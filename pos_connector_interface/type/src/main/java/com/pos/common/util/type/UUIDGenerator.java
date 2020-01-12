package com.pos.common.util.type;

import java.util.Base64;
import java.util.UUID;

public class UUIDGenerator {

    public static UUID generate() {

        return UUID.randomUUID();
    }

    public static byte[] UUIDToByteArray(UUID uuid) {

        byte[] msb = ByteUtils.longToBytes(uuid.getMostSignificantBits());
        byte[] lsb = ByteUtils.longToBytes(uuid.getLeastSignificantBits());

        return new byte[]{
                msb[7], msb[6], msb[5], msb[4], msb[3], msb[2], msb[1], msb[0],
                lsb[7], lsb[6], lsb[5], lsb[4], lsb[3], lsb[2], lsb[1], lsb[0]
        };
    }

    public static String UUIDToBase64(UUID uuid) {
        return Base64.getEncoder().encodeToString(UUIDToByteArray(uuid));
    }

    public static UUID Base64ToUUID(String uuid) {

        byte[] bytes = Base64.getDecoder().decode(uuid);

        byte[] lsbBytes = new byte[]{
                bytes[8 + 7], bytes[8 + 6], bytes[8 + 5], bytes[8 + 4], bytes[8 + 3], bytes[8 + 2], bytes[8 + 1], bytes[8 + 0]
        };

        byte[] msbBytes = new byte[]{
                bytes[7], bytes[6], bytes[5], bytes[4], bytes[3], bytes[2], bytes[1], bytes[0]
        };

        long msb = ByteUtils.bytesToLong(msbBytes);
        long lsb = ByteUtils.bytesToLong(lsbBytes);

        return new UUID(msb, lsb);
    }
}
