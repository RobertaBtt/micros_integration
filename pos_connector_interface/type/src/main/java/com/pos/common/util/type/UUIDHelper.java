package com.pos.common.util.type;

import java.text.DecimalFormat;
import java.util.UUID;

public class UUIDHelper {

    private static final DecimalFormat sdf = new DecimalFormat("00000000-0000-0000-0000-000000000000");

    public static final UUID fromNumber(Number number) {
        if (number == null) {
            return null;
        }

        final String twelveDigits = sdf.format(number);
        return UUID.fromString("00000000-0000-0000-0000-" + twelveDigits);
    }

    public static final Integer toInteger(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        String lastTwelveDigits = uuid.toString().substring(24);
        return Integer.valueOf(lastTwelveDigits);
    }

    public static final Long toLong(UUID uuid) {
        if (uuid == null) {
            return null;
        }
        String lastTwelveDigits = uuid.toString().substring(24);
        return Long.valueOf(lastTwelveDigits);
    }

}
