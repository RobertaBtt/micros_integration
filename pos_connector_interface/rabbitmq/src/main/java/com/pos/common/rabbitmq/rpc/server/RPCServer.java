package com.pos.common.rabbitmq.rpc.server;

import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.consumer.ConsumerFactory;
import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.producer.ProducerFactory;
import com.pos.common.rabbitmq.producer.RemoteException;
import com.pos.common.rabbitmq.rpc.RPCTopologyNaming;
import com.pos.common.rabbitmq.rpc.service.RPCRemoteByteService;
import com.pos.common.rabbitmq.rpc.service.RPCRemoteDeserializerService;
import com.pos.common.rabbitmq.rpc.service.RPCRemoteService;
import com.pos.common.rabbitmq.serialize.DeserializationError;
import com.pos.common.rabbitmq.serialize.SerializationError;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RPCServer {

    private final static Logger logger = LoggerFactory.getLogger(RPCServer.class);

    private static final LinkedBlockingQueue<Builder.Stoppable> servers = new LinkedBlockingQueue();

    private static long LONG_LIVED_MESSAGE_IN_MILLIS = RabbitProperties.DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS;

    public static Builder newOne(Connection connection) {
        return new Builder(connection);
    }

    public static void overrideDefaults(RabbitProperties properties) {
        LONG_LIVED_MESSAGE_IN_MILLIS = properties.getLONG_LIVED_MESSAGE_IN_MILLIS();
    }

    public static class Builder {

        private final Connection connection;
        private String applicationName;
        private String agentId;
        private Map<String, RPCRemoteByteService> serviceByMethodName = new HashMap<>();

        public Builder(Connection connection) {
            this.connection = connection;
        }

        public Builder withApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder withAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        public Builder withByteServices(Collection<RPCRemoteByteService> serviceList) {
            this.serviceByMethodName.putAll(toByteServiceMap(serviceList));
            return this;
        }

        public Builder withServices(Collection<RPCRemoteService> serviceList) {
            this.serviceByMethodName.putAll(toServiceMap(serviceList));
            return this;
        }

        public Stoppable start() {

            final String exchangeName = RPCTopologyNaming.exchangeName(applicationName, agentId);
            final String queueName = RPCTopologyNaming.requestQueueName(applicationName, agentId);

            final Channel channel = ChannelFactory.newOne(connection).create();

            Disposable listener = ConsumerFactory.newOne(channel, queueName)
                    .toObservable()
                    .flatMapSingle(executeServiceAndSendResult(exchangeName, channel))
                    .onErrorResumeNext(logAndSilent())
                    .subscribeOn(Schedulers.io())
                    .subscribe();

            Stoppable stoppable = new Stoppable(listener);

            servers.add(stoppable);

            return stoppable;
        }

        private Map<String, RPCRemoteByteService> toByteServiceMap(Collection<RPCRemoteByteService> serviceList) {
            return serviceList.stream().collect(Collectors.toMap(RPCRemoteByteService::methodName, Function.identity()));
        }


        private Map<String, RPCRemoteDeserializerService> toServiceMap(Collection<RPCRemoteService> serviceList) {
            return serviceList.stream()
                    .map(RPCRemoteDeserializerService::new)
                    .collect(Collectors.toMap(RPCRemoteDeserializerService::methodName, Function.identity()));
        }

        private RPCRemoteByteService getService(Message message) throws RPCNotFoundRemoteServiceException {
            final String methodName = getMethodName(message);

            RPCRemoteByteService rpcRemoteByteService = serviceByMethodName.get(methodName);

            if (rpcRemoteByteService == null) {
                //if i always reject it then the message will return again and again
                if (message.getEnvelope().isRedeliver() && message.getElapsedTime() > LONG_LIVED_MESSAGE_IN_MILLIS) {
                    message.ackUnwanted("message referencing to a not found RPCRemoteService bean with remote methodName " + methodName);
                } else {
                    message.rejectUnwanted("message referencing to a not found RPCRemoteService bean with remote methodName " + methodName);
                }
                throw new RPCNotFoundRemoteServiceException(methodName);
            }

            return rpcRemoteByteService;
        }

        private String getMethodName(Message message) {
            return message.getHeaders().getAppId();
        }

        private byte[] payload(Message message) {
            return message.getBody();
        }

        private AMQP.BasicProperties replyProperties(Message message) {
            return new AMQP.BasicProperties
                    .Builder()
                    .correlationId(message.getHeaders().getCorrelationId())
                    .timestamp(new Date())
                    .build();
        }

        private String replyTo(Message message) {
            return message.getHeaders().getReplyTo();
        }


        private io.reactivex.functions.Function<Message, SingleSource<byte[]>> executeServiceAndSendResult(String exchangeName, Channel channel) {
            return message -> getService(message)
                    .execute(payload(message))
                    .doOnSuccess(result -> sendResult(exchangeName, channel, message, result))
                    .doOnSuccess(everythingOk -> message.ack())
                    .doOnError(error -> {
                        if (error instanceof DeserializationError || error instanceof SerializationError) {
                            message.ackUnwanted(error);
                        } else {
                            message.reject();
                        }
                    });
        }

        private void sendResult(String exchangeName, Channel channel, Message message, byte[] response) throws RemoteException {
            ProducerFactory.newOne(channel, exchangeName, replyTo(message)).withProperties(replyProperties(message)).withBody(response).publish();
        }

        private io.reactivex.functions.Function<Throwable, Observable<byte[]>> logAndSilent() {
            return error -> {
                logger.error("Error executing RabbitMq invoked remote method", error);
                return Observable.empty();
            };
        }

        public class Stoppable {
            private Disposable listener;

            private Stoppable(Disposable listener) {
                this.listener = listener;
            }

            public void stop() {
                listener.dispose();
                servers.remove(this);
            }
        }

    }

    public static synchronized void stop() {
        servers.stream().forEach(server -> server.stop());
        servers.clear();
    }

}