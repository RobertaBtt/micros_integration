package com.pos.common.rabbitmq.consumer.listener;


import com.pos.common.rabbitmq.serialize.JsonSerializer;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Function;


public class RabbitDeserializerListener implements RabbitByteListener {

    private final RabbitListener<Object> objectListener;

    public RabbitDeserializerListener(RabbitListener objectListener) {
        this.objectListener = objectListener;
    }

    @Override
    public Completable execute(byte[] payload) {
        return Single.just(payload)
                .map(deserialize())
                .flatMapCompletable(objectListener::execute);
    }

    private Function<byte[], Object> deserialize() {
        return payload -> JsonSerializer.instance().deserialize(payload, objectListener.getParameterClass());
    }

}
