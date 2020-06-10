package com.andressamachado.util;

import com.andressamachado.model.TravelPackage;

public class DurationUtil {

    public static final String PLURAL = " Days";
    public static final String SINGULAR = " One Day";

    public static String durationFormat(int duration) {

        if (duration > 1) {
            return duration + PLURAL;
        }
        return SINGULAR;
    }
}
