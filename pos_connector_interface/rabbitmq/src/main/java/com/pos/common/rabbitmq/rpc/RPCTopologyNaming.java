package com.pos.common.rabbitmq.rpc;

import com.pos.common.rabbitmq.TopologyNaming;

public class RPCTopologyNaming {

    public static String exchangeName(String applicationName, String agentId) {
        return TopologyNaming.exchangeName(applicationName, agentId);
    }

    public static String requestQueueName(String applicationName, String agentId) {
        return applicationName + ".queue.rpc.request." + agentId;
    }

    public static String responseQueueName(String applicationName, String agentId) {
        return applicationName + ".queue.rpc.response." + agentId;
    }

}
