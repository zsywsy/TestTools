package mzs.libtools.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import mzs.libtools.utils.depend.DebugUtils;
import mzs.libtools.utils.NetWorkUtils;


/**
 * Created by 24275 on 2016/5/26.
 */
public class NetworkReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        action:
//        ConnectivityManager.CONNECTIVITY_ACTION

        DebugUtils.log("isOnline:" + NetWorkUtils.isOnline(context) + ";MOB:" + NetWorkUtils.isMobConnected(context) + ";WIFI:" + NetWorkUtils.isWifiConnected(context) + ";type:" + NetWorkUtils.getNetworkType(context));
    }
}
