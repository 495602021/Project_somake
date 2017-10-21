package com.example.project_somake.utlis;

import android.util.Log;

/**
 * Created by Mr Chen on 2017/10/18.
 */

public class ShowLargeLog {
    /**
     * 分段打印出较长log文本
     * @param logContent  打印文本
     * @param showLength  规定每段显示的长度（AndroidStudio控制台打印log的最大信息量大小为4k）
     *
     */
    public static void show(String logContent, int showLength){
        if(logContent.length() > showLength){
            String show = logContent.substring(0, showLength);
            Log.e("success", show);
            /*剩余的字符串如果大于规定显示的长度，截取剩余字符串进行递归，否则打印结果*/
            if((logContent.length() - showLength) > showLength){
                String partLog = logContent.substring(showLength,logContent.length());
                show(partLog, showLength);
            }else{
                String printLog = logContent.substring(showLength, logContent.length());
                Log.e("success", printLog);
            }

        }else{
            Log.e("success",logContent);
        }
    }
}
