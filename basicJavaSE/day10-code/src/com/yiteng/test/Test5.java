package com.yiteng.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        String s = getRandomString(4);
        System.out.println(s);
        String randomString = randomStr(s);
        System.out.println(randomString);
    }
    private static String getRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        Random random1 = new Random();
        for (int i = 0; i < length; i++) {
            int number;
            while(true){
                number = random1.nextInt(67,122) ;
                if (number <91 || number > 96){
                    break;
                }
            }

            char c = (char) number;
            sb.append(c);
        }
        int number1 = random1.nextInt(0,10) ;
        sb.append(number1);
        return sb.toString();
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
