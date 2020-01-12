package com.pos.common.rabbitmq.rpc.client;

import com.pos.common.rabbitmq.config.RabbitProperties;
import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.rpc.client.task.MessageExpiryTask;
import com.pos.common.rabbitmq.utils.TimedBlockingQueue;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RPCResponses {

    private final static Logger logger = LoggerFactory.getLogger(RPCResponses.class);

    private static long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = RabbitProperties.DEFAULT_EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;
    private static long RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS = RabbitProperties.DEFAULT_RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS;
    private static long LONG_LIVED_MESSAGE_IN_MILLIS = RabbitProperties.DEFAULT_LONG_LIVED_MESSAGE_IN_MILLIS;

    private static final ConcurrentHashMap<String, TimedBlockingQueue<Message>> byCorrelationId = new ConcurrentHashMap();

    private static Disposable MESSAGE_EXPIRY_TASK = MessageExpiryTask.newOne(byCorrelationId)
            .withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES)
            .withLONG_LIVED_MESSAGE_IN_MILLIS(LONG_LIVED_MESSAGE_IN_MILLIS)
            .runInBackground();

    public static void overrideDefaults(RabbitProperties properties) {
        MESSAGE_EXPIRY_TASK.dispose();

        MESSAGE_EXPIRY_TASK = MessageExpiryTask.newOne(byCorrelationId)
                .withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(properties.getEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES())
                .withLONG_LIVED_MESSAGE_IN_MILLIS(properties.getLONG_LIVED_MESSAGE_IN_MILLIS())
                .runInBackground();

        EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = properties.getEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES();
        RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS = properties.getRPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS();
        LONG_LIVED_MESSAGE_IN_MILLIS = properties.getLONG_LIVED_MESSAGE_IN_MILLIS();
    }

    public static void payAttentionTo(String correlationId) {

        TimedBlockingQueue<Message> blocking = new TimedBlockingQueue<>(1);

        byCorrelationId.put(correlationId, blocking);
    }

    public static Message waitFor(String correlationId) {

        ArrayBlockingQueue<Message> blocking = byCorrelationId.get(correlationId);

        Message response = null;
        try {
            response = blocking.poll(RPC_INVOKE_METHOD_TIME_OUT_IN_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException("unexpected interrupted waiting for rpc response "+correlationId, e);
        } finally {

            if (response != null) {
                byCorrelationId.remove(correlationId);
            }
        }

        return response;
    }

    public static void queue(Message message) {

        final String correlationId = message.getHeaders().getCorrelationId();

        ArrayBlockingQueue<Message> blocking = byCorrelationId.get(correlationId);

        //this message don't belongs to this jvm
        if (blocking == null) {
            //if i always reject it then the message will return again and again
            if (message.getEnvelope().isRedeliver() && message.getElapsedTime() > LONG_LIVED_MESSAGE_IN_MILLIS) {
                message.ackUnwanted("rpc response unknown message");
            } else {
                message.rejectUnwanted("rpc response unknown message");
            }
            return;
        }

        if (!blocking.offer(message)) {
            message.ackUnwanted("already received rpc knows response message");
        }
    }


    public static void stopExpiryMessagesTask() {
        MESSAGE_EXPIRY_TASK.dispose();
    }


}
