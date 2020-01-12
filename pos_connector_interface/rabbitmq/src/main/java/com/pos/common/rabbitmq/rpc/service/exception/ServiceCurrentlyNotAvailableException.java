package com.pos.common.rabbitmq.rpc.service.exception;

import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCStatus;

public class ServiceCurrentlyNotAvailableException extends RpcServiceException {

    public ServiceCurrentlyNotAvailableException(ErrorCode errorCode) {

        super(RPCStatus.SERVICE_UNAVAILABLE, errorCode);
    }
}
