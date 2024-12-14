package com.yiteng.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
    //JDK7
    //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值

    public static void main(String[] args) throws ParseException {
        //JDK 7
        //simple the date and get the milis
        //get the different between the date and the now
        //calculationg get the days
        String s1 = "2000-01-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s1);
        System.out.println(date);
        Date now = new Date();
        System.out.println(now);
        long s1Mili = date.getTime();
        long nowMili = now.getTime();
        long diffMili = nowMili - s1Mili;
        long days = diffMili / 86400000;
        System.out.println(days);

        System.out.println("-------------------");
        //JDK8
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1  = LocalDate.parse(s1);
        long days1 = ChronoUnit.DAYS.between(localDate1,localDate);
        System.out.println(days1);
    }
}
