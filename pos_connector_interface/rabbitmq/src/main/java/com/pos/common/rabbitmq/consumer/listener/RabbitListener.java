package com.pos.common.rabbitmq.consumer.listener;

import io.reactivex.Completable;

public interface RabbitListener<T> {

    Completable execute(T payload);

    Class<T> getParameterClass();

}
