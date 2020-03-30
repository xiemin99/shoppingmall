package com.shoppingmall.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author：xie_min
 * @Date：2020-3-30
 * @Descrption：com.shoppingmall.utils
 * @Version：1.0
 */
public class DateFormatHelper {

    private static final String FORMAT_STR = "yyyy-MM-dd HH:mm:ss";

    public static String dateToStr(long time){
        Date date = new Date(time);
        DateFormat df = new SimpleDateFormat(FORMAT_STR);
        return df.format(date);
    }

    public static Long strToDate(String str){
        Long time = null;
        try {
            DateFormat df = new SimpleDateFormat(FORMAT_STR);
            time = df.parse(str).getTime();
        }catch (Exception e){
            e.printStackTrace();
        }
        return time;
    }

}
