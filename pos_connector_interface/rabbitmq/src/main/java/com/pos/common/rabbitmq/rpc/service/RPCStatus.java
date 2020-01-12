package com.pos.common.rabbitmq.rpc.service;

public enum RPCStatus {

    NOT_FOUND,
    BAD_REQUEST,
    SERVICE_UNAVAILABLE,
    INTERNAL_SERVICE_ERROR
    ;

    public boolean isServiceUnavailable() {
        return this == SERVICE_UNAVAILABLE;
    }
}
