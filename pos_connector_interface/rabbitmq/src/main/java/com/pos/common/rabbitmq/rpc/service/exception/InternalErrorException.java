package com.pos.common.rabbitmq.rpc.service.exception;

import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCStatus;

public class InternalErrorException extends RpcServiceException {

    public InternalErrorException(ErrorCode errorCode) {

        super(RPCStatus.INTERNAL_SERVICE_ERROR, errorCode);
    }
}
