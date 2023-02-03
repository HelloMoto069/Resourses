package com.appser;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;
import com.appser.verapq.R;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33 extends Service {
    PowerManager.WakeLock wakeLock = null;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public void onTaskRemoved(Intent intent) {
        try {
            safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.phonixeffect(getApplicationContext(), "Scanner", 180000);
            Intent intent2 = new Intent(getApplicationContext(), getClass());
            intent2.setPackage(getPackageName());
            ((AlarmManager) getApplicationContext().getSystemService(NotificationCompat.CATEGORY_ALARM)).set(3, SystemClock.elapsedRealtime() + 1000, PendingIntent.getService(getApplicationContext(), 1, intent2, 1073741824));
            if (!this.wakeLock.equals((Object) null) && this.wakeLock.isHeld()) {
                this.wakeLock.release();
            }
        } catch (Exception unused) {
        }
        super.onTaskRemoved(intent);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|(1:10)|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r4 = this;
            super.onDestroy()
            r0 = 0
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.s_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_f0 = r0
            android.content.Context r0 = r4.getApplicationContext()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r1 = "iamdone"
            r2 = 180000(0x2bf20, double:8.8932E-319)
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.phonixeffect(r0, r1, r2)     // Catch:{ Exception -> 0x0012 }
        L_0x0012:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0026 }
            android.content.Context r1 = r4.getApplicationContext()     // Catch:{ Exception -> 0x0026 }
            java.lang.Class<com.appser.SensorRestarterBroadcastReceiver> r2 = com.appser.SensorRestarterBroadcastReceiver.class
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r1 = "RestartSensor"
            android.content.Intent r0 = r0.setAction(r1)     // Catch:{ Exception -> 0x0026 }
            r4.sendBroadcast(r0)     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            android.os.PowerManager$WakeLock r0 = r4.wakeLock     // Catch:{ Exception -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0038
            android.os.PowerManager$WakeLock r0 = r4.wakeLock     // Catch:{ Exception -> 0x003b }
            boolean r0 = r0.isHeld()     // Catch:{ Exception -> 0x003b }
            if (r0 != r1) goto L_0x0038
            android.os.PowerManager$WakeLock r0 = r4.wakeLock     // Catch:{ Exception -> 0x003b }
            r0.release()     // Catch:{ Exception -> 0x003b }
        L_0x0038:
            r4.stopForeground(r1)     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.onDestroy():void");
    }

    public static class ta extends AsyncTask<Context, Integer, String> {
        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:171|172|173|174) */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:36|37|38|39|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:11|(1:13)|14|15|16|17|(1:19)(1:20)|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:1|3|4|(2:6|(1:8)(2:9|(8:11|(1:13)|14|15|16|17|(1:19)(1:20)|21)))(2:22|(2:24|(1:26)))|27|28|(8:30|(2:32|(2:34|(5:36|37|38|39|40))(2:41|(2:43|(2:45|(2:46|(1:226)(2:48|(1:227)(1:54))))(0))(3:55|56|(2:58|(3:60|61|(3:63|64|(1:66)(2:67|(1:69)(1:70)))(3:71|72|(4:74|75|76|(1:78)(1:79))(3:80|81|(2:83|84)(3:85|86|(3:88|89|(1:91)(2:92|(1:94)(0)))(3:95|96|(4:98|99|223|100)(3:101|102|(3:104|105|(1:107)(0))(3:108|109|(2:111|112)(3:113|114|(2:116|117)(3:118|119|(2:121|122)(3:123|124|(3:126|127|(1:129)(0))(4:130|131|132|(2:134|135)(3:136|137|(2:139|140)(3:141|142|(3:144|145|(3:147|(2:153|(1:155)(4:156|(2:159|157)|228|160))|161)(0))(3:162|163|(2:165|166)(0)))))))))))))))(4:167|168|169|(4:171|172|173|174)(5:175|176|177|178|179)))(3:180|181|(2:183|(1:185)(0))(2:186|(2:188|(2:190|191)(0))(3:192|193|(1:195)(2:196|(1:198)(2:199|(1:201)(2:202|(1:204)(2:205|(1:207)(2:208|(1:212)(0))))))))))))(0)|213|(1:216)(1:217)|218|219|220|224)(2:221|225)|222) */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a1, code lost:
            r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.weeklyrcolumnocleaningqpeerjmadridmdollscfanvindiabbobgnetherlandszsupplierstworldwidehcookedv30("ʼʾʿˈᵔঙʿ$ʿʼ", new java.lang.Object[]{r18[0], com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl.get(r8).jasonalfa, r7[2], r7[4], r6.byt, "ʼʾʿˈᵔঙʿ$ʿʼ"});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x01d5, code lost:
            if (r7[3].equals(com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn[16]) != false) goto L_0x06a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r7[3], com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.get_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_Bytes(r3));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x053c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0102 */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0040 A[Catch:{ Exception -> 0x0073 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0049 A[Catch:{ Exception -> 0x0073 }] */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x06bd A[Catch:{ Exception | OutOfMemoryError -> 0x0004 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[Catch:{  }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(android.content.Context... r18) {
            /*
                r17 = this;
                java.lang.String r0 = "msg:"
                java.lang.String r1 = "\t"
            L_0x0004:
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                boolean r6 = com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.ec_outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4_ho     // Catch:{ Exception -> 0x0073 }
                r7 = -1
                if (r6 != r5) goto L_0x0051
                long r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.e_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_co     // Catch:{ Exception -> 0x0073 }
                int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r6 != 0) goto L_0x001f
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0073 }
                r8 = 45000(0xafc8, double:2.2233E-319)
                long r6 = r6 + r8
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.e_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_co = r6     // Catch:{ Exception -> 0x0073 }
                goto L_0x0073
            L_0x001f:
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0073 }
                long r11 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.e_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_co     // Catch:{ Exception -> 0x0073 }
                int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r6 <= 0) goto L_0x0073
                java.lang.String r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.dt     // Catch:{ Exception -> 0x0073 }
                int r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.inx     // Catch:{ Exception -> 0x0073 }
                if (r9 != r3) goto L_0x0030
                r6 = r1
            L_0x0030:
                java.lang.String r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.j_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_z     // Catch:{ Exception -> 0x003c }
                byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x003c }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r9, r6)     // Catch:{ Exception -> 0x003c }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.ox()     // Catch:{ Exception -> 0x003c }
            L_0x003c:
                int r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.inx     // Catch:{ Exception -> 0x0073 }
                if (r6 < r2) goto L_0x0049
                r6 = -1
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.inx = r6     // Catch:{ Exception -> 0x0073 }
                java.lang.String r6 = "DONE"
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.CLOSEALLINTENT(r6)     // Catch:{ Exception -> 0x0073 }
                goto L_0x004e
            L_0x0049:
                int r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.inx     // Catch:{ Exception -> 0x0073 }
                int r6 = r6 + r5
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.inx = r6     // Catch:{ Exception -> 0x0073 }
            L_0x004e:
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.e_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_co = r7     // Catch:{ Exception -> 0x0073 }
                goto L_0x0073
            L_0x0051:
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.e_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_co = r7     // Catch:{ Exception -> 0x0073 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0073 }
                if (r6 == 0) goto L_0x0073
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0073 }
                boolean r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Recording     // Catch:{ Exception -> 0x0073 }
                if (r6 == 0) goto L_0x0073
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0073 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Recording = r4     // Catch:{ Exception -> 0x0073 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0073 }
                android.media.MediaRecorder r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32mRecorder     // Catch:{ Exception -> 0x0073 }
                r6.stop()     // Catch:{ Exception -> 0x0073 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0073 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32RecorderActive = r4     // Catch:{ Exception -> 0x0073 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x0073 }
                android.media.MediaRecorder r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32mRecorder     // Catch:{ Exception -> 0x0073 }
                r6.release()     // Catch:{ Exception -> 0x0073 }
            L_0x0073:
                java.util.List<com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9> r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_i     // Catch:{  }
                int r6 = r6.size()     // Catch:{  }
                if (r6 <= 0) goto L_0x06bd
                java.util.List<com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9> r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_i     // Catch:{  }
                java.lang.Object r6 = r6.get(r4)     // Catch:{  }
                com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9 r6 = (com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9) r6     // Catch:{  }
                if (r6 == 0) goto L_0x06a7
                java.lang.String r7 = r6.str     // Catch:{  }
                java.lang.String r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.yrfjeradvertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31SERBRE     // Catch:{  }
                java.lang.String[] r7 = r7.split(r8)     // Catch:{  }
                r8 = r7[r4]     // Catch:{  }
                java.lang.String r9 = "0"
                boolean r9 = r8.equals(r9)     // Catch:{  }
                r14 = 11
                r15 = 9
                r16 = 7
                r12 = 8
                r10 = 6
                r11 = 5
                r13 = 4
                if (r9 == 0) goto L_0x0170
                java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch:{  }
                r9 = r18[r4]     // Catch:{  }
                r8[r4] = r9     // Catch:{  }
                byte[] r6 = r6.byt     // Catch:{  }
                r8[r5] = r6     // Catch:{  }
                r6 = r7[r5]     // Catch:{  }
                r8[r3] = r6     // Catch:{  }
                r6 = r7[r13]     // Catch:{  }
                r8[r2] = r6     // Catch:{  }
                java.lang.String r6 = "ՙXﹶYYjctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50φTʾXXՙYﹶVCjctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50WφXʾ"
                r8[r13] = r6     // Catch:{  }
                java.lang.Class r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.provisionsrguitarzfleshicookiexcolemanoreasonablewvegetablesrgoingeelhdrinkingobesideteffectivenessk29(r8)     // Catch:{  }
                com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2 r8 = new com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2     // Catch:{  }
                java.lang.String r9 = r6.getName()     // Catch:{  }
                r8.<init>(r9, r6)     // Catch:{  }
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                r6.add(r8)     // Catch:{  }
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                int r6 = r6.size()     // Catch:{  }
                r8 = r7[r3]     // Catch:{  }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{  }
                int r8 = r8.intValue()     // Catch:{  }
                if (r6 != r8) goto L_0x06a7
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = r7[r11]     // Catch:{  }
                r6[r4] = r8     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = r7[r10]     // Catch:{  }
                r6[r13] = r8     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = r7[r16]     // Catch:{  }
                r6[r11] = r8     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x0102 }
                r8 = r7[r12]     // Catch:{ Exception -> 0x0102 }
                r6[r10] = r8     // Catch:{ Exception -> 0x0102 }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x0102 }
                r8 = r7[r15]     // Catch:{ Exception -> 0x0102 }
                r6[r16] = r8     // Catch:{ Exception -> 0x0102 }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{ Exception -> 0x0102 }
                r8 = 10
                r8 = r7[r8]     // Catch:{ Exception -> 0x0102 }
                r6[r12] = r8     // Catch:{ Exception -> 0x0102 }
            L_0x0102:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = r7[r14]     // Catch:{  }
                r6[r15] = r8     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = 10
                r9 = 12
                r10 = r7[r9]     // Catch:{  }
                r6[r8] = r10     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = 13
                r9 = r7[r8]     // Catch:{  }
                r6[r14] = r9     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = 14
                r9 = r7[r8]     // Catch:{  }
                r8 = 12
                r6[r8] = r9     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = 15
                r9 = r7[r8]     // Catch:{  }
                r10 = 13
                r6[r10] = r9     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r9 = 16
                r10 = r7[r9]     // Catch:{  }
                r9 = 14
                r6[r9] = r10     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r9 = 17
                r9 = r7[r9]     // Catch:{  }
                r6[r8] = r9     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r9 = 18
                r9 = r7[r9]     // Catch:{  }
                r10 = 16
                r6[r10] = r9     // Catch:{  }
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                int r6 = r6.size()     // Catch:{  }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.p_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_lg = r6     // Catch:{  }
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
                r6 = r18[r4]     // Catch:{  }
                r3[r4] = r6     // Catch:{  }
                r2 = r7[r2]     // Catch:{  }
                r3[r5] = r2     // Catch:{  }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.vastvexpectationsebugsbrakevchampagnelpiloteassaultwefficientloperawcarefullyqtrimdisabilityy31(r3)     // Catch:{  }
                r2 = 10
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.s_outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4_s = r2     // Catch:{  }
                java.lang.String[] r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r2 = r2[r8]     // Catch:{  }
                byte[] r3 = r1.getBytes()     // Catch:{  }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{  }
                goto L_0x06a7
            L_0x0170:
                java.lang.String[] r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r9 = r9[r13]     // Catch:{  }
                java.lang.Boolean r9 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r9)     // Catch:{  }
                boolean r9 = r9.booleanValue()     // Catch:{  }
                if (r9 == 0) goto L_0x01e7
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                int r8 = r8.size()     // Catch:{  }
                if (r8 <= 0) goto L_0x06a7
                r8 = 0
            L_0x0187:
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                int r9 = r9.size()     // Catch:{  }
                if (r8 > r9) goto L_0x06a7
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r9 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                java.lang.Object r9 = r9.get(r8)     // Catch:{  }
                com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2 r9 = (com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2) r9     // Catch:{  }
                java.lang.String r9 = r9.Datahelp     // Catch:{  }
                r12 = r7[r5]     // Catch:{  }
                boolean r9 = r9.equals(r12)     // Catch:{  }
                if (r9 == 0) goto L_0x01e2
                java.lang.String r9 = "ʼʾʿˈᵔঙʿ$ʿʼ"
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{  }
                r12 = r18[r4]     // Catch:{  }
                r10[r4] = r12     // Catch:{  }
                java.util.List<com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2> r12 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl     // Catch:{  }
                java.lang.Object r8 = r12.get(r8)     // Catch:{  }
                com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2 r8 = (com.appser.themkfoxdreynoldsgconnectorlsquarecexposedkreligionemarkarepresentativekdildosdharvardiimpactsf2) r8     // Catch:{  }
                java.lang.Class<?> r8 = r8.jasonalfa     // Catch:{  }
                r10[r5] = r8     // Catch:{  }
                r5 = r7[r3]     // Catch:{  }
                r10[r3] = r5     // Catch:{  }
                r3 = r7[r13]     // Catch:{  }
                r10[r2] = r3     // Catch:{  }
                byte[] r3 = r6.byt     // Catch:{  }
                r10[r13] = r3     // Catch:{  }
                java.lang.String r3 = "ʼʾʿˈᵔঙʿ$ʿʼ"
                r10[r11] = r3     // Catch:{  }
                java.lang.Object r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.weeklyrcolumnocleaningqpeerjmadridmdollscfanvindiabbobgnetherlandszsupplierstworldwidehcookedv30(r9, r10)     // Catch:{  }
                r5 = r7[r2]     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r9 = 16
                r6 = r6[r9]     // Catch:{  }
                boolean r5 = r5.equals(r6)     // Catch:{  }
                if (r5 != 0) goto L_0x06a7
                r2 = r7[r2]     // Catch:{ Exception -> 0x06a7 }
                byte[] r3 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.get_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_Bytes(r3)     // Catch:{ Exception -> 0x06a7 }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x01e2:
                r9 = 16
                int r8 = r8 + 1
                goto L_0x0187
            L_0x01e7:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r6 = r6[r11]     // Catch:{  }
                java.lang.Boolean r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r6)     // Catch:{  }
                boolean r6 = r6.booleanValue()     // Catch:{  }
                if (r6 == 0) goto L_0x0568
                java.lang.String[] r6 = new java.lang.String[r12]     // Catch:{  }
                r8 = r7[r5]     // Catch:{  }
                r6[r4] = r8     // Catch:{  }
                r8 = r7[r3]     // Catch:{  }
                r6[r5] = r8     // Catch:{  }
                r8 = r7[r2]     // Catch:{  }
                r6[r3] = r8     // Catch:{  }
                r8 = r7[r13]     // Catch:{  }
                r6[r2] = r8     // Catch:{  }
                r2 = r7[r11]     // Catch:{  }
                r6[r13] = r2     // Catch:{  }
                r2 = r7[r10]     // Catch:{  }
                r6[r11] = r2     // Catch:{  }
                r2 = r7[r16]     // Catch:{  }
                r6[r10] = r2     // Catch:{  }
                r2 = r7[r12]     // Catch:{  }
                r6[r16] = r2     // Catch:{  }
                r2 = r7[r13]     // Catch:{  }
                java.lang.String r8 = "ddll"
                boolean r2 = r2.equals(r8)     // Catch:{  }
                r8 = 268435456(0x10000000, float:2.5243549E-29)
                if (r2 == 0) goto L_0x0509
                r2 = r7[r5]     // Catch:{  }
                boolean r2 = r2.startsWith(r0)     // Catch:{  }
                java.lang.String r6 = ""
                if (r2 == 0) goto L_0x0279
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = ":up"
                boolean r2 = r2.endsWith(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r2 == 0) goto L_0x0253
                com.appser.bizncadillacfsbatanogivenwwriteskleavendefendantidtdleonardyexistedemainlandkdimensionsiflavorn27 r2 = new com.appser.bizncadillacfsbatanogivenwwriteskleavendefendantidtdleonardyexistedemainlandkdimensionsiflavorn27     // Catch:{ Exception -> 0x06a7 }
                r2.<init>()     // Catch:{ Exception -> 0x06a7 }
                android.content.Context r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context     // Catch:{ Exception -> 0x06a7 }
                java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ Exception -> 0x06a7 }
                r5 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r5 = r5.replace(r0, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r7 = ":up"
                java.lang.String r5 = r5.replace(r7, r6)     // Catch:{ Exception -> 0x06a7 }
                r8[r4] = r5     // Catch:{ Exception -> 0x06a7 }
                r2.setContext(r3, r8)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0253:
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = ":fsh"
                boolean r2 = r2.endsWith(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r2 == 0) goto L_0x026e
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = r2.replace(r0, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = ":fsh"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.FPPAGE(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x026e:
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = r2.replace(r0, r6)     // Catch:{ Exception -> 0x06a7 }
                com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.showToast(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0279:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r9 = "goauth<*>"
                boolean r2 = r2.startsWith(r9)     // Catch:{  }
                if (r2 == 0) goto L_0x02c2
                java.lang.String r2 = "co#$m.goo#$gle.andr#$oid.ap#$ps.authent#$icator2"
                java.lang.String r3 = "#$"
                java.lang.String r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.appealszdiscretionxunionszformingefotostextractvlensesnpacificifairlygbanrreligionnbehaviourj48(r2, r3)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x06a7 }
                boolean r2 = com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10.IP_deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10_I(r2, r3)     // Catch:{ Exception -> 0x06a7 }
                if (r2 == 0) goto L_0x02b5
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SendGoogleAuth = r5     // Catch:{ Exception -> 0x06a7 }
                r2 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "co#$m.goo#$gle.andr#$oid.ap#$ps.authent#$icator2"
                java.lang.String r5 = "#$"
                java.lang.String r3 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.appealszdiscretionxunionszformingefotostextractvlensesnpacificifairlygbanrreligionnbehaviourj48(r3, r5)     // Catch:{ Exception -> 0x06a7 }
                android.content.Intent r2 = r2.getLaunchIntentForPackage(r3)     // Catch:{ Exception -> 0x06a7 }
                r2.addFlags(r8)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                r3.startActivity(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x02b5:
                java.lang.String r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.s_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_fh     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "Google Auth<app not installed<app not installed"
                byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x06a7 }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x02c2:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r9 = "kill<*>"
                boolean r2 = r2.startsWith(r9)     // Catch:{  }
                if (r2 == 0) goto L_0x02d4
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32bypass = r2     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x02d4:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r9 = "CRD<*>"
                boolean r2 = r2.startsWith(r9)     // Catch:{  }
                if (r2 == 0) goto L_0x0318
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "CRD<*>"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "E>"
                boolean r3 = r2.startsWith(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r3 == 0) goto L_0x02ff
                java.util.List<java.lang.String> r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.DisabledApps     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r5 = "E>"
                java.lang.String r2 = r2.replace(r5, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x06a7 }
                r3.add(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x02ff:
                java.lang.String r3 = "D>"
                boolean r3 = r2.startsWith(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r3 == 0) goto L_0x06a7
                java.util.List<java.lang.String> r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.DisabledApps     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r5 = "D>"
                java.lang.String r2 = r2.replace(r5, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x06a7 }
                r3.remove(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0318:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r9 = "EHP<*>"
                boolean r2 = r2.startsWith(r9)     // Catch:{  }
                if (r2 == 0) goto L_0x0374
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r7 = "EHP<*>"
                java.lang.String r2 = r2.replace(r7, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r7 = "#"
                java.lang.String[] r2 = r2.split(r7)     // Catch:{ Exception -> 0x06a7 }
                r7 = r2[r4]     // Catch:{ Exception -> 0x06a7 }
                r5 = r2[r5]     // Catch:{ Exception -> 0x06a7 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.CLINAME = r2     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r9 = "NH"
                com.appser.MySettings.Write(r3, r9, r7)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r7 = "NP"
                com.appser.MySettings.Write(r3, r7, r5)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r5 = "NN"
                com.appser.MySettings.Write(r3, r5, r2)     // Catch:{ Exception -> 0x06a7 }
                r2 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "UP"
                java.lang.String r5 = "YES"
                com.appser.MySettings.Write(r2, r3, r5)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = "jctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50"
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.CLOSEALLINTENT(r2)     // Catch:{ Exception -> 0x06a7 }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.Class<com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10> r5 = com.appser.deckmformulawamendedjdeleteddkgoaccessingeliveehourlykbreastaproposexdisciplinevwellsbbelfastl10.class
                r2.<init>(r3, r5)     // Catch:{ Exception -> 0x06a7 }
                r2.addFlags(r8)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                r3.startActivity(r2)     // Catch:{ Exception -> 0x06a7 }
                java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x06a7 }
                r2.exit(r4)     // Catch:{ Exception -> 0x06a7 }
                return r6
            L_0x0374:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r8 = "pst<*>"
                boolean r2 = r2.startsWith(r8)     // Catch:{  }
                if (r2 == 0) goto L_0x039d
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                if (r2 == 0) goto L_0x06a7
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "pst<*>"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32ToPaste = r2     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32NeedPaste = r2     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                r2.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32Treger()     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x039d:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r8 = "lnk<*>"
                boolean r2 = r2.startsWith(r8)     // Catch:{  }
                if (r2 == 0) goto L_0x03b4
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "lnk<*>"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.openlink(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x03b4:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r8 = "ssms<*>"
                boolean r2 = r2.startsWith(r8)     // Catch:{  }
                if (r2 == 0) goto L_0x03d5
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "ssms<*>"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "#"
                java.lang.String[] r2 = r2.split(r3)     // Catch:{ Exception -> 0x06a7 }
                r3 = r2[r4]     // Catch:{ Exception -> 0x06a7 }
                r2 = r2[r5]     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.sendSMS(r3, r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x03d5:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r8 = "adm<*>"
                boolean r2 = r2.startsWith(r8)     // Catch:{  }
                if (r2 == 0) goto L_0x03e4
                r17.RequestAdmin()     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x03e4:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r8 = "admwip<*>"
                boolean r2 = r2.startsWith(r8)     // Catch:{  }
                if (r2 == 0) goto L_0x0408
                android.app.admin.DevicePolicyManager r2 = com.appser.activityadm.mDPM     // Catch:{ Exception -> 0x06a7 }
                r6 = 0
                boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x06a7 }
                if (r2 != 0) goto L_0x06a7
                android.app.admin.DevicePolicyManager r2 = com.appser.activityadm.mDPM     // Catch:{ Exception -> 0x06a7 }
                r2.wipeData(r5)     // Catch:{ Exception -> 0x06a7 }
                android.app.admin.DevicePolicyManager r2 = com.appser.activityadm.mDPM     // Catch:{ Exception -> 0x06a7 }
                r2.wipeData(r3)     // Catch:{ Exception -> 0x06a7 }
                android.app.admin.DevicePolicyManager r2 = com.appser.activityadm.mDPM     // Catch:{ Exception -> 0x06a7 }
                r2.wipeData(r13)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0408:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r3 = "rdd<*>"
                boolean r2 = r2.startsWith(r3)     // Catch:{  }
                java.lang.String r3 = "rd<*>"
                if (r2 == 0) goto L_0x042b
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = "wait"
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFK = r2     // Catch:{ Exception -> 0x06a7 }
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.D_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_ele(r2)     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = "on"
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFK = r2     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x042b:
                r2 = r7[r5]     // Catch:{  }
                boolean r2 = r2.startsWith(r3)     // Catch:{  }
                if (r2 == 0) goto L_0x0456
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = "wait"
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFK = r2     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.l_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_g     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r8 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                r5 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = r5.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = r8.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32RD(r3)     // Catch:{ Exception -> 0x06a7 }
                byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x06a7 }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{ Exception -> 0x06a7 }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r2 = "on"
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32OFK = r2     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0456:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r3 = "sp<*>"
                boolean r2 = r2.startsWith(r3)     // Catch:{  }
                if (r2 == 0) goto L_0x04f2
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x06a7 }
                r3 = 24
                if (r2 < r3) goto L_0x06a7
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "sp<*>"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "clk"
                boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r3 != 0) goto L_0x04e3
                java.lang.String r3 = "Bc"
                boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r3 != 0) goto L_0x04e3
                java.lang.String r3 = "Ho"
                boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r3 != 0) goto L_0x04e3
                java.lang.String r3 = "RC"
                boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x06a7 }
                if (r3 == 0) goto L_0x048f
                goto L_0x04e3
            L_0x048f:
                java.lang.String r3 = ":"
                java.lang.String r3 = java.util.regex.Pattern.quote(r3)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String[] r2 = r2.split(r3)     // Catch:{ Exception -> 0x06a7 }
                int r3 = r2.length     // Catch:{ Exception -> 0x06a7 }
                android.graphics.Point[] r3 = new android.graphics.Point[r3]     // Catch:{ Exception -> 0x06a7 }
                r7 = 0
            L_0x049d:
                int r8 = r2.length     // Catch:{ Exception -> 0x06a7 }
                if (r7 >= r8) goto L_0x04da
                r8 = r2[r7]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r9 = "{"
                java.lang.String r8 = r8.replace(r9, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r9 = "}"
                java.lang.String r8 = r8.replace(r9, r6)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r9 = ","
                java.lang.String[] r8 = r8.split(r9)     // Catch:{ Exception -> 0x06a7 }
                r9 = r8[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r10 = "="
                java.lang.String[] r9 = r9.split(r10)     // Catch:{ Exception -> 0x06a7 }
                r9 = r9[r5]     // Catch:{ Exception -> 0x06a7 }
                int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x06a7 }
                r8 = r8[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r10 = "="
                java.lang.String[] r8 = r8.split(r10)     // Catch:{ Exception -> 0x06a7 }
                r8 = r8[r5]     // Catch:{ Exception -> 0x06a7 }
                int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x06a7 }
                android.graphics.Point r10 = new android.graphics.Point     // Catch:{ Exception -> 0x06a7 }
                r10.<init>(r9, r8)     // Catch:{ Exception -> 0x06a7 }
                r3[r7] = r10     // Catch:{ Exception -> 0x06a7 }
                int r7 = r7 + 1
                goto L_0x049d
            L_0x04da:
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                r5 = 1000(0x3e8, float:1.401E-42)
                r2.mouseDraw(r3, r5)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x04e3:
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32 r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.MyAccess     // Catch:{ Exception -> 0x06a7 }
                r3 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r5 = "sp<*>"
                java.lang.String r3 = r3.replace(r5, r6)     // Catch:{ Exception -> 0x06a7 }
                r2.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32SW(r3)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x04f2:
                r2 = r7[r5]     // Catch:{  }
                java.lang.String r3 = "sc:"
                boolean r2 = r2.startsWith(r3)     // Catch:{  }
                if (r2 == 0) goto L_0x06a7
                r2 = r7[r5]     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = "sc:"
                java.lang.String r2 = r2.replace(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.StartScreen(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0509:
                java.lang.Class<com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8> r2 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.class
                r3 = r18[r4]     // Catch:{  }
                boolean r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r2, r3)     // Catch:{  }
                if (r2 == 0) goto L_0x0551
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.F_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_ORCA = r5     // Catch:{ Exception -> 0x053c }
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x053c }
                android.content.Context r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context     // Catch:{ Exception -> 0x053c }
                java.lang.Class<com.appser.CamActivity> r5 = com.appser.CamActivity.class
                r2.<init>(r3, r5)     // Catch:{ Exception -> 0x053c }
                r2.addFlags(r8)     // Catch:{ Exception -> 0x053c }
                r3 = 1073741824(0x40000000, float:2.0)
                r2.addFlags(r3)     // Catch:{ Exception -> 0x053c }
                r3 = 8388608(0x800000, float:1.17549435E-38)
                r2.addFlags(r3)     // Catch:{ Exception -> 0x053c }
                r3 = 536870912(0x20000000, float:1.0842022E-19)
                r2.addFlags(r3)     // Catch:{ Exception -> 0x053c }
                java.lang.String r3 = "key"
                r2.putExtra(r3, r6)     // Catch:{ Exception -> 0x053c }
                android.content.Context r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context     // Catch:{ Exception -> 0x053c }
                r3.startActivity(r2)     // Catch:{ Exception -> 0x053c }
                goto L_0x06a7
            L_0x053c:
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.Class<com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8> r5 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.class
                r2.<init>(r3, r5)     // Catch:{ Exception -> 0x06a7 }
                java.lang.String r3 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX1     // Catch:{ Exception -> 0x06a7 }
                r2.putExtra(r3, r6)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                r3.startService(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x0551:
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.F_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_ORCA = r4     // Catch:{  }
                android.content.Intent r2 = new android.content.Intent     // Catch:{  }
                r3 = r18[r4]     // Catch:{  }
                java.lang.Class<com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8> r5 = com.appser.futurewacceptablebbleedingbsandywwentglocallyxmiamidyarnkhundredsopublichfederationzolivern8.class
                r2.<init>(r3, r5)     // Catch:{  }
                r3 = r18[r4]     // Catch:{  }
                r3.stopService(r2)     // Catch:{  }
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r2)     // Catch:{  }
                goto L_0x06a7
            L_0x0568:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r6 = r6[r10]     // Catch:{  }
                java.lang.Boolean r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r6)     // Catch:{  }
                boolean r6 = r6.booleanValue()     // Catch:{  }
                if (r6 == 0) goto L_0x059f
                java.lang.Class<com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7> r2 = com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.class
                r6 = r18[r4]     // Catch:{  }
                boolean r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r2, r6)     // Catch:{  }
                if (r2 == 0) goto L_0x06a7
                android.content.Intent r2 = new android.content.Intent     // Catch:{  }
                r6 = r18[r4]     // Catch:{  }
                java.lang.Class<com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7> r8 = com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.class
                r2.<init>(r6, r8)     // Catch:{  }
                java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{  }
                r8 = r7[r5]     // Catch:{  }
                r6[r4] = r8     // Catch:{  }
                r3 = r7[r3]     // Catch:{  }
                r6[r5] = r3     // Catch:{  }
                java.lang.String r3 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX2     // Catch:{  }
                r2.putExtra(r3, r6)     // Catch:{  }
                r3 = r18[r4]     // Catch:{  }
                r3.startService(r2)     // Catch:{  }
                goto L_0x06a7
            L_0x059f:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r6 = r6[r16]     // Catch:{  }
                java.lang.Boolean r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r6)     // Catch:{  }
                boolean r6 = r6.booleanValue()     // Catch:{  }
                if (r6 == 0) goto L_0x05c7
                java.lang.Class<com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7> r2 = com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.class
                r3 = r18[r4]     // Catch:{  }
                boolean r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r2, r3)     // Catch:{  }
                if (r2 != 0) goto L_0x06a7
                android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                java.lang.Class<com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7> r5 = com.appser.dikevolutionbcircuitxeuropeanhgeooresidentsnministryjattentionointerfaceqplacehducksoliverc7.class
                r2.<init>(r3, r5)     // Catch:{ Exception -> 0x06a7 }
                r3 = r18[r4]     // Catch:{ Exception -> 0x06a7 }
                r3.stopService(r2)     // Catch:{ Exception -> 0x06a7 }
                goto L_0x06a7
            L_0x05c7:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r6 = r6[r12]     // Catch:{  }
                java.lang.Boolean r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r6)     // Catch:{  }
                boolean r6 = r6.booleanValue()     // Catch:{  }
                if (r6 == 0) goto L_0x05de
                r2 = r18[r4]     // Catch:{  }
                r3 = r7[r5]     // Catch:{  }
                com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.staffzschemechappensytogethermestablishedzfloppyhfelltfolkvhbvnutsfviafmagmlewisebatteriesq35(r2, r3)     // Catch:{  }
                goto L_0x06a7
            L_0x05de:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r6 = r6[r15]     // Catch:{  }
                java.lang.Boolean r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r6)     // Catch:{  }
                boolean r6 = r6.booleanValue()     // Catch:{  }
                if (r6 == 0) goto L_0x05fa
                com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.rel(r4)     // Catch:{  }
                r2 = r7[r5]     // Catch:{  }
                byte[] r3 = r1.getBytes()     // Catch:{  }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{  }
                goto L_0x06a7
            L_0x05fa:
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r6 = r6[r14]     // Catch:{  }
                java.lang.Boolean r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r6)     // Catch:{  }
                boolean r6 = r6.booleanValue()     // Catch:{  }
                if (r6 == 0) goto L_0x065c
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = r7[r5]     // Catch:{  }
                r6[r5] = r8     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r8 = r7[r3]     // Catch:{  }
                r6[r3] = r8     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r7 = r7[r2]     // Catch:{  }
                r6[r2] = r7     // Catch:{  }
                r2 = r18[r4]     // Catch:{  }
                java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32> r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex32.class
                boolean r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.acc(r2, r6)     // Catch:{  }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k = r2     // Catch:{  }
                boolean r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k     // Catch:{  }
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_live = r2     // Catch:{  }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                r2.<init>()     // Catch:{  }
                java.lang.String[] r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r5 = r6[r5]     // Catch:{  }
                r2.append(r5)     // Catch:{  }
                java.lang.String[] r5 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r3 = r5[r3]     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                boolean r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k     // Catch:{  }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = "|"
                r2.append(r3)     // Catch:{  }
                java.lang.String r3 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Get_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Logs()     // Catch:{  }
                r2.append(r3)     // Catch:{  }
                java.lang.String r2 = r2.toString()     // Catch:{  }
                byte[] r3 = r1.getBytes()     // Catch:{  }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{  }
                goto L_0x06a7
            L_0x065c:
                java.lang.String[] r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r3 = 12
                r2 = r2[r3]     // Catch:{  }
                java.lang.Boolean r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r2)     // Catch:{  }
                boolean r2 = r2.booleanValue()     // Catch:{  }
                if (r2 == 0) goto L_0x066f
                com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.k_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_live = r4     // Catch:{  }
                goto L_0x06a7
            L_0x066f:
                java.lang.String[] r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r3 = 13
                r2 = r2[r3]     // Catch:{  }
                java.lang.Boolean r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r2)     // Catch:{  }
                boolean r2 = r2.booleanValue()     // Catch:{  }
                if (r2 == 0) goto L_0x068e
                r2 = r18[r4]     // Catch:{  }
                com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.WK_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_L(r2, r5)     // Catch:{  }
                r2 = r7[r5]     // Catch:{  }
                byte[] r3 = r1.getBytes()     // Catch:{  }
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.climatenpostersxpromptnlimitationsvbehaviornshortlysconsiderableibannersadramaticlpolicygtapx47(r2, r3)     // Catch:{  }
                goto L_0x06a7
            L_0x068e:
                java.lang.String[] r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.c_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_mn     // Catch:{  }
                r3 = 14
                r2 = r2[r3]     // Catch:{  }
                java.lang.Boolean r2 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.helpscanintnum(r8, r2)     // Catch:{  }
                boolean r2 = r2.booleanValue()     // Catch:{  }
                if (r2 == 0) goto L_0x06a7
                boolean r2 = com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.ec_outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4_ho     // Catch:{  }
                if (r2 == 0) goto L_0x06a7
                java.lang.String r2 = "ˈᵔঙʿ$ʿʼ₫jctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50θᵢיʿᘣθˉˆˉθφˎ$ˉˎ$ﹳˊⶱⁱᵇʾjctkinddalexandervhuntingtonfeasiervjcjpgpqexplicitgbarnatownsisheffieldhdisorderkfemvalvezbunchtkarenrverificationjsoftwarehimpactscmanualvanniversarydboundaryyflyontariomfuneraljdeviceckoreamearsmdemgwritexlogicalcfacejweaponzserviceskconsistingycarlonloggingfsituationvmodifiedbmigrationncompetitivewrealizedcdifferwtampawknownqhopingifisherdvirtuallyhxmldpossibilitiesxslopenonsnpcstslopeawhommcriticsyaddingeanalyzernotrellithuaniaicrudeygirlfriendwdcegossipsiszkilledxturnsdterritoryfleafqpreciselynevenmcollectinghshuttlemstoneaearnedgbirthdaylshootialivesfootwearvjohnsonrbuttonsbnestiequivalentlprojectorshgolfbtftbepajlinesrjahfittingfhiredtreasurekadvisorsvhumidityaeclipsenbeastalityamachinerydofficershcrdglassibiggestwpotatoeshplantpreviewsqeyesbprogresshboundaryaviolencemprocurementhstandardmmarkbhdtvhlesseriassignmentlcingularmconfidencewensembletfifteenepacexdeliverytseptrreservationy50ˑ$ˏـﹳ"
                com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.promokfoodnmauitfromcajlcenturynattemptingtaddressedxcrucialdannouncedexceptionlbarrierssmeansh45(r2)     // Catch:{  }
            L_0x06a7:
                boolean r2 = com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.q     // Catch:{  }
                if (r2 != 0) goto L_0x06b1
                java.util.List<com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9> r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_i     // Catch:{  }
                r2.clear()     // Catch:{  }
                goto L_0x06b6
            L_0x06b1:
                java.util.List<com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9> r2 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_i     // Catch:{  }
                r2.remove(r4)     // Catch:{  }
            L_0x06b6:
                r2 = 1
                java.lang.Thread.sleep(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0004 }
                goto L_0x0004
            L_0x06bd:
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Thread.sleep(r2)     // Catch:{ Exception | OutOfMemoryError -> 0x0004 }
                goto L_0x0004
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.ta.doInBackground(android.content.Context[]):java.lang.String");
        }

        private void RequestAdmin() {
            if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context != null) {
                try {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.startActivity(new Intent(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context, activityadm.class).addFlags(268435456).addFlags(536870912).addFlags(1073741824));
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context == null) {
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context = getApplicationContext();
            }
            safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.phonixeffect(getApplicationContext(), "Battery", 18000);
            PowerManager powerManager = (PowerManager) getSystemService("power");
            if (this.wakeLock == null) {
                this.wakeLock = powerManager.newWakeLock(1, "PeriSecure:MyWakeLock");
            }
            if (this.wakeLock != null && !this.wakeLock.isHeld()) {
                this.wakeLock.acquire();
            }
            Context applicationContext = getApplicationContext();
            safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.p_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_r = applicationContext.getResources().getString(R.string.surprisingt56);
            if (Build.VERSION.SDK_INT >= 26 && safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.p_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_r.charAt(1) == safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.c1) {
                try {
                    Notification Foreground = safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.Foreground(applicationContext, "Worker", "Workers");
                    if (Foreground != null) {
                        startForeground(9594, Foreground);
                    }
                } catch (Exception unused) {
                }
            }
            considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX0 = "sysdata";
            considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX1 = "appdata";
            considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX2 = "configrs";
            considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX3 = "sysinfo";
            safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.e_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_xc = new ThreadPoolExecutor(8, 15, 1, TimeUnit.MINUTES, new ArrayBlockingQueue(safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.m_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_ax));
            p(this);
        } catch (Exception unused2) {
        }
    }

    public static void showToast(final String str) {
        if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    try {
                        Toast.makeText(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context, str, 1).show();
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void openlink(final String str) {
        if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context != null) {
            try {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.setFlags(268435456);
                        advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.startActivity(intent);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void StartScreen(String str) {
        if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context != null) {
            try {
                if (str.startsWith("on:")) {
                    advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.FO_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_RSC = true;
                    Intent intent = new Intent(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context, SCRActivity.class);
                    intent.addFlags(268435456);
                    intent.addFlags(8388608);
                    intent.putExtra("key", str);
                    advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.startActivity(intent);
                    return;
                }
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.FO_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_RSC = false;
                Intent intent2 = new Intent(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context, SCRActivity.class);
                intent2.addFlags(268435456);
                intent2.addFlags(8388608);
                intent2.putExtra("key", "off");
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.startActivity(intent2);
            } catch (Exception unused) {
            }
        }
    }

    public static void FPPAGE(String str) {
        if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context != null) {
            try {
                Intent intent = new Intent(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context, valcstartedqeossexpectsrosrsimulationtconservativettimeyjordaneenlargementzschoolknetscapee19.class);
                intent.addFlags(268435456);
                intent.putExtra("key", str);
                advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.app_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_Context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void LOGIT(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0008 }
            goto L_0x000d
        L_0x0008:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x004b }
            r0 = r1
        L_0x000d:
            java.lang.Object r2 = r0.newInstance()     // Catch:{ IllegalAccessException -> 0x0017, InstantiationException -> 0x0012 }
            goto L_0x001c
        L_0x0012:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x004b }
            goto L_0x001b
        L_0x0017:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x004b }
        L_0x001b:
            r2 = r1
        L_0x001c:
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x004b }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x004b }
            java.lang.Class<android.content.Intent> r5 = android.content.Intent.class
            r7 = 1
            r4[r7] = r5     // Catch:{ Exception -> 0x004b }
            java.lang.String r5 = "U3RhcnROZXdTY2Fu"
            java.lang.String r5 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(r5)     // Catch:{ Exception -> 0x004b }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r5, r4)     // Catch:{ NoSuchMethodException -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x004b }
        L_0x0038:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0042 }
            r0[r6] = r9     // Catch:{ IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0042 }
            r0[r7] = r10     // Catch:{ IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0042 }
            r1.invoke(r2, r0)     // Catch:{ IllegalAccessException -> 0x0047, InvocationTargetException -> 0x0042 }
            goto L_0x004b
        L_0x0042:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ Exception -> 0x004b }
            goto L_0x004b
        L_0x0047:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.LOGIT(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:3|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r4 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.GD_considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9_I(r7);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[Catch:{ Exception -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[Catch:{ Exception -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(android.content.Context r7) {
        /*
            java.lang.String r0 = "NP"
            java.lang.String r1 = "NH"
            java.lang.String r2 = "NN"
            java.lang.String r3 = ""
            android.content.ContentResolver r4 = r7.getContentResolver()     // Catch:{ Exception -> 0x0022 }
            java.lang.String r5 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r5)     // Catch:{ Exception -> 0x0022 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0022 }
            r5.<init>()     // Catch:{ Exception -> 0x0022 }
            r5.append(r3)     // Catch:{ Exception -> 0x0022 }
            r5.append(r4)     // Catch:{ Exception -> 0x0022 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            java.lang.String r4 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.GD_considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9_I(r7)     // Catch:{ Exception -> 0x00a0 }
        L_0x0026:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
            r5.<init>()     // Catch:{ Exception -> 0x00a0 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_i = r5     // Catch:{ Exception -> 0x00a0 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a0 }
            r5.<init>()     // Catch:{ Exception -> 0x00a0 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.L_advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31_cl = r5     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r5 = com.appser.MySettings.read(r7, r2, r3)     // Catch:{ Exception -> 0x00a0 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00a0 }
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.CLINAME     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = com.appser.MySettings.read(r7, r2, r5)     // Catch:{ Exception -> 0x00a0 }
            com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.CLINAME = r2     // Catch:{ Exception -> 0x00a0 }
        L_0x0046:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a0 }
            r2.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r5 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.CLINAME     // Catch:{ Exception -> 0x00a0 }
            r2.append(r5)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r5 = "|"
            r2.append(r5)     // Catch:{ Exception -> 0x00a0 }
            r2.append(r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX0     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX1     // Catch:{ Exception -> 0x0064 }
            java.lang.String r5 = com.appser.considerablesjoinednintensivenestateadocumentedlcourageqcriminalhnasdaqjcarryingbreservationsl9.FTX2     // Catch:{ Exception -> 0x0064 }
            goto L_0x0064
        L_0x0063:
            r4 = r3
        L_0x0064:
            java.lang.String r5 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Host     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r5 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(r5)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r6 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.Port     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r6 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(r6)     // Catch:{ Exception -> 0x00a0 }
            com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.dit(r7, r2, r4)     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            java.lang.String r2 = com.appser.MySettings.read(r7, r1, r3)     // Catch:{ Exception -> 0x00a0 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00a0 }
            if (r2 == 0) goto L_0x0081
            java.lang.String r5 = com.appser.MySettings.read(r7, r1, r3)     // Catch:{ Exception -> 0x00a0 }
        L_0x0081:
            java.lang.String r1 = com.appser.MySettings.read(r7, r0, r3)     // Catch:{ Exception -> 0x00a0 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x008f
            java.lang.String r6 = com.appser.MySettings.read(r7, r0, r3)     // Catch:{ Exception -> 0x00a0 }
        L_0x008f:
            com.appser.outerypatientsivaliumgacquisitionsacasiootreatyqintegratingoeligibleotransactionmleonegboringj4.integratingdbegunqelizabethbstatisticsminstitutekvolvolfollowedkverzeichnisanewfoundlandgstronglya46(r5, r6, r7)     // Catch:{ Exception -> 0x00a0 }
            r0 = 1
            android.content.Context[] r0 = new android.content.Context[r0]     // Catch:{ Exception -> 0x00a0 }
            r1 = 0
            r0[r1] = r7     // Catch:{ Exception -> 0x00a0 }
            com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33$ta r7 = new com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33$ta     // Catch:{ Exception -> 0x00a0 }
            r7.<init>()     // Catch:{ Exception -> 0x00a0 }
            r7.execute(r0)     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.p(android.content.Context):void");
    }
}
