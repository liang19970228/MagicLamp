package com.topsec.hrpms.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String str = new SimpleDateFormat("yyyy年MM月dd日").format(date);
        String year = str.substring(0,4);
        String month = str.substring(str.indexOf("年")+1,str.indexOf("月"));
        String day = str.substring(str.indexOf("月")+1,str.indexOf("日"));
        System.out.println("year:"+year);
        System.out.println("month:"+month);
        System.out.println("day:"+day);

    }
}
