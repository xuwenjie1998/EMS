package com.sawyer.utils;

import java.text.SimpleDateFormat;

/**
 * 获取当前时间，返回指定yyyy-MM-dd hh:mm:ss 格式的字符串
 */
public class DateFormat {
    public String dateFormat(java.util.Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);
        return format;
    }
}
