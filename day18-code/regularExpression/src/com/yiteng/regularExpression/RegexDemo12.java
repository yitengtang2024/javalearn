package com.yiteng.regularExpression;

public class RegexDemo12 {
    public static void main(String[] args) {
        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)
        // \\组号:表示把第X组的内容再出来用一次
        System.out.println("a123a".matches("(.).+\\1"));//true
        System.out.println("b456b".matches("(.).+\\1"));//true
        System.out.println("17891".matches("(.).+\\1"));//true
        System.out.println("&abca&".matches("(.).+\\1"));//true
        System.out.println("a123b".matches("(.).+\\1"));//false
        System.out.println("---------------------------------");

        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        System.out.println("abc123abc".matches("(.+).+\\1"));//true
        System.out.println("b456b".matches("(.+).+\\1"));//true
        System.out.println("123789123".matches("(.+).+\\1"));//true
        System.out.println("&!@abc&!@&".matches("(.+).+\\1"));//true
        System.out.println("abc123abd".matches("(.+).+\\1"));//false
        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        //(.):把首字母看做一组
        // \\2:把首字母拿出来再次使用
        // *:作用于\\2,表示后面重复的内容出现日次或多次
        System.out.println("-------------------------------");
        System.out.println("aaa123aaa".matches("((.)\\2*).+\\1"));//true
        System.out.println("bbb456bbb".matches("((.)\\2*).+\\1"));//true
        System.out.println("111789111".matches("((.)\\2*).+\\1"));//true
        System.out.println("&&abc&&".matches("((.)\\2*).+\\1"));//true
    }
}
