package com.pos.common.rabbitmq.message.task;

import com.pos.common.rabbitmq.message.Message;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class FailedAckRetryTask {

    private final static Logger logger = LoggerFactory.getLogger(FailedAckRetryTask.class);

    private ConcurrentHashMap<String, Message> failedAckByCorrelationId;
    private Long LONG_LIVED_MESSAGE_IN_MILLIS;
    private long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;

    protected FailedAckRetryTask(ConcurrentHashMap<String, Message> failedAckByCorrelationId) {
        this.failedAckByCorrelationId=failedAckByCorrelationId;
    }

    public static FailedAckRetryTask newOne(ConcurrentHashMap<String, Message> failedAckByCorrelationId) {
        return new FailedAckRetryTask(failedAckByCorrelationId);
    }

    public FailedAckRetryTask withLONG_LIVED_MESSAGE_IN_MILLIS(Long LONG_LIVED_MESSAGE_IN_MILLIS) {
        this.LONG_LIVED_MESSAGE_IN_MILLIS = LONG_LIVED_MESSAGE_IN_MILLIS;
        return this;
    }

    public FailedAckRetryTask withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES) {
        this.EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;
        return this;
    }

    public Disposable runInBackground(long period, TimeUnit unit){
        return Observable.interval(period, unit)
                .doOnNext(this::retryFailedAcks)
                .subscribeOn(Schedulers.computation())
                .subscribe();
    }

    public Disposable runInBackground(){
        return runInBackground(EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES, TimeUnit.MINUTES);
    }

    protected void retryFailedAcks(long executionNumber) {
        try {
            Iterator<Map.Entry<String, Message>> iterator = failedAckByCorrelationId.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Message> entry = iterator.next();
                Message message = entry.getValue();

                try {
                    message.getChannel().basicAck(message.getEnvelope().getDeliveryTag(), false);
                    iterator.remove();
                } catch (Exception e) {
                    logger.warn("Error acking failed acks", e);
                }

                //delete old messages even when ack always throws exception
                if (message.getElapsedTime() > LONG_LIVED_MESSAGE_IN_MILLIS) {
                    iterator.remove();
                }

            }
        } catch (Exception e) {
            logger.warn("Error retrying failed acks", e);
        }
    }
}
