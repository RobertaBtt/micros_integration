package com.pos.common.rabbitmq.consumer.listener;

import io.reactivex.Completable;

public interface RabbitByteListener {

    Completable execute(byte[] payload);

}
