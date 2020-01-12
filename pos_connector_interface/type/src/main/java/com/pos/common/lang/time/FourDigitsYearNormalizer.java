package com.pos.common.lang.time;

import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class FourDigitsYearNormalizer implements Function<Integer, Integer> {

    private static DateTimeFormatter UNDER_THOUSAND = DateTimeFormatter.ofPattern("2yyy");

    @Override
    public Integer apply(Integer input) {

        if (input < 0 || input > 10000) {
            throw new IllegalArgumentException("Invalid value between -1 and 10000");
        }
        if (input < 1000) {
            return Integer.valueOf(Year.of(input).format(UNDER_THOUSAND));
        }
        return input;
    }
}
