package com.pos.common.rabbitmq.infrastructure.agent;

import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.TopologyNaming;
import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.producer.ProducerFactory;
import com.pos.common.rabbitmq.producer.RemoteException;
import com.pos.common.rabbitmq.serialize.JsonSerializer;
import com.rabbitmq.client.AlreadyClosedException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgentProducer {

    private final static Logger logger = LoggerFactory.getLogger(AgentProducer.class);

    private static Integer INVOKE_METHOD_MAX_RETRIES_ON_FAILURE = RabbitProperties.DEFAULT_RPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE;
    private static Integer INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE = RabbitProperties.DEFAULT_RPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE;

    public static void overrideDefaults(RabbitProperties properties) {
        INVOKE_METHOD_MAX_RETRIES_ON_FAILURE = properties.getRPC_INVOKE_METHOD_MAX_RETRIES_ON_FAILURE();
        INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE = properties.getRPC_INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE();
    }

    public static Builder newOne(Connection connection) {
        return new Builder(connection);
    }

    public static class Builder {


        private final Connection connection;
        private String applicationName;
        private String agentId;
        private String queueName;

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

        public Builder withQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        public void publish(Object payload) throws RemoteException {
            byte[] serialized = JsonSerializer.instance().serialize(payload);

            publish(serialized);
        }

        public void publish(byte[] payload) throws RemoteException {

            final String exchangeName = TopologyNaming.exchangeName(applicationName, agentId);
            final String extendedQueueName = TopologyNaming.extendedQueueName(applicationName, agentId, queueName);

            /**
             * For applications that use multiple threads/processes for processing, it is very common to open a new channel per thread/process
             * and not share channels between them.
             */
            final Channel channel = ChannelFactory.newOne(connection)
                    .withBufferSize(null)
                    .withRetries(INVOKE_METHOD_MAX_RETRIES_ON_FAILURE)
                    .withRetryMillis(INVOKE_METHOD_NEXT_RETRY_IN_MILLIS_ON_FAILURE)
                    .create();

            try {
                ProducerFactory.newOne(channel, exchangeName, extendedQueueName)
                        .withBody(payload)
                        .publish();
            } finally {
                try {
                    channel.close();
                } catch (AlreadyClosedException e) {
                } catch (Exception e) {
                    logger.warn("error closing channel producing on queue {}", extendedQueueName, e);
                }
            }

        }

    }


}
