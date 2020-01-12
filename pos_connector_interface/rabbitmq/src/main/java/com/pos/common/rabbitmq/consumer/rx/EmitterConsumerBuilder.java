package com.pos.common.rabbitmq.consumer.rx;

import com.pos.common.rabbitmq.consumer.ConsumerBuilder;
import com.pos.common.rabbitmq.message.Message;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import io.reactivex.ObservableEmitter;

public class EmitterConsumerBuilder implements ConsumerBuilder {


    protected Channel rabbitChannel;
    protected ObservableEmitter<Message> emitter;


    public ConsumerBuilder withChannel(Channel channel) {
        this.rabbitChannel = channel;
        return this;
    }

    public ConsumerBuilder withEmitter(ObservableEmitter<Message> emitter) {
        this.emitter = emitter;
        return this;
    }

    public Consumer create() {
        return new EmitterConsumer(rabbitChannel, emitter);
    }


}
