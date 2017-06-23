package com.nicole.hrms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xl on 2017/6/22.
 */
public class DateUtil {
    //方法的作用是返回格式化的当前日期
    public static Date getDate() throws ParseException{
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(sdf.format(date));
    }




}
