package com.pos.common.rabbitmq.consumer.listener;

import com.pos.common.rabbitmq.consumer.ConsumerBuilder;
import com.pos.common.rabbitmq.message.Message;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import io.reactivex.ObservableEmitter;

public class ByteListenerConsumerBuilder implements ConsumerBuilder {

    protected Channel rabbitChannel;
    protected ObservableEmitter<Message> emitter;
    protected RabbitByteListener listener;

    public ByteListenerConsumerBuilder(RabbitByteListener listener) {
        this.listener = listener;
    }

    public ByteListenerConsumerBuilder withChannel(Channel channel) {
        this.rabbitChannel = channel;
        return this;
    }

    public ByteListenerConsumerBuilder withEmitter(ObservableEmitter<Message> emitter) {
        this.emitter = emitter;
        return this;
    }

    public Consumer create() {
        return new ByteListenerConsumer(rabbitChannel, listener);
    }
}
