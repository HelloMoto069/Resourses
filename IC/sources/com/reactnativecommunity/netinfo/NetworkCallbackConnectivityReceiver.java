package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;

public class NetworkCallbackConnectivityReceiver extends ConnectivityReceiver {
    private static final int DELAY_MS = 250;
    /* access modifiers changed from: private */
    public NetworkCapabilities mCapabilities = null;
    /* access modifiers changed from: private */
    public Network mNetwork = null;
    private final ConnectivityNetworkCallback mNetworkCallback = new ConnectivityNetworkCallback();

    public NetworkCallbackConnectivityReceiver(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void register() {
        try {
            this.mNetwork = getConnectivityManager().getActiveNetwork();
            asyncUpdateAndSend(0);
            getConnectivityManager().registerDefaultNetworkCallback(this.mNetworkCallback);
        } catch (SecurityException unused) {
        }
    }

    public void unregister() {
        try {
            getConnectivityManager().unregisterNetworkCallback(this.mNetworkCallback);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void updateAndSend() {
        boolean z;
        ConnectionType connectionType = ConnectionType.UNKNOWN;
        Network network = this.mNetwork;
        NetworkCapabilities networkCapabilities = this.mCapabilities;
        CellularGeneration cellularGeneration = null;
        boolean z2 = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                connectionType = ConnectionType.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                connectionType = ConnectionType.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                connectionType = ConnectionType.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                connectionType = ConnectionType.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                connectionType = ConnectionType.VPN;
            }
            NetworkInfo networkInfo = network != null ? getConnectivityManager().getNetworkInfo(network) : null;
            if (Build.VERSION.SDK_INT >= 28) {
                z = !networkCapabilities.hasCapability(21);
            } else {
                z = (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z) {
                z2 = true;
            }
            if (network != null && connectionType == ConnectionType.CELLULAR && z2) {
                cellularGeneration = CellularGeneration.fromNetworkInfo(networkInfo);
            }
        } else {
            connectionType = ConnectionType.NONE;
        }
        updateConnectivity(connectionType, cellularGeneration, z2);
    }

    /* access modifiers changed from: private */
    public void asyncUpdateAndSend(int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                NetworkCallbackConnectivityReceiver.this.lambda$asyncUpdateAndSend$0$NetworkCallbackConnectivityReceiver();
            }
        }, (long) i);
    }

    public /* synthetic */ void lambda$asyncUpdateAndSend$0$NetworkCallbackConnectivityReceiver() {
        this.mCapabilities = getConnectivityManager().getNetworkCapabilities(this.mNetwork);
        updateAndSend();
    }

    private class ConnectivityNetworkCallback extends ConnectivityManager.NetworkCallback {
        private ConnectivityNetworkCallback() {
        }

        public void onAvailable(Network network) {
            Network unused = NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            NetworkCallbackConnectivityReceiver.this.asyncUpdateAndSend(250);
        }

        public void onLosing(Network network, int i) {
            Network unused = NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        public void onLost(Network network) {
            Network unused = NetworkCallbackConnectivityReceiver.this.mNetwork = null;
            NetworkCapabilities unused2 = NetworkCallbackConnectivityReceiver.this.mCapabilities = null;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        public void onUnavailable() {
            Network unused = NetworkCallbackConnectivityReceiver.this.mNetwork = null;
            NetworkCapabilities unused2 = NetworkCallbackConnectivityReceiver.this.mCapabilities = null;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Network unused = NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            NetworkCapabilities unused2 = NetworkCallbackConnectivityReceiver.this.mCapabilities = networkCapabilities;
            NetworkCallbackConnectivityReceiver.this.updateAndSend();
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (NetworkCallbackConnectivityReceiver.this.mNetwork != null) {
                Network unused = NetworkCallbackConnectivityReceiver.this.mNetwork = network;
            }
            NetworkCallbackConnectivityReceiver.this.asyncUpdateAndSend(250);
        }
    }
}
