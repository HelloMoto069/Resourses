package com.asterinet.react.bgactions;

import android.os.Bundle;
import com.facebook.react.uimanager.ViewProps;

public final class BackgroundTaskOptions {
    private final Bundle extras;

    public BackgroundTaskOptions(Bundle bundle) {
        this.extras = bundle;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r6.getPackageName();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BackgroundTaskOptions(com.facebook.react.bridge.ReactContext r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r5 = this;
            java.lang.String r0 = "color"
            r5.<init>()
            android.os.Bundle r1 = com.facebook.react.bridge.Arguments.toBundle(r7)
            r5.extras = r1
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = "taskTitle"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0097 }
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = "taskDesc"
            java.lang.String r1 = r7.getString(r1)     // Catch:{ Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = "taskIcon"
            com.facebook.react.bridge.ReadableMap r1 = r7.getMap(r1)     // Catch:{ Exception -> 0x007b }
            if (r1 == 0) goto L_0x0075
            java.lang.String r2 = "name"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = "type"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x007b }
            java.lang.String r4 = "package"
            java.lang.String r1 = r1.getString(r4)     // Catch:{ Exception -> 0x0040 }
            if (r1 == 0) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0040 }
            r1.<init>()     // Catch:{ Exception -> 0x0040 }
            throw r1     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            java.lang.String r1 = r6.getPackageName()     // Catch:{ Exception -> 0x007b }
        L_0x0044:
            android.content.res.Resources r6 = r6.getResources()     // Catch:{ Exception -> 0x007b }
            int r6 = r6.getIdentifier(r2, r3, r1)     // Catch:{ Exception -> 0x007b }
            android.os.Bundle r1 = r5.extras     // Catch:{ Exception -> 0x007b }
            java.lang.String r2 = "iconInt"
            r1.putInt(r2, r6)     // Catch:{ Exception -> 0x007b }
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = r7.getString(r0)     // Catch:{ Exception -> 0x0063 }
            android.os.Bundle r7 = r5.extras     // Catch:{ Exception -> 0x0063 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x0063 }
            r7.putInt(r0, r6)     // Catch:{ Exception -> 0x0063 }
            goto L_0x006e
        L_0x0063:
            android.os.Bundle r6 = r5.extras
            java.lang.String r7 = "#ffffff"
            int r7 = android.graphics.Color.parseColor(r7)
            r6.putInt(r0, r7)
        L_0x006e:
            return
        L_0x006f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x007b }
            r6.<init>()     // Catch:{ Exception -> 0x007b }
            throw r6     // Catch:{ Exception -> 0x007b }
        L_0x0075:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x007b }
            r6.<init>()     // Catch:{ Exception -> 0x007b }
            throw r6     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Task icon not found"
            r6.<init>(r7)
            throw r6
        L_0x0083:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0089 }
            r6.<init>()     // Catch:{ Exception -> 0x0089 }
            throw r6     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Task description cannot be null"
            r6.<init>(r7)
            throw r6
        L_0x0091:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0097 }
            r6.<init>()     // Catch:{ Exception -> 0x0097 }
            throw r6     // Catch:{ Exception -> 0x0097 }
        L_0x0097:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Task title cannot be null"
            r6.<init>(r7)
            throw r6
        L_0x009f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Could not convert arguments to bundle"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.asterinet.react.bgactions.BackgroundTaskOptions.<init>(com.facebook.react.bridge.ReactContext, com.facebook.react.bridge.ReadableMap):void");
    }

    public Bundle getExtras() {
        return this.extras;
    }

    public String getTaskTitle() {
        return this.extras.getString("taskTitle", "");
    }

    public String getTaskDesc() {
        return this.extras.getString("taskDesc", "");
    }

    public int getIconInt() {
        return this.extras.getInt("iconInt");
    }

    public int getColor() {
        return this.extras.getInt(ViewProps.COLOR);
    }

    public String getLinkingURI() {
        return this.extras.getString("linkingURI");
    }

    public Bundle getProgressBar() {
        return this.extras.getBundle("progressBar");
    }
}
