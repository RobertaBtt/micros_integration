package com.pos.common.rabbitmq.infrastructure.microservice;

import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.TopologyNaming;
import com.pos.common.rabbitmq.consumer.ConsumerFactory;
import com.pos.common.rabbitmq.consumer.listener.RabbitListener;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class AgentConsumer {

    private final static Logger logger = LoggerFactory.getLogger(AgentConsumer.class);

    public static Builder newOne(Connection connection) {
        return new Builder(connection);
    }

    public static class Builder {

        private String applicationName;
        private Connection connection;

        public Builder(Connection connection) {
            this.connection = connection;
        }

        public Builder withApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public void startListening(List<String> agentIds, String queueName, RabbitListener rabbitListener) {
            agentIds.forEach(agentId -> {
                startListening(agentId, queueName, rabbitListener);
            });
        }

        public void startListening(String agentId, String queueName, RabbitListener rabbitListener) {

            final String extendedQueueName = TopologyNaming.extendedQueueName(applicationName, agentId, queueName);
            startListening(rabbitListener, queueName, extendedQueueName);

        }

        public void startListening(RabbitListener rabbitListener, String queue, String extendedQueueName) {
            Channel channel = ChannelFactory.newOne(connection).create();

            ConsumerFactory.newOne(channel, extendedQueueName)
                    .withCallBackFromQueue(rabbitListener)
                    .startListening(queue);
        }

    }

    public static synchronized void freeResources() {
        ConsumerFactory.stopListening();
    }

}
