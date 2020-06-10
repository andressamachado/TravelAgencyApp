package com.andressamachado.util;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtil {

    public static final String CURRENCY_TARGET = "$";
    public static final String CURRENCY_REPLACEMENT = "$ ";

    public static String currencyFormat(BigDecimal value) {
        NumberFormat canadianDollarFormat = DecimalFormat.getCurrencyInstance(Locale.CANADA);
        return canadianDollarFormat.format(value).replace(CURRENCY_TARGET, CURRENCY_REPLACEMENT);
    }
}
