package com.sample.rewards;

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import org.devio.rn.splashscreen.SplashScreen;

public class MainActivity extends ReactActivity {
    /* access modifiers changed from: protected */
    public String getMainComponentName() {
        return "rewards";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        SplashScreen.show(this);
        super.onCreate(bundle);
    }
}
