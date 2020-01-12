package com.pos.common.rabbitmq.rpc.service.exception;

import pos.common.exceptions.ErrorCode;
import pos.common.exceptions.ServiceException;
import com.pos.common.rabbitmq.rpc.service.RPCStatus;

public abstract class RpcServiceException extends ServiceException {

    private RPCStatus statusCode;

    public RpcServiceException(RPCStatus statusCode, ErrorCode errorCode) {

        super(errorCode);
        this.statusCode = statusCode;
    }

    public RPCStatus getStatusCode() {
        return statusCode;
    }
}
