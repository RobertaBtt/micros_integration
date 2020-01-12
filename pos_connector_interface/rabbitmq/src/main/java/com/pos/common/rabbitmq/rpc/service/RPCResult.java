package com.pos.common.rabbitmq.rpc.service;

import pos.common.exceptions.ErrorCode;
import pos.common.exceptions.ServiceException;
import com.pos.common.rabbitmq.rpc.service.exception.RpcServiceException;


public class RPCResult<R> {

    private R returnedByService;
    private RPCErrorCode errorCode;

    public RPCResult() {
    }

    public RPCResult(R returnedByService, RPCErrorCode errorCode) {
        this.returnedByService = returnedByService;
        this.errorCode = errorCode;
    }

    public static <R> RPCResult<R> success(R returnedByService) {
        final RPCResult result = new RPCResult();
        result.returnedByService = returnedByService;
        return result;
    }

    public static RPCResult error(Throwable error) {
        final RPCResult result = new RPCResult();

        if (error instanceof RpcServiceException) {
            result.errorCode = RPCErrorCode.of((RpcServiceException) error);
        } else if (error instanceof ServiceException) {
            result.errorCode = getErrorCode((ServiceException) error);
        } else {
            result.errorCode = getErrorCode(error);
        }

        return result;
    }

    public R getReturnedByService() {
        return returnedByService;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    private static RPCErrorCode getErrorCode(ServiceException error) {
        ErrorCode errorCode = error.getErrorCode();
        return RPCErrorCode.of(RPCStatus.INTERNAL_SERVICE_ERROR, errorCode.getCode(), errorCode.getMessage());
    }

    private static RPCErrorCode getErrorCode(Throwable error) {
        final String code = "Rpc.Remote.Service.Rabbit.Unexpected.Error";
        final String description = error.toString();

        return RPCErrorCode.of(RPCStatus.INTERNAL_SERVICE_ERROR, code, description);
    }
}
