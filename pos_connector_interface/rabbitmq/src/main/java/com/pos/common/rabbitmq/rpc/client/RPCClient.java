package com.pos.common.rabbitmq.rpc.client;

import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.producer.ProducerFactory;
import com.pos.common.rabbitmq.producer.RemoteException;
import com.pos.common.rabbitmq.rpc.RPCTopologyNaming;
import com.pos.common.rabbitmq.rpc.service.RPCErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCResult;
import com.pos.common.rabbitmq.serialize.DeserializationError;
import com.pos.common.rabbitmq.serialize.JsonSerializer;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.AlreadyClosedException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

public class RPCClient {

    private final static Logger logger = LoggerFactory.getLogger(RPCClient.class);

    private static Integer RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE = RabbitProperties.DEFAULT_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE;
    private static Integer RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE = RabbitProperties.DEFAULT_RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

    public static void overrideDefaults(RabbitProperties properties) {
        RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE = properties.getRPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE();
        RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE = properties.getRPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE();
    }

    public static Builder newOne(Connection connection) {
        return new Builder(connection);
    }

    public static class Builder {


        private final Connection connection;
        private String applicationName;
        private String agentId;
        private String remoteMethodName;

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

        public Builder withRemoteServiceName(String remoteMethodName) {
            this.remoteMethodName = remoteMethodName;
            return this;
        }

        public <T> T invokeMethod(Object payload, Class<T> resultclass) throws RemoteException, TimeoutException {
            byte[] serialized = JsonSerializer.instance().serialize(payload);

            Message message = invokeMethod(serialized);

            RPCResult<T> deserialized;
            try {
                deserialized = JsonSerializer.instance().deserialize(message.getBody(), RPCResult.class, resultclass);
                //deserialized = JsonSerializer.instance().deserialize(message.getBody(), resultclass);
            } catch (DeserializationError e) {
                message.ackUnwanted(e);
                throw e;
            }

            message.ack();

            ifErrorSuccessRetrow(deserialized.getErrorCode());

            return deserialized.getReturnedByService();
        }

        public Message invokeMethod(byte[] payload) throws RemoteException, TimeoutException {
            final String exchangeName = RPCTopologyNaming.exchangeName(applicationName, agentId);
            final String queueName = RPCTopologyNaming.requestQueueName(applicationName, agentId);

            /**
             * For applications that use multiple threads/processes for processing, it is very common to open a new channel per thread/process
             * and not share channels between them.
             */
            final Channel channel = ChannelFactory.newOne(connection)
                    .withBufferSize(null)
                    .withRetries(RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE)
                    .withRetryMillis(RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE)
                    .create();

            final String correlationId = UUID.randomUUID().toString();
            final String replyQueueName = RPCTopologyNaming.responseQueueName(applicationName, agentId);

            AMQP.BasicProperties props = new AMQP.BasicProperties
                    .Builder()
                    .appId(remoteMethodName)
                    .correlationId(correlationId)
                    .replyTo(replyQueueName)
                    .timestamp(new Date())
                    .build();

            RPCResponses.payAttentionTo(correlationId);

            try {
                ProducerFactory.newOne(channel, exchangeName, queueName)
                        .withBody(payload)
                        .withProperties(props)
                        .publish();
            } finally {
                try {
                    channel.close();
                } catch (AlreadyClosedException e) {
                } catch (Exception e) {
                    logger.warn("error closing channel invoking RPC on queue {} method {}", queueName, remoteMethodName, e);
                }
            }

            RPCResponseListener.startListening(connection, replyQueueName);

            Message message = RPCResponses.waitFor(correlationId);


            if (message == null) {
                throw new TimeoutException("Rabbit RPC timeout waiting response for remote method " + remoteMethodName + " on queue " + queueName +" correlationId "+correlationId);
            }

            return message;

        }

    }

    private static void ifErrorSuccessRetrow(ErrorCode errorCode) throws RemoteException {
        if (errorCode != null) {
            if (errorCode instanceof RPCErrorCode) {
                throw new RemoteException((RPCErrorCode) errorCode);
            } else {
                throw new RemoteException(errorCode);
            }
        }
    }


}
