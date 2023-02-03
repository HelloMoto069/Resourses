package com.sample.rewards;

import android.app.Application;
import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        /* access modifiers changed from: protected */
        public String getJSMainModuleName() {
            return "index";
        }

        public boolean getUseDeveloperSupport() {
            return false;
        }

        /* access modifiers changed from: protected */
        public List<ReactPackage> getPackages() {
            ArrayList<ReactPackage> packages = new PackageList((ReactNativeHost) this).getPackages();
            packages.add(new HideAppIconPackage());
            return packages;
        }
    };

    private static void initializeFlipper(Context context, ReactInstanceManager reactInstanceManager) {
    }

    public ReactNativeHost getReactNativeHost() {
        return this.mReactNativeHost;
    }

    public void onCreate() {
        super.onCreate();
        SoLoader.init((Context) this, false);
        initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
    }
}
