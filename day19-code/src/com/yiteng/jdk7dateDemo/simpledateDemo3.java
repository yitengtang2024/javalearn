package com.yiteng.jdk7dateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpledateDemo3 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */

        //1.定义字符串表示三个时间
        String start = "2023-11-11 0:0:0";
        String end = "2023-11-11 0:10:0";
        String xiaojia = "2023-11-11 0:01:0";
        String xiaopi = "2023-11-11 0:11:0";

        //2.解析上面的三个时间，得到Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startdate = sdf.parse(start);
        Date enddate = sdf.parse(end);
        Date xiaojiadate = sdf.parse(xiaojia);
        Date xiaopidate = sdf.parse(xiaopi);
        System.out.println(startdate);
        System.out.println(enddate);
        System.out.println(xiaojiadate);
        System.out.println(xiaopidate);

        //3.得到三个时间的毫秒值
        long startms = startdate.getTime();
        long endms = enddate.getTime();
        long xiaojiadatems = xiaojiadate.getTime();
        long xiaopidatems = xiaopidate.getTime();

        //4.判断
        if(xiaojiadate.before(enddate) && xiaojiadate.after(startdate)){
            System.out.println("xiaojia earn the reward");
        }else{
            System.out.println("xiaojia loose the reward");
        }
        if(xiaopidate.before(enddate) && xiaopidate.after(startdate)){
            System.out.println("xiaopi earn the reward");
        }else{
            System.out.println("xiaopi loose the reward");
        }
    }
}
