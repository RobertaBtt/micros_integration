package com.pos.common.rabbitmq.rpc.service;

import io.reactivex.Single;

public interface RPCRemoteService<T, R> {

    Single<R> execute(T payload);

    Class<T> getParameterClass();

    String methodName();

}
