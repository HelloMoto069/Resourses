package com.applisto.appcloner.classes;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

@SuppressLint({"UseSparseArrays", "Registered", "PrivateApi"})
public class NotificationOptions extends OnAppExitListener {
    private static final String ACTION_SNOOZE_NOTIFICATION = "com.applisto.appcloner.action.SNOOZE_NOTIFICATION";
    private static final String EXTRA_SNOOZE_ACTION = "snooze_action";
    /* access modifiers changed from: private */
    public static final String TAG = NotificationOptions.class.getSimpleName();
    /* access modifiers changed from: private */
    public static boolean mAllowNotificationsWhenRunning;
    /* access modifiers changed from: private */
    public static boolean mBlockAllNotifications;
    /* access modifiers changed from: private */
    public static Integer mNotificationColor;
    /* access modifiers changed from: private */
    public boolean mHeadsUpNotifications;
    /* access modifiers changed from: private */
    public Icon mIcon;
    /* access modifiers changed from: private */
    public boolean mLocalOnlyNotifications;
    /* access modifiers changed from: private */
    public boolean mNoOngoingNotifications;
    private List<Map<String, Object>> mNotificationCategories = new ArrayList();
    /* access modifiers changed from: private */
    public final Set<String> mNotificationFilterSet;
    /* access modifiers changed from: private */
    public String mNotificationLightsColor;
    /* access modifiers changed from: private */
    public String mNotificationLightsPattern;
    /* access modifiers changed from: private */
    public String mNotificationPriority;
    /* access modifiers changed from: private */
    public boolean mNotificationQuietTime;
    /* access modifiers changed from: private */
    public int mNotificationQuietTimeEndHour;
    /* access modifiers changed from: private */
    public int mNotificationQuietTimeEndMinute;
    /* access modifiers changed from: private */
    public int mNotificationQuietTimeStartHour;
    /* access modifiers changed from: private */
    public int mNotificationQuietTimeStartMinute;
    /* access modifiers changed from: private */
    public int mNotificationSnoozeTimeout;
    /* access modifiers changed from: private */
    public String mNotificationSound;
    /* access modifiers changed from: private */
    public List<Map<String, Object>> mNotificationTextReplacements = new ArrayList();
    /* access modifiers changed from: private */
    public int mNotificationTimeout;
    /* access modifiers changed from: private */
    public boolean mNotificationTintStatusBarIcon;
    /* access modifiers changed from: private */
    public String mNotificationVibration;
    /* access modifiers changed from: private */
    public String mNotificationVisibility;
    /* access modifiers changed from: private */
    public boolean mRemoveNotificationActions;
    /* access modifiers changed from: private */
    public boolean mRemoveNotificationIcon;
    /* access modifiers changed from: private */
    public boolean mRemoveNotificationPeople;
    private boolean mReplaceNotificationIcon;
    /* access modifiers changed from: private */
    public boolean mRunning;
    /* access modifiers changed from: private */
    public boolean mShowNotificationTime;
    /* access modifiers changed from: private */
    public boolean mSimpleNotifications;
    /* access modifiers changed from: private */
    public Map<Integer, Notification> mSnoozeNotifications = new HashMap();
    /* access modifiers changed from: private */
    public Handler mTimeoutHandler = new Handler();
    /* access modifiers changed from: private */
    public Map<Integer, Runnable> mTimeoutRunnables = new HashMap();

    public NotificationOptions(CloneSettings cloneSettings) {
        mBlockAllNotifications = cloneSettings.getBoolean("blockAllNotifications", false).booleanValue();
        mAllowNotificationsWhenRunning = cloneSettings.getBoolean("allowNotificationsWhenRunning", false).booleanValue();
        String notificationFilter = cloneSettings.getString("notificationFilter", (String) null);
        this.mNotificationFilterSet = new HashSet();
        if (!TextUtils.isEmpty(notificationFilter)) {
            for (String s : notificationFilter.trim().split(",")) {
                String s2 = s.trim();
                if (!TextUtils.isEmpty(s2)) {
                    this.mNotificationFilterSet.add(s2.toLowerCase(Locale.ENGLISH));
                }
            }
        }
        this.mNotificationQuietTime = cloneSettings.getBoolean("notificationQuietTime", false).booleanValue();
        try {
            String[] arr = cloneSettings.getString("notificationQuietTimeStart", "21:00").split(":");
            this.mNotificationQuietTimeStartHour = Integer.parseInt(arr[0]);
            this.mNotificationQuietTimeStartMinute = Integer.parseInt(arr[1]);
            String[] arr2 = cloneSettings.getString("notificationQuietTimeEnd", "07:00").split(":");
            this.mNotificationQuietTimeEndHour = Integer.parseInt(arr2[0]);
            this.mNotificationQuietTimeEndMinute = Integer.parseInt(arr2[1]);
        } catch (Exception e) {
            Log.w(TAG, e);
        }
        if (cloneSettings.getBoolean("notificationColorUseStatusBarColor", false).booleanValue()) {
            mNotificationColor = cloneSettings.getInteger("statusBarColor", (Integer) null);
        } else {
            mNotificationColor = cloneSettings.getInteger("notificationColor", (Integer) null);
        }
        this.mNotificationTintStatusBarIcon = cloneSettings.getBoolean("notificationTintStatusBarIcon", false).booleanValue();
        this.mNotificationSound = cloneSettings.getString("notificationSound", "NO_CHANGE");
        this.mNotificationVibration = cloneSettings.getString("notificationVibration", "NO_CHANGE");
        this.mNotificationTimeout = cloneSettings.getInteger("notificationTimeout", 0).intValue();
        this.mNotificationSnoozeTimeout = cloneSettings.getInteger("notificationSnoozeTimeout", 0).intValue();
        this.mHeadsUpNotifications = cloneSettings.getBoolean("headsUpNotifications", false).booleanValue();
        this.mLocalOnlyNotifications = cloneSettings.getBoolean("localOnlyNotifications", false).booleanValue();
        this.mNoOngoingNotifications = cloneSettings.getBoolean("noOngoingNotifications", false).booleanValue();
        this.mShowNotificationTime = cloneSettings.getBoolean("showNotificationTime", false).booleanValue();
        this.mNotificationLightsPattern = cloneSettings.forObject("defaultNotificationLights").getString("notificationLightsPattern", "NO_CHANGE");
        this.mNotificationLightsColor = cloneSettings.forObject("defaultNotificationLights").getString("notificationLightsColor", "NO_CHANGE");
        this.mNotificationVisibility = cloneSettings.getString("notificationVisibility", "NO_CHANGE");
        this.mNotificationPriority = cloneSettings.getString("notificationPriority", "NO_CHANGE");
        this.mReplaceNotificationIcon = cloneSettings.getBoolean("replaceNotificationIcon", false).booleanValue();
        this.mRemoveNotificationIcon = cloneSettings.getBoolean("removeNotificationIcon", false).booleanValue();
        this.mRemoveNotificationActions = cloneSettings.getBoolean("removeNotificationActions", false).booleanValue();
        this.mRemoveNotificationPeople = cloneSettings.getBoolean("removeNotificationPeople", false).booleanValue();
        this.mSimpleNotifications = cloneSettings.getBoolean("simpleNotifications", false).booleanValue();
        List<CloneSettings> notificationCategories = cloneSettings.forObjectArray("notificationCategories");
        if (notificationCategories != null) {
            for (CloneSettings notificationCategory : notificationCategories) {
                Map<String, Object> map = new HashMap<>();
                map.put("name", notificationCategory.getString("name", ""));
                map.put("keywords", notificationCategory.getString("keywords", ""));
                map.put("ignoreCase", notificationCategory.getBoolean("ignoreCase", true));
                this.mNotificationCategories.add(map);
            }
        }
        List<CloneSettings> notificationTextReplacements = cloneSettings.forObjectArray("notificationTextReplacements");
        if (notificationTextReplacements != null) {
            for (CloneSettings notificationTextReplacement : notificationTextReplacements) {
                Map<String, Object> map2 = new HashMap<>();
                map2.put("replace", notificationTextReplacement.getString("replace", ""));
                map2.put("with", notificationTextReplacement.getString("with", ""));
                map2.put("ignoreCase", notificationTextReplacement.getBoolean("ignoreCase", true));
                map2.put("replaceInTitle", notificationTextReplacement.getBoolean("replaceInTitle", true));
                map2.put("replaceInContent", notificationTextReplacement.getBoolean("replaceInContent", true));
                map2.put("replaceInMessages", notificationTextReplacement.getBoolean("replaceInMessages", true));
                map2.put("replaceInActions", notificationTextReplacement.getBoolean("replaceInActions", true));
                this.mNotificationTextReplacements.add(map2);
            }
        }
        Log.i(TAG, "NotificationOptions; mBlockAllNotifications: " + mBlockAllNotifications);
        Log.i(TAG, "NotificationOptions; mAllowNotificationsWhenRunning: " + mAllowNotificationsWhenRunning);
        Log.i(TAG, "NotificationOptions; mNotificationFilterSet: " + this.mNotificationFilterSet);
        Log.i(TAG, "NotificationOptions; mNotificationQuietTime: " + this.mNotificationQuietTime);
        Log.i(TAG, "NotificationOptions; mNotificationQuietTimeStartHour: " + this.mNotificationQuietTimeStartHour);
        Log.i(TAG, "NotificationOptions; mNotificationQuietTimeStartMinute: " + this.mNotificationQuietTimeStartMinute);
        Log.i(TAG, "NotificationOptions; mNotificationQuietTimeEndHour: " + this.mNotificationQuietTimeEndHour);
        Log.i(TAG, "NotificationOptions; mNotificationQuietTimeEndMinute: " + this.mNotificationQuietTimeEndMinute);
        Log.i(TAG, "NotificationOptions; mNotificationColor: " + mNotificationColor);
        Log.i(TAG, "NotificationOptions; mNotificationTintStatusBarIcon: " + this.mNotificationTintStatusBarIcon);
        Log.i(TAG, "NotificationOptions; mNotificationSound: " + this.mNotificationSound);
        Log.i(TAG, "NotificationOptions; mNotificationVibration: " + this.mNotificationVibration);
        Log.i(TAG, "NotificationOptions; mNotificationTimeout: " + this.mNotificationTimeout);
        Log.i(TAG, "NotificationOptions; mNotificationSnoozeTimeout: " + this.mNotificationSnoozeTimeout);
        Log.i(TAG, "NotificationOptions; mHeadsUpNotifications: " + this.mHeadsUpNotifications);
        Log.i(TAG, "NotificationOptions; mLocalOnlyNotifications: " + this.mLocalOnlyNotifications);
        Log.i(TAG, "NotificationOptions; mNoOngoingNotifications: " + this.mNoOngoingNotifications);
        Log.i(TAG, "NotificationOptions; mShowNotificationTime: " + this.mShowNotificationTime);
        Log.i(TAG, "NotificationOptions; mNotificationLightsPattern: " + this.mNotificationLightsPattern);
        Log.i(TAG, "NotificationOptions; mNotificationLightsColor: " + this.mNotificationLightsColor);
        Log.i(TAG, "NotificationOptions; mNotificationVisibility: " + this.mNotificationVisibility);
        Log.i(TAG, "NotificationOptions; mNotificationPriority: " + this.mNotificationPriority);
        Log.i(TAG, "NotificationOptions; mReplaceNotificationIcon: " + this.mReplaceNotificationIcon);
        Log.i(TAG, "NotificationOptions; mRemoveNotificationIcon: " + this.mRemoveNotificationIcon);
        Log.i(TAG, "NotificationOptions; mRemoveNotificationActions: " + this.mRemoveNotificationActions);
        Log.i(TAG, "NotificationOptions; mRemoveNotificationPeople: " + this.mRemoveNotificationPeople);
        Log.i(TAG, "NotificationOptions; mSimpleNotifications: " + this.mSimpleNotifications);
        Log.i(TAG, "NotificationOptions; mNotificationCategories: " + this.mNotificationCategories);
        Log.i(TAG, "NotificationOptions; mNotificationTextReplacements: " + this.mNotificationTextReplacements);
    }

