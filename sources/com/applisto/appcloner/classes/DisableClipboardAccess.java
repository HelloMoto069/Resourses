package com.applisto.appcloner.classes;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.applisto.appcloner.classes.util.SimpleCrypt;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class DisableClipboardAccess {
    private static final int CLEAR_CLIPBOARD_TIMEOUT_MILLIS = 30000;
    private static final ClipData EMPTY_CLIP_DATA = ClipData.newPlainText("", "");
    /* access modifiers changed from: private */
    public static final String TAG = DisableClipboardAccess.class.getSimpleName();
    /* access modifiers changed from: private */
    public String mClearingClipDataToString;
    /* access modifiers changed from: private */
    public ClipData mClipData;
    /* access modifiers changed from: private */
    public boolean mClipboardTimeout;
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public boolean mDisableClipboardReadAccess;
    /* access modifiers changed from: private */
    public boolean mDisableClipboardWriteAccess;
    /* access modifiers changed from: private */
    public List<ClipboardManager.OnPrimaryClipChangedListener> mListeners = new CopyOnWriteArrayList();
    private boolean mPersistentClipboard;
    private SharedPreferences mPreferences;
    /* access modifiers changed from: private */
    public boolean mPrivateClipboard;
    private String mSetClipboardDataOnStart;
    private Handler mTimeoutHandler = new Handler();

    DisableClipboardAccess(CloneSettings cloneSettings) {
        this.mPrivateClipboard = cloneSettings.getBoolean("privateClipboard", false).booleanValue();
        if (this.mPrivateClipboard) {
            this.mPersistentClipboard = cloneSettings.getBoolean("persistentClipboard", false).booleanValue();
        } else {
            this.mDisableClipboardReadAccess = cloneSettings.getBoolean("disableClipboardReadAccess", false).booleanValue();
            this.mDisableClipboardWriteAccess = cloneSettings.getBoolean("disableClipboardWriteAccess", false).booleanValue();
        }
        this.mClipboardTimeout = cloneSettings.getBoolean("clipboardTimeout", false).booleanValue();
        this.mSetClipboardDataOnStart = cloneSettings.getString("setClipboardDataOnStart", "");
        String str = TAG;
        Log.i(str, "DisableClipboardAccess; mPrivateClipboard: " + this.mPrivateClipboard + ", mPersistentClipboard: " + this.mPersistentClipboard + ", mDisableClipboardReadAccess: " + this.mDisableClipboardReadAccess + ", mDisableClipboardWriteAccess: " + this.mDisableClipboardWriteAccess + ", mClipboardTimeout: " + this.mClipboardTimeout);
    }

    /* access modifiers changed from: package-private */
    public void init(Context context) {
        if (this.mDisableClipboardReadAccess || this.mDisableClipboardWriteAccess || this.mPrivateClipboard || this.mClipboardTimeout) {
            this.mContext = context;
            this.mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            installClipboardManagerHook(context);
        }
        if (!TextUtils.isEmpty(this.mSetClipboardDataOnStart)) {
            try {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", this.mSetClipboardDataOnStart));
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0066 A[Catch:{ Exception -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void installClipboardManagerHook(android.content.Context r11) {
        /*
            r10 = this;
            r10.loadClipboardIfPersistent()
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r11.getSystemService(r0)     // Catch:{ Exception -> 0x009b }
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ Exception -> 0x009b }
            r0.hasText()     // Catch:{ Exception -> 0x009b }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x009b }
            r2 = 0
            r3 = 26
            r4 = 1
            if (r1 >= r3) goto L_0x0033
            java.lang.String r1 = "O"
            java.lang.String r5 = android.os.Build.VERSION.CODENAME     // Catch:{ Exception -> 0x009b }
            boolean r1 = r1.equals(r5)     // Catch:{ Exception -> 0x009b }
            if (r1 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "sService"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ Exception -> 0x009b }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x009b }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ Exception -> 0x009b }
            goto L_0x0045
        L_0x0033:
            java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "mService"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ Exception -> 0x009b }
            r1.setAccessible(r4)     // Catch:{ Exception -> 0x009b }
            java.lang.Object r5 = r1.get(r0)     // Catch:{ Exception -> 0x009b }
        L_0x0045:
            r1 = r5
            com.applisto.appcloner.classes.DisableClipboardAccess$1 r5 = new com.applisto.appcloner.classes.DisableClipboardAccess$1     // Catch:{ Exception -> 0x009b }
            r5.<init>(r0, r1)     // Catch:{ Exception -> 0x009b }
            java.lang.String r6 = "android.content.IClipboard"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x009b }
            java.lang.Class r7 = r10.getClass()     // Catch:{ Exception -> 0x009b }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ Exception -> 0x009b }
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x009b }
            r9 = 0
            r8[r9] = r6     // Catch:{ Exception -> 0x009b }
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r7, r8, r5)     // Catch:{ Exception -> 0x009b }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x009b }
            if (r8 >= r3) goto L_0x0082
            java.lang.String r3 = "O"
            java.lang.String r8 = android.os.Build.VERSION.CODENAME     // Catch:{ Exception -> 0x009b }
            boolean r3 = r3.equals(r8)     // Catch:{ Exception -> 0x009b }
            if (r3 == 0) goto L_0x0071
            goto L_0x0082
        L_0x0071:
            java.lang.Class r3 = r0.getClass()     // Catch:{ Exception -> 0x009b }
            java.lang.String r8 = "sService"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ Exception -> 0x009b }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x009b }
            r3.set(r2, r7)     // Catch:{ Exception -> 0x009b }
            goto L_0x0093
        L_0x0082:
            java.lang.Class r2 = r0.getClass()     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = "mService"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x009b }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x009b }
            r2.set(r0, r7)     // Catch:{ Exception -> 0x009b }
        L_0x0093:
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x009b }
            java.lang.String r3 = "installClipboardManagerHook; installed proxy"
            android.util.Log.i(r2, r3)     // Catch:{ Exception -> 0x009b }
            goto L_0x00a1
        L_0x009b:
            r0 = move-exception
            java.lang.String r1 = TAG
            android.util.Log.w(r1, r0)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.DisableClipboardAccess.installClipboardManagerHook(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    public void startClipboardTimeout(final ClipboardManager clipboardManager, ClipData clipData) {
        try {
            if (EMPTY_CLIP_DATA.equals(clipData)) {
                Log.i(TAG, "startClipboardTimeout; empty clip data");
                return;
            }
            this.mTimeoutHandler.removeCallbacksAndMessages((Object) null);
            this.mTimeoutHandler.postDelayed(new Runnable() {
                public void run() {
                    DisableClipboardAccess disableClipboardAccess = DisableClipboardAccess.this;
                    String unused = disableClipboardAccess.mClearingClipDataToString = "" + clipboardManager.getPrimaryClip();
                    long when = System.currentTimeMillis() + 30000;
                    Intent i = new Intent();
                    i.setComponent(new ComponentName(DisableClipboardAccess.this.mContext, ClearClipboardReceiver.class));
                    i.setPackage(DisableClipboardAccess.this.mContext.getPackageName());
                    i.putExtra("expected_clip_data_to_string", DisableClipboardAccess.this.mClearingClipDataToString);
                    PendingIntent pendingIntent = PendingIntent.getBroadcast(DisableClipboardAccess.this.mContext, (int) when, i, 0);
                    AlarmManager alarmManager = (AlarmManager) DisableClipboardAccess.this.mContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
                    if (Build.VERSION.SDK_INT >= 23) {
                        alarmManager.setAndAllowWhileIdle(0, when, pendingIntent);
                    } else if (Build.VERSION.SDK_INT >= 19) {
                        alarmManager.setExact(0, when, pendingIntent);
                    } else {
                        alarmManager.set(0, when, pendingIntent);
                    }
                }
            }, 100);
            this.mTimeoutHandler.postDelayed(new Runnable() {
                public void run() {
                    DisableClipboardAccess.clearClipboard(DisableClipboardAccess.this.mContext, DisableClipboardAccess.this.mClearingClipDataToString);
                }
            }, 30000);
            Log.i(TAG, "startClipboardTimeout; started clipboard timeout");
        } catch (Throwable t) {
            Log.w(TAG, t);
        }
    }

    public static class ClearClipboardReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            String access$100 = DisableClipboardAccess.TAG;
            Log.i(access$100, "onReceive; intent: " + intent);
            DisableClipboardAccess.clearClipboard(context, intent.getStringExtra("expected_clip_data_to_string"));
        }
    }

    /* access modifiers changed from: private */
    public static void clearClipboard(Context context, String expectedClipDataToString) {
        Log.i(TAG, "clearClipboard; ");
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (("" + clipboardManager.getPrimaryClip()).equals(expectedClipDataToString)) {
                Log.i(TAG, "clearClipboard; clearing clipboard");
                clipboardManager.setPrimaryClip(EMPTY_CLIP_DATA);
                Toast.makeText(context, "Clipboard cleared", 0).show();
                return;
            }
            Log.i(TAG, "clearClipboard; not clearing clipboard; found other clip data");
        } catch (Exception e) {
            Log.w(TAG, e);
        }
    }

    private void loadClipboardIfPersistent() {
        if (this.mPersistentClipboard) {
            try {
                String s = this.mPreferences.getString("persistent_clip_data", (String) null);
                if (!TextUtils.isEmpty(s)) {
                    byte[] bytes = Base64.decode(new SimpleCrypt("gvdshfjry8wehu43").decrypt(s), 0);
                    Parcel parcel = Parcel.obtain();
                    parcel.unmarshall(bytes, 0, bytes.length);
                    parcel.setDataPosition(0);
                    this.mClipData = (ClipData) ClipData.CREATOR.createFromParcel(parcel);
                    Log.i(TAG, "saveClipboardIfPersistent; clipboard loaded");
                }
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public void saveClipboardIfPersistent() {
        if (this.mPersistentClipboard && this.mClipData != null) {
            try {
                Parcel parcel = Parcel.obtain();
                this.mClipData.writeToParcel(parcel, 0);
                this.mPreferences.edit().putString("persistent_clip_data", new SimpleCrypt("gvdshfjry8wehu43").encrypt(Base64.encodeToString(parcel.marshall(), 2))).commit();
                Log.i(TAG, "saveClipboardIfPersistent; clipboard saved");
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
    }

    /* access modifiers changed from: private */
    public static <T extends Parcelable> T cloneParcelable(T parcelable) {
        Parcel p = null;
        if (parcelable == null) {
            return p;
        }
        try {
            p = Parcel.obtain();
            p.writeValue(parcelable);
            p.setDataPosition(0);
            return (Parcelable) p.readValue(ClipData.class.getClassLoader());
        } finally {
            if (p != null) {
                p.recycle();
            }
        }
    }
}
