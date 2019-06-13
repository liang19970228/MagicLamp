package com.topsec.hrpms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 *
 * 日期格式化
 *      将字符串格式转换为Date格式
 *      将Date格式转化为字符串格式
 */

public class DateUtils {
    private static ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal() {
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    private DateUtils() {
    }

    public static String paserTime(String timeString, String srcPattern, String destPattern, Locale srcLocale, Locale destLocale) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(srcPattern, srcLocale);
        Date date = simpleDateFormat.parse(timeString);
        simpleDateFormat = new SimpleDateFormat(destPattern, destLocale);
        return simpleDateFormat.format(date);
    }

    public static String paserTime(String timeString, String srcPattern, String destPattern) throws ParseException {
        return paserTime(timeString, srcPattern, destPattern, Locale.ENGLISH, Locale.ENGLISH);
    }

    public static String fromString2String(String timeStr, String fromPattern, String toPattern) throws ParseException {
        SimpleDateFormat fromSimpleDateFormat = (SimpleDateFormat)threadLocal.get();
        fromSimpleDateFormat.applyPattern(fromPattern);
        Date time = fromSimpleDateFormat.parse(timeStr);
        fromSimpleDateFormat.applyPattern(toPattern);
        return fromSimpleDateFormat.format(time);
    }

    public static String fromDate2String(Date date, String pattern) throws ParseException {
        SimpleDateFormat fromSimpleDateFormat = (SimpleDateFormat)threadLocal.get();
        fromSimpleDateFormat.applyPattern(pattern);
        return fromSimpleDateFormat.format(date);
    }

    public static Date fromStringToDate(String timeStr, String pattern) throws ParseException {
        SimpleDateFormat fromSimpleDateFormat = (SimpleDateFormat)threadLocal.get();
        fromSimpleDateFormat.applyPattern(pattern);
        return fromSimpleDateFormat.parse(timeStr);
    }

    public static Date fromLong2Date(long timeLong) {
        return new Date(timeLong);
    }

    public static long fromDate2Long(Date date) {
        return date.getTime();
    }

    public static long fromString2Long(String timeStr, String pattern) throws ParseException {
        Date date = fromStringToDate(timeStr, pattern);
        return date.getTime();
    }

    public static String fromLong2String(long timeLong, String pattern) throws ParseException {
        Date date = fromLong2Date(timeLong);
        return fromDate2String(date, pattern);
    }

    public static Date fromDateToDate(Date date, String pattern) throws ParseException {
        SimpleDateFormat fromSimpleDateFormat = (SimpleDateFormat)threadLocal.get();
        fromSimpleDateFormat.applyPattern(pattern);
        return fromSimpleDateFormat.parse(fromSimpleDateFormat.format(date));
    }
}
