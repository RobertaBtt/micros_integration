package com.pos.common.util.type;


import com.pos.common.exceptions.MalformedUUIDException;

import java.util.UUID;

public class UUIDExtractor {

    public static String extractMacAddress(UUID uuid) throws MalformedUUIDException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = new byte[0];
        try {
            bytes = getMacBytes(uuid.node());
        } catch (IllegalArgumentException | UnsupportedOperationException exception) {
            throw new MalformedUUIDException(exception);
        }
        for (byte b : bytes) {
            sb.append(String.format("%02X:", b));
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : sb.toString();
    }

    private static byte[] getMacBytes(long n) {
        byte[] bytes = new byte[6];
        bytes[5] = (byte) (n);
        n >>>= 8;
        bytes[4] = (byte) (n);
        n >>>= 8;
        bytes[3] = (byte) (n);
        n >>>= 8;
        bytes[2] = (byte) (n);
        n >>>= 8;
        bytes[1] = (byte) (n);
        n >>>= 8;
        bytes[0] = (byte) (n);
        return bytes;
    }


}
