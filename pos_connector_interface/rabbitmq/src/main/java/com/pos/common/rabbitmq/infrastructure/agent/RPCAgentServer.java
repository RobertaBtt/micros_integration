package com.pos.common.rabbitmq.infrastructure.agent;

import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.rpc.server.RPCServer;
import com.pos.common.rabbitmq.rpc.service.RPCRemoteService;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RPCAgentServer {

    private final static Logger logger = LoggerFactory.getLogger(RPCAgentServer.class);

    public static Builder newOne(Connection connection) {
        return new Builder(connection);
    }

    public static void overrideDefaults(RabbitProperties properties) {
        RPCServer.overrideDefaults(properties);
    }

    public static void stop() {
        RPCServer.stop();
    }

    public static class Builder {

        private final Connection connection;
        private String applicationName;
        private Collection<RPCRemoteService> serviceList = new ArrayList<>();

        public Builder(Connection connection) {
            this.connection = connection;
        }

        public Builder withApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder withServices(Collection<RPCRemoteService> serviceList) {
            this.serviceList.addAll(serviceList);
            return this;
        }

        public void start(List<String> agentIds) {
            agentIds.stream().filter(Objects::nonNull).distinct()
                    .forEach(agentId -> {
                        start(agentId);
                    });
        }

        public void start(String agentId) {
            RPCServer.newOne(connection)
                    .withApplicationName(applicationName)
                    .withAgentId(agentId)
                    .withServices(serviceList)
                    .start();
        }

    }

}