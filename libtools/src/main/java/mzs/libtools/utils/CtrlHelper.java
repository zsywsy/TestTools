package mzs.libtools.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;

/**
 * Created by 24275 on 2016/7/27.
 */
public class CtrlHelper {

    public static void act2Act(Activity act, Class<?> cls) {
        if (act == null || cls == null) {
            throw new NullPointerException(" act or cls null");
        }
        Intent intent = new Intent(act, cls);
        act.startActivity(intent);
    }

    public static void frag2Act(Fragment fragment, Class<?> cls) {
        if (fragment == null || cls == null) {
            throw new NullPointerException("fragment or cls null");
        }
        Intent intent = new Intent(fragment.getActivity(), cls);
        fragment.startActivity(intent);
    }

}
