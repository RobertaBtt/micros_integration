package com.pos.common.rabbitmq;

public class TopologyNaming {

    public static String exchangeName(String applicationName, String agentId) {
        return applicationName + ".exchange." + agentId;
    }

    public static String extendedQueueName(String applicationName, String agentId, String queueName) {
        return applicationName + ".queue." + queueName + "." + agentId;
    }


}
