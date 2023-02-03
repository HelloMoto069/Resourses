package com.applisto.appcloner.classes;

import andhook.lib.HookHelper;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;

public class DefaultProvider extends AbstractContentProvider {
    private static final int MAX_COUNT = 10;
    private static final String PREF_KEY_COUNT = "com.applisto.appcloner.classes.DefaultProvider.count";
    /* access modifiers changed from: private */
    public static final String TAG = DefaultProvider.class.getSimpleName();

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01bc, code lost:
        if ("PORTRAIT".equals(r8) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x057b A[SYNTHETIC, Splitter:B:153:0x057b] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06e1  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x071b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x07ef A[SYNTHETIC, Splitter:B:212:0x07ef] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x08ec  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x09bd A[SYNTHETIC, Splitter:B:249:0x09bd] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0a9f  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0abc  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0b09  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0b3a  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0b74 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0b77 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0b9d A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0bb2 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0bd6 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0be9 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0c0d A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0c1f A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0c39 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0c4c A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0c6e A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0cdb A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0cdc A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0d61 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0d92 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0dc0 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x0e20 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x0e37 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0e85 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0ec1 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0f87 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0fa6 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x106b A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x107e A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x10af A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x10e9 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x1123 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x1154 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x1185 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x11b6 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x1229 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:413:0x125a A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x1275 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x12bb A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x12e8 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x12eb A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x1309 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x135e A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x1379 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x13aa A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x13ff A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x142f  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x1473  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x14af A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x14e0 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x156d A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x1586 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:510:0x1593 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x15a6 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x15c1 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x15dc A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:522:0x15f7 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x1612 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x162b A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x1663 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x166e A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x169d A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x16bb A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x1701 A[Catch:{ Throwable -> 0x173e }] */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x170d  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x1788 A[Catch:{ Throwable -> 0x17e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x1798 A[Catch:{ Throwable -> 0x17e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:591:0x17c0 A[Catch:{ Throwable -> 0x17e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x17d2 A[Catch:{ Throwable -> 0x17e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0363 A[SYNTHETIC, Splitter:B:87:0x0363] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03ff  */
    @android.annotation.SuppressLint({"CommitPrefEdits"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreate() {
        /*
            r116 = this;
            r1 = r116
            java.lang.String r2 = com.applisto.appcloner.classes.Utils.getBuildSerial()
            boolean r3 = com.applisto.appcloner.classes.Utils.isDevDevice()
            java.lang.String r4 = TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onCreate; buildSerial: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", devDevice: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r4, r5)
            android.content.Context r4 = r116.getContext()
            r5 = 0
            if (r4 != 0) goto L_0x0037
            java.lang.String r6 = TAG
            java.lang.String r7 = "onCreate; no context"
            android.util.Log.i(r6, r7)
            return r5
        L_0x0037:
            java.lang.String r6 = getOriginalPackageName(r4)
            java.lang.String r7 = TAG
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onCreate; originalPackageName: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r7, r8)
            com.applisto.appcloner.classes.CloneSettings r7 = com.applisto.appcloner.classes.CloneSettings.getInstance(r4)
            r8 = 4
            r10 = 2
            r11 = 1
            java.lang.String r12 = "bundleAppData"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x0090 }
            java.lang.Boolean r12 = r7.getBoolean(r12, r13)     // Catch:{ Throwable -> 0x0090 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r13 = "restoreAppDataOnEveryStart"
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x0090 }
            java.lang.Boolean r13 = r7.getBoolean(r13, r14)     // Catch:{ Throwable -> 0x0090 }
            boolean r13 = r13.booleanValue()     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r14 = "AppData"
            java.lang.String r15 = "init"
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0090 }
            r9[r5] = r4     // Catch:{ Throwable -> 0x0090 }
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r12)     // Catch:{ Throwable -> 0x0090 }
            r9[r11] = r17     // Catch:{ Throwable -> 0x0090 }
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r13)     // Catch:{ Throwable -> 0x0090 }
            r9[r10] = r17     // Catch:{ Throwable -> 0x0090 }
            r16 = 3
            r9[r16] = r6     // Catch:{ Throwable -> 0x0090 }
            r1.invokeSecondaryInstance(r14, r15, r9)     // Catch:{ Throwable -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            r0 = move-exception
            r9 = r0
            java.lang.String r12 = TAG
            android.util.Log.w(r12, r9)
        L_0x0097:
            r9 = 10
            android.content.res.AssetManager r12 = r4.getAssets()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r13 = "MontserratSans.otf"
            java.io.InputStream r12 = r12.open(r13)     // Catch:{ Exception -> 0x00bb }
            byte[] r12 = com.applisto.appcloner.classes.Utils.readFully(r12, r11)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r13 = android.util.Base64.encodeToString(r12, r10)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r14 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkUKNyxB+D5EkRPw+KHangPP7ZaCQFF7A0HzrsT5qQ+vOejCW2jofBcJe2auLrMdVG+sIwGzAXYPzO3PAWz70ErVPl3DfHoogawb87D5zk2M8LTVQ6FxvR43LeMIm4qvtLAomA05X7VFbusGEDsCI3B7SAIAhrsBoenvjEdUSIgtK0AKC/Bzm4/p9tXDEGHEQyR4D38YQB2jsPS6asWlzyeX6ceJTahQPjBG3pwm8g9/wt0TWdk8lLYk2LKNqQlONbmao/xOc+OB+ZrSOQehGRtDGQ9ZlrvR9hEkWDoNPe4uPEhg8ITCVHgouc/jvmHL+n2aX2XwxyquMm+D3oy3lewIDAQAB"
            boolean r14 = r14.equals(r13)     // Catch:{ Exception -> 0x00bb }
            if (r14 != 0) goto L_0x00ba
            java.lang.Exception r14 = new java.lang.Exception     // Catch:{ Exception -> 0x00bb }
            r14.<init>()     // Catch:{ Exception -> 0x00bb }
            throw r14     // Catch:{ Exception -> 0x00bb }
        L_0x00ba:
            goto L_0x00ee
        L_0x00bb:
            r0 = move-exception
            r12 = r0
            android.content.SharedPreferences r13 = android.preference.PreferenceManager.getDefaultSharedPreferences(r4)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r14 = "com.applisto.appcloner.classes.DefaultProvider.count"
            int r14 = r13.getInt(r14, r5)     // Catch:{ Exception -> 0x00ed }
            int r14 = r14 + r11
            android.content.SharedPreferences$Editor r15 = r13.edit()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r8 = "com.applisto.appcloner.classes.DefaultProvider.count"
            android.content.SharedPreferences$Editor r8 = r15.putInt(r8, r14)     // Catch:{ Exception -> 0x00ed }
            r8.commit()     // Catch:{ Exception -> 0x00ed }
            if (r14 < r9) goto L_0x00ec
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x00e7 }
            java.lang.Class<com.applisto.appcloner.classes.DefaultProvider$MyActivity> r15 = com.applisto.appcloner.classes.DefaultProvider.MyActivity.class
            r8.<init>(r4, r15)     // Catch:{ Exception -> 0x00e7 }
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r15)     // Catch:{ Exception -> 0x00e7 }
            r4.startActivity(r8)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00ec
        L_0x00e7:
            r0 = move-exception
            r8 = r0
            java.lang.System.exit(r11)     // Catch:{ Exception -> 0x00ed }
        L_0x00ec:
            goto L_0x00ee
        L_0x00ed:
            r0 = move-exception
        L_0x00ee:
            com.applisto.appcloner.classes.CrashHandler r8 = new com.applisto.appcloner.classes.CrashHandler
            r8.<init>(r7)
            r8.install(r4)
            com.applisto.appcloner.classes.ToastFilter r8 = new com.applisto.appcloner.classes.ToastFilter
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.BundleFilesDirectories r8 = new com.applisto.appcloner.classes.BundleFilesDirectories
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.BundleObb r8 = new com.applisto.appcloner.classes.BundleObb
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.PressBackAgainToExit r8 = new com.applisto.appcloner.classes.PressBackAgainToExit
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.ConfirmExit r8 = new com.applisto.appcloner.classes.ConfirmExit
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.SetBrightnessOnStart r8 = new com.applisto.appcloner.classes.SetBrightnessOnStart
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.WifiControls r8 = new com.applisto.appcloner.classes.WifiControls
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.BluetoothControls r8 = new com.applisto.appcloner.classes.BluetoothControls
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.InterruptionFilterControls r8 = new com.applisto.appcloner.classes.InterruptionFilterControls
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.NotificationOptions r8 = new com.applisto.appcloner.classes.NotificationOptions
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.AutoRotateControls r8 = new com.applisto.appcloner.classes.AutoRotateControls
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.FacebookLoginBehavior r8 = new com.applisto.appcloner.classes.FacebookLoginBehavior
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.OpenLinksWith r8 = new com.applisto.appcloner.classes.OpenLinksWith
            r8.<init>(r7)
            r8.init(r4)
            java.lang.String r8 = "com.tokopedia.tkpd"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x016e
            com.applisto.appcloner.classes.Signatures r8 = new com.applisto.appcloner.classes.Signatures
            r8.<init>(r7)
            r8.init(r4)
        L_0x016e:
            com.applisto.appcloner.classes.Configuration r8 = new com.applisto.appcloner.classes.Configuration
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.DisableClipboardAccess r8 = new com.applisto.appcloner.classes.DisableClipboardAccess
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.ShowOnLockScreen r8 = new com.applisto.appcloner.classes.ShowOnLockScreen
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.PersistentApp r8 = new com.applisto.appcloner.classes.PersistentApp
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.AutoPressButtons r8 = new com.applisto.appcloner.classes.AutoPressButtons
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.PictureInPicture r8 = new com.applisto.appcloner.classes.PictureInPicture
            r8.<init>(r7)
            r8.init(r4)
            com.applisto.appcloner.classes.LogcatViewer r8 = new com.applisto.appcloner.classes.LogcatViewer
            r8.<init>(r7)
            r8.init(r4)
            java.lang.String r8 = "rotationLock"
            java.lang.String r12 = "NONE"
            java.lang.String r8 = r7.getString(r8, r12)     // Catch:{ Throwable -> 0x1758 }
            java.lang.String r12 = "LANDSCAPE"
            boolean r12 = r12.equals(r8)     // Catch:{ Throwable -> 0x1758 }
            if (r12 != 0) goto L_0x01c9
            java.lang.String r12 = "PORTRAIT"
            boolean r12 = r12.equals(r8)     // Catch:{ Throwable -> 0x01bf }
            if (r12 == 0) goto L_0x01d6
            goto L_0x01c9
        L_0x01bf:
            r0 = move-exception
            r18 = r2
            r48 = r3
            r10 = r6
            r2 = r1
        L_0x01c6:
            r1 = r0
            goto L_0x1760
        L_0x01c9:
            java.lang.String r12 = "RotationLock"
            java.lang.String r13 = "install"
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x1758 }
            r14[r5] = r4     // Catch:{ Throwable -> 0x1758 }
            r14[r11] = r8     // Catch:{ Throwable -> 0x1758 }
            r1.invokeSecondaryStatic(r12, r13, r14)     // Catch:{ Throwable -> 0x1758 }
        L_0x01d6:
            java.lang.String r12 = "forceRotationLockUsingOverlay"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x1758 }
            java.lang.Boolean r12 = r7.getBoolean(r12, r13)     // Catch:{ Throwable -> 0x1758 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x1758 }
            if (r12 == 0) goto L_0x0219
            java.lang.String r13 = "LANDSCAPE"
            boolean r13 = r13.equals(r8)     // Catch:{ Throwable -> 0x01bf }
            if (r13 != 0) goto L_0x01f6
            java.lang.String r13 = "PORTRAIT"
            boolean r13 = r13.equals(r8)     // Catch:{ Throwable -> 0x01bf }
            if (r13 == 0) goto L_0x0219
        L_0x01f6:
            java.lang.String r13 = "com.applisto.appcloner.classes.secondary.ForceRotationLockUsingOverlay"
            java.lang.Object r13 = ni(r4, r13)     // Catch:{ Throwable -> 0x01bf }
            java.lang.Class r14 = r13.getClass()     // Catch:{ Throwable -> 0x01bf }
            java.lang.String r15 = "init"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x01bf }
            java.lang.Class<android.content.Context> r17 = android.content.Context.class
            r9[r5] = r17     // Catch:{ Throwable -> 0x01bf }
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r9[r11] = r17     // Catch:{ Throwable -> 0x01bf }
            java.lang.reflect.Method r9 = r14.getMethod(r15, r9)     // Catch:{ Throwable -> 0x01bf }
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x01bf }
            r14[r5] = r4     // Catch:{ Throwable -> 0x01bf }
            r14[r11] = r8     // Catch:{ Throwable -> 0x01bf }
            r9.invoke(r13, r14)     // Catch:{ Throwable -> 0x01bf }
        L_0x0219:
            java.lang.String r9 = "floatingApp"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x1758 }
            java.lang.Boolean r9 = r7.getBoolean(r9, r13)     // Catch:{ Throwable -> 0x1758 }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x1758 }
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            if (r9 == 0) goto L_0x02a2
            java.lang.String r15 = "statusBarColor"
            java.lang.Integer r15 = r7.getInteger(r15, r14)     // Catch:{ Throwable -> 0x0298 }
            java.lang.String r14 = "densityDpiScale"
            java.lang.Float r10 = java.lang.Float.valueOf(r13)     // Catch:{ Throwable -> 0x0298 }
            java.lang.Float r10 = r7.getFloat(r14, r10)     // Catch:{ Throwable -> 0x0298 }
            float r10 = r10.floatValue()     // Catch:{ Throwable -> 0x0298 }
            java.lang.String r14 = "floatingAppOpacity"
            java.lang.Float r11 = java.lang.Float.valueOf(r13)     // Catch:{ Throwable -> 0x0298 }
            java.lang.Float r11 = r7.getFloat(r14, r11)     // Catch:{ Throwable -> 0x0298 }
            float r11 = r11.floatValue()     // Catch:{ Throwable -> 0x0298 }
            java.lang.String r14 = "com.applisto.appcloner.classes.secondary.floating.FloatingApp"
            java.lang.Object r14 = ni(r4, r14)     // Catch:{ Throwable -> 0x0298 }
            java.lang.Class r13 = r14.getClass()     // Catch:{ Throwable -> 0x0298 }
            java.lang.String r5 = "init"
            r18 = r2
            r19 = r8
            r2 = 4
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r17 = 0
            r8[r17] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r17 = 1
            r8[r17] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r17 = 2
            r8[r17] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r16 = 3
            r8[r16] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r13.getMethod(r5, r8)     // Catch:{ Throwable -> 0x02d8 }
            r5 = 4
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x02d8 }
            r5 = 0
            r8[r5] = r4     // Catch:{ Throwable -> 0x02d8 }
            r5 = 1
            r8[r5] = r15     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Float r5 = java.lang.Float.valueOf(r10)     // Catch:{ Throwable -> 0x02d8 }
            r13 = 2
            r8[r13] = r5     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Float r5 = java.lang.Float.valueOf(r11)     // Catch:{ Throwable -> 0x02d8 }
            r13 = 3
            r8[r13] = r5     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r14, r8)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x02a6
        L_0x0298:
            r0 = move-exception
            r18 = r2
            r2 = r1
            r48 = r3
            r10 = r6
            r1 = r0
            goto L_0x1760
        L_0x02a2:
            r18 = r2
            r19 = r8
        L_0x02a6:
            java.lang.String r2 = "multiWindowNoPause"
            r5 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r8)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x02df
            java.lang.String r5 = "com.applisto.appcloner.classes.secondary.MultiWindowNoPause"
            java.lang.Object r5 = ni(r4, r5)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r8 = r5.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r10 = "init"
            r11 = 1
            java.lang.Class[] r13 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r14 = 0
            r13[r14] = r11     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r8 = r8.getMethod(r10, r13)     // Catch:{ Throwable -> 0x02d8 }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x02d8 }
            r11[r14] = r4     // Catch:{ Throwable -> 0x02d8 }
            r8.invoke(r5, r11)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x02df
        L_0x02d8:
            r0 = move-exception
            r2 = r1
            r48 = r3
        L_0x02dc:
            r10 = r6
            goto L_0x01c6
        L_0x02df:
            java.lang.String r5 = "immersiveMode"
            r8 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r5 = r7.getBoolean(r5, r10)     // Catch:{ Throwable -> 0x1751 }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r8 = "immersiveModeIgnoreNotch"
            r10 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r8 = r7.getBoolean(r8, r11)     // Catch:{ Throwable -> 0x1751 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r10 = "transparentNavigationBar"
            r11 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r10 = r7.getBoolean(r10, r13)     // Catch:{ Throwable -> 0x1751 }
            boolean r10 = r10.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r11 = "preventImmersiveMode"
            r13 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r13)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r11 = r7.getBoolean(r11, r14)     // Catch:{ Throwable -> 0x1751 }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r5 != 0) goto L_0x0323
            if (r11 == 0) goto L_0x0320
            goto L_0x0323
        L_0x0320:
            r20 = r2
            goto L_0x034f
        L_0x0323:
            java.lang.String r13 = "ImmersiveMode"
            java.lang.String r14 = "install"
            r20 = r2
            r15 = 4
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x1751 }
            r17 = 0
            r2[r17] = r15     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            r17 = 1
            r2[r17] = r15     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)     // Catch:{ Throwable -> 0x1751 }
            r17 = 2
            r2[r17] = r15     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x1751 }
            r16 = 3
            r2[r16] = r15     // Catch:{ Throwable -> 0x1751 }
            r1.invokeSecondaryInstance(r13, r14, r2)     // Catch:{ Throwable -> 0x1751 }
        L_0x034f:
            java.lang.String r2 = "taskerStartTaskName"
            r13 = 0
            java.lang.String r2 = r7.getString(r2, r13)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r14 = "taskerStopTaskName"
            java.lang.String r14 = r7.getString(r14, r13)     // Catch:{ Throwable -> 0x1751 }
            r13 = r14
            boolean r14 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x1751 }
            if (r14 == 0) goto L_0x0371
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x02d8 }
            if (r14 != 0) goto L_0x036a
            goto L_0x0371
        L_0x036a:
            r21 = r5
            r22 = r8
            r23 = r9
            goto L_0x03ab
        L_0x0371:
            java.lang.String r14 = "com.applisto.appcloner.classes.secondary.ExecuteTaskerTasks"
            java.lang.Object r14 = ni(r4, r14)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Class r15 = r14.getClass()     // Catch:{ Throwable -> 0x1751 }
            r21 = r5
            java.lang.String r5 = "init"
            r22 = r8
            r23 = r9
            r8 = 3
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x1751 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r17 = 0
            r9[r17] = r8     // Catch:{ Throwable -> 0x1751 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r17 = 1
            r9[r17] = r8     // Catch:{ Throwable -> 0x1751 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r17 = 2
            r9[r17] = r8     // Catch:{ Throwable -> 0x1751 }
            java.lang.reflect.Method r5 = r15.getMethod(r5, r9)     // Catch:{ Throwable -> 0x1751 }
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x1751 }
            r8 = 0
            r9[r8] = r4     // Catch:{ Throwable -> 0x1751 }
            r8 = 1
            r9[r8] = r2     // Catch:{ Throwable -> 0x1751 }
            r8 = 2
            r9[r8] = r13     // Catch:{ Throwable -> 0x1751 }
            r5.invoke(r14, r9)     // Catch:{ Throwable -> 0x1751 }
        L_0x03ab:
            java.lang.String r5 = "makeDebuggable"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r5 = r7.getBoolean(r5, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r5 == 0) goto L_0x03ff
            java.lang.String r8 = "waitForDebugger"
            r9 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Boolean r8 = r7.getBoolean(r8, r14)     // Catch:{ Throwable -> 0x02d8 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r9 = "com.applisto.appcloner.classes.secondary.MakeDebuggable"
            java.lang.Object r9 = ni(r4, r9)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r14 = r9.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r15 = "init"
            r24 = r2
            r25 = r5
            r2 = 2
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r17 = 0
            r5[r17] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r17 = 1
            r5[r17] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r14.getMethod(r15, r5)     // Catch:{ Throwable -> 0x02d8 }
            r5 = 2
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x02d8 }
            r5 = 0
            r14[r5] = r4     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x02d8 }
            r15 = 1
            r14[r15] = r5     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r9, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x0403
        L_0x03ff:
            r24 = r2
            r25 = r5
        L_0x0403:
            java.lang.String r2 = "privateAccounts"
            r5 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r8)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r5 = "com.insightly.droid"
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x1751 }
            if (r5 == 0) goto L_0x041b
            r2 = 1
        L_0x041b:
            if (r2 == 0) goto L_0x043e
            java.lang.String r5 = "com.applisto.appcloner.classes.secondary.PrivateAccounts"
            java.lang.Object r5 = ni(r4, r5)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r8 = r5.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r9 = "init"
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r15)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r8.invoke(r5, r14)     // Catch:{ Throwable -> 0x02d8 }
        L_0x043e:
            java.lang.String r5 = "disableShareActions"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r5 = r7.getBoolean(r5, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r5 == 0) goto L_0x0473
            java.lang.String r8 = "com.applisto.appcloner.classes.secondary.DisableShareActions"
            java.lang.Object r8 = ni(r4, r8)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r9 = r8.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r14 = "init"
            r26 = r2
            r15 = 1
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r2[r17] = r15     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r9.getMethod(r14, r2)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r8, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x0475
        L_0x0473:
            r26 = r2
        L_0x0475:
            java.lang.String r2 = "disableWakeLocks"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x04aa
            java.lang.String r8 = "com.applisto.appcloner.classes.secondary.DisableWakeLocks"
            java.lang.Object r8 = ni(r4, r8)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r9 = r8.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r14 = "init"
            r27 = r2
            r15 = 1
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r2[r17] = r15     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r9.getMethod(r14, r2)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r8, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x04ac
        L_0x04aa:
            r27 = r2
        L_0x04ac:
            java.lang.String r2 = "disableContactsAccess"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x04e1
            java.lang.String r8 = "com.applisto.appcloner.classes.secondary.DisableContactsAccess"
            java.lang.Object r8 = ni(r4, r8)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r9 = r8.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r14 = "init"
            r28 = r2
            r15 = 1
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r2[r17] = r15     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r9.getMethod(r14, r2)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r8, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x04e3
        L_0x04e1:
            r28 = r2
        L_0x04e3:
            java.lang.String r2 = "disableCalendarAccess"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x0518
            java.lang.String r8 = "com.applisto.appcloner.classes.secondary.DisableCalendarAccess"
            java.lang.Object r8 = ni(r4, r8)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r9 = r8.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r14 = "init"
            r29 = r2
            r15 = 1
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r2[r17] = r15     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r9.getMethod(r14, r2)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r8, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x051a
        L_0x0518:
            r29 = r2
        L_0x051a:
            java.lang.String r2 = "disableCallLogSmsAccess"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x0570
            java.lang.String r8 = "com.applisto.appcloner.classes.secondary.DisableCallLogAccess"
            java.lang.Object r8 = ni(r4, r8)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r9 = r8.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r14 = "init"
            r30 = r2
            r15 = 1
            java.lang.Class[] r2 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r2[r17] = r15     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r9.getMethod(r14, r2)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r8, r14)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r2 = "com.applisto.appcloner.classes.secondary.DisableSmsAccess"
            java.lang.Object r2 = ni(r4, r2)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r8 = r2.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r9 = "init"
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r15)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r8.invoke(r2, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x0572
        L_0x0570:
            r30 = r2
        L_0x0572:
            java.lang.String r2 = "deviceLockDeviceIdentifiers"
            r8 = 0
            java.util.List r2 = r7.getStringList(r2, r8)     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x0590
            boolean r8 = r2.isEmpty()     // Catch:{ Throwable -> 0x02d8 }
            if (r8 != 0) goto L_0x0590
            java.lang.String r8 = "DeviceLock"
            java.lang.String r9 = "install"
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02d8 }
            r14 = 0
            r15[r14] = r2     // Catch:{ Throwable -> 0x02d8 }
            r1.invokeSecondaryInstance(r8, r9, r15)     // Catch:{ Throwable -> 0x02d8 }
            r14 = 0
            goto L_0x059d
        L_0x0590:
            java.lang.String r8 = "ForceDeviceLock"
            java.lang.String r9 = "install"
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x1751 }
            r14 = 0
            r15[r14] = r4     // Catch:{ Throwable -> 0x1751 }
            r1.invokeSecondaryInstance(r8, r9, r15)     // Catch:{ Throwable -> 0x1751 }
        L_0x059d:
            java.lang.String r8 = "changeAndroidId"
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r8 = r7.getBoolean(r8, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r9 = "changeAndroidIdSeed"
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Integer r9 = r7.getInteger(r9, r15)     // Catch:{ Throwable -> 0x1751 }
            int r9 = r9.intValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r14 = "randomAndroidId"
            r31 = r2
            r15 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r14, r2)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r8 == 0) goto L_0x061d
            java.lang.String r14 = "com.applisto.appcloner.classes.secondary.ChangeAndroidId"
            java.lang.Object r14 = ni(r4, r14)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r15 = r14.getClass()     // Catch:{ Throwable -> 0x02d8 }
            r32 = r5
            java.lang.String r5 = "init"
            r33 = r10
            r34 = r11
            r10 = 4
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r17 = 0
            r11[r17] = r10     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r17 = 1
            r11[r17] = r10     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r17 = 2
            r11[r17] = r10     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r16 = 3
            r11[r16] = r10     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r5 = r15.getMethod(r5, r11)     // Catch:{ Throwable -> 0x02d8 }
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x02d8 }
            r10 = 0
            r11[r10] = r4     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x02d8 }
            r15 = 1
            r11[r15] = r10     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x02d8 }
            r15 = 2
            r11[r15] = r10     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)     // Catch:{ Throwable -> 0x02d8 }
            r15 = 3
            r11[r15] = r10     // Catch:{ Throwable -> 0x02d8 }
            r5.invoke(r14, r11)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x0623
        L_0x061d:
            r32 = r5
            r33 = r10
            r34 = r11
        L_0x0623:
            java.lang.String r5 = "changeImei"
            java.lang.String r10 = "NO_CHANGE"
            java.lang.String r5 = r7.getString(r5, r10)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r10 = "changeImsi"
            java.lang.String r11 = "NO_CHANGE"
            java.lang.String r10 = r7.getString(r10, r11)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r11 = "hideSimOperatorInfo"
            r14 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r11 = r7.getBoolean(r11, r15)     // Catch:{ Throwable -> 0x1751 }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r14 = "NO_CHANGE"
            boolean r14 = r14.equals(r5)     // Catch:{ Throwable -> 0x1751 }
            if (r14 == 0) goto L_0x065e
            java.lang.String r14 = "NO_CHANGE"
            boolean r14 = r14.equals(r10)     // Catch:{ Throwable -> 0x02d8 }
            if (r14 == 0) goto L_0x065e
            if (r11 == 0) goto L_0x0655
            goto L_0x065e
        L_0x0655:
            r35 = r2
            r36 = r8
            r37 = r9
            r38 = r12
            goto L_0x0697
        L_0x065e:
            java.lang.String r14 = "customImei"
            java.lang.String r15 = ""
            java.lang.String r14 = r7.getString(r14, r15)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r15 = "customImsi"
            r35 = r2
            java.lang.String r2 = ""
            java.lang.String r2 = r7.getString(r15, r2)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r15 = "ChangeImeiImsiHideSimOperatorInfo"
            r36 = r8
            java.lang.String r8 = "install"
            r37 = r9
            r38 = r12
            r9 = 6
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x1751 }
            r9 = 0
            r12[r9] = r4     // Catch:{ Throwable -> 0x1751 }
            r9 = 1
            r12[r9] = r5     // Catch:{ Throwable -> 0x1751 }
            r9 = 2
            r12[r9] = r14     // Catch:{ Throwable -> 0x1751 }
            r9 = 3
            r12[r9] = r10     // Catch:{ Throwable -> 0x1751 }
            r9 = 4
            r12[r9] = r2     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x1751 }
            r17 = 5
            r12[r17] = r9     // Catch:{ Throwable -> 0x1751 }
            r1.invokeSecondaryInstance(r15, r8, r12)     // Catch:{ Throwable -> 0x1751 }
        L_0x0697:
            java.lang.String r2 = "hideWifiMacAddress"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r2 = r7.getBoolean(r2, r9)     // Catch:{ Throwable -> 0x1751 }
            boolean r2 = r2.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r8 = "hideWifiInfo"
            r9 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r8 = r7.getBoolean(r8, r12)     // Catch:{ Throwable -> 0x1751 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r2 == 0) goto L_0x06d0
            java.lang.String r9 = "HideWifiMacAddress"
            java.lang.String r12 = "install"
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02d8 }
            r14 = 0
            r15[r14] = r4     // Catch:{ Throwable -> 0x02d8 }
            r1.invokeSecondaryInstance(r9, r12, r15)     // Catch:{ Throwable -> 0x02d8 }
            if (r8 == 0) goto L_0x06d0
            java.lang.String r9 = "HideWifiInfo"
            java.lang.String r12 = "install"
            r14 = 0
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02d8 }
            r1.invokeSecondaryInstance(r9, r12, r15)     // Catch:{ Throwable -> 0x02d8 }
        L_0x06d0:
            java.lang.String r9 = "hideBluetoothMacAddress"
            r12 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)     // Catch:{ Throwable -> 0x1751 }
            java.lang.Boolean r9 = r7.getBoolean(r9, r14)     // Catch:{ Throwable -> 0x1751 }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x1751 }
            if (r9 == 0) goto L_0x0707
            java.lang.String r12 = "com.applisto.appcloner.classes.secondary.HideBtMacAddress"
            java.lang.Object r12 = ni(r4, r12)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r14 = r12.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r15 = "init"
            r39 = r2
            r40 = r5
            r2 = 1
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r17 = 0
            r5[r17] = r2     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r2 = r14.getMethod(r15, r5)     // Catch:{ Throwable -> 0x02d8 }
            r5 = 1
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x02d8 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x02d8 }
            r2.invoke(r12, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x070b
        L_0x0707:
            r39 = r2
            r40 = r5
        L_0x070b:
            java.lang.String r2 = "spoofLocationLatitude"
            r5 = 0
            java.lang.Double r2 = r7.getDouble(r2, r5)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r12 = "spoofLocationLongitude"
            java.lang.Double r12 = r7.getDouble(r12, r5)     // Catch:{ Throwable -> 0x1751 }
            r5 = r12
            if (r2 == 0) goto L_0x0756
            if (r5 == 0) goto L_0x0756
            java.lang.String r12 = "com.applisto.appcloner.classes.secondary.SpoofLocation"
            java.lang.Object r12 = ni(r4, r12)     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r14 = r12.getClass()     // Catch:{ Throwable -> 0x02d8 }
            java.lang.String r15 = "init"
            r41 = r8
            r42 = r9
            r8 = 3
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r17 = 0
            r9[r17] = r8     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r8 = java.lang.Double.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r17 = 1
            r9[r17] = r8     // Catch:{ Throwable -> 0x02d8 }
            java.lang.Class r8 = java.lang.Double.TYPE     // Catch:{ Throwable -> 0x02d8 }
            r17 = 2
            r9[r17] = r8     // Catch:{ Throwable -> 0x02d8 }
            java.lang.reflect.Method r8 = r14.getMethod(r15, r9)     // Catch:{ Throwable -> 0x02d8 }
            r9 = 3
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x02d8 }
            r9 = 0
            r14[r9] = r4     // Catch:{ Throwable -> 0x02d8 }
            r9 = 1
            r14[r9] = r2     // Catch:{ Throwable -> 0x02d8 }
            r9 = 2
            r14[r9] = r5     // Catch:{ Throwable -> 0x02d8 }
            r8.invoke(r12, r14)     // Catch:{ Throwable -> 0x02d8 }
            goto L_0x075a
        L_0x0756:
            r41 = r8
            r42 = r9
        L_0x075a:
            java.lang.String r8 = "androidVersionSdk"
            r9 = 0
            java.lang.String r8 = r7.getString(r8, r9)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r12 = "androidVersionSdkInt"
            java.lang.String r12 = r7.getString(r12, r9)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r14 = "androidVersionPreviewSdkInt"
            java.lang.String r14 = r7.getString(r14, r9)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r15 = "androidVersionCodename"
            java.lang.String r15 = r7.getString(r15, r9)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r9 = "androidVersionIncremental"
            r43 = r2
            r2 = 0
            java.lang.String r9 = r7.getString(r9, r2)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r2 = "androidVersionRelease"
            r44 = r5
            r5 = 0
            java.lang.String r2 = r7.getString(r2, r5)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r5 = "androidVersionBaseOs"
            r45 = r10
            r10 = 0
            java.lang.String r5 = r7.getString(r5, r10)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r10 = "androidVersionSecurityPatch"
            r46 = r11
            r11 = 0
            java.lang.String r10 = r7.getString(r10, r11)     // Catch:{ Throwable -> 0x1751 }
            java.lang.String r11 = TAG     // Catch:{ Throwable -> 0x1751 }
            r47 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x1751 }
            r13.<init>()     // Catch:{ Throwable -> 0x1751 }
            r48 = r3
            java.lang.String r3 = "onCreate; androidVersionSdk: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r8)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionSdkInt: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r12)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionPreviewSdkInt: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r14)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionCodename: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r15)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionIncremental: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r9)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionRelease: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r2)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionBaseOs: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r5)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = ", androidVersionSecurityPatch: "
            r13.append(r3)     // Catch:{ Throwable -> 0x174c }
            r13.append(r10)     // Catch:{ Throwable -> 0x174c }
            java.lang.String r3 = r13.toString()     // Catch:{ Throwable -> 0x174c }
            android.util.Log.i(r11, r3)     // Catch:{ Throwable -> 0x174c }
            boolean r3 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x174c }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x081d }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x081d }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Throwable -> 0x081d }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x081d }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x081d }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x081d }
            if (r3 == 0) goto L_0x0821
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x081d }
            if (r3 != 0) goto L_0x081a
            goto L_0x0821
        L_0x081a:
            r49 = r6
            goto L_0x0890
        L_0x081d:
            r0 = move-exception
            r2 = r1
            goto L_0x02dc
        L_0x0821:
            java.lang.String r3 = "com.applisto.appcloner.classes.secondary.AndroidVersion"
            java.lang.Object r3 = ni(r4, r3)     // Catch:{ Throwable -> 0x174c }
            java.lang.Class r11 = r3.getClass()     // Catch:{ Throwable -> 0x174c }
            java.lang.String r13 = "init"
            r49 = r6
            r6 = 9
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r17 = 0
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 1
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 2
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r16 = 3
            r1[r16] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 4
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 5
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 6
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 7
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r17 = 8
            r1[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            java.lang.reflect.Method r1 = r11.getMethod(r13, r1)     // Catch:{ Throwable -> 0x1745 }
            r6 = 9
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x1745 }
            r6 = 0
            r11[r6] = r4     // Catch:{ Throwable -> 0x1745 }
            r6 = 1
            r11[r6] = r8     // Catch:{ Throwable -> 0x1745 }
            r6 = 2
            r11[r6] = r12     // Catch:{ Throwable -> 0x1745 }
            r6 = 3
            r11[r6] = r14     // Catch:{ Throwable -> 0x1745 }
            r6 = 4
            r11[r6] = r15     // Catch:{ Throwable -> 0x1745 }
            r6 = 5
            r11[r6] = r9     // Catch:{ Throwable -> 0x1745 }
            r6 = 6
            r11[r6] = r2     // Catch:{ Throwable -> 0x1745 }
            r6 = 7
            r11[r6] = r5     // Catch:{ Throwable -> 0x1745 }
            r6 = 8
            r11[r6] = r10     // Catch:{ Throwable -> 0x1745 }
            r1.invoke(r3, r11)     // Catch:{ Throwable -> 0x1745 }
        L_0x0890:
            java.lang.String r1 = "buildPropsManufacturer"
            r3 = 0
            java.lang.String r1 = r7.getString(r1, r3)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r6 = "buildPropsBrand"
            java.lang.String r6 = r7.getString(r6, r3)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r11 = "buildPropsModel"
            java.lang.String r11 = r7.getString(r11, r3)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r13 = "buildPropsProduct"
            java.lang.String r13 = r7.getString(r13, r3)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r3 = "buildPropsDevice"
            r50 = r1
            r1 = 0
            java.lang.String r3 = r7.getString(r3, r1)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r1 = "buildPropsBoard"
            r51 = r2
            r2 = 0
            java.lang.String r1 = r7.getString(r1, r2)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r2 = "buildPropsHardware"
            r52 = r1
            r1 = 0
            java.lang.String r2 = r7.getString(r2, r1)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r1 = "buildPropsBootloader"
            r53 = r2
            r2 = 0
            java.lang.String r1 = r7.getString(r1, r2)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r2 = "buildPropsFingerprint"
            r54 = r1
            r1 = 0
            java.lang.String r2 = r7.getString(r2, r1)     // Catch:{ Throwable -> 0x1745 }
            r1 = r2
            java.lang.String r2 = "randomizeBuildProps"
            r55 = r1
            r56 = r3
            r1 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ Throwable -> 0x1745 }
            java.lang.Boolean r1 = r7.getBoolean(r2, r3)     // Catch:{ Throwable -> 0x1745 }
            boolean r2 = r1.booleanValue()     // Catch:{ Throwable -> 0x1745 }
            if (r2 == 0) goto L_0x0947
            java.lang.String r2 = "buildPropsManufacturer"
            java.lang.String r2 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r2)     // Catch:{ Throwable -> 0x093f }
            java.lang.String r3 = "buildPropsBrand"
            java.lang.String r3 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r3)     // Catch:{ Throwable -> 0x093f }
            r6 = r3
            java.lang.String r3 = "buildPropsModel"
            java.lang.String r3 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r3)     // Catch:{ Throwable -> 0x093f }
            r11 = r3
            java.lang.String r3 = "buildPropsProduct"
            java.lang.String r3 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r3)     // Catch:{ Throwable -> 0x093f }
            r13 = r3
            java.lang.String r3 = "buildPropsDevice"
            java.lang.String r3 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r3)     // Catch:{ Throwable -> 0x093f }
            r57 = r2
            java.lang.String r2 = "buildPropsBoard"
            java.lang.String r2 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r2)     // Catch:{ Throwable -> 0x093f }
            r58 = r2
            java.lang.String r2 = "buildPropsHardware"
            java.lang.String r2 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r2)     // Catch:{ Throwable -> 0x093f }
            r59 = r2
            java.lang.String r2 = "buildPropsBootloader"
            java.lang.String r2 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r2)     // Catch:{ Throwable -> 0x093f }
            r60 = r2
            java.lang.String r2 = "buildPropsFingerprint"
            java.lang.String r2 = com.applisto.appcloner.classes.Utils.getPackageSeededRandomString(r4, r2)     // Catch:{ Throwable -> 0x093f }
            r61 = r5
            r62 = r8
            r63 = r9
            r64 = r10
            r5 = r58
            r8 = r59
            r9 = r60
            r10 = r2
            r2 = r57
            goto L_0x095b
        L_0x093f:
            r0 = move-exception
            r1 = r0
            r10 = r49
            r2 = r116
            goto L_0x1760
        L_0x0947:
            r61 = r5
            r62 = r8
            r63 = r9
            r64 = r10
            r2 = r50
            r5 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r3 = r56
        L_0x095b:
            r65 = r12
            java.lang.String r12 = TAG     // Catch:{ Throwable -> 0x1745 }
            r66 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x1745 }
            r14.<init>()     // Catch:{ Throwable -> 0x1745 }
            r67 = r15
            java.lang.String r15 = "onCreate; buildPropsManufacturer: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r2)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsBrand: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r6)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsModel: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r11)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsProduct: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r13)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsDevice: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r3)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsBoard: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r5)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsHardware: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r8)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsBootloader: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r9)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r15 = ", buildPropsFingerprint: "
            r14.append(r15)     // Catch:{ Throwable -> 0x1745 }
            r14.append(r10)     // Catch:{ Throwable -> 0x1745 }
            java.lang.String r14 = r14.toString()     // Catch:{ Throwable -> 0x1745 }
            android.util.Log.i(r12, r14)     // Catch:{ Throwable -> 0x1745 }
            boolean r12 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x1745 }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x093f }
            if (r12 == 0) goto L_0x09f3
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x093f }
            if (r12 != 0) goto L_0x09ee
            goto L_0x09f3
        L_0x09ee:
            r68 = r2
            r2 = r116
            goto L_0x0a2a
        L_0x09f3:
            java.lang.String r12 = "BuildProps"
            java.lang.String r14 = "install"
            r15 = 10
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x1745 }
            r17 = 0
            r15[r17] = r4     // Catch:{ Throwable -> 0x1745 }
            r17 = 1
            r15[r17] = r2     // Catch:{ Throwable -> 0x1745 }
            r17 = 2
            r15[r17] = r6     // Catch:{ Throwable -> 0x1745 }
            r16 = 3
            r15[r16] = r11     // Catch:{ Throwable -> 0x1745 }
            r17 = 4
            r15[r17] = r13     // Catch:{ Throwable -> 0x1745 }
            r17 = 5
            r15[r17] = r3     // Catch:{ Throwable -> 0x1745 }
            r17 = 6
            r15[r17] = r5     // Catch:{ Throwable -> 0x1745 }
            r17 = 7
            r15[r17] = r8     // Catch:{ Throwable -> 0x1745 }
            r17 = 8
            r15[r17] = r9     // Catch:{ Throwable -> 0x1745 }
            r17 = 9
            r15[r17] = r10     // Catch:{ Throwable -> 0x1745 }
            r68 = r2
            r2 = r116
            r2.invokeSecondaryStatic(r12, r14, r15)     // Catch:{ Throwable -> 0x1741 }
        L_0x0a2a:
            java.lang.String r12 = "socksProxy"
            r14 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)     // Catch:{ Throwable -> 0x1741 }
            java.lang.Boolean r12 = r7.getBoolean(r12, r15)     // Catch:{ Throwable -> 0x1741 }
            boolean r12 = r12.booleanValue()     // Catch:{ Throwable -> 0x1741 }
            if (r12 == 0) goto L_0x0a9f
            java.lang.String r14 = "socksProxyHost"
            r15 = 0
            java.lang.String r14 = r7.getString(r14, r15)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.String r15 = "socksProxyPort"
            r69 = r3
            r70 = r5
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Integer r3 = r7.getInteger(r15, r5)     // Catch:{ Throwable -> 0x0a99 }
            int r3 = r3.intValue()     // Catch:{ Throwable -> 0x0a99 }
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x0a99 }
            if (r5 != 0) goto L_0x0a90
            if (r3 == 0) goto L_0x0a90
            java.lang.String r5 = "socksProxyUsername"
            r15 = 0
            java.lang.String r5 = r7.getString(r5, r15)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.String r15 = "socksProxyPassword"
            r71 = r6
            r6 = 0
            java.lang.String r15 = r7.getString(r15, r6)     // Catch:{ Throwable -> 0x0a99 }
            r6 = r15
            java.lang.String r15 = "SocksProxy"
            r72 = r8
            java.lang.String r8 = "install"
            r73 = r9
            r74 = r10
            r9 = 4
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0a99 }
            r9 = 0
            r10[r9] = r14     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x0a99 }
            r17 = 1
            r10[r17] = r9     // Catch:{ Throwable -> 0x0a99 }
            r9 = 2
            r10[r9] = r5     // Catch:{ Throwable -> 0x0a99 }
            r9 = 3
            r10[r9] = r6     // Catch:{ Throwable -> 0x0a99 }
            r2.invokeSecondaryInstance(r15, r8, r10)     // Catch:{ Throwable -> 0x0a99 }
            goto L_0x0aab
        L_0x0a90:
            r71 = r6
            r72 = r8
            r73 = r9
            r74 = r10
            goto L_0x0aab
        L_0x0a99:
            r0 = move-exception
            r1 = r0
            r10 = r49
            goto L_0x1760
        L_0x0a9f:
            r69 = r3
            r70 = r5
            r71 = r6
            r72 = r8
            r73 = r9
            r74 = r10
        L_0x0aab:
            java.lang.String r3 = "disableAllNetworking"
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x1741 }
            java.lang.Boolean r3 = r7.getBoolean(r3, r6)     // Catch:{ Throwable -> 0x1741 }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x1741 }
            if (r3 == 0) goto L_0x0af8
            java.lang.String r5 = "disableAllNetworkingDelayMillis"
            r6 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Integer r5 = r7.getInteger(r5, r8)     // Catch:{ Throwable -> 0x0a99 }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x0a99 }
            java.lang.String r6 = "com.applisto.appcloner.classes.secondary.DisableAllNetworking"
            java.lang.Object r6 = ni(r4, r6)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class r8 = r6.getClass()     // Catch:{ Throwable -> 0x0a99 }
            java.lang.String r9 = "init"
            r10 = 2
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r15 = 0
            r14[r15] = r10     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0a99 }
            r15 = 1
            r14[r15] = r10     // Catch:{ Throwable -> 0x0a99 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r14)     // Catch:{ Throwable -> 0x0a99 }
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0a99 }
            r9 = 0
            r10[r9] = r4     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x0a99 }
            r14 = 1
            r10[r14] = r9     // Catch:{ Throwable -> 0x0a99 }
            r8.invoke(r6, r10)     // Catch:{ Throwable -> 0x0a99 }
        L_0x0af8:
            java.lang.String r5 = "disableBackgroundNetworking"
            r6 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch:{ Throwable -> 0x1741 }
            java.lang.Boolean r5 = r7.getBoolean(r5, r8)     // Catch:{ Throwable -> 0x1741 }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x1741 }
            if (r5 == 0) goto L_0x0b29
            java.lang.String r6 = "com.applisto.appcloner.classes.secondary.DisableBackgroundNetworking"
            java.lang.Object r6 = ni(r4, r6)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class r8 = r6.getClass()     // Catch:{ Throwable -> 0x0a99 }
            java.lang.String r9 = "init"
            r10 = 1
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r15 = 0
            r14[r15] = r10     // Catch:{ Throwable -> 0x0a99 }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r14)     // Catch:{ Throwable -> 0x0a99 }
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0a99 }
            r10[r15] = r4     // Catch:{ Throwable -> 0x0a99 }
            r8.invoke(r6, r10)     // Catch:{ Throwable -> 0x0a99 }
        L_0x0b29:
            java.lang.String r6 = "disableMobileData"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x1741 }
            java.lang.Boolean r6 = r7.getBoolean(r6, r9)     // Catch:{ Throwable -> 0x1741 }
            boolean r6 = r6.booleanValue()     // Catch:{ Throwable -> 0x1741 }
            if (r6 == 0) goto L_0x0b5b
            java.lang.String r8 = "com.applisto.appcloner.classes.secondary.DisableMobileData"
            java.lang.Object r8 = ni(r4, r8)     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class r9 = r8.getClass()     // Catch:{ Throwable -> 0x0a99 }
            java.lang.String r10 = "init"
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x0a99 }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x0a99 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r15)     // Catch:{ Throwable -> 0x0a99 }
            r10 = 1
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x0a99 }
            r14[r17] = r4     // Catch:{ Throwable -> 0x0a99 }
            r9.invoke(r8, r14)     // Catch:{ Throwable -> 0x0a99 }
        L_0x0b5b:
            java.lang.String r8 = "disableInAppSearch"
            r9 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x1741 }
            java.lang.Boolean r8 = r7.getBoolean(r8, r10)     // Catch:{ Throwable -> 0x1741 }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x1741 }
            java.lang.String r9 = "com.contextlogic.wish"
            r10 = r49
            boolean r9 = r9.equals(r10)     // Catch:{ Throwable -> 0x173e }
            if (r9 == 0) goto L_0x0b75
            r8 = 1
        L_0x0b75:
            if (r8 == 0) goto L_0x0b9d
            java.lang.String r9 = "com.applisto.appcloner.classes.secondary.DisableInAppSearch"
            java.lang.Object r9 = ni(r4, r9)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r14 = r9.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "init"
            r75 = r3
            r76 = r5
            r3 = 1
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r17 = 0
            r5[r17] = r3     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r14.getMethod(r15, r5)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r14[r17] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r9, r14)     // Catch:{ Throwable -> 0x173e }
            goto L_0x0ba1
        L_0x0b9d:
            r75 = r3
            r76 = r5
        L_0x0ba1:
            java.lang.String r3 = "makeWatchApp"
            r5 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r3 = r7.getBoolean(r3, r9)     // Catch:{ Throwable -> 0x173e }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r3 == 0) goto L_0x0bd6
            java.lang.String r5 = "com.applisto.appcloner.classes.secondary.NullSearchManager"
            java.lang.Object r5 = ni(r4, r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r9 = r5.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "init"
            r77 = r3
            r15 = 1
            java.lang.Class[] r3 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r3[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r9.getMethod(r14, r3)     // Catch:{ Throwable -> 0x173e }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x173e }
            r14[r17] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r5, r14)     // Catch:{ Throwable -> 0x173e }
            goto L_0x0bd8
        L_0x0bd6:
            r77 = r3
        L_0x0bd8:
            java.lang.String r3 = "disableActivityTransitions"
            r5 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r3 = r7.getBoolean(r3, r9)     // Catch:{ Throwable -> 0x173e }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r3 == 0) goto L_0x0c0d
            java.lang.String r5 = "com.applisto.appcloner.classes.secondary.DisableActivityTransitions"
            java.lang.Object r5 = ni(r4, r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r9 = r5.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "init"
            r78 = r3
            r15 = 1
            java.lang.Class[] r3 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r3[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r9.getMethod(r14, r3)     // Catch:{ Throwable -> 0x173e }
            r9 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x173e }
            r14[r17] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r5, r14)     // Catch:{ Throwable -> 0x173e }
            goto L_0x0c0f
        L_0x0c0d:
            r78 = r3
        L_0x0c0f:
            java.lang.String r3 = "longPressBackAction"
            java.lang.String r5 = "NONE"
            java.lang.String r3 = r7.getString(r3, r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "NONE"
            boolean r5 = r5.equals(r3)     // Catch:{ Throwable -> 0x173e }
            if (r5 != 0) goto L_0x0c39
            java.lang.String r5 = "longPressBackActionParam"
            r9 = 0
            java.lang.String r5 = r7.getString(r5, r9)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r9 = "LongPressBackAction"
            java.lang.String r14 = "install"
            r79 = r6
            r15 = 2
            java.lang.Object[] r6 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x173e }
            r15 = 0
            r6[r15] = r3     // Catch:{ Throwable -> 0x173e }
            r15 = 1
            r6[r15] = r5     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r9, r14, r6)     // Catch:{ Throwable -> 0x173e }
            goto L_0x0c3b
        L_0x0c39:
            r79 = r6
        L_0x0c3b:
            java.lang.String r5 = "backAlwaysFinishes"
            r6 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r5 = r7.getBoolean(r5, r9)     // Catch:{ Throwable -> 0x173e }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r5 == 0) goto L_0x0c56
            java.lang.String r5 = "BackAlwaysFinishes"
            java.lang.String r6 = "install"
            r9 = 0
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r5, r6, r14)     // Catch:{ Throwable -> 0x173e }
        L_0x0c56:
            java.lang.String r5 = "fingerprintTapAction"
            java.lang.String r6 = "NONE"
            java.lang.String r5 = r7.getString(r5, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "fingerprintLongTapAction"
            java.lang.String r9 = "NONE"
            java.lang.String r6 = r7.getString(r6, r9)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r9 = "NONE"
            boolean r9 = r9.equals(r5)     // Catch:{ Throwable -> 0x173e }
            if (r9 == 0) goto L_0x0c7e
            java.lang.String r9 = "NONE"
            boolean r9 = r9.equals(r6)     // Catch:{ Throwable -> 0x173e }
            if (r9 != 0) goto L_0x0c77
            goto L_0x0c7e
        L_0x0c77:
            r80 = r3
            r81 = r8
            r82 = r11
            goto L_0x0cab
        L_0x0c7e:
            java.lang.String r9 = "fingerprintTapActionParam"
            r14 = 0
            java.lang.String r9 = r7.getString(r9, r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "fingerprintLongTapActionParam"
            java.lang.String r15 = r7.getString(r15, r14)     // Catch:{ Throwable -> 0x173e }
            r14 = r15
            java.lang.String r15 = "FingerprintTapAction"
            r80 = r3
            java.lang.String r3 = "install"
            r81 = r8
            r82 = r11
            r8 = 5
            java.lang.Object[] r11 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x173e }
            r8 = 0
            r11[r8] = r4     // Catch:{ Throwable -> 0x173e }
            r8 = 1
            r11[r8] = r5     // Catch:{ Throwable -> 0x173e }
            r8 = 2
            r11[r8] = r9     // Catch:{ Throwable -> 0x173e }
            r8 = 3
            r11[r8] = r6     // Catch:{ Throwable -> 0x173e }
            r8 = 4
            r11[r8] = r14     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r15, r3, r11)     // Catch:{ Throwable -> 0x173e }
        L_0x0cab:
            java.lang.String r3 = "volumeUpKeyAction"
            java.lang.String r8 = "NONE"
            java.lang.String r3 = r7.getString(r3, r8)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r8 = "volumeDownKeyAction"
            java.lang.String r9 = "NONE"
            java.lang.String r8 = r7.getString(r8, r9)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r9 = "volumeUpDownKeyAction"
            java.lang.String r11 = "NONE"
            java.lang.String r9 = r7.getString(r9, r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r3)     // Catch:{ Throwable -> 0x173e }
            if (r11 == 0) goto L_0x0ce5
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r8)     // Catch:{ Throwable -> 0x173e }
            if (r11 == 0) goto L_0x0ce5
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r9)     // Catch:{ Throwable -> 0x173e }
            if (r11 != 0) goto L_0x0cdc
            goto L_0x0ce5
        L_0x0cdc:
            r83 = r5
            r84 = r6
            r85 = r12
            r86 = r13
            goto L_0x0d1e
        L_0x0ce5:
            java.lang.String r11 = "volumeUpKeyActionParam"
            r14 = 0
            java.lang.String r11 = r7.getString(r11, r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "volumeDownKeyActionParam"
            java.lang.String r15 = r7.getString(r15, r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "volumeUpDownKeyActionParam"
            r83 = r5
            r5 = 0
            java.lang.String r14 = r7.getString(r14, r5)     // Catch:{ Throwable -> 0x173e }
            r5 = r14
            java.lang.String r14 = "VolumeUpDownKeyAction"
            r84 = r6
            java.lang.String r6 = "install"
            r85 = r12
            r86 = r13
            r12 = 6
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x173e }
            r12 = 0
            r13[r12] = r3     // Catch:{ Throwable -> 0x173e }
            r12 = 1
            r13[r12] = r11     // Catch:{ Throwable -> 0x173e }
            r12 = 2
            r13[r12] = r8     // Catch:{ Throwable -> 0x173e }
            r12 = 3
            r13[r12] = r15     // Catch:{ Throwable -> 0x173e }
            r12 = 4
            r13[r12] = r9     // Catch:{ Throwable -> 0x173e }
            r12 = 5
            r13[r12] = r5     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r14, r6, r13)     // Catch:{ Throwable -> 0x173e }
        L_0x0d1e:
            java.lang.String r5 = "SecurityExceptionWorkaround"
            java.lang.String r6 = "install"
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r5, r6, r12)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "googlePlayServicesWorkaround"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r5 = r7.getBoolean(r5, r6)     // Catch:{ Throwable -> 0x173e }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "com.fiverr.fiverr"
            boolean r6 = r6.equals(r10)     // Catch:{ Throwable -> 0x173e }
            if (r6 != 0) goto L_0x0d5e
            java.lang.String r6 = "com.instagram.android"
            boolean r6 = r6.equals(r10)     // Catch:{ Throwable -> 0x173e }
            if (r6 != 0) goto L_0x0d5e
            java.lang.String r6 = "com.viber.voip"
            boolean r6 = r6.equals(r10)     // Catch:{ Throwable -> 0x173e }
            if (r6 != 0) goto L_0x0d5e
            java.lang.String r6 = "com.waze"
            boolean r6 = r6.equals(r10)     // Catch:{ Throwable -> 0x173e }
            if (r6 != 0) goto L_0x0d5e
            java.lang.String r6 = "com.amazon.mShop.android"
            boolean r6 = r6.equals(r10)     // Catch:{ Throwable -> 0x173e }
            if (r6 == 0) goto L_0x0d5f
        L_0x0d5e:
            r5 = 1
        L_0x0d5f:
            if (r5 == 0) goto L_0x0d81
            java.lang.String r6 = "com.applisto.appcloner.classes.secondary.GooglePlayServicesWorkaround"
            java.lang.Object r6 = ni(r4, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r11 = r6.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r12 = "init"
            r13 = 1
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r15 = 0
            r14[r15] = r13     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r14)     // Catch:{ Throwable -> 0x173e }
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x173e }
            r13[r15] = r4     // Catch:{ Throwable -> 0x173e }
            r11.invoke(r6, r13)     // Catch:{ Throwable -> 0x173e }
        L_0x0d81:
            java.lang.String r6 = "hideGooglePlayServices"
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r6 = r7.getBoolean(r6, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r6 = r6.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r6 == 0) goto L_0x0db3
            java.lang.String r11 = "com.applisto.appcloner.classes.secondary.HideGooglePlayServices"
            java.lang.Object r11 = ni(r4, r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r12 = r11.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r13 = "init"
            r14 = 1
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r15)     // Catch:{ Throwable -> 0x173e }
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x173e }
            r14[r17] = r4     // Catch:{ Throwable -> 0x173e }
            r12.invoke(r11, r14)     // Catch:{ Throwable -> 0x173e }
        L_0x0db3:
            java.lang.String r11 = "welcomeMessageHtml"
            r12 = 0
            java.lang.String r11 = r7.getString(r11, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Throwable -> 0x173e }
            if (r12 != 0) goto L_0x0e20
            java.lang.String r12 = "welcomeMessageMode"
            java.lang.String r13 = "DIALOG"
            java.lang.String r12 = r7.getString(r12, r13)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r13 = "welcomeMessageDelay"
            r14 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r13 = r7.getInteger(r13, r14)     // Catch:{ Throwable -> 0x173e }
            int r13 = r13.intValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "com.applisto.appcloner.classes.secondary.WelcomeMessage"
            java.lang.Object r14 = ni(r4, r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r15 = r14.getClass()     // Catch:{ Throwable -> 0x173e }
            r87 = r3
            java.lang.String r3 = "init"
            r88 = r5
            r89 = r6
            r5 = 4
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r17 = 0
            r6[r17] = r5     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r17 = 1
            r6[r17] = r5     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r17 = 2
            r6[r17] = r5     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x173e }
            r16 = 3
            r6[r16] = r5     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r15.getMethod(r3, r6)     // Catch:{ Throwable -> 0x173e }
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            r6[r5] = r12     // Catch:{ Throwable -> 0x173e }
            r5 = 2
            r6[r5] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x173e }
            r15 = 3
            r6[r15] = r5     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r14, r6)     // Catch:{ Throwable -> 0x173e }
            goto L_0x0e26
        L_0x0e20:
            r87 = r3
            r88 = r5
            r89 = r6
        L_0x0e26:
            java.lang.String r3 = "incognitoMode"
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r3 = r7.getBoolean(r3, r6)     // Catch:{ Throwable -> 0x173e }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r3 == 0) goto L_0x0e75
            java.lang.String r5 = "autoIncognitoMode"
            r6 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r5 = r7.getBoolean(r5, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "com.applisto.appcloner.classes.secondary.IncognitoMode"
            java.lang.Object r6 = ni(r4, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r12 = r6.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r13 = "init"
            r14 = 2
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r14 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 1
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r15)     // Catch:{ Throwable -> 0x173e }
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x173e }
            r13 = 0
            r14[r13] = r4     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            r15 = 1
            r14[r15] = r13     // Catch:{ Throwable -> 0x173e }
            r12.invoke(r6, r14)     // Catch:{ Throwable -> 0x173e }
        L_0x0e75:
            java.lang.String r5 = "volumeRockerLocker"
            java.lang.String r6 = "NONE"
            java.lang.String r5 = r7.getString(r5, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "NONE"
            boolean r6 = r6.equals(r5)     // Catch:{ Throwable -> 0x173e }
            if (r6 != 0) goto L_0x0eb0
            java.lang.String r6 = "com.applisto.appcloner.classes.secondary.VolumeRockerLocker"
            java.lang.Object r6 = ni(r4, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r12 = r6.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r13 = "init"
            r14 = 2
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r17 = 1
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r12 = r12.getMethod(r13, r15)     // Catch:{ Throwable -> 0x173e }
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x173e }
            r13 = 0
            r14[r13] = r4     // Catch:{ Throwable -> 0x173e }
            r13 = 1
            r14[r13] = r5     // Catch:{ Throwable -> 0x173e }
            r12.invoke(r6, r14)     // Catch:{ Throwable -> 0x173e }
        L_0x0eb0:
            java.lang.String r6 = "floatingBackButton"
            r12 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r6 = r7.getBoolean(r6, r13)     // Catch:{ Throwable -> 0x173e }
            boolean r6 = r6.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r6 == 0) goto L_0x0f87
            java.lang.String r13 = "floatingBackButtonSize"
            java.lang.String r14 = "MEDIUM"
            java.lang.String r13 = r7.getString(r13, r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "floatingBackButtonLongPressAction"
            java.lang.String r15 = "NONE"
            java.lang.String r14 = r7.getString(r14, r15)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "floatingBackButtonDoubleBackTap"
            r90 = r3
            r12 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r3 = r7.getBoolean(r15, r3)     // Catch:{ Throwable -> 0x173e }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r12 = "floatingBackButtonPositionPerScreen"
            r91 = r5
            r15 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r15)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r5 = r7.getBoolean(r12, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r12 = "floatingBackButtonColor"
            r92 = r6
            r15 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r6 = r7.getInteger(r12, r6)     // Catch:{ Throwable -> 0x173e }
            int r6 = r6.intValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r12 = "floatingBackButtonOpacity"
            r15 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r15 = java.lang.Float.valueOf(r15)     // Catch:{ Throwable -> 0x173e }
            java.lang.Float r12 = r7.getFloat(r12, r15)     // Catch:{ Throwable -> 0x173e }
            float r12 = r12.floatValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "com.applisto.appcloner.classes.secondary.FloatingBackButton"
            java.lang.Object r15 = ni(r4, r15)     // Catch:{ Throwable -> 0x173e }
            r93 = r8
            java.lang.Class r8 = r15.getClass()     // Catch:{ Throwable -> 0x173e }
            r94 = r9
            java.lang.String r9 = "init"
            r96 = r1
            r95 = r11
            r11 = 7
            java.lang.Class[] r1 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r17 = 0
            r1[r17] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r17 = 1
            r1[r17] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r17 = 2
            r1[r17] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x173e }
            r16 = 3
            r1[r16] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r11 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 4
            r1[r17] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 5
            r1[r17] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r11 = java.lang.Float.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 6
            r1[r17] = r11     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r1 = r8.getMethod(r9, r1)     // Catch:{ Throwable -> 0x173e }
            r8 = 7
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x173e }
            r8 = 0
            r9[r8] = r4     // Catch:{ Throwable -> 0x173e }
            r8 = 1
            r9[r8] = r13     // Catch:{ Throwable -> 0x173e }
            r8 = 2
            r9[r8] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            r11 = 3
            r9[r11] = r8     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            r11 = 4
            r9[r11] = r8     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            r11 = 5
            r9[r11] = r8     // Catch:{ Throwable -> 0x173e }
            java.lang.Float r8 = java.lang.Float.valueOf(r12)     // Catch:{ Throwable -> 0x173e }
            r11 = 6
            r9[r11] = r8     // Catch:{ Throwable -> 0x173e }
            r1.invoke(r15, r9)     // Catch:{ Throwable -> 0x173e }
            goto L_0x0f95
        L_0x0f87:
            r96 = r1
            r90 = r3
            r91 = r5
            r92 = r6
            r93 = r8
            r94 = r9
            r95 = r11
        L_0x0f95:
            java.lang.String r1 = "joystickPointer"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x106b
            java.lang.String r3 = "joystickPointerSize"
            java.lang.String r5 = "MEDIUM"
            java.lang.String r3 = r7.getString(r3, r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "joystickPointerColor"
            r6 = -7829368(0xffffffffff888888, float:NaN)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r5 = r7.getInteger(r5, r6)     // Catch:{ Throwable -> 0x173e }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "joystickPointerOpacity"
            r8 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            java.lang.Float r6 = r7.getFloat(r6, r8)     // Catch:{ Throwable -> 0x173e }
            float r6 = r6.floatValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r8 = "joystickPointerToggleKeyCode"
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r8 = r7.getInteger(r8, r11)     // Catch:{ Throwable -> 0x173e }
            int r8 = r8.intValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r9 = "joystickPointerToggleLongPress"
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r9 = r7.getBoolean(r9, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r11 = "joystickPointerShowInitially"
            r12 = 1
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r11 = r7.getBoolean(r11, r13)     // Catch:{ Throwable -> 0x173e }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r12 = "com.applisto.appcloner.classes.secondary.JoystickPointer"
            java.lang.Object r12 = ni(r4, r12)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r13 = r12.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "init"
            r97 = r1
            r15 = 7
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r17 = 0
            r1[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r17 = 1
            r1[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 2
            r1[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r15 = java.lang.Float.TYPE     // Catch:{ Throwable -> 0x173e }
            r16 = 3
            r1[r16] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 4
            r1[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r15 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 5
            r1[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r15 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x173e }
            r17 = 6
            r1[r17] = r15     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r1 = r13.getMethod(r14, r1)     // Catch:{ Throwable -> 0x173e }
            r13 = 7
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x173e }
            r14 = 0
            r13[r14] = r4     // Catch:{ Throwable -> 0x173e }
            r14 = 1
            r13[r14] = r3     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            r15 = 2
            r13[r15] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Float r14 = java.lang.Float.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            r15 = 3
            r13[r15] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            r15 = 4
            r13[r15] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x173e }
            r15 = 5
            r13[r15] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            r15 = 6
            r13[r15] = r14     // Catch:{ Throwable -> 0x173e }
            r1.invoke(r12, r13)     // Catch:{ Throwable -> 0x173e }
            goto L_0x106d
        L_0x106b:
            r97 = r1
        L_0x106d:
            java.lang.String r1 = "showTouches"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x109e
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.ShowTouches"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x109e:
            java.lang.String r1 = "localBroadcastsServices"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x10d8
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.LocalBroadcastsServices"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 2
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r9 = 1
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            r6[r5] = r10     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x10d8:
            java.lang.String r1 = "localActivities"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1112
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.LocalActivities"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 2
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r9 = 1
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            r6[r5] = r10     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x1112:
            java.lang.String r1 = "showAppInfoNotification"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1143
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.ShowAppInfoNotification"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x1143:
            java.lang.String r1 = "pictureInPictureNotification"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1174
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.PictureInPictureNotification"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x1174:
            java.lang.String r1 = "hidePasswordCharacters"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x11a5
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.HidePasswordCharacters"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x11a5:
            java.lang.String r1 = "incognitoKeyboard"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x11d6
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.IncognitoKeyboard"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x11d6:
            java.lang.String r1 = "makeDebuggable"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1218
            java.lang.String r1 = "debugUtils"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1218
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.DebugUtils"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x1218:
            java.lang.String r1 = "noBackgroundServices"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1249
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.NoBackgroundServices"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x173e }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x173e }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r6[r9] = r4     // Catch:{ Throwable -> 0x173e }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x1249:
            java.lang.String r1 = "disableLogcatLogging"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1264
            java.lang.String r1 = "DisableLogcatLogging"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x1264:
            java.lang.String r1 = "flushLogcatBufferOnExit"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x127f
            java.lang.String r1 = "FlushLogcatBufferOnExit"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x127f:
            java.lang.String r1 = "logGetPackageName"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x129c
            if (r48 == 0) goto L_0x129c
            java.lang.String r1 = "LogGetPackageNameHook"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x129c:
            java.lang.String r1 = "statusBarColor"
            r3 = 0
            java.lang.Integer r1 = r7.getInteger(r1, r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "navigationBarColor"
            java.lang.Integer r5 = r7.getInteger(r5, r3)     // Catch:{ Throwable -> 0x173e }
            r3 = r5
            java.lang.String r5 = "navigationBarColorUseStatusBarColor"
            r6 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r5 = r7.getBoolean(r5, r8)     // Catch:{ Throwable -> 0x173e }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r5 == 0) goto L_0x12bc
            r3 = r1
        L_0x12bc:
            if (r1 != 0) goto L_0x12c0
            if (r3 == 0) goto L_0x12d0
        L_0x12c0:
            java.lang.String r5 = "StatusNavigationBarColor"
            java.lang.String r6 = "install"
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x173e }
            r8 = 0
            r9[r8] = r1     // Catch:{ Throwable -> 0x173e }
            r8 = 1
            r9[r8] = r3     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r5, r6, r9)     // Catch:{ Throwable -> 0x173e }
        L_0x12d0:
            java.lang.String r5 = "toolbarColor"
            r6 = 0
            java.lang.Integer r5 = r7.getInteger(r5, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "toolbarColorUseStatusBarColor"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r6 = r7.getBoolean(r6, r9)     // Catch:{ Throwable -> 0x173e }
            boolean r6 = r6.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r6 == 0) goto L_0x12e9
            r5 = r1
        L_0x12e9:
            if (r5 == 0) goto L_0x12f8
            java.lang.String r6 = "ToolbarColor"
            java.lang.String r8 = "install"
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x173e }
            r9 = 0
            r11[r9] = r5     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r6, r8, r11)     // Catch:{ Throwable -> 0x173e }
        L_0x12f8:
            java.lang.String r6 = "muteOnStart"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r6 = r7.getBoolean(r6, r9)     // Catch:{ Throwable -> 0x173e }
            boolean r6 = r6.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r6 == 0) goto L_0x1313
            java.lang.String r6 = "MuteOnStart"
            java.lang.String r8 = "install"
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r6, r8, r11)     // Catch:{ Throwable -> 0x173e }
        L_0x1313:
            java.lang.String r6 = "allowTextSelection"
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r6 = r7.getBoolean(r6, r9)     // Catch:{ Throwable -> 0x173e }
            boolean r6 = r6.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r8 = "allowSharingImages"
            r9 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r8 = r7.getBoolean(r8, r11)     // Catch:{ Throwable -> 0x173e }
            boolean r8 = r8.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r6 != 0) goto L_0x1335
            if (r8 == 0) goto L_0x134d
        L_0x1335:
            java.lang.String r9 = "AllowTextSelectionSharingImages"
            java.lang.String r11 = "install"
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)     // Catch:{ Throwable -> 0x173e }
            r14 = 0
            r13[r14] = r12     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            r14 = 1
            r13[r14] = r12     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r9, r11, r13)     // Catch:{ Throwable -> 0x173e }
        L_0x134d:
            java.lang.String r9 = "keepScreenOn"
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r9 = r7.getBoolean(r9, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r9 == 0) goto L_0x1368
            java.lang.String r9 = "KeepScreenOn"
            java.lang.String r11 = "install"
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r9, r11, r13)     // Catch:{ Throwable -> 0x173e }
        L_0x1368:
            java.lang.String r9 = "exitAppOnScreenOff"
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r9 = r7.getBoolean(r9, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r9 == 0) goto L_0x1399
            java.lang.String r9 = "exitAppOnScreenOffDelaySeconds"
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r9 = r7.getInteger(r9, r12)     // Catch:{ Throwable -> 0x173e }
            int r9 = r9.intValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r11 = "ExitAppOnScreenOff"
            java.lang.String r12 = "install"
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x173e }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x173e }
            r15 = 0
            r14[r15] = r13     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r11, r12, r14)     // Catch:{ Throwable -> 0x173e }
        L_0x1399:
            java.lang.String r9 = "requestAllPermissions"
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r9 = r7.getBoolean(r9, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r9 == 0) goto L_0x13b4
            java.lang.String r9 = "RequestAllPermissions"
            java.lang.String r11 = "install"
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r9, r11, r13)     // Catch:{ Throwable -> 0x173e }
        L_0x13b4:
            java.lang.String r9 = "allowScreenshots"
            r11 = 0
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r9 = r7.getBoolean(r9, r12)     // Catch:{ Throwable -> 0x173e }
            boolean r9 = r9.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r11 = "preventScreenshots"
            r12 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r11 = r7.getBoolean(r11, r13)     // Catch:{ Throwable -> 0x173e }
            boolean r11 = r11.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r9 != 0) goto L_0x13d6
            if (r11 == 0) goto L_0x13f0
        L_0x13d6:
            java.lang.String r12 = "AllowPreventScreenshots"
            java.lang.String r13 = "install"
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x173e }
            r17 = 0
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            r17 = 1
            r15[r17] = r14     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r12, r13, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x13f0:
            java.lang.String r12 = "webViewSafeBrowsing"
            r13 = 0
            java.lang.Boolean r12 = r7.getBoolean(r12, r13)     // Catch:{ Throwable -> 0x173e }
            r13 = r96
            boolean r14 = r13.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r14 != 0) goto L_0x1407
            if (r12 == 0) goto L_0x1402
            goto L_0x1407
        L_0x1402:
            r98 = r1
            r99 = r3
            goto L_0x141e
        L_0x1407:
            java.lang.String r14 = "WebViewHooks"
            java.lang.String r15 = "install"
            r98 = r1
            r99 = r3
            r1 = 3
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x173e }
            r1 = 0
            r3[r1] = r4     // Catch:{ Throwable -> 0x173e }
            r1 = 1
            r3[r1] = r13     // Catch:{ Throwable -> 0x173e }
            r1 = 2
            r3[r1] = r12     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r14, r15, r3)     // Catch:{ Throwable -> 0x173e }
        L_0x141e:
            java.lang.String r1 = "clearCacheWhenNotUsed"
            r3 = 0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r14)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1473
            java.lang.String r1 = "clearCacheWhenNotUsedValue"
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x1467 }
            java.lang.Integer r1 = r7.getInteger(r1, r3)     // Catch:{ Exception -> 0x1467 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x1467 }
            java.lang.String r3 = "clearCacheWhenNotUsedTimeUnit"
            java.lang.String r14 = "DAYS"
            java.lang.String r3 = r7.getString(r3, r14)     // Catch:{ Exception -> 0x1467 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.valueOf(r3)     // Catch:{ Exception -> 0x1467 }
            java.lang.String r14 = "ClearCacheWhenNotUsed"
            java.lang.String r15 = "install"
            r100 = r5
            r101 = r6
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x1464 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x1464 }
            r16 = 0
            r6[r16] = r5     // Catch:{ Exception -> 0x1464 }
            r5 = 1
            r6[r5] = r3     // Catch:{ Exception -> 0x1464 }
            r2.invokeSecondaryInstance(r14, r15, r6)     // Catch:{ Exception -> 0x1464 }
            goto L_0x1477
        L_0x1464:
            r0 = move-exception
            r1 = r0
            goto L_0x146d
        L_0x1467:
            r0 = move-exception
            r100 = r5
            r101 = r6
            r1 = r0
        L_0x146d:
            java.lang.String r3 = TAG     // Catch:{ Throwable -> 0x173e }
            android.util.Log.w(r3, r1)     // Catch:{ Throwable -> 0x173e }
            goto L_0x1477
        L_0x1473:
            r100 = r5
            r101 = r6
        L_0x1477:
            java.lang.String r1 = "com.amazon.mas.kiwi.util.ApkHelpers"
            java.lang.Class.forName(r1)     // Catch:{ Throwable -> 0x1487 }
            java.lang.String r1 = "AmazonAppstoreWorkaround"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x1487 }
            r2.invokeSecondaryStatic(r1, r3, r6)     // Catch:{ Throwable -> 0x1487 }
            goto L_0x1488
        L_0x1487:
            r0 = move-exception
        L_0x1488:
            java.lang.String r1 = "BrazeAppboyWorkaround"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r1 = "FabricWorkaround"
            java.lang.String r3 = "install"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r1 = "removeLauncherIcon"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r3)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 != 0) goto L_0x14c3
            java.lang.String r1 = "removeLauncherIconShortcuts"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x14c1
            goto L_0x14c3
        L_0x14c1:
            r5 = 0
            goto L_0x14d0
        L_0x14c3:
            java.lang.String r1 = "RemoveLauncherIconShortcuts"
            java.lang.String r3 = "install"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x14d0:
            java.lang.String r1 = "bringAppToFrontNotification"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r3)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x14ed
            java.lang.String r1 = "BringAppToFrontNotification"
            java.lang.String r3 = "install"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x14ed:
            java.lang.String r1 = "penDetachedEventAction"
            java.lang.String r3 = "NONE"
            java.lang.String r1 = r7.getString(r1, r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r3 = "penInsertedEventAction"
            java.lang.String r5 = "NONE"
            java.lang.String r3 = r7.getString(r3, r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r5 = "EXIT_APP"
            boolean r5 = r5.equals(r1)     // Catch:{ Throwable -> 0x173e }
            if (r5 != 0) goto L_0x150d
            java.lang.String r5 = "EXIT_APP"
            boolean r5 = r5.equals(r3)     // Catch:{ Throwable -> 0x173e }
            if (r5 == 0) goto L_0x1510
        L_0x150d:
            com.applisto.appcloner.classes.PenEventReceiver.init()     // Catch:{ Throwable -> 0x173e }
        L_0x1510:
            java.lang.String r5 = "powerConnectedEventAction"
            java.lang.String r6 = "NONE"
            java.lang.String r5 = r7.getString(r5, r6)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r6 = "powerDisconnectedEventAction"
            java.lang.String r14 = "NONE"
            java.lang.String r6 = r7.getString(r6, r14)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r14 = "EXIT_APP"
            boolean r14 = r14.equals(r5)     // Catch:{ Throwable -> 0x173e }
            if (r14 != 0) goto L_0x1530
            java.lang.String r14 = "EXIT_APP"
            boolean r14 = r14.equals(r6)     // Catch:{ Throwable -> 0x173e }
            if (r14 == 0) goto L_0x1533
        L_0x1530:
            com.applisto.appcloner.classes.PowerEventReceiver.init()     // Catch:{ Throwable -> 0x173e }
        L_0x1533:
            java.lang.String r14 = "headphonesPluggedEventAction"
            java.lang.String r15 = "NONE"
            java.lang.String r14 = r7.getString(r14, r15)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "headphonesUnpluggedEventAction"
            r102 = r1
            java.lang.String r1 = "NONE"
            java.lang.String r1 = r7.getString(r15, r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.String r15 = "NONE"
            boolean r15 = r15.equals(r14)     // Catch:{ Throwable -> 0x173e }
            if (r15 == 0) goto L_0x1555
            java.lang.String r15 = "NONE"
            boolean r15 = r15.equals(r1)     // Catch:{ Throwable -> 0x173e }
            if (r15 != 0) goto L_0x1558
        L_0x1555:
            com.applisto.appcloner.classes.HeadphonesEventReceiver.init(r4)     // Catch:{ Throwable -> 0x173e }
        L_0x1558:
            java.lang.String r15 = "disableCameras"
            r103 = r1
            r104 = r3
            r1 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r15, r3)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1575
            com.applisto.appcloner.classes.DisableCameras r1 = new com.applisto.appcloner.classes.DisableCameras     // Catch:{ Throwable -> 0x173e }
            r1.<init>()     // Catch:{ Throwable -> 0x173e }
            r1.install()     // Catch:{ Throwable -> 0x173e }
        L_0x1575:
            java.lang.String r1 = "muteMic"
            r3 = 0
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r15)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1593
            java.lang.String r1 = "MuteMic"
            java.lang.String r3 = "install"
            r105 = r5
            r15 = 0
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r5)     // Catch:{ Throwable -> 0x173e }
            goto L_0x1595
        L_0x1593:
            r105 = r5
        L_0x1595:
            java.lang.String r1 = "disableAutoFill"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x15b0
            java.lang.String r1 = "DisableAutoFill"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x15b0:
            java.lang.String r1 = "disablePermissionPrompts"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x15cb
            java.lang.String r1 = "DisablePermissionPrompts"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x15cb:
            java.lang.String r1 = "requestIgnoreBatteryOptimizations"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x15e6
            java.lang.String r1 = "RequestIgnoreBatteryOptimizations"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x15e6:
            java.lang.String r1 = "trustAllCertificates"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1601
            java.lang.String r1 = "TrustAllCertificates"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r1, r3, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x1601:
            java.lang.String r1 = "fakeCalculator"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x161a
            com.applisto.appcloner.classes.FakeCalculator r1 = new com.applisto.appcloner.classes.FakeCalculator     // Catch:{ Throwable -> 0x173e }
            r1.<init>()     // Catch:{ Throwable -> 0x173e }
            r1.install()     // Catch:{ Throwable -> 0x173e }
        L_0x161a:
            java.lang.String r1 = "hideNotch"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x1635
            java.lang.String r1 = "HideNotch"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x1635:
            java.lang.String r1 = "appValidFrom"
            r106 = r6
            r5 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Long r1 = r7.getLong(r1, r3)     // Catch:{ Throwable -> 0x173e }
            long r15 = r1.longValue()     // Catch:{ Throwable -> 0x173e }
            r107 = r15
            java.lang.String r1 = "appValidUntil"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Long r1 = r7.getLong(r1, r3)     // Catch:{ Throwable -> 0x173e }
            long r15 = r1.longValue()     // Catch:{ Throwable -> 0x173e }
            r109 = r15
            r111 = r8
            r112 = r9
            r8 = r107
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x166e
            r113 = r11
            r114 = r12
            r11 = r109
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x168c
            goto L_0x1674
        L_0x166e:
            r113 = r11
            r114 = r12
            r11 = r109
        L_0x1674:
            java.lang.String r1 = "AppValidity"
            java.lang.String r3 = "install"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x173e }
            r15 = 0
            r5[r15] = r6     // Catch:{ Throwable -> 0x173e }
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ Throwable -> 0x173e }
            r15 = 1
            r5[r15] = r6     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r5)     // Catch:{ Throwable -> 0x173e }
        L_0x168c:
            java.lang.String r1 = "accessibleDataDirectory"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x16aa
            java.lang.String r1 = "AccessibleDataDirectory"
            java.lang.String r3 = "install"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x173e }
            r5 = 0
            r6[r5] = r4     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryInstance(r1, r3, r6)     // Catch:{ Throwable -> 0x173e }
        L_0x16aa:
            java.lang.String r1 = "hostsBlocker"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x16d4
            java.lang.String r1 = "blockByDefault"
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r1 = r7.getBoolean(r1, r5)     // Catch:{ Throwable -> 0x173e }
            boolean r1 = r1.booleanValue()     // Catch:{ Throwable -> 0x173e }
            java.lang.String r3 = "socksProxyHost"
            r5 = 0
            java.lang.String r3 = r7.getString(r3, r5)     // Catch:{ Throwable -> 0x173e }
            com.applisto.appcloner.classes.HostsBlocker.install(r4, r1, r3)     // Catch:{ Throwable -> 0x173e }
        L_0x16d4:
            java.lang.String r1 = "overrideSharedPreferences"
            r3 = 0
            java.util.Map r1 = r7.getStringMap(r1, r3)     // Catch:{ Throwable -> 0x173e }
            if (r1 == 0) goto L_0x16f0
            boolean r3 = r1.isEmpty()     // Catch:{ Throwable -> 0x173e }
            if (r3 != 0) goto L_0x16f0
            java.lang.String r3 = "OverrideSharedPreferences"
            java.lang.String r5 = "install"
            r6 = 1
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x173e }
            r6 = 0
            r15[r6] = r1     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r3, r5, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x16f0:
            java.lang.String r3 = "enableTvVersion"
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ Throwable -> 0x173e }
            java.lang.Boolean r3 = r7.getBoolean(r3, r6)     // Catch:{ Throwable -> 0x173e }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x173e }
            if (r3 == 0) goto L_0x170b
            java.lang.String r3 = "EnableTvVersion"
            java.lang.String r5 = "install"
            r6 = 0
            java.lang.Object[] r15 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x173e }
            r2.invokeSecondaryStatic(r3, r5, r15)     // Catch:{ Throwable -> 0x173e }
        L_0x170b:
            if (r48 == 0) goto L_0x173d
            java.lang.String r3 = "com.applisto.appcloner.classes.secondary.Test"
            java.lang.Object r3 = ni(r4, r3)     // Catch:{ Exception -> 0x1734 }
            java.lang.Class r5 = r3.getClass()     // Catch:{ Exception -> 0x1734 }
            java.lang.String r6 = "init"
            r115 = r1
            r15 = 1
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x1731 }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r16 = 0
            r1[r16] = r15     // Catch:{ Exception -> 0x1731 }
            java.lang.reflect.Method r1 = r5.getMethod(r6, r1)     // Catch:{ Exception -> 0x1731 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x1731 }
            r6[r16] = r4     // Catch:{ Exception -> 0x1731 }
            r1.invoke(r3, r6)     // Catch:{ Exception -> 0x1731 }
            goto L_0x173d
        L_0x1731:
            r0 = move-exception
            r1 = r0
            goto L_0x1738
        L_0x1734:
            r0 = move-exception
            r115 = r1
            r1 = r0
        L_0x1738:
            java.lang.String r3 = TAG     // Catch:{ Throwable -> 0x173e }
            android.util.Log.w(r3, r1)     // Catch:{ Throwable -> 0x173e }
        L_0x173d:
            goto L_0x1765
        L_0x173e:
            r0 = move-exception
            goto L_0x01c6
        L_0x1741:
            r0 = move-exception
            r10 = r49
            goto L_0x174a
        L_0x1745:
            r0 = move-exception
            r10 = r49
            r2 = r116
        L_0x174a:
            r1 = r0
            goto L_0x1760
        L_0x174c:
            r0 = move-exception
            r2 = r1
            r10 = r6
            r1 = r0
            goto L_0x1760
        L_0x1751:
            r0 = move-exception
            r2 = r1
            r48 = r3
            r10 = r6
            r1 = r0
            goto L_0x1760
        L_0x1758:
            r0 = move-exception
            r18 = r2
            r48 = r3
            r10 = r6
            r2 = r1
            r1 = r0
        L_0x1760:
            java.lang.String r3 = TAG
            android.util.Log.w(r3, r1)
        L_0x1765:
            java.lang.String r1 = "com.whatsapp"
            boolean r1 = r1.equals(r10)     // Catch:{ Throwable -> 0x17e2 }
            if (r1 != 0) goto L_0x1775
            java.lang.String r1 = "com.whatsapp.w4b"
            boolean r1 = r1.equals(r10)     // Catch:{ Throwable -> 0x17e2 }
            if (r1 == 0) goto L_0x1780
        L_0x1775:
            com.applisto.appcloner.classes.WhatsAppSupport r1 = new com.applisto.appcloner.classes.WhatsAppSupport     // Catch:{ Throwable -> 0x17e2 }
            r1.<init>()     // Catch:{ Throwable -> 0x17e2 }
            r1.init(r10)     // Catch:{ Throwable -> 0x17e2 }
            java.io.ByteArrayOutputStrean.init(r4, r10)     // Catch:{ Throwable -> 0x17e2 }
        L_0x1780:
            java.lang.String r1 = "com.google.android.gm"
            boolean r1 = r1.equals(r10)     // Catch:{ Throwable -> 0x17e2 }
            if (r1 == 0) goto L_0x1790
            com.applisto.appcloner.classes.GmailSupport r1 = new com.applisto.appcloner.classes.GmailSupport     // Catch:{ Throwable -> 0x17e2 }
            r1.<init>()     // Catch:{ Throwable -> 0x17e2 }
            r1.init(r4)     // Catch:{ Throwable -> 0x17e2 }
        L_0x1790:
            java.lang.String r1 = "com.paypal.android.p2pmobile"
            boolean r1 = r1.equals(r10)     // Catch:{ Throwable -> 0x17e2 }
            if (r1 == 0) goto L_0x17b8
            java.lang.String r1 = "com.applisto.appcloner.classes.secondary.PayPalSupport"
            java.lang.Object r1 = ni(r4, r1)     // Catch:{ Throwable -> 0x17e2 }
            java.lang.Class r3 = r1.getClass()     // Catch:{ Throwable -> 0x17e2 }
            java.lang.String r5 = "init"
            r6 = 1
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x17e2 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r9 = 0
            r8[r9] = r6     // Catch:{ Throwable -> 0x17e2 }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ Throwable -> 0x17e2 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x17e2 }
            r6[r9] = r4     // Catch:{ Throwable -> 0x17e2 }
            r3.invoke(r1, r6)     // Catch:{ Throwable -> 0x17e2 }
        L_0x17b8:
            java.lang.String r1 = "com.yahoo.mobile.client.android.flickr"
            boolean r1 = r1.equals(r10)     // Catch:{ Throwable -> 0x17e2 }
            if (r1 == 0) goto L_0x17ca
            java.lang.String r1 = "FlickrSupport"
            java.lang.String r3 = "install"
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x17e2 }
            r2.invokeSecondaryStatic(r1, r3, r5)     // Catch:{ Throwable -> 0x17e2 }
        L_0x17ca:
            java.lang.String r1 = "com.fiverr.fiverr"
            boolean r1 = r1.equals(r10)     // Catch:{ Throwable -> 0x17e2 }
            if (r1 == 0) goto L_0x17da
            com.applisto.appcloner.classes.DefaultProvider$1 r1 = new com.applisto.appcloner.classes.DefaultProvider$1     // Catch:{ Throwable -> 0x17e2 }
            r1.<init>()     // Catch:{ Throwable -> 0x17e2 }
            r1.start()     // Catch:{ Throwable -> 0x17e2 }
        L_0x17da:
            java.lang.String r1 = TAG     // Catch:{ Throwable -> 0x17e2 }
            java.lang.String r3 = "onCreate; done"
            android.util.Log.i(r1, r3)     // Catch:{ Throwable -> 0x17e2 }
            goto L_0x17e9
        L_0x17e2:
            r0 = move-exception
            r1 = r0
            java.lang.String r3 = TAG
            android.util.Log.w(r3, r1)
        L_0x17e9:
            com.applisto.appcloner.classes.Utils.closeAndroidPieApiCompatibilityDialog()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.DefaultProvider.onCreate():boolean");
    }

    public static String getPackageNameHook(Object contextImpl) {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        int i = 0;
        while (i < stackTraceElements.length && i < 4) {
            String className = stackTraceElements[i].getClassName();
            if (!className.startsWith("com.fiverr.") || !className.contains(".Network.")) {
                i++;
            } else {
                Log.i(TAG, "getPackageNameHook; returning original package name for Fiverr");
                return "com.fiverr.fiverr";
            }
        }
        return (String) HookHelper.invokeObjectOrigin(contextImpl, new Object[0]);
    }

    private static String getOriginalPackageName(Context context) {
        try {
            return new String(Base64.decode(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.applisto.appcloner.originalPackageName"), 0));
        } catch (Exception e) {
            Log.w(TAG, e);
            return null;
        }
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String mode) throws FileNotFoundException {
        if (uri != null) {
            try {
                if (uri.toString().endsWith("assets/.notificationSoundFile")) {
                    return getContext().getResources().getAssets().openFd(".notificationSoundFile");
                }
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
        return super.openAssetFile(uri, mode);
    }

    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        String str = TAG;
        Log.i(str, "openFile; uri: " + uri);
        Context context = getContext();
        if (!"/Image.png".equals(uri.getPath()) || !"r".equals(mode)) {
            if (Utils.checkCaller(context)) {
                try {
                    if ("/cloneSettings".equals(uri.getPath())) {
                        File cloneSettingsFile = CloneSettings.getInstance(context).getCloneSettingsFile();
                        if ("r".equals(mode)) {
                            Log.i(TAG, "openFile; returning clone settings file MODE_READ_ONLY file descriptor...");
                            return ParcelFileDescriptor.open(cloneSettingsFile, 268435456);
                        } else if ("w".equals(mode)) {
                            Log.i(TAG, "openFile; returning clone settings file MODE_WRITE_ONLY file descriptor...");
                            return ParcelFileDescriptor.open(cloneSettingsFile, 738197504);
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw e;
                } catch (Exception e2) {
                    Log.w(TAG, e2);
                }
            }
            return super.openFile(uri, mode);
        }
        File file = new File(context.getCacheDir(), "share_image.png");
        String str2 = TAG;
        Log.i(str2, "openFile; returning share image file descriptor; file: " + file);
        return ParcelFileDescriptor.open(file, 268435456);
    }

    public static class DefaultReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            String access$000 = DefaultProvider.TAG;
            Log.i(access$000, "onReceive; intent: " + intent);
            if ("com.applisto.appcloner.KILL_PROCESS".equals(intent.getAction())) {
                try {
                    DefaultProvider.invokeSecondaryInstance(context, "util.Utils", "killAppProcesses", context);
                } catch (Exception e) {
                    Log.w(DefaultProvider.TAG, e);
                }
            }
        }
    }

    @Deprecated
    public static Object ni(Context c, String s) throws Exception {
        return Utils.getSecondaryClassLoader(c).loadClass(s).newInstance();
    }

    private void invokeSecondaryInstance(String s, String m, Object... args) throws Exception {
        invokeSecondaryInstance(getContext(), s, m, args);
    }

    public static void invokeSecondaryInstance(Context context, String s, String m, Object... args) throws Exception {
        Class<?> clazz = Utils.getSecondaryClassLoader(context).loadClass("com.applisto.appcloner.classes.secondary." + s);
        for (Method method : clazz.getMethods()) {
            if (method.getName().equals(m)) {
                method.invoke(clazz.newInstance(), args);
                return;
            }
        }
    }

    private void invokeSecondaryStatic(String s, String m, Object... args) throws Exception {
        invokeSecondaryStatic(getContext(), s, m, args);
    }

    public static void invokeSecondaryStatic(Context context, String s, String m, Object... args) throws Exception {
        for (Method method : Utils.getSecondaryClassLoader(context).loadClass("com.applisto.appcloner.classes.secondary." + s).getMethods()) {
            if (method.getName().equals(m)) {
                method.invoke((Object) null, args);
                return;
            }
        }
    }

    @SuppressLint({"Registered"})
    public static class MyActivity extends Activity {
        /* access modifiers changed from: private */
        public Handler mHandler = new Handler();

        /* access modifiers changed from: protected */
        @TargetApi(17)
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            try {
                new AlertDialog.Builder(this).setTitle(Utils.getAppName(this)).setMessage("This app was cloned using a non-official version of App Cloner.\n\nTo continue using this app reclone it using the official install of App Cloner.").setPositiveButton(17039370, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                    public void onDismiss(DialogInterface dialog) {
                        MyActivity.this.finish();
                        MyActivity.this.mHandler.postDelayed(new Runnable() {
                            public void run() {
                                try {
                                    Class.forName(new String(Base64.decode("amF2YS5sYW5nLlN5c3RlbQ==", 0))).getMethod(new String(Base64.decode("ZXhpdA==", 0)), new Class[]{Integer.TYPE}).invoke((Object) null, new Object[]{1});
                                } catch (Exception e) {
                                    Log.w(DefaultProvider.TAG, e);
                                }
                            }
                        }, 500);
                    }
                }).show();
            } catch (Exception e) {
                Log.w(DefaultProvider.TAG, e);
                System.exit(1);
            }
        }
    }
}
