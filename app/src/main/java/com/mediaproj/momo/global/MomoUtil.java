package com.mediaproj.momo.global;

import android.content.Context;
import android.widget.Toast;

import com.mediaproj.momo.data.UserData;

public class MomoUtil {

    static UserData ud;

    public static boolean isStringEmpty(String value) {
        return value == null || value.length() == 0;
    }

    public static void showMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static UserData getUserData() {
        return ud;
    }

    public static void setUserData(UserData userData) {
        ud = userData;
    }


}
