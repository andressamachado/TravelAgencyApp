package com.andressamachado.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.andressamachado.model.TravelPackage;

public class ResourcesUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable getDrawable(Context context, String textDrawable) {
        Resources resources = context.getResources();
        int drawableID = resources.getIdentifier(textDrawable, DRAWABLE, context.getPackageName());
        return resources.getDrawable(drawableID);
    }
}
