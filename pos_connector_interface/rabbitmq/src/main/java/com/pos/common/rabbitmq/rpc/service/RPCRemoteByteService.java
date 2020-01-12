package com.pos.common.rabbitmq.rpc.service;

import io.reactivex.Single;

public interface RPCRemoteByteService {

    Single<byte[]> execute(byte[] payload);

    String methodName();

}
