package com.pos.common.type;


import java.beans.Transient;
import java.util.Objects;

public class LocatedTime {

    private long timestamp;
    private String timezone;


    private LocatedTime() {
    }

    public LocatedTime(long timestamp, String timezone) {

        this.timestamp = timestamp;
        this.timezone = timezone;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocatedTime that = (LocatedTime) o;
        return timestamp == that.timestamp &&
                Objects.equals(timezone, that.timezone);
    }

    @Transient
    @Override
    public int hashCode() {

        return Objects.hash(timestamp, timezone);
    }

    @Transient
    @Override
    public String toString() {
        return "LocatedTime{" +
                "timestamp=" + timestamp +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}
