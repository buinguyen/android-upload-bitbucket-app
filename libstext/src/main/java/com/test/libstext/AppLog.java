package com.test.libstext;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class AppLog {

    public static void error(String tag, String msg) {
        Log.e(tag, msg);
    }

    public static void showToast(Context context, String text, int duration) {
        Toast.makeText(context, text, duration).show();
    }
}
