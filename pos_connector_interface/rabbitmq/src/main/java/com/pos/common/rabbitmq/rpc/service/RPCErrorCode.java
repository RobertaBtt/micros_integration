package com.pos.common.rabbitmq.rpc.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.exception.RpcServiceException;


public class RPCErrorCode implements ErrorCode {
    private RPCStatus status;
    private String code;
    private String message;

    public RPCErrorCode() {
    }

    static RPCErrorCode of(RPCStatus status, String code, String message) {
        return new RPCErrorCode(status, code, message);
    }

    static RPCErrorCode of(RpcServiceException exception) {

        ErrorCode errorCode = exception.getErrorCode();
        RPCStatus statusCode = exception.getStatusCode();

        return new RPCErrorCode(statusCode, errorCode.getCode(), errorCode.getMessage());
    }

    public RPCErrorCode(RPCStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public RPCStatus getStatus() {
        return status;
    }

    @JsonIgnore
    public boolean isServiceUnavailable() {
        return status.isServiceUnavailable();
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String printPrettyMessage() {
        return "[" + status.toString() + "] " + message;
    }
}

