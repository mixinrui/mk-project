package com.mikai.utils;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mk on 17/2/8.
 */
public class JodaTimeUtils {

    public static void main(String[] args) {
        Date tempDate = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startTime = DateTime.now().plusHours(48).toDate();
        System.out.println("startTime = " +startTime);
        String dateStr = new DateTime(new Date()).toString("yyyy-MM-dd");
        System.out.println("dateStr = " +dateStr);





        System.out.println("Date格式：现在的时间是："+new Date());
        System.out.println("joda-time：现在的时间是："+new DateTime());
        System.out.println("joda-time:只获取年月日时间："+(new DateTime()).toString("yyyy-MM-dd"));
        System.out.println("joda-time:今天是"+(new DateTime()).toString("E"));
        System.out.println("joda-time:获取时间到秒："+(new DateTime()).toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println("joda-time:获取时间到毫秒："+(new DateTime()).toString(" yyyy/MM/dd/ E HH:mm:ss.SSS"));
        System.out.println("joda-time:获取时间带下午："+(new DateTime()).toString("MM/dd/yyyy hh:mm:ss.SSSa"));




        //计算两个日期间隔的天数
        LocalDate start=new LocalDate(2012, 12,14);
        LocalDate end=new LocalDate(2013, 01, 15);
        int days = Days.daysBetween(start, end).getDays();

        //计算两个日期间隔的小时数,分钟数,秒数

        //增加日期
        DateTime dateTime1 = DateTime.parse("2012-12-03");
        dateTime1 = dateTime1.plusDays(30);
        dateTime1 = dateTime1.plusHours(3);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.plusMinutes(3);
        dateTime1 = dateTime1.plusMonths(2);
        dateTime1 = dateTime1.plusSeconds(4);
        dateTime1 = dateTime1.plusWeeks(5);
        dateTime1 = dateTime1.plusYears(3);

    }
}
