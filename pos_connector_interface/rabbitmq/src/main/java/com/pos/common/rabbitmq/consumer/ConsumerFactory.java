package com.pos.common.rabbitmq.consumer;


import com.pos.common.rabbitmq.TopologyNaming;
import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.consumer.listener.ByteListenerConsumerBuilder;
import com.pos.common.rabbitmq.consumer.listener.RabbitByteListener;
import com.pos.common.rabbitmq.consumer.listener.RabbitDeserializerListener;
import com.pos.common.rabbitmq.consumer.listener.RabbitListener;
import com.pos.common.rabbitmq.consumer.rx.EmitterConsumer;
import com.pos.common.rabbitmq.infrastructure.microservice.AgentConsumer;
import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.utils.RetryWithDelay;
import com.rabbitmq.client.AlreadyClosedException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Consumer;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;


public class ConsumerFactory {

    private final static Logger logger = LoggerFactory.getLogger(ConsumerFactory.class);

    private static final Map<String, LinkedBlockingQueue<Builder>> consumers = new HashMap<>();

    private static Integer INIT_MAX_RETRIES_ON_FAILURE = RabbitProperties.DEFAULT_INIT_MAX_RETRIES_ON_FAILURE;
    private static Long INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = RabbitProperties.DEFAULT_INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

    public static void overrideDefaults(RabbitProperties properties) {
        INIT_MAX_RETRIES_ON_FAILURE = properties.getINIT_MAX_RETRIES_ON_FAILURE();
        INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE = properties.getINIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE();
    }

    public static Builder newOne(Channel channel, String queueName) {
        return new Builder(channel, queueName);
    }


    public static class Builder {

        private Channel channel;
        private String queueName;
        private ConsumerBuilder callBackBuilder;
        private int maxRetries = INIT_MAX_RETRIES_ON_FAILURE;
        private long retryMillis = INIT_NEXT_RETRY_IN_MILLIS_ON_FAILURE;
        private String consumerTag;

        public Builder(Channel channel, String queueName) {
            this.channel = channel;
            this.queueName = queueName;
        }

        public Builder withCallBackFromQueue(ConsumerBuilder callBackBuilder) {
            this.callBackBuilder = callBackBuilder;
            return this;
        }

        public Builder withCallBackFromQueue(RabbitByteListener byteListener) {
            this.callBackBuilder = new ByteListenerConsumerBuilder(byteListener);
            return this;
        }

        public Builder withCallBackFromQueue(RabbitListener listener) {
            this.callBackBuilder = new ByteListenerConsumerBuilder(new RabbitDeserializerListener(listener));
            return this;
        }

        public Builder withRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder withRetryMillis(long millis) {
            if (millis > 0) {
                this.retryMillis = millis;
            } else {
                this.retryMillis = 1;
            }
            return this;
        }

        public String queueName() {
            return queueName;
        }

        boolean sameTopology(String applicationName, String agentId, String queueName) {
            return this.queueName.equals(TopologyNaming.extendedQueueName(applicationName, agentId, queueName));
        }

        public Builder startListening(String queue) {
            final Consumer rabbitConsumer = this.callBackBuilder.withChannel(channel).create();

            //String basicConsume(String queue, boolean autoAck, String consumerTag, Consumer callback) throws IOException;
            consumerTag = UUID.randomUUID().toString();

            consumerTag = Observable.fromCallable(() -> channel.basicConsume(queueName, false, consumerTag, rabbitConsumer))
                    //consumerTag = Observable.fromCallable(() -> channel.basicConsume(queueName, false, rabbitConsumer))
                    .doOnError(e -> logger.warn("Unexpected error registering rabbitmq consumer on {}", queueName, e))
                    .retryWhen(new RetryWithDelay(maxRetries, retryMillis))
                    .doOnError(e -> logger.error("Unexpected error registering rabbitmq consumer on {}", queueName, e))
                    .blockingFirst();

            logger.debug("Start listening queue {} consumerTag {}", queueName, consumerTag);

            LinkedBlockingQueue<Builder> consumersByQueue = consumers.get(queue);
            if (consumersByQueue == null) {
                consumersByQueue = new LinkedBlockingQueue<>();
                consumersByQueue.add(this);
                consumers.put(queue, consumersByQueue);
            } else {
                consumersByQueue.add(this);
            }

            return this;
        }