    public void init(Context context) {
        if (mNotificationColor != null || mBlockAllNotifications || !this.mNotificationFilterSet.isEmpty() || this.mNotificationQuietTime || !"NO_CHANGE".equals(this.mNotificationSound) || !"NO_CHANGE".equals(this.mNotificationVibration) || this.mNotificationTimeout != 0 || this.mNotificationSnoozeTimeout != 0 || this.mHeadsUpNotifications || this.mLocalOnlyNotifications || this.mNoOngoingNotifications || this.mShowNotificationTime || !"NO_CHANGE".equals(this.mNotificationLightsPattern) || !"NO_CHANGE".equals(this.mNotificationLightsColor) || !"NO_CHANGE".equals(this.mNotificationVisibility) || !"NO_CHANGE".equals(this.mNotificationPriority) || this.mReplaceNotificationIcon || this.mRemoveNotificationIcon || this.mRemoveNotificationActions || this.mRemoveNotificationPeople || this.mSimpleNotifications || !this.mNotificationCategories.isEmpty() || !this.mNotificationTextReplacements.isEmpty()) {
            onCreate();
            install(context);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityCreated(Activity activity) {
        super.onActivityCreated(activity);
        this.mRunning = true;
    }

    /* access modifiers changed from: protected */
    public void onAppExit(Context context) {
        Log.i(TAG, "onAppExit; ");
        this.mRunning = false;
    }

    public void install(final Context context) {
        Log.i(TAG, "install; ");
        try {
            Field serviceField = NotificationManager.class.getDeclaredField("sService");
            serviceField.setAccessible(true);
            if (serviceField.get((Object) null) != null) {
                Log.i(TAG, "onCreate; sService already initialized!!!");
            } else {
                Log.i(TAG, "onCreate; sService == null");
            }
            NotificationManager.class.getMethod("getService", new Class[0]).invoke((Object) null, new Object[0]);
            final Object instance = serviceField.get((Object) null);
            Class<?> inf = Class.forName("android.app.INotificationManager");
            serviceField.set((Object) null, Proxy.newProxyInstance(NotificationOptions.class.getClassLoader(), new Class[]{inf}, new InvocationHandler() {
                /* JADX WARNING: Removed duplicated region for block: B:267:0x0984  */
                /* JADX WARNING: Removed duplicated region for block: B:282:0x09d1  */
                /* JADX WARNING: Removed duplicated region for block: B:294:0x0a00  */
                /* JADX WARNING: Removed duplicated region for block: B:334:0x0ab7 A[Catch:{ Exception -> 0x0b24 }] */
                @android.annotation.SuppressLint({"NewApi"})
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object invoke(java.lang.Object r29, java.lang.reflect.Method r30, java.lang.Object[] r31) throws java.lang.Throwable {
                    /*
                        r28 = this;
                        r1 = r28
                        r2 = r30
                        r3 = r31
                        java.lang.String r4 = "enqueueNotificationWithTag"
                        java.lang.String r5 = r30.getName()
                        boolean r4 = r4.equals(r5)
                        if (r4 == 0) goto L_0x0b3b
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this
                        boolean r4 = r4.isAppClonerClassesNotification()
                        if (r4 != 0) goto L_0x0b3b
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r6 = "invoke; method: "
                        r5.append(r6)     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r2)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        r4 = 3
                        r5 = 2
                        r6 = r3[r4]     // Catch:{ ClassCastException -> 0x003d }
                        java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ ClassCastException -> 0x003d }
                        int r6 = r6.intValue()     // Catch:{ ClassCastException -> 0x003d }
                        goto L_0x0048
                    L_0x003d:
                        r0 = move-exception
                        r6 = r0
                        r7 = r3[r5]     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0b32 }
                        int r7 = r7.intValue()     // Catch:{ Exception -> 0x0b32 }
                        r6 = r7
                    L_0x0048:
                        r7 = 1621363246(0x60a40a2e, float:9.456249E19)
                        if (r6 == r7) goto L_0x0b31
                        r7 = 4534513(0x4530f1, float:6.354206E-39)
                        if (r6 == r7) goto L_0x0b31
                        boolean r7 = com.applisto.appcloner.classes.NotificationOptions.mBlockAllNotifications     // Catch:{ Exception -> 0x0b32 }
                        boolean r8 = com.applisto.appcloner.classes.NotificationOptions.mAllowNotificationsWhenRunning     // Catch:{ Exception -> 0x0b32 }
                        if (r8 == 0) goto L_0x0065
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r8 = r8.mRunning     // Catch:{ Exception -> 0x0b32 }
                        if (r8 == 0) goto L_0x0065
                        r7 = 0
                    L_0x0065:
                        r8 = 0
                        if (r7 == 0) goto L_0x0072
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "invoke; blocked notification"
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        return r8
                    L_0x0072:
                        r9 = 4
                        r10 = r3[r9]     // Catch:{ ClassCastException -> 0x0078 }
                        android.app.Notification r10 = (android.app.Notification) r10     // Catch:{ ClassCastException -> 0x0078 }
                        goto L_0x007f
                    L_0x0078:
                        r0 = move-exception
                        r10 = r0
                        r11 = r3[r4]     // Catch:{ Exception -> 0x0b32 }
                        android.app.Notification r11 = (android.app.Notification) r11     // Catch:{ Exception -> 0x0b32 }
                        r10 = r11
                    L_0x007f:
                        java.lang.Integer r11 = com.applisto.appcloner.classes.NotificationOptions.mNotificationColor     // Catch:{ Exception -> 0x0b32 }
                        if (r11 == 0) goto L_0x00ad
                        java.lang.Integer r11 = com.applisto.appcloner.classes.NotificationOptions.mNotificationColor     // Catch:{ NoSuchFieldError -> 0x00ac }
                        int r11 = r11.intValue()     // Catch:{ NoSuchFieldError -> 0x00ac }
                        r10.color = r11     // Catch:{ NoSuchFieldError -> 0x00ac }
                        java.lang.String r11 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ NoSuchFieldError -> 0x00ac }
                        java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NoSuchFieldError -> 0x00ac }
                        r12.<init>()     // Catch:{ NoSuchFieldError -> 0x00ac }
                        java.lang.String r13 = "invoke; set notification color; notificationColor: "
                        r12.append(r13)     // Catch:{ NoSuchFieldError -> 0x00ac }
                        java.lang.Integer r13 = com.applisto.appcloner.classes.NotificationOptions.mNotificationColor     // Catch:{ NoSuchFieldError -> 0x00ac }
                        r12.append(r13)     // Catch:{ NoSuchFieldError -> 0x00ac }
                        java.lang.String r12 = r12.toString()     // Catch:{ NoSuchFieldError -> 0x00ac }
                        android.util.Log.i(r11, r12)     // Catch:{ NoSuchFieldError -> 0x00ac }
                        goto L_0x00ad
                    L_0x00ac:
                        r0 = move-exception
                    L_0x00ad:
                        android.os.Bundle r11 = com.applisto.appcloner.classes.NotificationOptions.getExtras(r10)     // Catch:{ Exception -> 0x0b32 }
                        r15 = r11
                        java.lang.String r11 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r12.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r13 = "invoke; extras: "
                        r12.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        r12.append(r15)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r11, r12)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r11.<init>()     // Catch:{ Exception -> 0x0b32 }
                        r14 = r11
                        java.lang.String r11 = "android.title"
                        java.lang.String r12 = ""
                        java.lang.String r11 = r15.getString(r11, r12)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        r11 = 32
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = "android.title.big"
                        java.lang.String r13 = ""
                        java.lang.String r12 = r15.getString(r12, r13)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = "android.text"
                        java.lang.Object r12 = r15.get(r12)     // Catch:{ Exception -> 0x0b32 }
                        r13 = r12
                        if (r13 == 0) goto L_0x00fd
                        r14.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                    L_0x00fd:
                        java.lang.String r12 = "android.bigText"
                        java.lang.String r4 = ""
                        java.lang.String r4 = r15.getString(r12, r4)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r4)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = "android.infoText"
                        java.lang.String r12 = ""
                        java.lang.String r4 = r15.getString(r4, r12)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r4)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.CharSequence r4 = r10.tickerText     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r4)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = "android.textLines"
                        java.lang.CharSequence[] r4 = r15.getCharSequenceArray(r4)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0139
                        int r9 = r4.length     // Catch:{ Exception -> 0x0b32 }
                        r5 = 0
                    L_0x0128:
                        if (r5 >= r9) goto L_0x0139
                        r16 = r4[r5]     // Catch:{ Exception -> 0x0b32 }
                        r20 = r16
                        r12 = r20
                        r14.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        r14.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r5 + 1
                        goto L_0x0128
                    L_0x0139:
                        java.lang.String r5 = r14.toString()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r11.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = "invoke; concatenatedText: "
                        r11.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        r11.append(r5)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r9, r11)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r9 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.Set r9 = r9.mNotificationFilterSet     // Catch:{ Exception -> 0x0b32 }
                        boolean r9 = r9.isEmpty()     // Catch:{ Exception -> 0x0b32 }
                        if (r9 != 0) goto L_0x01a3
                        java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = r5.toLowerCase(r9)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.Set r11 = r11.mNotificationFilterSet     // Catch:{ Exception -> 0x0b32 }
                        java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0b32 }
                    L_0x0171:
                        boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x0b32 }
                        if (r12 == 0) goto L_0x01a3
                        java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0b32 }
                        boolean r16 = r9.contains(r12)     // Catch:{ Exception -> 0x0b32 }
                        if (r16 == 0) goto L_0x019f
                        java.lang.String r11 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        r21 = r4
                        java.lang.String r4 = "invoke; blocked notification; notificationFilterString: "
                        r8.append(r4)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r11, r4)     // Catch:{ Exception -> 0x0b32 }
                        r4 = 0
                        return r4
                    L_0x019f:
                        r21 = r4
                        r8 = 0
                        goto L_0x0171
                    L_0x01a3:
                        r21 = r4
                        int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0b32 }
                        r8 = 26
                        r9 = 1
                        if (r4 < r8) goto L_0x01ef
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Throwable -> 0x01e6 }
                        android.content.Context r11 = r10     // Catch:{ Throwable -> 0x01e6 }
                        java.lang.String r4 = r4.getNotificationChannelId(r11, r5)     // Catch:{ Throwable -> 0x01e6 }
                        java.lang.String r11 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Throwable -> 0x01e6 }
                        java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01e6 }
                        r12.<init>()     // Catch:{ Throwable -> 0x01e6 }
                        java.lang.String r8 = "invoke; channelId: "
                        r12.append(r8)     // Catch:{ Throwable -> 0x01e6 }
                        r12.append(r4)     // Catch:{ Throwable -> 0x01e6 }
                        java.lang.String r8 = r12.toString()     // Catch:{ Throwable -> 0x01e6 }
                        android.util.Log.i(r11, r8)     // Catch:{ Throwable -> 0x01e6 }
                        boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x01e6 }
                        if (r8 != 0) goto L_0x01e5
                        java.lang.Class<android.app.Notification> r8 = android.app.Notification.class
                        java.lang.String r11 = "mChannelId"
                        java.lang.reflect.Field r8 = r8.getDeclaredField(r11)     // Catch:{ Throwable -> 0x01e6 }
                        r8.setAccessible(r9)     // Catch:{ Throwable -> 0x01e6 }
                        r8.set(r10, r4)     // Catch:{ Throwable -> 0x01e6 }
                        java.lang.String r11 = "channel_id"
                        r15.putString(r11, r4)     // Catch:{ Throwable -> 0x01e6 }
                    L_0x01e5:
                        goto L_0x01ef
                    L_0x01e6:
                        r0 = move-exception
                        r4 = r0
                        java.lang.String r8 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r8, r4)     // Catch:{ Exception -> 0x0b32 }
                    L_0x01ef:
                        r4 = 0
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r8 = r8.mNotificationQuietTime     // Catch:{ Exception -> 0x0b32 }
                        if (r8 == 0) goto L_0x02e7
                        java.util.Calendar r8 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r11 = r11.mNotificationQuietTimeStartHour     // Catch:{ Exception -> 0x0b32 }
                        r12 = 11
                        r8.set(r12, r11)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r11 = r11.mNotificationQuietTimeStartMinute     // Catch:{ Exception -> 0x0b32 }
                        r9 = 12
                        r8.set(r9, r11)     // Catch:{ Exception -> 0x0b32 }
                        r11 = 13
                        r9 = 0
                        r8.set(r11, r9)     // Catch:{ Exception -> 0x0b32 }
                        r11 = 14
                        r8.set(r11, r9)     // Catch:{ Exception -> 0x0b32 }
                        java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r11 = r11.mNotificationQuietTimeEndHour     // Catch:{ Exception -> 0x0b32 }
                        r9.set(r12, r11)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r11 = r11.mNotificationQuietTimeEndMinute     // Catch:{ Exception -> 0x0b32 }
                        r12 = 12
                        r9.set(r12, r11)     // Catch:{ Exception -> 0x0b32 }
                        r11 = 13
                        r12 = 0
                        r9.set(r11, r12)     // Catch:{ Exception -> 0x0b32 }
                        r11 = 14
                        r9.set(r11, r12)     // Catch:{ Exception -> 0x0b32 }
                        boolean r11 = r9.before(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r11 == 0) goto L_0x024b
                        r11 = 5
                        r12 = 1
                        r9.add(r11, r12)     // Catch:{ Exception -> 0x0b32 }
                    L_0x024b:
                        java.util.Calendar r11 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0b32 }
                        java.util.Calendar r12 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0b32 }
                        r22 = r4
                        r4 = 5
                        r23 = r5
                        r5 = 1
                        r12.add(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r8.before(r11)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0268
                        boolean r4 = r9.after(r11)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 != 0) goto L_0x0274
                    L_0x0268:
                        boolean r4 = r8.before(r12)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0276
                        boolean r4 = r9.after(r12)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0276
                    L_0x0274:
                        r4 = 1
                        goto L_0x0278
                    L_0x0276:
                        r4 = r22
                    L_0x0278:
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        r24 = r7
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r7.<init>()     // Catch:{ Exception -> 0x0b32 }
                        r25 = r13
                        java.lang.String r13 = "invoke; start: "
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.util.Date r13 = r8.getTime()     // Catch:{ Exception -> 0x0b32 }
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r13 = ", end: "
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.util.Date r13 = r9.getTime()     // Catch:{ Exception -> 0x0b32 }
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r7.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r13 = "invoke; c1: "
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.util.Date r13 = r11.getTime()     // Catch:{ Exception -> 0x0b32 }
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r13 = ", c2: "
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.util.Date r13 = r12.getTime()     // Catch:{ Exception -> 0x0b32 }
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r7.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r13 = "invoke; quietTime: "
                        r7.append(r13)     // Catch:{ Exception -> 0x0b32 }
                        r7.append(r4)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        r22 = r4
                        goto L_0x02ef
                    L_0x02e7:
                        r22 = r4
                        r23 = r5
                        r24 = r7
                        r25 = r13
                    L_0x02ef:
                        r4 = -2
                        if (r22 == 0) goto L_0x0302
                        r5 = 0
                        r10.sound = r5     // Catch:{ Exception -> 0x0b32 }
                        r10.vibrate = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & r4
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                    L_0x0302:
                        if (r22 != 0) goto L_0x046d
                        java.lang.String r5 = "DEFAULT"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationSound     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0325
                        r5 = 0
                        r10.sound = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r7 = 1
                        r5 = r5 | r7
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; sound: default"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0392
                    L_0x0325:
                        java.lang.String r5 = "SILENCE"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationSound     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0345
                        r5 = 0
                        r10.sound = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & r4
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; sound: silence"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0392
                    L_0x0345:
                        java.lang.String r5 = "CUSTOM"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationSound     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0392
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "content://"
                        r5.append(r7)     // Catch:{ Exception -> 0x0b32 }
                        android.content.Context r7 = r10     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.getPackageName()     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = ".com.applisto.appcloner.classes.DefaultProvider/assets/.notificationSoundFile"
                        r5.append(r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x0b32 }
                        r10.sound = r5     // Catch:{ Exception -> 0x0b32 }
                        int r7 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r7 = r7 & r4
                        r10.defaults = r7     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = "invoke; sound: custom; uri: "
                        r8.append(r9)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r5)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r7, r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0392:
                        java.lang.String r5 = "DEFAULT"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationVibration     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x03b4
                        r5 = 0
                        r10.vibrate = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r7 = 2
                        r5 = r5 | r7
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; vibration: default"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x046d
                    L_0x03b4:
                        java.lang.String r5 = "SILENCE"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationVibration     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x03d6
                        r5 = 0
                        r10.vibrate = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; vibration: silence"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x046d
                    L_0x03d6:
                        java.lang.String r5 = "VERY_SHORT"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationVibration     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x03fc
                        r5 = 2
                        long[] r7 = new long[r5]     // Catch:{ Exception -> 0x0b32 }
                        r7 = {0, 50} // fill-array     // Catch:{ Exception -> 0x0b32 }
                        r10.vibrate = r7     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; vibration: very short"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x046d
                    L_0x03fc:
                        java.lang.String r5 = "SHORT"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationVibration     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0422
                        r5 = 2
                        long[] r7 = new long[r5]     // Catch:{ Exception -> 0x0b32 }
                        r7 = {0, 100} // fill-array     // Catch:{ Exception -> 0x0b32 }
                        r10.vibrate = r7     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; vibration: short"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x046d
                    L_0x0422:
                        java.lang.String r5 = "LONG"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationVibration     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0448
                        r5 = 2
                        long[] r7 = new long[r5]     // Catch:{ Exception -> 0x0b32 }
                        r7 = {0, 500} // fill-array     // Catch:{ Exception -> 0x0b32 }
                        r10.vibrate = r7     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; vibration: long"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x046d
                    L_0x0448:
                        java.lang.String r5 = "VERY_LONG"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = r7.mNotificationVibration     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x046d
                        r5 = 2
                        long[] r7 = new long[r5]     // Catch:{ Exception -> 0x0b32 }
                        r7 = {0, 1000} // fill-array     // Catch:{ Exception -> 0x0b32 }
                        r10.vibrate = r7     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.defaults = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; vibration: very long"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                    L_0x046d:
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r5.mNotificationTimeout     // Catch:{ Exception -> 0x0b32 }
                        r7 = 1000(0x3e8, float:1.401E-42)
                        if (r5 == 0) goto L_0x04e0
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.Map r5 = r5.mTimeoutRunnables     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Object r5 = r5.get(r8)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Runnable r5 = (java.lang.Runnable) r5     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0492
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        android.os.Handler r8 = r8.mTimeoutHandler     // Catch:{ Exception -> 0x0b32 }
                        r8.removeCallbacks(r5)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0492:
                        r8 = r6
                        com.applisto.appcloner.classes.NotificationOptions$1$1 r9 = new com.applisto.appcloner.classes.NotificationOptions$1$1     // Catch:{ Exception -> 0x0b32 }
                        r9.<init>(r8)     // Catch:{ Exception -> 0x0b32 }
                        r5 = r9
                        com.applisto.appcloner.classes.NotificationOptions r9 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        android.os.Handler r9 = r9.mTimeoutHandler     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r11 = r11.mNotificationTimeout     // Catch:{ Exception -> 0x0b32 }
                        int r11 = r11 * 1000
                        long r11 = (long) r11     // Catch:{ Exception -> 0x0b32 }
                        r9.postDelayed(r5, r11)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r9 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.Map r9 = r9.mTimeoutRunnables     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0b32 }
                        r9.put(r11, r5)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r11.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = "invoke; scheduled timeout; id: "
                        r11.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        r11.append(r6)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = ", millis: "
                        r11.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r12 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r12 = r12.mNotificationTimeout     // Catch:{ Exception -> 0x0b32 }
                        int r12 = r12 * 1000
                        r11.append(r12)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r9, r11)     // Catch:{ Exception -> 0x0b32 }
                    L_0x04e0:
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.mHeadsUpNotifications     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x050f
                        int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0b32 }
                        r8 = 21
                        if (r5 < r8) goto L_0x050f
                        java.lang.String r5 = "headsup"
                        r8 = 2
                        r15.putInt(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                        r5 = 1
                        r10.priority = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = "invoke; headsUpNotifications; notification: "
                        r8.append(r9)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x050f:
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.mLocalOnlyNotifications     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0535
                        int r5 = r10.flags     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 | 256(0x100, float:3.59E-43)
                        r10.flags = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = "invoke; localOnlyNotifications; notification: "
                        r8.append(r9)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0535:
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.mNoOngoingNotifications     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0561
                        int r5 = r10.flags     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -3
                        r10.flags = r5     // Catch:{ Exception -> 0x0b32 }
                        int r5 = r10.flags     // Catch:{ Exception -> 0x0b32 }
                        r5 = r5 & -33
                        r10.flags = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = "invoke; noOngoingNotifications; notification: "
                        r8.append(r9)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0561:
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.mShowNotificationTime     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0597
                        long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x058e }
                        r10.when = r8     // Catch:{ Exception -> 0x058e }
                        java.lang.String r5 = "android.showWhen"
                        r8 = 1
                        r15.putBoolean(r5, r8)     // Catch:{ Exception -> 0x058e }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x058e }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x058e }
                        r8.<init>()     // Catch:{ Exception -> 0x058e }
                        java.lang.String r9 = "invoke; showNotificationTime; notification: "
                        r8.append(r9)     // Catch:{ Exception -> 0x058e }
                        r8.append(r10)     // Catch:{ Exception -> 0x058e }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x058e }
                        android.util.Log.i(r5, r8)     // Catch:{ Exception -> 0x058e }
                        goto L_0x0597
                    L_0x058e:
                        r0 = move-exception
                        r5 = r0
                        java.lang.String r8 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r8, r5)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0597:
                        int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0b32 }
                        r8 = 21
                        r9 = -1
                        if (r5 < r8) goto L_0x05f3
                        java.lang.String r5 = "PUBLIC"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationVisibility     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x05c8
                        r5 = 1
                        r10.visibility = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r11 = "invoke; made notification public; notification: "
                        r8.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x05f3
                    L_0x05c8:
                        java.lang.String r5 = "PRIVATE"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationVisibility     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x05f3
                        r10.visibility = r9     // Catch:{ Exception -> 0x0b32 }
                        r5 = 0
                        r10.publicVersion = r5     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r8.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r11 = "invoke; made notification private; notification: "
                        r8.append(r11)     // Catch:{ Exception -> 0x0b32 }
                        r8.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x05f3:
                        java.lang.String r5 = "MAX"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationPriority     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x061e
                        r4 = 2
                        r10.priority = r4     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = "invoke; PRIORITY_MAX; notification: "
                        r5.append(r8)     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x06c4
                    L_0x061e:
                        java.lang.String r5 = "HIGH"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationPriority     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0649
                        r4 = 1
                        r10.priority = r4     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = "invoke; PRIORITY_HIGH; notification: "
                        r5.append(r8)     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x06c4
                    L_0x0649:
                        java.lang.String r5 = "DEFAULT"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationPriority     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x0673
                        r4 = 0
                        r10.priority = r4     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = "invoke; PRIORITY_DEFAULT; notification: "
                        r5.append(r8)     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x06c4
                    L_0x0673:
                        java.lang.String r5 = "LOW"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationPriority     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x069c
                        r10.priority = r9     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = "invoke; PRIORITY_LOW; notification: "
                        r5.append(r8)     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x06c4
                    L_0x069c:
                        java.lang.String r5 = "MIN"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationPriority     // Catch:{ Exception -> 0x0b32 }
                        boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x06c4
                        r10.priority = r4     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0b32 }
                        r5.<init>()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = "invoke; PRIORITY_MIN; notification: "
                        r5.append(r8)     // Catch:{ Exception -> 0x0b32 }
                        r5.append(r10)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0b32 }
                    L_0x06c4:
                        java.lang.String r4 = "NO_CHANGE"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        r5 = 250(0xfa, float:3.5E-43)
                        if (r4 != 0) goto L_0x0750
                        int r4 = r10.ledARGB     // Catch:{ Exception -> 0x0b32 }
                        if (r4 != 0) goto L_0x06da
                        r10.ledARGB = r9     // Catch:{ Exception -> 0x0b32 }
                    L_0x06da:
                        int r4 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r4 = r4 & -5
                        r10.defaults = r4     // Catch:{ Exception -> 0x0b32 }
                        int r4 = r10.flags     // Catch:{ Exception -> 0x0b32 }
                        r8 = 1
                        r4 = r4 | r8
                        r10.flags = r4     // Catch:{ Exception -> 0x0b32 }
                        r4 = 0
                        r10.priority = r4     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = "ON"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0700
                        r4 = 100000000(0x5f5e100, float:2.3122341E-35)
                        r10.ledOnMS = r4     // Catch:{ Exception -> 0x0b32 }
                        r4 = 1
                        r10.ledOffMS = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0750
                    L_0x0700:
                        java.lang.String r4 = "FLASH_SLOW"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0715
                        r10.ledOnMS = r7     // Catch:{ Exception -> 0x0b32 }
                        r4 = 2000(0x7d0, float:2.803E-42)
                        r10.ledOffMS = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0750
                    L_0x0715:
                        java.lang.String r4 = "FLASH_MEDIUM"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x072a
                        r4 = 500(0x1f4, float:7.0E-43)
                        r10.ledOnMS = r4     // Catch:{ Exception -> 0x0b32 }
                        r10.ledOffMS = r7     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0750
                    L_0x072a:
                        java.lang.String r4 = "FLASH_FAST"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x073d
                        r10.ledOnMS = r5     // Catch:{ Exception -> 0x0b32 }
                        r10.ledOffMS = r5     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0750
                    L_0x073d:
                        java.lang.String r4 = "OFF"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0750
                        r4 = 0
                        r10.ledOnMS = r4     // Catch:{ Exception -> 0x0b32 }
                        r10.ledOffMS = r4     // Catch:{ Exception -> 0x0b32 }
                    L_0x0750:
                        java.lang.String r4 = "NO_CHANGE"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 != 0) goto L_0x080c
                        int r4 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r8 = 4
                        r4 = r4 & r8
                        if (r4 == 0) goto L_0x0776
                        java.lang.String r4 = "NO_CHANGE"
                        com.applisto.appcloner.classes.NotificationOptions r8 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r8 = r8.mNotificationLightsPattern     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 != 0) goto L_0x0776
                        r10.ledOnMS = r7     // Catch:{ Exception -> 0x0b32 }
                        r10.ledOffMS = r5     // Catch:{ Exception -> 0x0b32 }
                    L_0x0776:
                        int r4 = r10.defaults     // Catch:{ Exception -> 0x0b32 }
                        r4 = r4 & -5
                        r10.defaults = r4     // Catch:{ Exception -> 0x0b32 }
                        int r4 = r10.flags     // Catch:{ Exception -> 0x0b32 }
                        r5 = 1
                        r4 = r4 | r5
                        r10.flags = r4     // Catch:{ Exception -> 0x0b32 }
                        r4 = 0
                        r10.priority = r4     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r4 = "WHITE"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0797
                        r10.ledARGB = r9     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x080c
                    L_0x0797:
                        java.lang.String r4 = "RED"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x07aa
                        r4 = -65536(0xffffffffffff0000, float:NaN)
                        r10.ledARGB = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x080c
                    L_0x07aa:
                        java.lang.String r4 = "YELLOW"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x07bd
                        r4 = -256(0xffffffffffffff00, float:NaN)
                        r10.ledARGB = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x080c
                    L_0x07bd:
                        java.lang.String r4 = "GREEN"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x07d1
                        r4 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                        r10.ledARGB = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x080c
                    L_0x07d1:
                        java.lang.String r4 = "CYAN"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x07e5
                        r4 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
                        r10.ledARGB = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x080c
                    L_0x07e5:
                        java.lang.String r4 = "BLUE"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x07f9
                        r4 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
                        r10.ledARGB = r4     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x080c
                    L_0x07f9:
                        java.lang.String r4 = "MAGENTA"
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.mNotificationLightsColor     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x080c
                        r4 = -65281(0xffffffffffff00ff, float:NaN)
                        r10.ledARGB = r4     // Catch:{ Exception -> 0x0b32 }
                    L_0x080c:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        int r4 = r4.mNotificationSnoozeTimeout     // Catch:{ Exception -> 0x0b32 }
                        if (r4 <= 0) goto L_0x08a8
                        int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0b32 }
                        r5 = 16
                        if (r4 < r5) goto L_0x08a8
                        android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "com.applisto.appcloner.action.SNOOZE_NOTIFICATION"
                        r4.<init>(r5)     // Catch:{ Exception -> 0x0b32 }
                        android.content.Context r5 = r10     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = r5.getPackageName()     // Catch:{ Exception -> 0x0b32 }
                        r4.setPackage(r5)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "id"
                        r4.putExtra(r5, r6)     // Catch:{ Exception -> 0x0b32 }
                        android.content.Context r5 = r10     // Catch:{ Exception -> 0x0b32 }
                        r7 = 1073741824(0x40000000, float:2.0)
                        android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r5, r6, r4, r7)     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.Map r7 = r7.mSnoozeNotifications     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0b32 }
                        r7.put(r8, r10)     // Catch:{ Exception -> 0x0b32 }
                        java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0b32 }
                        r7.<init>()     // Catch:{ Exception -> 0x0b32 }
                        android.app.Notification$Action[] r8 = r10.actions     // Catch:{ Exception -> 0x0b32 }
                        if (r8 == 0) goto L_0x0856
                        android.app.Notification$Action[] r8 = r10.actions     // Catch:{ Exception -> 0x0b32 }
                        java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ Exception -> 0x0b32 }
                        r7.addAll(r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0856:
                        java.util.Iterator r8 = r7.iterator()     // Catch:{ Exception -> 0x0b32 }
                    L_0x085a:
                        boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x0b32 }
                        if (r9 == 0) goto L_0x087c
                        java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x0b32 }
                        android.app.Notification$Action r9 = (android.app.Notification.Action) r9     // Catch:{ Exception -> 0x0b32 }
                        android.os.Bundle r11 = r9.getExtras()     // Catch:{ Exception -> 0x0b32 }
                        if (r11 == 0) goto L_0x087b
                        android.os.Bundle r11 = r9.getExtras()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r12 = "snooze_action"
                        boolean r11 = r11.getBoolean(r12)     // Catch:{ Exception -> 0x0b32 }
                        if (r11 == 0) goto L_0x087b
                        r8.remove()     // Catch:{ Exception -> 0x0b32 }
                    L_0x087b:
                        goto L_0x085a
                    L_0x087c:
                        android.app.Notification$Action r8 = new android.app.Notification$Action     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r9 = "Snooze"
                        r11 = 0
                        r8.<init>(r11, r9, r5)     // Catch:{ Exception -> 0x0b32 }
                        android.os.Bundle r9 = r8.getExtras()     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r11 = "snooze_action"
                        r12 = 1
                        r9.putBoolean(r11, r12)     // Catch:{ Exception -> 0x0b32 }
                        r7.add(r8)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0891:
                        int r9 = r7.size()     // Catch:{ Exception -> 0x0b32 }
                        r11 = 3
                        if (r9 <= r11) goto L_0x089d
                        r9 = 0
                        r7.remove(r9)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x0891
                    L_0x089d:
                        r9 = 0
                        android.app.Notification$Action[] r11 = new android.app.Notification.Action[r9]     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Object[] r9 = r7.toArray(r11)     // Catch:{ Exception -> 0x0b32 }
                        android.app.Notification$Action[] r9 = (android.app.Notification.Action[]) r9     // Catch:{ Exception -> 0x0b32 }
                        r10.actions = r9     // Catch:{ Exception -> 0x0b32 }
                    L_0x08a8:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        android.graphics.drawable.Icon r4 = r4.mIcon     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x08f4
                        java.lang.Class<android.app.Notification> r4 = android.app.Notification.class
                        java.lang.String r5 = "setSmallIcon"
                        r7 = 1
                        java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0b32 }
                        java.lang.Class<android.graphics.drawable.Icon> r7 = android.graphics.drawable.Icon.class
                        r9 = 0
                        r8[r9] = r7     // Catch:{ Exception -> 0x0b32 }
                        java.lang.reflect.Method r4 = r4.getMethod(r5, r8)     // Catch:{ Exception -> 0x0b32 }
                        r5 = 1
                        java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0b32 }
                        com.applisto.appcloner.classes.NotificationOptions r5 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        android.graphics.drawable.Icon r5 = r5.mIcon     // Catch:{ Exception -> 0x0b32 }
                        r8 = 0
                        r7[r8] = r5     // Catch:{ Exception -> 0x0b32 }
                        r4.invoke(r10, r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; replaced small icon"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "android.largeIcon"
                        boolean r5 = r15.containsKey(r5)     // Catch:{ Exception -> 0x0b32 }
                        if (r5 == 0) goto L_0x08f4
                        java.lang.String r5 = "android.largeIcon"
                        com.applisto.appcloner.classes.NotificationOptions r7 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        android.graphics.drawable.Icon r7 = r7.mIcon     // Catch:{ Exception -> 0x0b32 }
                        r15.putParcelable(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r7 = "invoke; replaced large icon"
                        android.util.Log.i(r5, r7)     // Catch:{ Exception -> 0x0b32 }
                    L_0x08f4:
                        java.lang.Integer r4 = com.applisto.appcloner.classes.NotificationOptions.mNotificationColor     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0978
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.mNotificationTintStatusBarIcon     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0978
                        int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0b32 }
                        r5 = 23
                        if (r4 < r5) goto L_0x0978
                        android.graphics.drawable.Icon r4 = r10.getSmallIcon()     // Catch:{ Throwable -> 0x096a }
                        if (r4 == 0) goto L_0x0965
                        android.content.Context r5 = r10     // Catch:{ Throwable -> 0x096a }
                        android.graphics.drawable.Drawable r5 = r4.loadDrawable(r5)     // Catch:{ Throwable -> 0x096a }
                        int r7 = r5.getIntrinsicWidth()     // Catch:{ Throwable -> 0x096a }
                        int r8 = r5.getIntrinsicHeight()     // Catch:{ Throwable -> 0x096a }
                        android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Throwable -> 0x096a }
                        android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r7, r8, r9)     // Catch:{ Throwable -> 0x096a }
                        android.graphics.Canvas r11 = new android.graphics.Canvas     // Catch:{ Throwable -> 0x096a }
                        r11.<init>(r9)     // Catch:{ Throwable -> 0x096a }
                        java.lang.Integer r12 = com.applisto.appcloner.classes.NotificationOptions.mNotificationColor     // Catch:{ Throwable -> 0x096a }
                        int r12 = r12.intValue()     // Catch:{ Throwable -> 0x096a }
                        android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Throwable -> 0x096a }
                        r5.setColorFilter(r12, r13)     // Catch:{ Throwable -> 0x096a }
                        r12 = 0
                        r5.setBounds(r12, r12, r7, r8)     // Catch:{ Throwable -> 0x096a }
                        r5.draw(r11)     // Catch:{ Throwable -> 0x096a }
                        android.graphics.drawable.Icon r12 = android.graphics.drawable.Icon.createWithBitmap(r9)     // Catch:{ Throwable -> 0x096a }
                        r4 = r12
                        java.lang.Class<android.app.Notification> r12 = android.app.Notification.class
                        java.lang.String r13 = "setSmallIcon"
                        r26 = r5
                        r27 = r6
                        r5 = 1
                        java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x0960 }
                        java.lang.Class<android.graphics.drawable.Icon> r5 = android.graphics.drawable.Icon.class
                        r16 = 0
                        r6[r16] = r5     // Catch:{ Throwable -> 0x095e }
                        java.lang.reflect.Method r5 = r12.getMethod(r13, r6)     // Catch:{ Throwable -> 0x095e }
                        r6 = 1
                        java.lang.Object[] r12 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x095e }
                        r12[r16] = r4     // Catch:{ Throwable -> 0x095e }
                        r5.invoke(r10, r12)     // Catch:{ Throwable -> 0x095e }
                        goto L_0x0969
                    L_0x095e:
                        r0 = move-exception
                        goto L_0x0963
                    L_0x0960:
                        r0 = move-exception
                        r16 = 0
                    L_0x0963:
                        r4 = r0
                        goto L_0x0970
                    L_0x0965:
                        r27 = r6
                        r16 = 0
                    L_0x0969:
                        goto L_0x097c
                    L_0x096a:
                        r0 = move-exception
                        r27 = r6
                        r16 = 0
                        r4 = r0
                    L_0x0970:
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r5, r4)     // Catch:{ Exception -> 0x0b32 }
                        goto L_0x097c
                    L_0x0978:
                        r27 = r6
                        r16 = 0
                    L_0x097c:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.mRemoveNotificationIcon     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x09c9
                        r4 = 0
                        r10.largeIcon = r4     // Catch:{ Exception -> 0x09c0 }
                        java.lang.String r4 = "android.largeIcon"
                        r15.remove(r4)     // Catch:{ Exception -> 0x09c0 }
                        java.lang.String r4 = "android.wearable.EXTENSIONS"
                        android.os.Bundle r4 = r15.getBundle(r4)     // Catch:{ Exception -> 0x09c0 }
                        if (r4 == 0) goto L_0x0999
                        java.lang.String r5 = "background"
                        r4.remove(r5)     // Catch:{ Exception -> 0x09c0 }
                    L_0x0999:
                        java.lang.String r5 = "android.car.EXTENSIONS"
                        android.os.Bundle r5 = r15.getBundle(r5)     // Catch:{ Exception -> 0x09c0 }
                        if (r5 == 0) goto L_0x09a6
                        java.lang.String r6 = "large_icon"
                        r5.remove(r6)     // Catch:{ Exception -> 0x09c0 }
                    L_0x09a6:
                        java.lang.Class<android.app.Notification> r6 = android.app.Notification.class
                        java.lang.String r7 = "mLargeIcon"
                        java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x09c0 }
                        r7 = 1
                        r6.setAccessible(r7)     // Catch:{ Exception -> 0x09c0 }
                        r7 = 0
                        r6.set(r10, r7)     // Catch:{ Exception -> 0x09c0 }
                        java.lang.String r7 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x09c0 }
                        java.lang.String r8 = "invoke; removed notification icon"
                        android.util.Log.i(r7, r8)     // Catch:{ Exception -> 0x09c0 }
                        goto L_0x09c9
                    L_0x09c0:
                        r0 = move-exception
                        r4 = r0
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r5, r4)     // Catch:{ Exception -> 0x0b32 }
                    L_0x09c9:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.mRemoveNotificationActions     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x09f8
                        r4 = 0
                        r10.contentIntent = r4     // Catch:{ Exception -> 0x09ef }
                        r10.deleteIntent = r4     // Catch:{ Exception -> 0x09ef }
                        r10.actions = r4     // Catch:{ Exception -> 0x09ef }
                        java.lang.String r4 = "android.wearable.EXTENSIONS"
                        android.os.Bundle r4 = r15.getBundle(r4)     // Catch:{ Exception -> 0x09ef }
                        if (r4 == 0) goto L_0x09e5
                        java.lang.String r5 = "actions"
                        r4.remove(r5)     // Catch:{ Exception -> 0x09ef }
                    L_0x09e5:
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x09ef }
                        java.lang.String r6 = "invoke; removed notification actions"
                        android.util.Log.i(r5, r6)     // Catch:{ Exception -> 0x09ef }
                        goto L_0x09f8
                    L_0x09ef:
                        r0 = move-exception
                        r4 = r0
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r5, r4)     // Catch:{ Exception -> 0x0b32 }
                    L_0x09f8:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.mRemoveNotificationPeople     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0a72
                        java.lang.String r4 = "android.messagingUser"
                        r15.remove(r4)     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r4 = "android.people.list"
                        r15.remove(r4)     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r4 = "android.people"
                        r15.remove(r4)     // Catch:{ Exception -> 0x0a69 }
                        int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0a69 }
                        r5 = 24
                        if (r4 < r5) goto L_0x0a37
                        java.lang.String r4 = "android.messages"
                        android.os.Parcelable[] r4 = r15.getParcelableArray(r4)     // Catch:{ Exception -> 0x0a69 }
                        if (r4 == 0) goto L_0x0a37
                        int r5 = r4.length     // Catch:{ Exception -> 0x0a69 }
                        r6 = 0
                    L_0x0a1f:
                        if (r6 >= r5) goto L_0x0a37
                        r7 = r4[r6]     // Catch:{ Exception -> 0x0a69 }
                        boolean r8 = r7 instanceof android.os.Bundle     // Catch:{ Exception -> 0x0a69 }
                        if (r8 == 0) goto L_0x0a34
                        r8 = r7
                        android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r9 = "sender"
                        r8.remove(r9)     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r9 = "sender_person"
                        r8.remove(r9)     // Catch:{ Exception -> 0x0a69 }
                    L_0x0a34:
                        int r6 = r6 + 1
                        goto L_0x0a1f
                    L_0x0a37:
                        int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0a69 }
                        r5 = 26
                        if (r4 < r5) goto L_0x0a5f
                        java.lang.String r4 = "android.messages.historic"
                        android.os.Parcelable[] r4 = r15.getParcelableArray(r4)     // Catch:{ Exception -> 0x0a69 }
                        if (r4 == 0) goto L_0x0a5f
                        int r5 = r4.length     // Catch:{ Exception -> 0x0a69 }
                        r6 = 0
                    L_0x0a47:
                        if (r6 >= r5) goto L_0x0a5f
                        r7 = r4[r6]     // Catch:{ Exception -> 0x0a69 }
                        boolean r8 = r7 instanceof android.os.Bundle     // Catch:{ Exception -> 0x0a69 }
                        if (r8 == 0) goto L_0x0a5c
                        r8 = r7
                        android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r9 = "sender"
                        r8.remove(r9)     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r9 = "sender_person"
                        r8.remove(r9)     // Catch:{ Exception -> 0x0a69 }
                    L_0x0a5c:
                        int r6 = r6 + 1
                        goto L_0x0a47
                    L_0x0a5f:
                        java.lang.String r4 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0a69 }
                        java.lang.String r5 = "invoke; removed notification people"
                        android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0a69 }
                        goto L_0x0a72
                    L_0x0a69:
                        r0 = move-exception
                        r4 = r0
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r5, r4)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0a72:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.mSimpleNotifications     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0a93
                        android.os.Bundle r4 = r10.extras     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0a93
                        android.os.Bundle r4 = r10.extras     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "android.picture"
                        r4.remove(r5)     // Catch:{ Exception -> 0x0b32 }
                        android.os.Bundle r4 = r10.extras     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "android.largeIcon.big"
                        r4.remove(r5)     // Catch:{ Exception -> 0x0b32 }
                        android.os.Bundle r4 = r10.extras     // Catch:{ Exception -> 0x0b32 }
                        java.lang.String r5 = "android.template"
                        r4.remove(r5)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0a93:
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.List r4 = r4.mNotificationTextReplacements     // Catch:{ Exception -> 0x0b32 }
                        if (r4 == 0) goto L_0x0b31
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b32 }
                        java.util.List r4 = r4.mNotificationTextReplacements     // Catch:{ Exception -> 0x0b32 }
                        boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x0b32 }
                        if (r4 != 0) goto L_0x0b31
                        com.applisto.appcloner.classes.NotificationOptions r4 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b24 }
                        java.util.List r4 = r4.mNotificationTextReplacements     // Catch:{ Exception -> 0x0b24 }
                        java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0b24 }
                    L_0x0ab1:
                        boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0b24 }
                        if (r5 == 0) goto L_0x0b1f
                        java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0b24 }
                        java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x0b24 }
                        com.applisto.appcloner.classes.NotificationOptions r11 = com.applisto.appcloner.classes.NotificationOptions.this     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r6 = "replace"
                        java.lang.Object r6 = r5.get(r6)     // Catch:{ Exception -> 0x0b24 }
                        r13 = r6
                        java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r6 = "with"
                        java.lang.Object r6 = r5.get(r6)     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r7 = "ignoreCase"
                        java.lang.Object r7 = r5.get(r7)     // Catch:{ Exception -> 0x0b24 }
                        java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x0b24 }
                        boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r8 = "replaceInTitle"
                        java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0b24 }
                        java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x0b24 }
                        boolean r16 = r8.booleanValue()     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r8 = "replaceInContent"
                        java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0b24 }
                        java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x0b24 }
                        boolean r17 = r8.booleanValue()     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r8 = "replaceInMessages"
                        java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0b24 }
                        java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x0b24 }
                        boolean r18 = r8.booleanValue()     // Catch:{ Exception -> 0x0b24 }
                        java.lang.String r8 = "replaceInActions"
                        java.lang.Object r8 = r5.get(r8)     // Catch:{ Exception -> 0x0b24 }
                        java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ Exception -> 0x0b24 }
                        boolean r19 = r8.booleanValue()     // Catch:{ Exception -> 0x0b24 }
                        r12 = r10
                        r8 = r25
                        r9 = r14
                        r14 = r6
                        r6 = r15
                        r15 = r7
                        r11.replaceNotificationText(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0b1c }
                        r15 = r6
                        r25 = r8
                        r14 = r9
                        goto L_0x0ab1
                    L_0x0b1c:
                        r0 = move-exception
                        r4 = r0
                        goto L_0x0b2a
                    L_0x0b1f:
                        r9 = r14
                        r6 = r15
                        r8 = r25
                        goto L_0x0b31
                    L_0x0b24:
                        r0 = move-exception
                        r9 = r14
                        r6 = r15
                        r8 = r25
                        r4 = r0
                    L_0x0b2a:
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG     // Catch:{ Exception -> 0x0b32 }
                        android.util.Log.w(r5, r4)     // Catch:{ Exception -> 0x0b32 }
                    L_0x0b31:
                        goto L_0x0b3b
                    L_0x0b32:
                        r0 = move-exception
                        r4 = r0
                        java.lang.String r5 = com.applisto.appcloner.classes.NotificationOptions.TAG
                        android.util.Log.w(r5, r4)
                    L_0x0b3b:
                        java.lang.Object r4 = r3
                        java.lang.Object r4 = r2.invoke(r4, r3)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.NotificationOptions.AnonymousClass1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
                }
            }));
            if (this.mNotificationSnoozeTimeout > 0) {
                context.registerReceiver(new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        try {
                            final int id = intent.getIntExtra("id", 0);
                            final Notification notification = (Notification) NotificationOptions.this.mSnoozeNotifications.remove(Integer.valueOf(id));
                            if (notification != null) {
                                final NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                                notificationManager.cancel(id);
                                Runnable runnable = (Runnable) NotificationOptions.this.mTimeoutRunnables.get(Integer.valueOf(id));
                                if (runnable != null) {
                                    NotificationOptions.this.mTimeoutHandler.removeCallbacks(runnable);
                                }
                                Runnable runnable2 = new Runnable() {
                                    public void run() {
                                        try {
                                            notificationManager.notify(id, notification);
                                        } catch (Throwable t) {
                                            Log.w(NotificationOptions.TAG, t);
                                        }
                                    }
                                };
                                NotificationOptions.this.mTimeoutHandler.postDelayed(runnable2, (long) (NotificationOptions.this.mNotificationSnoozeTimeout * 1000));
                                NotificationOptions.this.mTimeoutRunnables.put(Integer.valueOf(id), runnable2);
                            }
                        } catch (Throwable t) {
                            Log.w(NotificationOptions.TAG, t);
                        }
                    }
                }, new IntentFilter(ACTION_SNOOZE_NOTIFICATION));
            }
            if (this.mReplaceNotificationIcon && Build.VERSION.SDK_INT >= 23) {
                try {
                    byte[] bytes = Utils.readFully(context.getAssets().open(".notificationIconFile"), true);
                    this.mIcon = Icon.createWithData(bytes, 0, bytes.length);
                    String str = TAG;
                    Log.i(str, "install; mIcon: " + this.mIcon);
                } catch (Exception e) {
                    Log.w(TAG, e);
                }
            }
        } catch (Exception e2) {
            Log.w(TAG, e2);
        }
    }

    /* access modifiers changed from: private */
    public boolean isAppClonerClassesNotification() {
        boolean notificationManager = false;
        for (StackTraceElement stackTraceElement : new Exception().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if ("android.app.NotificationManager".equals(className)) {
                notificationManager = true;
            } else if (notificationManager) {
                return className.startsWith("com.applisto.appcloner.classes.");
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public static Bundle getExtras(Notification notification) {
        Bundle extras = null;
        try {
            extras = notification.extras;
        } catch (Throwable th) {
            try {
                Field f = Notification.class.getDeclaredField("extras");
                f.setAccessible(true);
                extras = (Bundle) f.get(notification);
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
        if (extras == null) {
            return new Bundle();
        }
        return extras;
    }

    /* access modifiers changed from: private */
    @TargetApi(26)
    public String getNotificationChannelId(Context context, String text) {
        String channelName = getNotificationChannelName(text);
        if (channelName == null) {
            return null;
        }
        String channelId = "app_cloner_" + Math.abs(channelName.hashCode());
        Log.i(TAG, "getNotificationChannelId; channelId: " + channelId + ", channelName: " + channelName);
        ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(channelId, channelName, 3));
        return channelId;
    }

    private String getNotificationChannelName(String text) {
        for (Map<String, Object> notificationCategory : this.mNotificationCategories) {
            String name = (String) notificationCategory.get("name");
            if (!TextUtils.isEmpty(name)) {
                String keywords = (String) notificationCategory.get("keywords");
                if (TextUtils.isEmpty(keywords)) {
                    continue;
                } else {
                    boolean ignoreCase = ((Boolean) notificationCategory.get("ignoreCase")).booleanValue();
                    String matchText = ignoreCase ? text.toLowerCase(Locale.ENGLISH) : text;
                    Log.i(TAG, "getNotificationChannelName; name: " + name + ", keywords: " + keywords + ", ignoreCase: " + ignoreCase + ", matchText: " + matchText);
                    for (String keyword : keywords.split(",")) {
                        String keyword2 = keyword.trim();
                        if (ignoreCase) {
                            keyword2 = keyword2.toLowerCase(Locale.ENGLISH);
                        }
                        if (matchText.contains(keyword2)) {
                            Log.i(TAG, "getNotificationChannelName; found keyword; keyword: " + keyword2);
                            return name;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03bb A[ADDED_TO_REGION, Catch:{ Exception -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void replaceNotificationText(android.app.Notification r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            r26 = this;
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r9 = r32
            r8 = r33
            r7 = r34
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "replaceNotificationText; replace: "
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = ", with: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = ", ignoreCase: "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = ", replaceInTitle: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = ", replaceInContent: "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = ", replaceInMessages: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ", replaceInActions: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r1, r2)
            java.lang.CharSequence r1 = r11.tickerText
            java.lang.CharSequence r1 = r10.replaceText(r1, r12, r13, r14)
            r11.tickerText = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L_0x041a
            android.os.Bundle r6 = getExtras(r27)
            r1 = 24
            if (r15 == 0) goto L_0x00f6
            java.lang.String r2 = "android.title"
            java.lang.CharSequence r2 = r6.getCharSequence(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x008f
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x008a
            java.lang.String r3 = "android.title"
            r6.putCharSequence(r3, r2)
            goto L_0x008f
        L_0x008a:
            java.lang.String r3 = "android.title.big"
            r6.remove(r3)
        L_0x008f:
            java.lang.String r3 = "android.title.big"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00b0
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00ab
            java.lang.String r3 = "android.title.big"
            r6.putCharSequence(r3, r2)
            goto L_0x00b0
        L_0x00ab:
            java.lang.String r3 = "android.title.big"
            r6.remove(r3)
        L_0x00b0:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x00f6
            java.lang.String r3 = "android.conversationTitle"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00d5
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00d0
            java.lang.String r3 = "android.conversationTitle"
            r6.putCharSequence(r3, r2)
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r3 = "android.conversationTitle"
            r6.remove(r3)
        L_0x00d5:
            java.lang.String r3 = "android.hiddenConversationTitle"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00f6
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x00f1
            java.lang.String r3 = "android.hiddenConversationTitle"
            r6.putCharSequence(r3, r2)
            goto L_0x00f6
        L_0x00f1:
            java.lang.String r3 = "android.hiddenConversationTitle"
            r6.remove(r3)
        L_0x00f6:
            if (r9 == 0) goto L_0x01c8
            java.lang.String r2 = "android.text"
            java.lang.CharSequence r2 = r6.getCharSequence(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0119
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0114
            java.lang.String r3 = "android.text"
            r6.putCharSequence(r3, r2)
            goto L_0x0119
        L_0x0114:
            java.lang.String r3 = "android.text"
            r6.remove(r3)
        L_0x0119:
            java.lang.String r3 = "android.subText"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x013a
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0135
            java.lang.String r3 = "android.subText"
            r6.putCharSequence(r3, r2)
            goto L_0x013a
        L_0x0135:
            java.lang.String r3 = "android.subText"
            r6.remove(r3)
        L_0x013a:
            java.lang.String r3 = "android.infoText"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x015b
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0156
            java.lang.String r3 = "android.infoText"
            r6.putCharSequence(r3, r2)
            goto L_0x015b
        L_0x0156:
            java.lang.String r3 = "android.infoText"
            r6.remove(r3)
        L_0x015b:
            java.lang.String r3 = "android.summaryText"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x017c
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0177
            java.lang.String r3 = "android.summaryText"
            r6.putCharSequence(r3, r2)
            goto L_0x017c
        L_0x0177:
            java.lang.String r3 = "android.summaryText"
            r6.remove(r3)
        L_0x017c:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r3 < r4) goto L_0x01a3
            java.lang.String r3 = "android.bigText"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01a3
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x019e
            java.lang.String r3 = "android.bigText"
            r6.putCharSequence(r3, r2)
            goto L_0x01a3
        L_0x019e:
            java.lang.String r3 = "android.bigText"
            r6.remove(r3)
        L_0x01a3:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x01c8
            java.lang.String r3 = "android.selfDisplayName"
            java.lang.CharSequence r2 = r6.getCharSequence(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01c8
            java.lang.CharSequence r2 = r10.replaceText(r2, r12, r13, r14)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x01c3
            java.lang.String r3 = "android.selfDisplayName"
            r6.putCharSequence(r3, r2)
            goto L_0x01c8
        L_0x01c3:
            java.lang.String r3 = "android.selfDisplayName"
            r6.remove(r3)
        L_0x01c8:
            if (r8 == 0) goto L_0x02c6
            java.lang.String r2 = "android.textLines"
            java.lang.CharSequence[] r2 = r6.getCharSequenceArray(r2)
            if (r2 == 0) goto L_0x021d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r1 = 0
        L_0x01d9:
            if (r1 >= r4) goto L_0x0200
            r5 = r2[r1]
            r18 = r2
            java.lang.CharSequence r2 = r10.replaceText(r5, r12, r13, r14)
            boolean r19 = android.text.TextUtils.isEmpty(r2)
            if (r19 != 0) goto L_0x01f7
            r20 = r4
            boolean r4 = r5 instanceof java.lang.String
            if (r4 == 0) goto L_0x01f3
            java.lang.String r2 = r2.toString()
        L_0x01f3:
            r3.add(r2)
            goto L_0x01f9
        L_0x01f7:
            r20 = r4
        L_0x01f9:
            int r1 = r1 + 1
            r2 = r18
            r4 = r20
            goto L_0x01d9
        L_0x0200:
            r18 = r2
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x0217
            java.lang.String r1 = "android.textLines"
            r2 = 0
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r2]
            java.lang.Object[] r2 = r3.toArray(r4)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r6.putCharSequenceArray(r1, r2)
            goto L_0x021f
        L_0x0217:
            java.lang.String r1 = "android.textLines"
            r6.remove(r1)
            goto L_0x021f
        L_0x021d:
            r18 = r2
        L_0x021f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L_0x02c6
            java.lang.String r1 = "android.messages"
            android.os.Parcelable[] r1 = r6.getParcelableArray(r1)
            if (r1 == 0) goto L_0x02c6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        L_0x0234:
            if (r4 >= r3) goto L_0x02aa
            r5 = r1[r4]
            r21 = r1
            r1 = r5
            android.os.Bundle r1 = (android.os.Bundle) r1
            r22 = r3
            java.lang.String r3 = "sender"
            java.lang.String r3 = r1.getString(r3)
            boolean r16 = android.text.TextUtils.isEmpty(r3)
            if (r16 != 0) goto L_0x0268
            r23 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = ""
            r5.append(r8)
            java.lang.CharSequence r8 = r10.replaceText(r3, r12, r13, r14)
            r5.append(r8)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "sender"
            r1.putString(r5, r3)
            goto L_0x026a
        L_0x0268:
            r23 = r5
        L_0x026a:
            java.lang.String r5 = "text"
            java.lang.String r5 = r1.getString(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x0290
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = ""
            r8.append(r9)
            java.lang.CharSequence r9 = r10.replaceText(r5, r12, r13, r14)
            r8.append(r9)
            java.lang.String r5 = r8.toString()
            java.lang.String r8 = "text"
            r1.putString(r8, r5)
        L_0x0290:
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 == 0) goto L_0x029c
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x029f
        L_0x029c:
            r2.add(r1)
        L_0x029f:
            int r4 = r4 + 1
            r1 = r21
            r3 = r22
            r8 = r33
            r9 = r32
            goto L_0x0234
        L_0x02aa:
            r21 = r1
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x02c1
            java.lang.String r1 = "android.messages"
            r3 = 0
            android.os.Parcelable[] r4 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r2.toArray(r4)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            r6.putParcelableArray(r1, r3)
            goto L_0x02c6
        L_0x02c1:
            java.lang.String r1 = "android.messages"
            r6.remove(r1)
        L_0x02c6:
            if (r7 == 0) goto L_0x0306
            android.app.Notification$Action[] r1 = r11.actions
            if (r1 == 0) goto L_0x0306
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.app.Notification$Action[] r2 = r11.actions
            int r3 = r2.length
            r4 = 0
        L_0x02d5:
            if (r4 >= r3) goto L_0x02ef
            r5 = r2[r4]
            java.lang.CharSequence r8 = r5.title
            java.lang.CharSequence r8 = r10.replaceText(r8, r12, r13, r14)
            r5.title = r8
            java.lang.CharSequence r8 = r5.title
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x02ec
            r1.add(r5)
        L_0x02ec:
            int r4 = r4 + 1
            goto L_0x02d5
        L_0x02ef:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0301
            r5 = 0
            android.app.Notification$Action[] r2 = new android.app.Notification.Action[r5]
            java.lang.Object[] r2 = r1.toArray(r2)
            android.app.Notification$Action[] r2 = (android.app.Notification.Action[]) r2
            r11.actions = r2
            goto L_0x0307
        L_0x0301:
            r5 = 0
            r2 = 0
            r11.actions = r2
            goto L_0x0307
        L_0x0306:
            r5 = 0
        L_0x0307:
            java.lang.String r1 = "android.wearable.EXTENSIONS"
            android.os.Bundle r1 = r6.getBundle(r1)     // Catch:{ Exception -> 0x03a7 }
            r9 = r1
            if (r9 == 0) goto L_0x03a1
            if (r7 == 0) goto L_0x0347
            java.lang.String r1 = "actions"
            java.util.ArrayList r1 = r9.getParcelableArrayList(r1)     // Catch:{ Exception -> 0x033e }
            if (r1 == 0) goto L_0x0347
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x033e }
        L_0x031e:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x033e }
            if (r3 == 0) goto L_0x0347
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x033e }
            android.app.Notification$Action r3 = (android.app.Notification.Action) r3     // Catch:{ Exception -> 0x033e }
            java.lang.CharSequence r4 = r3.title     // Catch:{ Exception -> 0x033e }
            java.lang.CharSequence r4 = r10.replaceText(r4, r12, r13, r14)     // Catch:{ Exception -> 0x033e }
            r3.title = r4     // Catch:{ Exception -> 0x033e }
            java.lang.CharSequence r4 = r3.title     // Catch:{ Exception -> 0x033e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x033e }
            if (r4 == 0) goto L_0x033d
            r2.remove()     // Catch:{ Exception -> 0x033e }
        L_0x033d:
            goto L_0x031e
        L_0x033e:
            r0 = move-exception
            r1 = r0
            r11 = r6
            r19 = 0
            r20 = r33
            goto L_0x03ae
        L_0x0347:
            java.lang.String r1 = "pages"
            android.os.Parcelable[] r1 = r9.getParcelableArray(r1)     // Catch:{ Exception -> 0x03a7 }
            r8 = r1
            if (r8 == 0) goto L_0x03a1
            int r4 = r8.length     // Catch:{ Exception -> 0x03a7 }
            r3 = 0
        L_0x0352:
            if (r3 >= r4) goto L_0x03a1
            r1 = r8[r3]     // Catch:{ Exception -> 0x03a7 }
            r16 = r1
            r2 = r16
            android.app.Notification r2 = (android.app.Notification) r2     // Catch:{ Exception -> 0x037b }
            r1 = r10
            r17 = r3
            r3 = r12
            r18 = r4
            r4 = r13
            r19 = 0
            r5 = r14
            r11 = r6
            r6 = r15
            r7 = r32
            r21 = r8
            r20 = r33
            r8 = r20
            r22 = r9
            r9 = r34
            r1.replaceNotificationText(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0378 }
            goto L_0x038f
        L_0x0378:
            r0 = move-exception
            r1 = r0
            goto L_0x038a
        L_0x037b:
            r0 = move-exception
            r17 = r3
            r18 = r4
            r11 = r6
            r21 = r8
            r22 = r9
            r19 = 0
            r20 = r33
            r1 = r0
        L_0x038a:
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x039e }
            android.util.Log.w(r2, r1)     // Catch:{ Exception -> 0x039e }
        L_0x038f:
            int r3 = r17 + 1
            r7 = r34
            r6 = r11
            r4 = r18
            r8 = r21
            r9 = r22
            r5 = 0
            r11 = r27
            goto L_0x0352
        L_0x039e:
            r0 = move-exception
            r1 = r0
            goto L_0x03ae
        L_0x03a1:
            r11 = r6
            r19 = 0
            r20 = r33
            goto L_0x03b3
        L_0x03a7:
            r0 = move-exception
            r11 = r6
            r19 = 0
            r20 = r33
            r1 = r0
        L_0x03ae:
            java.lang.String r2 = TAG
            android.util.Log.w(r2, r1)
        L_0x03b3:
            java.lang.String r1 = "android.car.EXTENSIONS"
            android.os.Bundle r1 = r11.getBundle(r1)     // Catch:{ Exception -> 0x0412 }
            if (r1 == 0) goto L_0x0411
            if (r20 == 0) goto L_0x0411
            java.lang.String r2 = "car_conversation"
            android.os.Bundle r2 = r1.getBundle(r2)     // Catch:{ Exception -> 0x0412 }
            if (r2 == 0) goto L_0x0411
            java.lang.String r3 = "messages"
            android.os.Parcelable[] r3 = r2.getParcelableArray(r3)     // Catch:{ Exception -> 0x0412 }
            if (r3 == 0) goto L_0x0411
            int r4 = r3.length     // Catch:{ Exception -> 0x0412 }
            r5 = 0
        L_0x03cf:
            if (r5 >= r4) goto L_0x0411
            r6 = r3[r5]     // Catch:{ Exception -> 0x0412 }
            r7 = r6
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ Exception -> 0x0412 }
            java.lang.String r8 = "author"
            java.lang.CharSequence r8 = r7.getCharSequence(r8)     // Catch:{ Exception -> 0x0412 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0412 }
            if (r9 != 0) goto L_0x03ee
            java.lang.String r9 = "author"
            r24 = r1
            java.lang.CharSequence r1 = r10.replaceText(r8, r12, r13, r14)     // Catch:{ Exception -> 0x0412 }
            r7.putCharSequence(r9, r1)     // Catch:{ Exception -> 0x0412 }
            goto L_0x03f0
        L_0x03ee:
            r24 = r1
        L_0x03f0:
            java.lang.String r1 = "text"
            java.lang.CharSequence r1 = r7.getCharSequence(r1)     // Catch:{ Exception -> 0x0412 }
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0412 }
            if (r9 != 0) goto L_0x0408
            java.lang.String r9 = "text"
            r25 = r2
            java.lang.CharSequence r2 = r10.replaceText(r1, r12, r13, r14)     // Catch:{ Exception -> 0x0412 }
            r7.putCharSequence(r9, r2)     // Catch:{ Exception -> 0x0412 }
            goto L_0x040a
        L_0x0408:
            r25 = r2
        L_0x040a:
            int r5 = r5 + 1
            r1 = r24
            r2 = r25
            goto L_0x03cf
        L_0x0411:
            goto L_0x041c
        L_0x0412:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = TAG
            android.util.Log.w(r2, r1)
            goto L_0x041c
        L_0x041a:
            r20 = r8
        L_0x041c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.NotificationOptions.replaceNotificationText(android.app.Notification, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    private CharSequence replaceText(CharSequence text, String replace, CharSequence with, boolean ignoreCase) {
        if (TextUtils.isEmpty(text)) {
            return text;
        }
        if (TextUtils.isEmpty(replace)) {
            return with;
        }
        while (true) {
            try {
                CharSequence newText = replace(text, replace, with, ignoreCase);
                if (text.toString().equals(newText.toString())) {
                    break;
                }
                text = newText;
            } catch (Exception e) {
                Log.w(TAG, e);
            }
        }
        return text;
    }

    private static CharSequence replace(CharSequence text, String replace, CharSequence with, boolean ignoreCase) {
        int pos;
        SpannableStringBuilder b = new SpannableStringBuilder(text);
        if (ignoreCase) {
            pos = text.toString().toLowerCase(Locale.ENGLISH).indexOf(replace.toLowerCase(Locale.ENGLISH));
        } else {
            pos = text.toString().indexOf(replace);
        }
        if (pos == -1) {
            return text;
        }
        b.setSpan(replace, pos, replace.length() + pos, 33);
        int start = b.getSpanStart(replace);
        int end = b.getSpanEnd(replace);
        if (start != -1) {
            b.replace(start, end, with);
        }
        return b;
    }
}
