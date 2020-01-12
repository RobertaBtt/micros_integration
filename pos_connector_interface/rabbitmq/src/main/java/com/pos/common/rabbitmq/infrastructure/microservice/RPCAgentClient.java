package com.pos.common.rabbitmq.infrastructure.microservice;

import com.pos.common.rabbitmq.rpc.client.RPCClient;
import com.pos.common.rabbitmq.rpc.client.RPCResponseListener;

public class RPCAgentClient extends RPCClient {
    public static void freeResources() {
        RPCResponseListener.stopListening();
    }
}
