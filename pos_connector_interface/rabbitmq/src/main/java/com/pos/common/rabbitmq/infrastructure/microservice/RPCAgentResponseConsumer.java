package com.pos.common.rabbitmq.infrastructure.microservice;

import com.pos.common.rabbitmq.rpc.RPCTopologyNaming;
import com.pos.common.rabbitmq.rpc.client.RPCResponseListener;
import com.pos.common.rabbitmq.rpc.client.RPCResponses;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

public class RPCAgentResponseConsumer {

    private final static Logger logger = LoggerFactory.getLogger(RPCAgentResponseConsumer.class);

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

        public void startListening(List<String> agentIds) {
            agentIds.stream().filter(Objects::nonNull).distinct()
                    .forEach(agentId -> {
                        startListening(agentId);
                    });
        }

        public void startListening(String agentId) {
            final String replyQueueName = RPCTopologyNaming.responseQueueName(applicationName, agentId);
            RPCResponseListener.startListening(connection, replyQueueName);
        }

    }

    public static synchronized void freeResources() {
        RPCResponses.stopExpiryMessagesTask();
        RPCResponseListener.stopListening();
    }

}
