package com.yiteng.jdk8dateDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeForMatterDemo {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */
        //获取时间对象
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.systemDefault());
        // 解析/格式化器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(formatter);

        // 格式化
        System.out.println(zdt.format(formatter));
    }
}
