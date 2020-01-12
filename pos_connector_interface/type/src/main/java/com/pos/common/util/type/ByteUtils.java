package com.pos.common.util.type;


import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;

public class ByteUtils {

    private static final byte BYTE_DELIMITER = 0x00;

    public static String byteArrayToBase64(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static byte[] longToBytes(long l) {

        byte[] result = new byte[8];
        for (int i = 7; i >= 0; i--) {
            result[i] = (byte) (l & 0xFF);
            l >>= 8;
        }

        return result;
    }

    public static long bytesToLong(byte[] b) {

        long result = 0;
        for (int i = 0; i < 8; i++) {
            result <<= 8;
            result |= (b[i] & 0xFF);
        }

        return result;
    }

    public static <Origin extends Collection<byte[]>, Destination extends Collection<Long>> Destination byteCollectionToLongCollection(Origin origin, Destination destination) {

        if (origin != null) {
            for (byte[] item : origin) {

                if (item != null) {
                    destination.add(bytesToLong(item));
                }
            }
        }

        return destination;
    }

    public static char[] bytesToChars(byte[] bytes) {

        if (bytes == null) {
            return null;
        }

        char[] result = new char[bytes.length / 2];
        for (int i = 0; i < result.length; i++) {
            result[i] = (char) (bytes[i * 2] << 8);
            result[i] |= (char) (bytes[i * 2 + 1] & 0x00ff);
        }

        return result;
    }

    public static byte[] charsToBytes(char[] chars) {

        if (chars == null) {
            return null;
        }

        byte[] result = new byte[chars.length * 2];
        for (int i = 0; i < chars.length; i++) {
            result[i * 2] = (byte) (chars[i] >> 8);
            result[i * 2 + 1] = (byte) (chars[i] & 0x00ff);
        }

        return result;
    }

    public static String bytesToString(byte[] bytes) {

        if (bytes == null) {
            return null;
        }

        return new String(bytesToChars(bytes));
    }

    public static byte[] stringToBytes(String string) {

        if (string == null) {
            return null;
        }

        return charsToBytes(string.toCharArray());
    }

    public static <T extends Collection<String>> T bytesToStringCollection(byte[] bytes, T collection) {

        if (bytes == null) {
            return null;
        }

        T result = collection == null ? (T) new ArrayList<String>() : collection;
        char[] chars = new char[bytes.length / 2];
        int offset = 0;
        int i = 0;
        for (; i < chars.length; i++) {

            byte byteA = bytes[i * 2];
            byte byteB = bytes[i * 2 + 1];

            if (byteA == BYTE_DELIMITER && byteB == BYTE_DELIMITER) {
                result.add(new String(chars, offset, i - offset));
                offset = i + 1;
            } else {
                chars[i] = (char) (byteA << 8);
                chars[i] |= (char) (byteB & 0x00ff);
            }
        }

        result.add(new String(chars, offset, i - offset));

        return result;
    }

    public static <T extends Collection<String>> byte[] stringCollectionToBytes(T strings) {

        if (strings == null) {
            return null;
        }

        int charCount = 0;
        int stringsCount = 0;
        for (String string : strings) {

            if (string != null) {
                charCount += string.length();
                stringsCount++;
            }
        }
        charCount += stringsCount - 1;
        int offset = 0;
        byte[] result = new byte[charCount * 2];
        for (String string : strings) {

            if (string != null) {
                if (offset > 0) {
                    result[offset++] = BYTE_DELIMITER;
                    result[offset++] = BYTE_DELIMITER;
                }

                char[] chars = string.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    result[offset + i * 2] = (byte) (chars[i] >> 8);
                    result[offset + i * 2 + 1] = (byte) (chars[i] & 0x00ff);
                }
                offset += chars.length * 2;
            }
        }

        return result;
    }


    public static <T extends Collection<Long>> T bytesToLongCollection(byte[] bytes, T collection) {

        if (bytes == null) {
            return null;
        }

        T result = collection == null ? (T) new ArrayList<Long>() : collection;

        long newLong = 0;
        for (int i = 0, j = 0; i < bytes.length; i++) {

            newLong <<= 8;
            newLong |= (bytes[i] & 0xFF);

            if (j == 7) {
                result.add(newLong);
                newLong = 0;
                j = 0;
            } else {
                j++;
            }
        }

        return result;
    }


    public static <T extends Collection<Long>> byte[] longCollectionToBytes(T longs) {

        if (longs == null) {
            return null;
        }

        int byteCount = 0;
        for (Long currentLong : longs) {

            if (currentLong != null) {
                byteCount += 8;
            }
        }

        byte[] result = new byte[byteCount];
        int currentLongIndex = 0;
        for (Long currentLong : longs) {
            if (currentLong != null) {
                for (int i = 7; i >= 0; i--) {
                    result[currentLongIndex + i] = (byte) (currentLong & 0xFF);
                    currentLong >>= 8;
                }
                currentLongIndex += 8;
            }
        }

        return result;
    }
}
