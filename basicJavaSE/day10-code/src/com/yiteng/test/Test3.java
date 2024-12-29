package com.yiteng.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String str = "abcdefg";
        String randomStr = randomStr(str);
        System.out.println(randomStr);

    }
    private static String randomStr(String str){
        Random random = new Random();
        char[] arr = new char[str.length()];// char[] arr =str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            int index = random.nextInt(i+1);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return new String(arr);
    }
}
