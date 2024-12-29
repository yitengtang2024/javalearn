package com.yiteng.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("please input a 5 digit string wiht 4 char and 1 digit");
            String str = sc.nextLine();
            if(numberCheck(str) && charCheck(str)){
                break;
            }else{
                System.out.println("The input is not fit with the standard!");
                System.out.println("Please give another shot!");
            }
        }
    }
    private static boolean numberCheck(String str){
        char[] arr = str.toCharArray();
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] >= '0' && arr[i] <= '9') {
               count++;
           }
           if(count == 1){
               flag = true;
           }
        }
        return flag;
    }
    private static char[] getChar(String str){
        char[] arr = str.toCharArray();
        char[] onlychar = new char[arr.length-1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                continue;
            }else{
               onlychar[index] = arr[i];
               index++;
            }

        }
        return onlychar;
    }
    private static boolean charCheck(String str){
        char[] arr = getChar(str);
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 65 && arr[i] <=90 || arr[i] >= 97 && arr[i] <=122) {
               count++;
            }
            if(count == 4){
                flag = true;
            }

        }
        return flag;
    }
}
