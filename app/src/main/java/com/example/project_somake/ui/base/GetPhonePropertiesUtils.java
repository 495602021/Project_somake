package com.example.project_somake.ui.base;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;

/**
 * -------- This is 羊驼! -------
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃神兽保佑
 * 　　　　┃　　　┃代码无BUG！
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━神兽出没━━━━━━
 * Created by 习爸爸 on 2017/9/28.
 *
 *
 *          getPhoneWidth();             获取手机屏幕宽度
 *
 *           getPhoneHeigth();           获取手机屏幕高度
 *
 *          getPhoneOsversion();         获取设备系统版本
 *
 *          getPhoneDeviceName();        获取设备型号
 *
 *          getPhoneCarrier();           获取设备运营商
 *
 *          getPhoneIMEI()               获取设备IMEI
 *
 *          getPhoneMacId                获取设备MACID
 */

public class GetPhonePropertiesUtils {

    /**
     * 获取手机屏幕宽度
     *
     * @param context
     * @return
     */
    public static int getPhoneWidth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }

    /**
     * 获取手机屏幕高度
     *
     * @param context
     * @return
     */
    public static int getPhoneHeigth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);

        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }

    /**
     * 获取设备系统版本
     */
    public static String getPhoneOsversion() {
        return android.os.Build.VERSION.RELEASE;
    }

    /**
     * 获取设备型号
     *
     * @return
     */

    public static String getPhoneDeviceName() {
        return android.os.Build.MODEL;
    }

    /**
     * 获取设备运营商
     *
     * @return
     */

    public static String getPhoneCarrier(Context context) {
        TelephonyManager telManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        String operator = telManager.getSimOperator();

        if (operator != null) {
            if (operator.equals("46000") || operator.equals("46002") || operator.equals("46007")) {

                //中国移动
                return "中国移动";

            } else if (operator.equals("46001")) {

                //中国联通
                return "中国联通";

            } else if (operator.equals("46003")) {

                //中国电信
                return "中国电信";
            }
        }
        return null;
    }

    /**
     * 获取设备id
     *
     * @param context
     * @return
     */
    public static String getPhoneIMEI(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }

    /**
     * 获取设备运营商MACid
     *
     * @param context
     * @return
     */
    public static String getPhoneMacId(Context context) {
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = wifi.getConnectionInfo();
        return info.getMacAddress();
    }
}
