package com.pos.common.rabbitmq.infrastructure.microservice;

import com.pos.common.rabbitmq.Topology;
import com.pos.common.rabbitmq.TopologyNaming;
import com.rabbitmq.client.AlreadyClosedException;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class AgentTopology {

    private final static Logger logger = LoggerFactory.getLogger(AgentTopology.class);

    private static final Map<String, LinkedBlockingQueue<Builder>> resourcesMap = new HashMap<>();

    public static Builder newOne(Channel channel) {
        return new Builder(channel);
    }


    public static class Builder {

        private String applicationName;
        private Channel channel;
        private String exchangeName;
        private String queueName;
        private String extendedQueueName;


        public Builder(Channel channel) {
            this.channel = channel;
        }

        public Builder withApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public void declare(String queueName, List<String> agentIds) {
            agentIds.forEach(agentId -> {
                declare(agentId, queueName);
            });

        }
        public void declare(String agentId, String queueName) {

            this.queueName = queueName;
            exchangeName = TopologyNaming.exchangeName(applicationName, agentId);
            extendedQueueName = TopologyNaming.extendedQueueName(applicationName, agentId, queueName);


            Topology.newOne(channel)
                    .withExchangeName(exchangeName)
                    .withQueueName(extendedQueueName)
                    .declare();

            LinkedBlockingQueue<Builder> resourcesByQueue = resourcesMap.get(queueName);
            if (resourcesByQueue == null) {
                resourcesByQueue = new LinkedBlockingQueue<>();
                resourcesByQueue.add(this);
                resourcesMap.put(queueName, resourcesByQueue);
            } else {
                resourcesByQueue.add(this);
            }
        }

        boolean sameTopology(String applicationName, String agentId, String queueName) {
            return this.exchangeName.equals(TopologyNaming.exchangeName(applicationName, agentId))
                    && this.extendedQueueName.equals(TopologyNaming.extendedQueueName(applicationName, agentId, queueName));
        }

        public String getQueueName() throws IOException {
            return channel.queueDeclare().getQueue();
        }

        public void freeResources() {
            close(channel);
            LinkedBlockingQueue<Builder> consumersByQueue = resourcesMap.get(queueName);
            if (consumersByQueue != null) {
                consumersByQueue.remove(this);
            }
        }

        private static final void close(Channel channel) {
            try {
                channel.close();
            } catch (AlreadyClosedException e) {
            } catch (Exception e) {
                logger.warn("Unexpected error closing Agent Topology channel", e);
            }
        }


    }

    public static synchronized void createNewAgents(Channel channel, List<String> agentsId, String applicationName, String queueName) {

        agentsId.stream()
                .filter(it -> noneMatch(applicationName, queueName, it))
                .forEach(it -> AgentTopology.newOne(channel)
                        .withApplicationName(applicationName)
                        .declare(it, queueName));

    }

    public static synchronized void freeUnused(List<String> agentsId, String applicationName, String queueName) {

        LinkedBlockingQueue<Builder> resourcesByQueue = resourcesMap.get(queueName);

        if (resourcesByQueue != null) {

            resourcesByQueue.stream()
                    .filter(it -> noneMatch(it, agentsId, applicationName, queueName))
                    .forEach(it -> {
                        it.freeResources();
                        resourcesMap.remove(it);
                    });
        }
    }

    private static boolean noneMatch(String applicationName, String queueName, String agent) {

        LinkedBlockingQueue<Builder> resourcesByQueue = resourcesMap.get(queueName);

        if (resourcesByQueue == null) {
            return true;
        } else {
            return resourcesByQueue.stream()
                    .noneMatch(resource -> resource.sameTopology(applicationName, agent, queueName));
        }
    }

    private static boolean noneMatch(Builder result, List<String> agents, String applicationName, String queueName) {
        return agents.stream()
                .noneMatch(agentId -> result.sameTopology(applicationName, agentId, queueName));
    }

    public static synchronized void freeResources() {

        resourcesMap.values().stream()
                .flatMap(LinkedBlockingQueue::stream)
                .forEach(Builder::freeResources);

        resourcesMap.clear();
    }

}
