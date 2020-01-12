package com.pos.common.rabbitmq.rpc.service;

import com.pos.common.rabbitmq.serialize.JsonSerializer;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RPCRemoteDeserializerService implements RPCRemoteByteService {

    private final static Logger logger = LoggerFactory.getLogger(RPCRemoteDeserializerService.class);

    private final RPCRemoteService<Object, Object> objectService;

    public RPCRemoteDeserializerService(RPCRemoteService objectService) {
        this.objectService = objectService;
    }

    @Override
    public Single<byte[]> execute(byte[] payload) {
        return Single.just(payload)
                .map(deserialize())
                .flatMap(objectService::execute)
                .doOnError(error -> logger.warn("error executing application remote service '{}'", objectService.methodName(), error))
                .map(RPCResult::success)
                .onErrorReturn(RPCResult::error)
                .map(serialize())
                ;
    }

    private Function<byte[], Object> deserialize() {
        return payload -> JsonSerializer.instance().deserialize(payload, objectService.getParameterClass());
    }

    private Function<Object, byte[]> serialize() {
        return result -> JsonSerializer.instance().serialize(result);
    }

    @Override
    public String methodName() {
        return objectService.methodName();
    }

}
