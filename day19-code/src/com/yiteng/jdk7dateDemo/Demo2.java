package com.yiteng.jdk7dateDemo;

import java.util.Date;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
                /*
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        */

        method();
        Date today = new Date();//with paste parament it will return current time
        System.out.println(today);

        System.out.println("-----------------------");
        //需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        Random r = new Random();

        //创建两个时间对象
        Date d1 = new Date(Math.abs(r.nextLong()));
        Date d2= new Date(Math.abs(r.nextLong()));
        System.out.println(d1);
        System.out.println(d2);

        if (d1.equals(d2)) {
            System.out.println("they are equal");
        }else if(d1.before(d2)){
            System.out.println("d1 before d2");
        }else if(d1.after(d2)){
            System.out.println("d1 after d2");
        }



    }

    private static void method() {
        //需求1:打印时间原点开始一年之后的时间
        //1.创建一个对象，表示时间原点
        Date date = new Date(0L);
        System.out.println(date);
        //2.获取d1时间的毫秒值
        long time = date.getTime();
        System.out.println(time);
        //3.在这个基础上我们要加一年的毫秒值即可
        time += 1000L *365 *24 *60 *60 ;
        //4.把计算之后的时间毫秒值，再设置回d1当中
        //5.打印d1
        date.setTime(time);
        System.out.println(date);
    }
}

