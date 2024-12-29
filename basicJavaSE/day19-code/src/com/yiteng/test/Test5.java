package com.yiteng.test;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Calendar;

public class Test5 {
    /*
          判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
          二月有29天是闰年一年有366天是闰年
      */
    public static void main(String[] args) {
        //jdk7
        //我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);//month2 is March


        //月份的范围:0~11
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的时间是28号还是29号?
        int day = c.get(Calendar.DAY_OF_MONTH);

        System.out.println(day);


        //jdk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        //把时间往前减一天
        //获取这一天是一个月中的几号
        LocalDate localDate = LocalDate.of(2000,3,1);
        System.out.println(localDate);
        LocalDate l1 = localDate.minusDays(1);
        System.out.println(l1.getDayOfMonth());

        //true:闰年
        //false:平年
        System.out.println(l1.isLeapYear());

    }

}
