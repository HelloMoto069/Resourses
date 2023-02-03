package com.appser;

import android.content.Context;
import android.content.SharedPreferences;

public class MySettings {
    public static final String ScreenHight = "SCW";
    public static final String ScreenWidth = "SCH";
    private static SharedPreferences mSharedPref;

    public static void Write(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        mSharedPref = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static String read(Context context, String str, String str2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        mSharedPref = sharedPreferences;
        return sharedPreferences.getString(str, str2);
    }
}
