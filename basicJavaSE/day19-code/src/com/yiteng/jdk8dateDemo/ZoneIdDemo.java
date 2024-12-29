package com.yiteng.jdk8dateDemo;

import java.time.ZoneId;
import java.util.Set;

import static java.time.ZoneId.systemDefault;

public class ZoneIdDemo {
    public static void main(String[] args) {
        /*
        static Set<string> getAvailableZoneIds() 获取Java中支持的所有时区
        static ZoneId systemDefault() 获取系统默认时区
        static Zoneld of(string zoneld) 获取一个指定时区
        */

        //1.获取所有的时区名称
        Set<String> zoneID = ZoneId.getAvailableZoneIds();
        System.out.println(zoneID);


        //2.获取当前系统的默认时区
        ZoneId zone = systemDefault();
        System.out.println(zone);

        //3.获取指定的时区
        ZoneId zone2 = ZoneId.of("America/Los_Angeles");
        System.out.println(zone2);
    }

}
