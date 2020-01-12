package com.pos.common.util.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WatchdogExecutor implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(WatchdogExecutor.class);

    private ScheduledExecutorService executor;
    private Runnable runnable;
    private long period;

    public WatchdogExecutor(String namingPattern, Runnable runnable, int period, TimeUnit unit) {
        this(Executors.newScheduledThreadPool(2,
                new BasicThreadFactory.Builder().namingPattern(namingPattern).build()),
                runnable, period, unit);
    }


    public WatchdogExecutor(ScheduledExecutorService executor, Runnable runnable, int period, TimeUnit unit) {

        this.runnable = runnable;
        this.executor = executor;
        this.period = unit.toMillis(period);

        this.executor.scheduleAtFixedRate(this, 0, 1, TimeUnit.MICROSECONDS);
    }

    @Override
    public void run() {

        long periodAmount;
        long now;
        Thread.currentThread().setName(runnable.getClass().getSimpleName() + "-watchdog");

        try {
            while (true) {

                periodAmount = System.currentTimeMillis() + period;

                Future<?> futureTask = executor.submit(runnable);
                futureTask.get();
                now = System.currentTimeMillis();

                if (periodAmount > now) {
                    Thread.sleep(periodAmount - now);
                }
            }
        } catch (Exception e) {
            logger.error("Runnable error " + runnable.getClass(), e);
        }
    }

}