        public Observable<Message> toObservable() {
            if (callBackBuilder == null) {
                withCallBackFromQueue(EmitterConsumer.builder());
            }
            return Observable.<Message>create(emitter ->
                    {
                        final Consumer rabbitConsumer = this.callBackBuilder.withChannel(channel).withEmitter(emitter).create();

                        consumerTag = UUID.randomUUID().toString();
                        consumerTag = Observable.fromCallable(() -> channel.basicConsume(queueName, false, consumerTag, rabbitConsumer))
                                .doOnError(e -> logger.warn("Unexpected error registering observable rabbitmq consumer on {}", queueName, e))
                                .retryWhen(new RetryWithDelay(maxRetries, retryMillis))
                                .doOnError(e -> logger.error("Unexpected error registering observable rabbitmq consumer on {}", queueName, e))
                                .blockingFirst();

                        logger.debug("Start listening queue {} consumerTag {}", queueName, consumerTag);

                    }
            )
                    .doOnDispose(() -> closeChannel());
        }

        private void closeChannel() {
            logger.debug("Stopping consumer channel queue {} consumerTag {}", queueName, consumerTag);
            if (consumerTag != null) {
                try {
                    channel.basicCancel(consumerTag);
                } catch (AlreadyClosedException e) {
                } catch (Exception e) {
                    logger.warn("Unexpected error cancelling consumer channel on queue {} consumerTag {}", queueName, consumerTag, e);
                }
            }

            //todo: wait for unacked messages: At this point any messages are being stored in bd (or whatelse) but ack has not been sent yet, so we should wait for pending acks here

            logger.debug("Stopping channel queue {} consumerTag {}", queueName, consumerTag);
            try {
                channel.close();
            } catch (AlreadyClosedException e) {
            } catch (Exception e) {
                logger.warn("Unexpected error closing channel channel on queue {} consumerTag {}", queueName, consumerTag, e);
            }
        }

        public void stopListening() {
            closeChannel();
            LinkedBlockingQueue<Builder> consumersByQueue = consumers.get(queueName);
            if (consumersByQueue != null) {
                consumersByQueue.remove(this);
            }
        }

    }

    public static synchronized void createNewAgents(Connection connection, List<String> agentsId, String applicationName, String queueName, RabbitListener rabbitListener) {

        agentsId.stream()
                .filter(it -> noneMatch(applicationName, queueName, it))
                .forEach(it -> AgentConsumer.newOne(connection)
                        .withApplicationName(applicationName)
                        .startListening(it, queueName, rabbitListener));
    }

    private static boolean noneMatch(String applicationName, String queueName, String it) {


        LinkedBlockingQueue<Builder> consumersByQueue = consumers.get(queueName);

        if (consumersByQueue == null) {
            return true;
        } else {
            return consumersByQueue.stream()
                    .noneMatch(listener -> listener.sameTopology(applicationName, it, queueName));
        }
    }


    public static synchronized void freeUnused(List<String> agentsId, String applicationName, String queueName) {


        LinkedBlockingQueue<Builder> consumersByQueue = consumers.get(queueName);

        if (consumersByQueue != null) {

            consumersByQueue.stream()
                    .filter(it -> noneMatch(agentsId, applicationName, queueName, it))
                    .forEach(builder -> {
                        builder.stopListening();
                        consumersByQueue.remove(builder);
                    });
        }
    }

    private static boolean noneMatch(List<String> agentsId, String applicationName, String queueName, Builder it) {
        return agentsId.stream().noneMatch(agent -> it.sameTopology(applicationName, agent, queueName));
    }

    public static synchronized void stopListening() {
        consumers.values().stream()
                .flatMap(LinkedBlockingQueue::stream)
                .forEach(ConsumerFactory.Builder::stopListening);
        consumers.clear();
    }

}
