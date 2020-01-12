package com.pos.common.rabbitmq.producer;

import pos.common.exceptions.ErrorCode;
import com.pos.common.rabbitmq.rpc.service.RPCErrorCode;

public class RemoteException extends Exception {

    private ErrorCode errorCode;

    public RemoteException(RPCErrorCode errorCode) {

        super(errorCode.getMessage());

        this.errorCode = errorCode;
    }

    public RemoteException(ErrorCode errorCode) {

        super(errorCode.getMessage());

        this.errorCode = errorCode;
    }


    public RemoteException(ErrorCode errorCode, Throwable cause) {

        super(errorCode.getMessage(), cause);

        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
