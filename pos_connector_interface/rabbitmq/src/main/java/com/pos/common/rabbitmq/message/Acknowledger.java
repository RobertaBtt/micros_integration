package com.pos.common.rabbitmq.message;

public interface Acknowledger {

    void ack();

    void reject();

    void ackUnwanted(Throwable cause);

    void ackUnwanted(String reason);

    void rejectUnwanted(String reason);
}
