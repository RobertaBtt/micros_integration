package com.pos.common.rabbitmq.consumer.rx;

import com.pos.common.rabbitmq.message.Message;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import io.reactivex.ObservableEmitter;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class EmitterConsumer extends DefaultConsumer {

    private final static Logger logger = LoggerFactory.getLogger(EmitterConsumer.class);

    protected final ObservableEmitter<Message> emitter;
    protected final Scheduler.Worker emitterWorker;

    private String consumerTag;

    public EmitterConsumer(Channel channel, ObservableEmitter<Message> emitter) {
        super(channel);
        this.emitter = emitter;
        this.emitterWorker = Schedulers.io().createWorker();
    }


    @Override
    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties headers, byte[] body) throws IOException {

        emitterWorker.schedule(() -> {
            if (emitter.isDisposed()) {
                return;
            }
            emitter.onNext(new Message(getChannel(), consumerTag, envelope, headers, body));
        });

    }


    public static final EmitterConsumerBuilder builder() {
        return new EmitterConsumerBuilder();
    }


    private static String toStringBody(byte[] body) {
        return new String(body);
    }


}




