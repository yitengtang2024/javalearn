package com.yiteng.jdk8dateDemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {
        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneIdzone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */
        //1.获取当前时间的Instant对象(标准时间)


        Instant now = Instant.now();//when we use Instant.now it always return the current time of zulu time zone
        System.out.println(now);
        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant = Instant.ofEpochSecond(now.getEpochSecond());
        System.out.println(instant);

        //3. 指定时区

        ZoneId eaternZoneId = ZoneId.of("America/New_York");
        ZonedDateTime easternTime = now.atZone(eaternZoneId);
        System.out.println(easternTime);


        //4.isXxx 判断

        //5.用于时间的判断
        //isBefore:判断调用者代表的时间是否在参数表示时间的前面

        //isAfter:判断调用者代表的时间是否在参数表示时间的后面
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.ofEpochSecond(2L);
        boolean results = instant1.equals(instant2);
        System.out.println(results);
        boolean result1 = instant1.isBefore(instant2);
        System.out.println(result1);
        boolean result2 = instant1.isAfter(instant2);
        System.out.println(result2);

        //6.Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        Instant instant3 = Instant.ofEpochMilli(100L);
        Instant instant4 = instant3.minusSeconds(1L);
        System.out.println(instant3);
        System.out.println(instant4);







    }
}
