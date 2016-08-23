package mzs.libtools.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by 24275 on 2016/6/29.
 */
public class EncryptUtils {
    public static void main(String[] args) {
        System.out.println(MD5("123456", false));
        System.out.println(MD5("asdf", true).toUpperCase());
    }

    public static String MD5(String str) {
        return MD5(str, false);
    }

    public static String MD5(String str, boolean sub16) {
        if (str == null) {
            return null;
        }
        StringBuilder sBuilder = new StringBuilder();
        try {
            byte[] clears = str.getBytes();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(clears);
            byte[] ciphers = md.digest();
            for (byte b : ciphers) {
                int value = b & 0xff;
                String valueHex = Integer.toHexString(value);
                String valueHex2 = value <= 0xf ? "0" + valueHex : valueHex;
                sBuilder.append(valueHex2);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (sBuilder.length() > 0) {
            if (sub16) {
                return sBuilder.toString().substring(8, 24);
            } else {
                return sBuilder.toString();
            }

        }
        return null;
    }
}
