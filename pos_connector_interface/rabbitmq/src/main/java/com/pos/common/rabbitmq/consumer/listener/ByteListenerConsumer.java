package com.pos.common.rabbitmq.consumer.listener;

import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.serialize.DeserializationError;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class ByteListenerConsumer extends DefaultConsumer {

    private final static Logger logger = LoggerFactory.getLogger(ByteListenerConsumer.class);

    protected RabbitByteListener listener;

    public ByteListenerConsumer(Channel channel, RabbitByteListener listener) {
        super(channel);
        this.listener = listener;
    }


    @Override
    public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties headers, byte[] body) throws IOException {

        Message message = new Message(getChannel(), consumerTag, envelope, headers, body);

        try {
            listener.execute(message.getBody())
                    .doOnComplete(() -> message.ack())
                    .doOnError(error -> {
                        if (error instanceof DeserializationError) {
                            message.ack();
                        } else {
                            message.reject();
                        }
                    })
                    .onErrorResumeNext(logAndSilent())
                    .subscribeOn(Schedulers.io())
                    .subscribe();
        } catch (DeserializationError e) {
            logger.error("Error RabbitMq listener deserialize bytes (future ack)", e);
            message.ack();
        } catch (Exception e) {
            logger.error("Error executing rx chain on RabbitMq listener (future reject)", e);
            message.reject();
        }
    }

    private Function<Throwable, CompletableSource> logAndSilent() {
        return error -> {
            logger.error("Error executing RabbitMq listener", error);
            return Completable.complete();
        };
    }

}
