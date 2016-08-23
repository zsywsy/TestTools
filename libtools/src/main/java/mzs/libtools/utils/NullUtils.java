package mzs.libtools.utils;

/**
 * Created by 24275 on 2016/6/13.
 */
public class NullUtils {

    public static boolean isNull(Object o) {
        return o == null;
    }

    public static boolean isEmpty(String content){
        return content==null||content.length()==0;
    }

    public static void ExIfNull(Object o){
        if(o==null){
            throw new NullPointerException();
        }
    }

}
