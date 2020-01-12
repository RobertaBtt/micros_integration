package com.pos.common.rabbitmq.consumer;


import com.pos.common.rabbitmq.message.Message;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import io.reactivex.ObservableEmitter;

public interface ConsumerBuilder {

    ConsumerBuilder withChannel(Channel channel);

    ConsumerBuilder withEmitter(ObservableEmitter<Message> emitter);

    Consumer create();

}
