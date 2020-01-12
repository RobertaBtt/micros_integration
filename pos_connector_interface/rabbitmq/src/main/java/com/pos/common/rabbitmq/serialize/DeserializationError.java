package com.pos.common.rabbitmq.serialize;

public class DeserializationError extends RuntimeException {
    public DeserializationError(String message, Throwable cause) {
        super(message, cause);
    }
}
