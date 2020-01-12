package com.connector.micros_micros.dto;

import pos.common.exceptions.ErrorCode;

public enum MicrosAgentErrorCode implements ErrorCode {

    ERROR_PICKUP_CHECK("ErrorPickupCheck", "Could not pickup check"),
    CHECK_NOT_FOUND("CheckNotFound", "Check ID {} check seq {} not found in the POS"),
    CHECK_NOT_FOUND_CACHE("CheckNotFoundAgent", "Check ID {} check seq {} not found in the Agent cache"),
    POS_PAYMENT_NOT_FOUND("PosPaymentNotFound", "Pos Payment Not Found"),
    POS_DISCOUNT_NOT_FOUND("PosDiscountNotFound", "Pos Discount Not Found"),
    HOST_UNREACHABLE("Host unreachable", "No route to host (Host unreachable)"),
    UNKOWN_ERROR("Unkown Error", "Unkown Error");

    MicrosAgentErrorCode(String code, String message) {
        this.code = code;
        this.message = message;

    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private final String code;
    private final String message;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public MicrosAgentErrorCode from(String code) {
        return MicrosAgentErrorCode.valueOf(code);
    }
}
