package com.yiteng.demo1;
/*
*input String abc
* out String cba
 */
public class stringDemo3 {
    public static void main(String[] args) {
        String s1 = "abc";
        String reverse="";
        reverse = reverseString(s1, reverse);
        System.out.println(reverse);
    }

    private static String reverseString(String s1, String reverse) {
        StringBuilder reverseBuilder = new StringBuilder(reverse);
        for (int i = s1.length()-1; i >=0 ; i--) {
            char c = s1.charAt(i);
            reverseBuilder.append(c);

        }
        reverse = reverseBuilder.toString();
        return reverse;
    }

}
