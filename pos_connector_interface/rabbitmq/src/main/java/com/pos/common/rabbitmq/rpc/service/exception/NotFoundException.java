package com.pos.common.rabbitmq.rpc.service.exception;

import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCStatus;

public class NotFoundException extends RpcServiceException {

    public NotFoundException(ErrorCode errorCode) {

        super(RPCStatus.NOT_FOUND, errorCode);
    }
}
