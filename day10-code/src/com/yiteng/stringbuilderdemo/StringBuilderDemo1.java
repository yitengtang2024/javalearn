package com.yiteng.stringbuilderdemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");// sb created by the StringBuider and it is a StringBuilder type instead of String
        System.out.println(sb);// print the sb directly will auto call the .toString
        String str = sb.reverse().toString();// convert the StringBuilder type to the String type
        System.out.println(str);

        boolean isSame = sb.reverse().toString().equals(sb.reverse().toString());
        System.out.println(isSame);
    }
}
