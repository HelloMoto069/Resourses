package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class ConnectivityReceiver {
    public boolean hasListener = false;
    @Nullable
    private CellularGeneration mCellularGeneration = null;
    @Nonnull
    private ConnectionType mConnectionType = ConnectionType.UNKNOWN;
    private final ConnectivityManager mConnectivityManager;
    private boolean mIsInternetReachable = false;
    private Boolean mIsInternetReachableOverride;
    private final ReactApplicationContext mReactContext;
    private final TelephonyManager mTelephonyManager;
    private final WifiManager mWifiManager;

    public abstract void register();

    public abstract void unregister();

    ConnectivityReceiver(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
        this.mConnectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.mWifiManager = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.mTelephonyManager = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    public void getCurrentState(@Nullable String str, Promise promise) {
        promise.resolve(createConnectivityEventMap(str));
    }

    public void setIsInternetReachableOverride(boolean z) {
        this.mIsInternetReachableOverride = Boolean.valueOf(z);
        updateConnectivity(this.mConnectionType, this.mCellularGeneration, this.mIsInternetReachable);
    }

    public void clearIsInternetReachableOverride() {
        this.mIsInternetReachableOverride = null;
    }

    /* access modifiers changed from: package-private */
    public ReactApplicationContext getReactContext() {
        return this.mReactContext;
    }

    /* access modifiers changed from: package-private */
    public ConnectivityManager getConnectivityManager() {
        return this.mConnectivityManager;
    }

    /* access modifiers changed from: package-private */
    public void updateConnectivity(@Nonnull ConnectionType connectionType, @Nullable CellularGeneration cellularGeneration, boolean z) {
        Boolean bool = this.mIsInternetReachableOverride;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z2 = true;
        boolean z3 = connectionType != this.mConnectionType;
        boolean z4 = cellularGeneration != this.mCellularGeneration;
        if (z == this.mIsInternetReachable) {
            z2 = false;
        }
        if (z3 || z4 || z2) {
            this.mConnectionType = connectionType;
            this.mCellularGeneration = cellularGeneration;
            this.mIsInternetReachable = z;
            if (this.hasListener) {
                sendConnectivityChangedEvent();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void sendConnectivityChangedEvent() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", createConnectivityEventMap((String) null));
    }

    /* access modifiers changed from: protected */
    public WritableMap createConnectivityEventMap(@Nullable String str) {
        String str2;
        WritableMap createMap = Arguments.createMap();
        if (NetInfoUtils.isAccessWifiStatePermissionGranted(getReactContext())) {
            createMap.putBoolean("isWifiEnabled", this.mWifiManager.isWifiEnabled());
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = this.mConnectionType.label;
        }
        createMap.putString("type", str2);
        boolean z = false;
        boolean z2 = true;
        boolean z3 = !this.mConnectionType.equals(ConnectionType.NONE) && !this.mConnectionType.equals(ConnectionType.UNKNOWN);
        createMap.putBoolean("isConnected", z3);
        if (this.mIsInternetReachable && (str == null || str.equals(this.mConnectionType.label))) {
            z = true;
        }
        createMap.putBoolean("isInternetReachable", z);
        if (str == null) {
            str = this.mConnectionType.label;
        }
        WritableMap createDetailsMap = createDetailsMap(str);
        if (z3) {
            if (getConnectivityManager() != null) {
                z2 = getConnectivityManager().isActiveNetworkMetered();
            }
            createDetailsMap.putBoolean("isConnectionExpensive", z2);
        }
        createMap.putMap("details", createDetailsMap);
        return createMap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:8|9|(1:13)|14|15|(1:17)|18|19|20|21|(1:23)|24|25|(2:26|27)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:8|9|(1:13)|14|15|(1:17)|18|19|20|21|(1:23)|24|25|26|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x008c */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[Catch:{ Exception -> 0x006f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.WritableMap createDetailsMap(@javax.annotation.Nonnull java.lang.String r8) {
        /*
            r7 = this;
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()
            r8.hashCode()
            java.lang.String r1 = "cellular"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x00f2
            java.lang.String r1 = "wifi"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0019
            goto L_0x010a
        L_0x0019:
            com.facebook.react.bridge.ReactApplicationContext r8 = r7.getReactContext()
            boolean r8 = com.reactnativecommunity.netinfo.NetInfoUtils.isAccessWifiStatePermissionGranted(r8)
            if (r8 == 0) goto L_0x010a
            android.net.wifi.WifiManager r8 = r7.mWifiManager
            android.net.wifi.WifiInfo r8 = r8.getConnectionInfo()
            if (r8 == 0) goto L_0x010a
            java.lang.String r1 = r8.getSSID()     // Catch:{ Exception -> 0x0046 }
            if (r1 == 0) goto L_0x0046
            java.lang.String r2 = "<unknown ssid>"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x0046 }
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = "\""
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ Exception -> 0x0046 }
            java.lang.String r2 = "ssid"
            r0.putString(r2, r1)     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            java.lang.String r1 = r8.getBSSID()     // Catch:{ Exception -> 0x0051 }
            if (r1 == 0) goto L_0x0051
            java.lang.String r2 = "bssid"
            r0.putString(r2, r1)     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            int r1 = r8.getRssi()     // Catch:{ Exception -> 0x0060 }
            r2 = 100
            int r1 = android.net.wifi.WifiManager.calculateSignalLevel(r1, r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "strength"
            r0.putInt(r2, r1)     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x006f }
            r2 = 21
            if (r1 < r2) goto L_0x006f
            int r1 = r8.getFrequency()     // Catch:{ Exception -> 0x006f }
            java.lang.String r2 = "frequency"
            r0.putInt(r2, r1)     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            int r1 = r8.getIpAddress()     // Catch:{ Exception -> 0x008c }
            long r1 = (long) r1     // Catch:{ Exception -> 0x008c }
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)     // Catch:{ Exception -> 0x008c }
            byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x008c }
            com.reactnativecommunity.netinfo.NetInfoUtils.reverseByteArray(r1)     // Catch:{ Exception -> 0x008c }
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1)     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = r1.getHostAddress()     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = "ipAddress"
            r0.putString(r2, r1)     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            int r8 = r8.getIpAddress()     // Catch:{ Exception -> 0x010a }
            long r1 = (long) r8     // Catch:{ Exception -> 0x010a }
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r1)     // Catch:{ Exception -> 0x010a }
            byte[] r8 = r8.toByteArray()     // Catch:{ Exception -> 0x010a }
            com.reactnativecommunity.netinfo.NetInfoUtils.reverseByteArray(r8)     // Catch:{ Exception -> 0x010a }
            java.net.InetAddress r8 = java.net.InetAddress.getByAddress(r8)     // Catch:{ Exception -> 0x010a }
            java.net.NetworkInterface r8 = java.net.NetworkInterface.getByInetAddress(r8)     // Catch:{ Exception -> 0x010a }
            r1 = -1
            java.util.List r8 = r8.getInterfaceAddresses()     // Catch:{ Exception -> 0x010a }
            r2 = 1
            java.lang.Object r8 = r8.get(r2)     // Catch:{ Exception -> 0x010a }
            java.net.InterfaceAddress r8 = (java.net.InterfaceAddress) r8     // Catch:{ Exception -> 0x010a }
            short r8 = r8.getNetworkPrefixLength()     // Catch:{ Exception -> 0x010a }
            int r8 = 32 - r8
            int r8 = r1 << r8
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = "%d.%d.%d.%d"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x010a }
            r5 = 0
            int r6 = r8 >> 24
            r6 = r6 & 255(0xff, float:3.57E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x010a }
            r4[r5] = r6     // Catch:{ Exception -> 0x010a }
            int r5 = r8 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x010a }
            r4[r2] = r5     // Catch:{ Exception -> 0x010a }
            r2 = 2
            int r5 = r8 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x010a }
            r4[r2] = r5     // Catch:{ Exception -> 0x010a }
            r2 = 3
            r8 = r8 & 255(0xff, float:3.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x010a }
            r4[r2] = r8     // Catch:{ Exception -> 0x010a }
            java.lang.String r8 = java.lang.String.format(r1, r3, r4)     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = "subnet"
            r0.putString(r1, r8)     // Catch:{ Exception -> 0x010a }
            goto L_0x010a
        L_0x00f2:
            com.reactnativecommunity.netinfo.types.CellularGeneration r8 = r7.mCellularGeneration
            if (r8 == 0) goto L_0x00fd
            java.lang.String r8 = r8.label
            java.lang.String r1 = "cellularGeneration"
            r0.putString(r1, r8)
        L_0x00fd:
            android.telephony.TelephonyManager r8 = r7.mTelephonyManager
            java.lang.String r8 = r8.getNetworkOperatorName()
            if (r8 == 0) goto L_0x010a
            java.lang.String r1 = "carrier"
            r0.putString(r1, r8)
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.netinfo.ConnectivityReceiver.createDetailsMap(java.lang.String):com.facebook.react.bridge.WritableMap");
    }
}
