package com.asterinet.react.bgactions;

import android.app.NotificationManager;
import android.content.Intent;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class BackgroundActionsModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNBackgroundActions";
    private Intent currentServiceIntent;
    private final ReactContext reactContext;

    @ReactMethod
    public void addListener(String str) {
    }

    public String getName() {
        return TAG;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public BackgroundActionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void start(ReadableMap readableMap, Promise promise) {
        try {
            Intent intent = this.currentServiceIntent;
            if (intent != null) {
                this.reactContext.stopService(intent);
            }
            this.currentServiceIntent = new Intent(this.reactContext, RNBackgroundActionsTask.class);
            this.currentServiceIntent.putExtras(new BackgroundTaskOptions(this.reactContext, readableMap).getExtras());
            this.reactContext.startService(this.currentServiceIntent);
            promise.resolve((Object) null);
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }

    @ReactMethod
    public void stop(Promise promise) {
        Intent intent = this.currentServiceIntent;
        if (intent != null) {
            this.reactContext.stopService(intent);
        }
        promise.resolve((Object) null);
    }

    @ReactMethod
    public void updateNotification(ReadableMap readableMap, Promise promise) {
        try {
            ((NotificationManager) this.reactContext.getSystemService("notification")).notify(RNBackgroundActionsTask.SERVICE_NOTIFICATION_ID, RNBackgroundActionsTask.buildNotification(this.reactContext, new BackgroundTaskOptions(this.reactContext, readableMap)));
            promise.resolve((Object) null);
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }
}
