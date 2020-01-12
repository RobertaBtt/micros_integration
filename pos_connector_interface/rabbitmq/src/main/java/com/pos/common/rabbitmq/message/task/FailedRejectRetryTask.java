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

public class FailedRejectRetryTask {

    private final static Logger logger = LoggerFactory.getLogger(FailedRejectRetryTask.class);

    private ConcurrentHashMap<String, Message> failedRejectByCorrelationId;
    private Long LONG_LIVED_MESSAGE_IN_MILLIS;
    private long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;

    protected FailedRejectRetryTask(ConcurrentHashMap<String, Message> failedRejectByCorrelationId) {
        this.failedRejectByCorrelationId = failedRejectByCorrelationId;
    }

    public static FailedRejectRetryTask newOne(ConcurrentHashMap<String, Message> failedRejectByCorrelationId) {
        return new FailedRejectRetryTask(failedRejectByCorrelationId);
    }

    public FailedRejectRetryTask withLONG_LIVED_MESSAGE_IN_MILLIS(Long LONG_LIVED_MESSAGE_IN_MILLIS) {
        this.LONG_LIVED_MESSAGE_IN_MILLIS = LONG_LIVED_MESSAGE_IN_MILLIS;
        return this;
    }

    public FailedRejectRetryTask withEXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES(long EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES) {
        this.EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES = EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES;
        return this;
    }

    public Disposable runInBackground(long period, TimeUnit unit) {
        return Observable.interval(period, unit)
                .doOnNext(this::retryFailedRejects)
                .subscribeOn(Schedulers.computation())
                .subscribe();
    }

    public Disposable runInBackground() {
        return runInBackground(EXPIRY_OLD_MESSAGE_TASK_PERIOD_IN_MINUTES, TimeUnit.MINUTES);
    }

    protected void retryFailedRejects(long executionNumber) {
        try {
            Iterator<Map.Entry<String, Message>> iterator = failedRejectByCorrelationId.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Message> entry = iterator.next();
                Message message = entry.getValue();

                try {
                    message.getChannel().basicNack(message.getEnvelope().getDeliveryTag(), false, true);
                    iterator.remove();
                } catch (Exception e) {
                    logger.warn("Error rejecting failed reject", e);
                }

                //delete old messages even when Nack always throws exception
                if (message.getElapsedTime() > LONG_LIVED_MESSAGE_IN_MILLIS) {
                    iterator.remove();
                }

            }
        } catch (Exception e) {
            logger.warn("Error retrying failed rejects", e);
        }
    }
}
