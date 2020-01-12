package com.pos.common.rabbitmq.rpc.service.exception;

import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCStatus;

public class BadRequestException extends RpcServiceException {

    public BadRequestException(ErrorCode errorCode) {

        super(RPCStatus.BAD_REQUEST, errorCode);
    }
}
