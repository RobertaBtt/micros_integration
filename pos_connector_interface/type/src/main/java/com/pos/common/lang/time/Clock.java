package com.pos.common.lang.time;

import java.time.Instant;


public class Clock {

    public Instant currentInstant() {
        return Instant.now();
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
