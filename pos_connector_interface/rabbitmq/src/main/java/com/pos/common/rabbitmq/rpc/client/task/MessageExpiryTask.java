package com.pos.common.rabbitmq.rpc.client.task;

import com.pos.common.rabbitmq.message.Message;
import com.pos.common.rabbitmq.utils.TimedBlockingQueue;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class MessageExpiryTask {

    private final static Logger logger = LoggerFactory.getLogger(MessageExpiryTask.class);

    private ConcurrentHashMap<String, TimedBlockingQueue<Message>> byCorrelationId;
    private long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;
    private Long LONG_LIVED_MESSAGE_IN_MILLIS;

    protected MessageExpiryTask(ConcurrentHashMap<String, TimedBlockingQueue<Message>> byCorrelationId) {
        this.byCorrelationId = byCorrelationId;
    }

    public static MessageExpiryTask newOne(ConcurrentHashMap<String, TimedBlockingQueue<Message>> byCorrelationId) {
        return new MessageExpiryTask(byCorrelationId);
    }

    public MessageExpiryTask withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES) {
        this.EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;
        return this;
    }

    public MessageExpiryTask withLONG_LIVED_MESSAGE_IN_MILLIS(Long LONG_LIVED_MESSAGE_IN_MILLIS) {
        this.LONG_LIVED_MESSAGE_IN_MILLIS = LONG_LIVED_MESSAGE_IN_MILLIS;
        return this;
    }

    public Disposable runInBackground(long period, TimeUnit unit) {
        return Observable.interval(period, unit)
                .doOnNext(this::removeOldMessages)
                .subscribeOn(Schedulers.computation())
                .subscribe();
    }

    public Disposable runInBackground() {
        return runInBackground(EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES, TimeUnit.MINUTES);
    }

    protected void removeOldMessages(long executionNumber) {
        try {
            Iterator<Map.Entry<String, TimedBlockingQueue<Message>>> iterator = byCorrelationId.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, TimedBlockingQueue<Message>> entry = iterator.next();
                TimedBlockingQueue<Message> blocking = entry.getValue();

                if (blocking.getElapsedTime() > LONG_LIVED_MESSAGE_IN_MILLIS) {
                    Message message = blocking.peek();
                    if (message != null) {
                        message.ackUnwanted("rpc response message too old");
                    }
                    iterator.remove();
                }

            }
        } catch (Exception e) {
            logger.warn("Error removing old RPC result messages on RPC Client", e);
        }
    }
}
