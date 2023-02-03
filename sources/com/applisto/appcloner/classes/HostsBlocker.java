package com.applisto.appcloner.classes;

import andhook.lib.HookHelper;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"StaticFieldLeak", "UseSparseArrays"})
public class HostsBlocker {
    private static final String PREF_KEY_PREFIX = "com.applisto.appcloner.host_";
    /* access modifiers changed from: private */
    public static final String TAG = HostsBlocker.class.getSimpleName();
    /* access modifiers changed from: private */
    public static String sAllowLabel;
    private static boolean sBlockByDefault;
    /* access modifiers changed from: private */
    public static String sBlockLabel;
    private static String sContentText;
    private static String sContentTitle;
    /* access modifiers changed from: private */
    public static Context sContext;
    private static Handler sHandler = new Handler();
    /* access modifiers changed from: private */
    public static String sHostBlockedMessage;
    private static final Map<String, Boolean> sHosts = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public static String sHostsBlockerTitle;
    private static Set<String> sHostsFileHosts = new HashSet();
    private static String sIgnoreLabel;
    private static NotificationManager sNotificationManager;
    /* access modifiers changed from: private */
    public static final Map<Integer, String> sNotifications = Collections.synchronizedMap(new HashMap());
    private static SharedPreferences sPreferences;
    private static String sSocksProxyHost;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        android.util.Log.w(TAG, r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[Catch:{ Exception -> 0x007c, FileNotFoundException -> 0x0088 }, ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:3:0x001a] */
    @android.annotation.SuppressLint({"PrivateApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void install(android.content.Context r10, boolean r11, java.lang.String r12) {
        /*
            sContext = r10
            sBlockByDefault = r11
            sSocksProxyHost = r12
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r10.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            sNotificationManager = r0
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r10)
            sPreferences = r0
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = sHosts
            monitor-enter(r0)
            r1 = 1
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
            android.content.res.AssetManager r4 = r10.getAssets()     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
            java.lang.String r5 = ".blockedHostsFile"
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
            java.lang.String r3 = "(?:0.0.0.0|127.0.0.1)\\s+(\\S*)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ all -> 0x0077 }
        L_0x0034:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0077 }
            r5 = r4
            if (r4 == 0) goto L_0x0071
            java.lang.String r4 = r5.trim()     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)     // Catch:{ all -> 0x0077 }
            if (r5 != 0) goto L_0x0034
            java.util.regex.Matcher r5 = r3.matcher(r4)     // Catch:{ all -> 0x0077 }
            boolean r6 = r5.find()     // Catch:{ all -> 0x0077 }
            if (r6 == 0) goto L_0x0070
            java.lang.String r6 = r5.group(r1)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = TAG     // Catch:{ all -> 0x0077 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r8.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = "install; host: "
            r8.append(r9)     // Catch:{ all -> 0x0077 }
            r8.append(r6)     // Catch:{ all -> 0x0077 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0077 }
            android.util.Log.i(r7, r8)     // Catch:{ all -> 0x0077 }
            java.util.Set<java.lang.String> r7 = sHostsFileHosts     // Catch:{ all -> 0x0077 }
            r7.add(r6)     // Catch:{ all -> 0x0077 }
        L_0x0070:
            goto L_0x0034
        L_0x0071:
            r2.close()     // Catch:{ Exception -> 0x0075, FileNotFoundException -> 0x0088 }
            goto L_0x0089
        L_0x0075:
            r3 = move-exception
            goto L_0x0089
        L_0x0077:
            r3 = move-exception
            r2.close()     // Catch:{ Exception -> 0x007c, FileNotFoundException -> 0x0088 }
            goto L_0x007d
        L_0x007c:
            r4 = move-exception
        L_0x007d:
            throw r3     // Catch:{ FileNotFoundException -> 0x0088, Exception -> 0x0081 }
        L_0x007e:
            r1 = move-exception
            goto L_0x01a7
        L_0x0081:
            r2 = move-exception
            java.lang.String r3 = TAG     // Catch:{ all -> 0x007e }
            android.util.Log.w(r3, r2)     // Catch:{ all -> 0x007e }
            goto L_0x008a
        L_0x0088:
            r2 = move-exception
        L_0x0089:
        L_0x008a:
            android.content.SharedPreferences r2 = sPreferences     // Catch:{ all -> 0x007e }
            java.util.Map r2 = r2.getAll()     // Catch:{ all -> 0x007e }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x007e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007e }
        L_0x0098:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007e }
            r4 = 0
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x00c8
            java.lang.String r5 = "com.applisto.appcloner.host_"
            boolean r5 = r3.startsWith(r5)     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x00c8
            android.content.SharedPreferences r5 = sPreferences     // Catch:{ all -> 0x007e }
            boolean r4 = r5.getBoolean(r3, r4)     // Catch:{ all -> 0x007e }
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = sHosts     // Catch:{ all -> 0x007e }
            java.lang.String r6 = "com.applisto.appcloner.host_"
            int r6 = r6.length()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r3.substring(r6)     // Catch:{ all -> 0x007e }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x007e }
            r5.put(r6, r7)     // Catch:{ all -> 0x007e }
        L_0x00c8:
            goto L_0x0098
        L_0x00c9:
            java.lang.String r2 = TAG     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r3.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = "install; sHosts: "
            r3.append(r5)     // Catch:{ all -> 0x007e }
            java.util.Map<java.lang.String, java.lang.Boolean> r5 = sHosts     // Catch:{ all -> 0x007e }
            r3.append(r5)     // Catch:{ all -> 0x007e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007e }
            android.util.Log.i(r2, r3)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            r0 = 0
            andhook.lib.AndHook.ensureNativeLibraryLoaded(r0)     // Catch:{ Throwable -> 0x0130 }
            java.lang.String r0 = "java.net.PlainSocketImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x0130 }
            andhook.lib.AndHook.ensureClassInitialized(r0)     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker> r2 = com.applisto.appcloner.classes.HostsBlocker.class
            andhook.lib.AndHook.ensureClassInitialized(r2)     // Catch:{ Throwable -> 0x0130 }
            java.lang.String r2 = "socketConnect"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class<java.net.InetAddress> r6 = java.net.InetAddress.class
            r5[r4] = r6     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0130 }
            r5[r1] = r6     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0130 }
            r7 = 2
            r5[r7] = r6     // Catch:{ Throwable -> 0x0130 }
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r5)     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker> r5 = com.applisto.appcloner.classes.HostsBlocker.class
            java.lang.String r6 = "socketConnectHook"
            r8 = 4
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r8[r4] = r9     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class<java.net.InetAddress> r4 = java.net.InetAddress.class
            r8[r1] = r4     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0130 }
            r8[r7] = r1     // Catch:{ Throwable -> 0x0130 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0130 }
            r8[r3] = r1     // Catch:{ Throwable -> 0x0130 }
            java.lang.reflect.Method r1 = r5.getMethod(r6, r8)     // Catch:{ Throwable -> 0x0130 }
            andhook.lib.HookHelper.hook(r2, r1)     // Catch:{ Throwable -> 0x0130 }
            java.lang.String r1 = TAG     // Catch:{ Throwable -> 0x0130 }
            java.lang.String r2 = "install; socketConnectHook installed"
            android.util.Log.i(r1, r2)     // Catch:{ Throwable -> 0x0130 }
            goto L_0x0136
        L_0x0130:
            r0 = move-exception
            java.lang.String r1 = TAG
            android.util.Log.w(r1, r0)
        L_0x0136:
            android.content.Context r0 = sContext
            java.lang.String r1 = "hosts_blocker_title"
            java.lang.String r2 = "Hosts blocker"
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sHostsBlockerTitle = r0
            android.content.Context r0 = sContext
            java.lang.String r1 = "hosts_blocker_app_is_accessing_title"
            java.lang.String r2 = "%s is accessing"
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sContentTitle = r0
            android.content.Context r0 = sContext
            java.lang.String r1 = "hosts_blocker_touch_to_block_title"
            java.lang.String r2 = "Touch to block %s"
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sContentText = r0
            android.content.Context r0 = sContext
            java.lang.String r1 = "label_allow"
            java.lang.String r2 = "Allow"
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sAllowLabel = r0
            android.content.Context r0 = sContext
            java.lang.String r1 = "label_block"
            java.lang.String r2 = "Block"
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sBlockLabel = r0
            android.content.Context r0 = sContext
            java.lang.String r1 = "label_ignore"
            java.lang.String r2 = "Ignore"
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sIgnoreLabel = r0
            android.content.Context r0 = sContext
            java.lang.String r1 = "hosts_blocker_host_blocked_message"
            java.lang.String r2 = "Host %s blocked."
            java.lang.CharSequence r0 = com.applisto.appcloner.classes.Utils.getAppClonerResourceText(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            sHostBlockedMessage = r0
            return
        L_0x01a7:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.HostsBlocker.install(android.content.Context, boolean, java.lang.String):void");
    }

    public static void socketConnectHook(Object instance, InetAddress address, int port, int timeout) throws UnknownHostException {
        String str = TAG;
        Log.i(str, "socketConnectHook; address: " + address + ", port: " + port + ", timeout: " + timeout);
        checkHost(address);
        HookHelper.invokeVoidOrigin(instance, address, Integer.valueOf(port), Integer.valueOf(timeout));
    }

    private static void checkHost(InetAddress address) throws UnknownHostException {
        if (address != null) {
            checkHost(address.getHostName());
        }
    }

    private static void checkHost(final String host) throws UnknownHostException {
        if (host != null && host.length() > 0) {
            if ((sSocksProxyHost == null || !sSocksProxyHost.equals(host)) && !"127.0.0.1".equals(host) && !"localhost".equals(host) && !host.startsWith("192.168.")) {
                for (String key : splitHost(host)) {
                    if (sHosts.containsKey(key)) {
                        Boolean b = sHosts.get(key);
                        if (b == null || b.booleanValue()) {
                            String str = TAG;
                            Log.i(str, "checkHost; ignored/allowed; host: " + host);
                            return;
                        }
                        String str2 = TAG;
                        Log.i(str2, "checkHost; blocked; host: " + host);
                        throw new UnknownHostException("Blocked");
                    } else if (sHostsFileHosts.contains(key)) {
                        addBlockedHost(host);
                        sHandler.post(new Runnable() {
                            public void run() {
                                Toast.makeText(HostsBlocker.sContext, HostsBlocker.sHostBlockedMessage.replace("%s", host), 0).show();
                            }
                        });
                        String str3 = TAG;
                        Log.i(str3, "checkHost; blocked; host: " + host);
                        throw new UnknownHostException("Blocked");
                    }
                }
                notifyHost(host);
                if (sBlockByDefault) {
                    throw new UnknownHostException("Blocked by default");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static List<String> splitHost(String host) {
        List<String> list = new ArrayList<>();
        list.add(host);
        boolean alpha = false;
        int len = host.length();
        int n = 0;
        while (true) {
            if (n < len) {
                char c = host.charAt(n);
                if (c != '.' && !Character.isDigit(c)) {
                    alpha = true;
                    break;
                }
                n++;
            } else {
                break;
            }
        }
        if (alpha) {
            while (true) {
                int pos = host.indexOf(46);
                if (pos == -1) {
                    break;
                }
                host = host.substring(pos + 1);
                if (host.indexOf(46) == -1) {
                    break;
                }
                list.add("*." + host);
            }
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c6, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c8, code lost:
        r9.setContentText(r14).addAction(r1, sAllowLabel, r3).addAction(r1, sBlockLabel, r4).addAction(r1, sIgnoreLabel, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00de, code lost:
        r9.setContentText(sContentText.replace("%s", r14)).setContentIntent(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f1, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00f3, code lost:
        r9.setVisibility(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f7, code lost:
        com.applisto.appcloner.classes.Utils.setSmallNotificationIcon(r9);
        r10 = r9.getNotification();
        r10.sound = null;
        r10.defaults &= -2;
        sNotificationManager.notify(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x010b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        android.util.Log.i(TAG, "notifyHost; host: " + r14);
        r1 = r14.hashCode();
        r2 = android.app.PendingIntent.getBroadcast(sContext, r1, new android.content.Intent(r14, (android.net.Uri) null, sContext, com.applisto.appcloner.classes.HostsBlocker.ContentReceiver.class), 134217728);
        r3 = android.app.PendingIntent.getBroadcast(sContext, r1 + 1, new android.content.Intent(r14, (android.net.Uri) null, sContext, com.applisto.appcloner.classes.HostsBlocker.AllowReceiver.class), 1073741824);
        r4 = android.app.PendingIntent.getBroadcast(sContext, r1 + 2, new android.content.Intent(r14, (android.net.Uri) null, sContext, com.applisto.appcloner.classes.HostsBlocker.BlockReceiver.class), 1073741824);
        r5 = android.app.PendingIntent.getBroadcast(sContext, r1 + 3, new android.content.Intent(r14, (android.net.Uri) null, sContext, com.applisto.appcloner.classes.HostsBlocker.IgnoreReceiver.class), 1073741824);
        r9 = new android.app.Notification.Builder(sContext).setSmallIcon(17301543).setContentTitle(sContentTitle.replace("%s", com.applisto.appcloner.classes.Utils.getAppName(sContext))).setContentIntent(r2).setDeleteIntent(android.app.PendingIntent.getBroadcast(sContext, r1 + 4, new android.content.Intent(java.lang.Integer.toString(r0), (android.net.Uri) null, sContext, com.applisto.appcloner.classes.HostsBlocker.CancelReceiver.class), 1073741824)).setAutoCancel(false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void notifyHost(java.lang.String r14) {
        /*
            int r0 = r14.hashCode()
            java.util.Map<java.lang.Integer, java.lang.String> r1 = sNotifications
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.String> r2 = sNotifications     // Catch:{ all -> 0x010c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010c }
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x010c }
            if (r2 == 0) goto L_0x0015
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            return
        L_0x0015:
            java.util.Map<java.lang.Integer, java.lang.String> r2 = sNotifications     // Catch:{ all -> 0x010c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x010c }
            r2.put(r3, r14)     // Catch:{ all -> 0x010c }
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notifyHost; host: "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r1, r2)
            int r1 = r14.hashCode()
            android.content.Context r2 = sContext
            android.content.Intent r3 = new android.content.Intent
            android.content.Context r4 = sContext
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker$ContentReceiver> r5 = com.applisto.appcloner.classes.HostsBlocker.ContentReceiver.class
            r6 = 0
            r3.<init>(r14, r6, r4, r5)
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r1, r3, r4)
            android.content.Context r3 = sContext
            int r4 = r1 + 1
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r7 = sContext
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker$AllowReceiver> r8 = com.applisto.appcloner.classes.HostsBlocker.AllowReceiver.class
            r5.<init>(r14, r6, r7, r8)
            r7 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r3, r4, r5, r7)
            android.content.Context r4 = sContext
            int r5 = r1 + 2
            android.content.Intent r8 = new android.content.Intent
            android.content.Context r9 = sContext
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker$BlockReceiver> r10 = com.applisto.appcloner.classes.HostsBlocker.BlockReceiver.class
            r8.<init>(r14, r6, r9, r10)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r4, r5, r8, r7)
            android.content.Context r5 = sContext
            int r8 = r1 + 3
            android.content.Intent r9 = new android.content.Intent
            android.content.Context r10 = sContext
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker$IgnoreReceiver> r11 = com.applisto.appcloner.classes.HostsBlocker.IgnoreReceiver.class
            r9.<init>(r14, r6, r10, r11)
            android.app.PendingIntent r5 = android.app.PendingIntent.getBroadcast(r5, r8, r9, r7)
            android.content.Context r8 = sContext
            int r9 = r1 + 4
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r11 = java.lang.Integer.toString(r0)
            android.content.Context r12 = sContext
            java.lang.Class<com.applisto.appcloner.classes.HostsBlocker$CancelReceiver> r13 = com.applisto.appcloner.classes.HostsBlocker.CancelReceiver.class
            r10.<init>(r11, r6, r12, r13)
            android.app.PendingIntent r7 = android.app.PendingIntent.getBroadcast(r8, r9, r10, r7)
            java.lang.String r8 = sContentTitle
            java.lang.String r9 = "%s"
            android.content.Context r10 = sContext
            java.lang.String r10 = com.applisto.appcloner.classes.Utils.getAppName(r10)
            java.lang.String r8 = r8.replace(r9, r10)
            android.app.Notification$Builder r9 = new android.app.Notification$Builder
            android.content.Context r10 = sContext
            r9.<init>(r10)
            r10 = 17301543(0x1080027, float:2.4979364E-38)
            android.app.Notification$Builder r9 = r9.setSmallIcon(r10)
            android.app.Notification$Builder r9 = r9.setContentTitle(r8)
            android.app.Notification$Builder r9 = r9.setContentIntent(r2)
            android.app.Notification$Builder r9 = r9.setDeleteIntent(r7)
            r10 = 0
            android.app.Notification$Builder r9 = r9.setAutoCancel(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 16
            if (r10 < r11) goto L_0x00de
            android.app.Notification$Builder r10 = r9.setContentText(r14)
            java.lang.String r11 = sAllowLabel
            android.app.Notification$Builder r10 = r10.addAction(r1, r11, r3)
            java.lang.String r11 = sBlockLabel
            android.app.Notification$Builder r10 = r10.addAction(r1, r11, r4)
            java.lang.String r11 = sIgnoreLabel
            r10.addAction(r1, r11, r5)
            goto L_0x00ed
        L_0x00de:
            java.lang.String r10 = sContentText
            java.lang.String r11 = "%s"
            java.lang.String r10 = r10.replace(r11, r14)
            android.app.Notification$Builder r11 = r9.setContentText(r10)
            r11.setContentIntent(r4)
        L_0x00ed:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r10 < r11) goto L_0x00f7
            r10 = -1
            r9.setVisibility(r10)
        L_0x00f7:
            com.applisto.appcloner.classes.Utils.setSmallNotificationIcon(r9)
            android.app.Notification r10 = r9.getNotification()
            r10.sound = r6
            int r6 = r10.defaults
            r6 = r6 & -2
            r10.defaults = r6
            android.app.NotificationManager r6 = sNotificationManager
            r6.notify(r0, r10)
            return
        L_0x010c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applisto.appcloner.classes.HostsBlocker.notifyHost(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    public static void addAllowedHost(String host) {
        String str = TAG;
        Log.i(str, "addAllowedHost; host: " + host);
        sHosts.put(host, true);
        synchronized (sPreferences) {
            SharedPreferences.Editor edit = sPreferences.edit();
            edit.putBoolean(PREF_KEY_PREFIX + host, true).apply();
        }
    }

    /* access modifiers changed from: private */
    public static void addBlockedHost(String host) {
        String str = TAG;
        Log.i(str, "addBlockedHost; host: " + host);
        sHosts.put(host, false);
        synchronized (sPreferences) {
            SharedPreferences.Editor edit = sPreferences.edit();
            edit.putBoolean(PREF_KEY_PREFIX + host, false).apply();
        }
    }

    /* access modifiers changed from: private */
    public static void addIgnoredHost(String host) {
        String str = TAG;
        Log.i(str, "addIgnoredHost; host: " + host);
        sHosts.put(host, (Object) null);
    }

    /* access modifiers changed from: private */
    public static void whois(Context context, String host) {
        Log.i(TAG, "whois; host: " + host);
        if (host.startsWith("*.")) {
            host = host.substring(2);
        }
        try {
            Intent i = new Intent("android.intent.action.VIEW");
            i.setFlags(268435456);
            i.setData(Uri.parse("http://whois.domaintools.com/" + host));
            context.startActivity(i);
        } catch (Exception e) {
            Log.w(TAG, e);
            Toast.makeText(context, "Failed to open browser.", 1).show();
        }
    }

    public static abstract class HostReceiver extends BroadcastReceiver {
        /* access modifiers changed from: protected */
        public abstract void handleHost(Context context, String str);

        public void onReceive(Context context, Intent intent) {
            try {
                String host = intent.getAction();
                if (!TextUtils.isEmpty(host)) {
                    handleHost(context, host);
                }
            } catch (Exception e) {
                Log.w(HostsBlocker.TAG, e);
            }
        }
    }

    public static class ContentReceiver extends HostReceiver {
        /* access modifiers changed from: protected */
        public void handleHost(Context context, String host) {
            String access$200 = HostsBlocker.TAG;
            Log.i(access$200, "ContentReceiver; handleHost; host: " + host);
            Intent i = new Intent(context, HostsBlockerActivity.class);
            i.setFlags(268435456);
            i.putExtra("host", host);
            context.startActivity(i);
        }
    }

    public static class AllowReceiver extends HostReceiver {
        /* access modifiers changed from: protected */
        public void handleHost(Context context, String host) {
            String access$200 = HostsBlocker.TAG;
            Log.i(access$200, "AllowReceiver; handleHost; host: " + host);
            HostsBlocker.addAllowedHost(host);
            HostsBlocker.removeNotification(host);
        }
    }

    public static class BlockReceiver extends HostReceiver {
        /* access modifiers changed from: protected */
        public void handleHost(Context context, String host) {
            String access$200 = HostsBlocker.TAG;
            Log.i(access$200, "BlockReceiver; handleHost; host: " + host);
            HostsBlocker.addBlockedHost(host);
            HostsBlocker.removeNotification(host);
        }
    }

    public static class IgnoreReceiver extends HostReceiver {
        /* access modifiers changed from: protected */
        public void handleHost(Context context, String host) {
            String access$200 = HostsBlocker.TAG;
            Log.i(access$200, "IgnoreReceiver; handleHost; host: " + host);
            HostsBlocker.addIgnoredHost(host);
            HostsBlocker.removeNotification(host);
        }
    }

    public static class CancelReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            try {
                String notificationId = intent.getAction();
                String access$200 = HostsBlocker.TAG;
                Log.i(access$200, "CancelReceiver; onReceive; notificationId: " + notificationId);
                HostsBlocker.sNotifications.remove(Integer.valueOf(Integer.parseInt(notificationId)));
            } catch (Exception e) {
                Log.w(HostsBlocker.TAG, e);
            }
        }
    }

    public static class HostsBlockerActivity extends Activity {
        /* access modifiers changed from: protected */
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            String host = getIntent().getStringExtra("host");
            String access$200 = HostsBlocker.TAG;
            Log.i(access$200, "onCreate; host: " + host);
            final String[] items = (String[]) HostsBlocker.splitHost(host).toArray(new String[0]);
            final AtomicReference<String> ref = new AtomicReference<>(items[0]);
            AlertDialog.Builder builder = Utils.getDialogBuilder(this).setTitle(HostsBlocker.sHostsBlockerTitle).setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    ref.set(items[which]);
                }
            });
            if (Build.VERSION.SDK_INT > 21) {
                builder.setNeutralButton("Whois", (DialogInterface.OnClickListener) null).setNegativeButton(HostsBlocker.sAllowLabel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        HostsBlocker.addAllowedHost((String) ref.get());
                        HostsBlocker.removeNotification((String) ref.get());
                    }
                }).setPositiveButton(HostsBlocker.sBlockLabel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        HostsBlocker.addBlockedHost((String) ref.get());
                        HostsBlocker.removeNotification((String) ref.get());
                    }
                });
            } else {
                builder.setNegativeButton("Whois", (DialogInterface.OnClickListener) null).setNeutralButton(HostsBlocker.sAllowLabel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        HostsBlocker.addAllowedHost((String) ref.get());
                        HostsBlocker.removeNotification((String) ref.get());
                    }
                }).setPositiveButton(HostsBlocker.sBlockLabel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        HostsBlocker.addBlockedHost((String) ref.get());
                        HostsBlocker.removeNotification((String) ref.get());
                    }
                });
            }
            AlertDialog dialog = builder.create();
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialog) {
                    HostsBlockerActivity.this.finish();
                }
            });
            dialog.show();
            if (Build.VERSION.SDK_INT > 21) {
                dialog.getButton(-3).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        HostsBlocker.whois(HostsBlockerActivity.this, (String) ref.get());
                    }
                });
            } else {
                dialog.getButton(-2).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        HostsBlocker.whois(HostsBlockerActivity.this, (String) ref.get());
                    }
                });
            }
            Utils.keepDialogOpenOnOrientationChange(dialog);
        }
    }

    /* access modifiers changed from: private */
    public static void removeNotification(String host) {
        String str = TAG;
        Log.i(str, "removeNotification; host: " + host);
        try {
            sNotificationManager.cancel(host.hashCode());
            if (host.startsWith("*.")) {
                host = host.substring(2);
            }
            synchronized (sNotifications) {
                for (Integer notificationId : sNotifications.keySet()) {
                    if (sNotifications.get(notificationId).endsWith(host)) {
                        sNotificationManager.cancel(notificationId.intValue());
                    }
                }
            }
        } catch (Exception e) {
            Log.w(TAG, e);
        }
    }
}
