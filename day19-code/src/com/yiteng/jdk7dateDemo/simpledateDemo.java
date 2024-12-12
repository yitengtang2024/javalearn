package com.yiteng.jdk7dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateDemo {
    public static void main(String[] args) throws ParseException {
        /*
            public simpleDateFormat() 默认格式
            public simpleDateFormat(String pattern) 指定格式
            public final string format(Date date) 格式化(日期对象 ->字符串)
            public Date parse(string source) 解析(字符串 ->日期对象)
        */

        //1.定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //2.利用空参构造创建simpleDateFormat对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 细节:
        //创建对象的格式要跟字符串的格式完全一致
        //3.打印结果
        Date date1 = sdf1.parse(str);
        System.out.println(date1);
        System.out.println(sdf1.format(date1));
//1.利用空参构造创建simpleDateFormat对象，默认格式
        System.out.println("----------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date);
        System.out.println(sdf.format(date));
    }

    private static void method1() {
        //1.利用空参构造创建simpleDateFormat对象，默认格式

        //2.利用带参构造创建simpleDateFormat对象，指定格式

        //课堂练习:yyyy年MM月dd日 时:分:秒 星期
    }
}

