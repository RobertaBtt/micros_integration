package com.pos.common.rabbitmq.rpc.server;

public class RPCNotFoundRemoteServiceException extends Exception {

    public RPCNotFoundRemoteServiceException(String methodName) {
        super("Not found RPCRemoteService bean with remote methodName " + methodName);
    }
}
