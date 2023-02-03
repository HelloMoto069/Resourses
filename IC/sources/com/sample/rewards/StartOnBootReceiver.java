package com.sample.rewards;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class StartOnBootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            Intent intent2 = new Intent(context, MainActivity.class);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            Intent intent3 = new Intent(context, MyTaskService.class);
            Bundle bundle = new Bundle();
            bundle.putString("foo", "bar");
            intent3.putExtras(bundle);
            context.startService(intent3);
        }
    }
}
