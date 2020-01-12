package com.pos.common.util;

import java.text.NumberFormat;
import java.util.Locale;

public final class LocaleUtil {


    public static Locale getLocaleByCurrency(String currencyCode) {
        for (Locale locale : NumberFormat.getAvailableLocales()) {
            String code = NumberFormat.getCurrencyInstance(locale).getCurrency().getCurrencyCode();
            if (currencyCode.equals(code)) {
                return locale;
            }
        }
        return null;
    }

}
