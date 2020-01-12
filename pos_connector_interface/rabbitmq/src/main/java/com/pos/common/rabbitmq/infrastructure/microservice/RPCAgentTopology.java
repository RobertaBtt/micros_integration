package com.pos.common.rabbitmq.infrastructure.microservice;

import com.pos.common.rabbitmq.ChannelFactory;
import com.pos.common.rabbitmq.rpc.RPCTopology;
import com.pos.common.rabbitmq.rpc.RPCTopologyNaming;
import com.rabbitmq.client.AlreadyClosedException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

public class RPCAgentTopology {

    private final static Logger logger = LoggerFactory.getLogger(RPCAgentTopology.class);

    private static final LinkedBlockingQueue<Builder> resources = new LinkedBlockingQueue();

    public static Builder newOne(Channel channel) {
        return new Builder(channel);
    }


    public static class Builder {

        private String applicationName;
        private Channel channel;
        private String agentId;


        public Builder(Channel channel) {
            this.channel = channel;
        }

        public Builder withApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public void declare(List<String> agentIds) {

            agentIds.stream().filter(Objects::nonNull).distinct()
                    .forEach(agentId -> {
                        declare(agentId);

                    });

            resources.add(this);
        }

        public void declare(String agentId) {

            this.agentId = agentId;

            final String exchangeName = RPCTopologyNaming.exchangeName(applicationName, agentId);
            final String requestQueueName = RPCTopologyNaming.requestQueueName(applicationName, agentId);
            final String replyQueueName = RPCTopologyNaming.responseQueueName(applicationName, agentId);

            RPCTopology.newOne(channel)
                    .withExchangeName(exchangeName)
                    .withRequestQueueName(requestQueueName)
                    .withReplyQueueName(replyQueueName)
                    .declare();

            if (!resources.contains(this)) {
                resources.add(this);
            }
        }

        public void freeResources() {
            close(channel);
            resources.remove(this);
        }

        private static final void close(Channel channel) {
            try {
                channel.close();
            } catch (AlreadyClosedException e) {
            } catch (Exception e) {
                logger.warn("Unexpected error closing RPCAgentTopology channel", e);
            }
        }

        boolean sameTopology(String applicationName, String agentId) {
            return this.applicationName.equals(applicationName) && this.agentId.equals(agentId);
        }
    }

    public static synchronized void createNewAgents(Channel channel, List<String> agentsId, String applicationName) {

        agentsId.stream()
                .filter(it -> noneMatch(applicationName, it))
                .forEach(it -> RPCAgentTopology.newOne(channel)
                        .withApplicationName(applicationName)
                        .declare(it));

    }

    public static synchronized void freeUnusedResources(List<String> agentsId, String applicationName) {

        resources.stream()
                .filter(it -> noneMatch(agentsId, applicationName, it))
                .forEach(resource -> {
                    resource.freeResources();
                    resources.remove(resource);
                });
    }

    private static boolean noneMatch(List<String> agentsId, String applicationName, Builder it) {
        return agentsId.stream()
                .noneMatch(agentId -> it.sameTopology(applicationName, agentId));
    }

    private static boolean noneMatch(String applicationName, String agent) {
        return resources.stream()
                .noneMatch(resource -> resource.sameTopology(applicationName, agent));
    }

    public static synchronized void freeResources() {
        resources.forEach(resource -> resource.freeResources());
        resources.clear();
    }

}
