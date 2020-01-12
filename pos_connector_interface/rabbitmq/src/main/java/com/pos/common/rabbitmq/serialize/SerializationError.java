package com.pos.common.rabbitmq.serialize;

public class SerializationError extends RuntimeException {
    public SerializationError(String message, Throwable cause) {
        super(message, cause);
    }
}
