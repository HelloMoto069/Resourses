package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.types.CellularGeneration;
import com.reactnativecommunity.netinfo.types.ConnectionType;

public class BroadcastReceiverConnectivityReceiver extends ConnectivityReceiver {
    public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    private final ConnectivityBroadcastReceiver mConnectivityBroadcastReceiver = new ConnectivityBroadcastReceiver();

    public BroadcastReceiverConnectivityReceiver(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void register() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(CONNECTIVITY_ACTION);
        getReactContext().registerReceiver(this.mConnectivityBroadcastReceiver, intentFilter);
        this.mConnectivityBroadcastReceiver.setRegistered(true);
        updateAndSendConnectionType();
    }

    public void unregister() {
        if (this.mConnectivityBroadcastReceiver.isRegistered()) {
            getReactContext().unregisterReceiver(this.mConnectivityBroadcastReceiver);
            this.mConnectivityBroadcastReceiver.setRegistered(false);
        }
    }

    /* access modifiers changed from: private */
    public void updateAndSendConnectionType() {
        ConnectionType connectionType = ConnectionType.UNKNOWN;
        CellularGeneration cellularGeneration = null;
        boolean z = false;
        try {
            NetworkInfo activeNetworkInfo = getConnectivityManager().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    z = activeNetworkInfo.isConnected();
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1) {
                            connectionType = ConnectionType.WIFI;
                        } else if (type != 4) {
                            if (type == 9) {
                                connectionType = ConnectionType.ETHERNET;
                            } else if (type == 17) {
                                connectionType = ConnectionType.VPN;
                            } else if (type == 6) {
                                connectionType = ConnectionType.WIMAX;
                            } else if (type == 7) {
                                connectionType = ConnectionType.BLUETOOTH;
                            }
                        }
                        updateConnectivity(connectionType, cellularGeneration, z);
                    }
                    connectionType = ConnectionType.CELLULAR;
                    cellularGeneration = CellularGeneration.fromNetworkInfo(activeNetworkInfo);
                    updateConnectivity(connectionType, cellularGeneration, z);
                }
            }
            connectionType = ConnectionType.NONE;
        } catch (SecurityException unused) {
            connectionType = ConnectionType.UNKNOWN;
        }
        updateConnectivity(connectionType, cellularGeneration, z);
    }

    private class ConnectivityBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private ConnectivityBroadcastReceiver() {
            this.isRegistered = false;
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }

        public boolean isRegistered() {
            return this.isRegistered;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION)) {
                BroadcastReceiverConnectivityReceiver.this.updateAndSendConnectionType();
            }
        }
    }
}
