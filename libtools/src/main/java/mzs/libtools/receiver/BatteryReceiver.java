package mzs.libtools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import mzs.libtools.utils.depend.DebugUtils;
import mzs.libtools.utils.IterateIntent;

/**
 * Created by 24275 on 2016/5/26.
 */
public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if(Intent.ACTION_POWER_CONNECTED.equals(action)){
        }else if(Intent.ACTION_POWER_DISCONNECTED.equals(action)){
        }else if(Intent.ACTION_BATTERY_OKAY.equals(action)){
        }else if(Intent.ACTION_BATTERY_LOW.equals(action)){
        }else if(Intent.ACTION_BATTERY_CHANGED.equals(action)){
        }

        DebugUtils.toast(context, IterateIntent.iterateIntent(intent,new StringBuilder()).toString());
    }
}
