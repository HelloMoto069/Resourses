package com.applisto.appcloner.classes;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class PressBackAgainToExit extends BackKeyHandler {
    private static final String TAG = PressBackAgainToExit.class.getSimpleName();
    private Context mContext;
    private boolean mPressBackAgainToExit;
    private long mTimestamp;
    private Toast mToast;

    public PressBackAgainToExit(CloneSettings cloneSettings) {
        this.mPressBackAgainToExit = cloneSettings.getBoolean("pressBackAgainToExit", false).booleanValue();
        String str = TAG;
        Log.i(str, "PressBackAgainToExit; mPressBackAgainToExit: " + this.mPressBackAgainToExit);
    }

    public void init(Context context) {
        if (this.mPressBackAgainToExit) {
            this.mContext = context;
            onCreate();
        }
    }

    /* access modifiers changed from: protected */
    public boolean handleBackPressed(Activity activity, Object token) {
        long timestamp = System.currentTimeMillis();
        try {
            if (timestamp - this.mTimestamp > 1000) {
                Log.i(TAG, "invoke; intercept finishActivity");
                showToast();
                return false;
            }
            this.mTimestamp = timestamp;
            return true;
        } finally {
            this.mTimestamp = timestamp;
        }
    }

    private void showToast() {
        if (this.mToast != null) {
            try {
                this.mToast.cancel();
            } catch (Throwable th) {
            }
        }
        try {
            this.mToast = Toast.makeText(this.mContext, "Press Back again to exit.", 0);
            this.mToast.show();
        } catch (Throwable t) {
            Log.w(TAG, t);
        }
    }
}
