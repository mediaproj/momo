package com.mediaproj.momo.global;

public class MomoUtil {

    public static boolean isStringEmpty(String value) {
        if (value == null || value.length() == 0)
            return true;
        return false;
    }

}
