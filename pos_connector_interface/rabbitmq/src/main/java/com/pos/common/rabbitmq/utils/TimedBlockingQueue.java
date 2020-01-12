package com.pos.common.rabbitmq.utils;


import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class TimedBlockingQueue<E> extends ArrayBlockingQueue<E> {

    private long createdTime = System.currentTimeMillis();

    public TimedBlockingQueue(int capacity) {
        super(capacity);
    }

    public TimedBlockingQueue(int capacity, boolean fair) {
        super(capacity, fair);
    }

    public TimedBlockingQueue(int capacity, boolean fair, Collection<? extends E> c) {
        super(capacity, fair, c);
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - this.getCreatedTime();
    }
}
