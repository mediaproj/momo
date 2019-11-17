package com.mediaproj.momo.global;

import android.content.Context;
import android.widget.Toast;

import com.mediaproj.momo.R;

public class MomoUtil {

    public static boolean isStringEmpty(String value) {
        return value == null || value.length() == 0;
    }

    public static void showMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
