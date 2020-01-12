package com.pos.common.lang.time;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public StopWatch start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
        return this;
    }

    public long stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
        return getElapsedTime();
    }

    private long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

}
