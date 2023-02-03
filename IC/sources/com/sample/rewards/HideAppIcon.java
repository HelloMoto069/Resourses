package com.sample.rewards;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class HideAppIcon extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    public String getName() {
        return "HideAppIcon";
    }

    HideAppIcon(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void HideAppIcon() {
        getCurrentActivity().getPackageManager().setComponentEnabledSetting(getCurrentActivity().getComponentName(), 2, 1);
    }
}
