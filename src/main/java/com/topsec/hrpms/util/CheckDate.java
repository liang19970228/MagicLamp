package com.topsec.hrpms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 判断当前时间是否在[startTime, endTime]区间，注意时间格式要一致
 *  *@param now 当前时间
 *  *@param startTime 开始时间段
 *  *@param endTime 结束时间段
 */

public class CheckDate {
    public boolean isEffectiveDate(Date now,String startTime,String endTime)throws ParseException {
        String format = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String nowTime = sdf.format(now);
        Date nowDate = sdf.parse(nowTime);
        Date startDate = sdf.parse(startTime);
        Date endDate = sdf.parse(endTime);

        if (nowDate.getTime() == startDate.getTime() || nowDate.getTime() == endDate.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowDate);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startDate);

        Calendar end = Calendar.getInstance();
        end.setTime(endDate);

        if (date.after(begin) && date.before(end)){
            return true;
        }else {
            return false;
        }

    }
}
