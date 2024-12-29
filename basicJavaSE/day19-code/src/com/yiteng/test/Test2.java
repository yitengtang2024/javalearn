package com.yiteng.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number int number less than 11 digits:");
        String str = sc.nextLine();
        int number = Integer.parseInt(str);
        if(!str.matches("[1-9]\\d{1,9}")){
            System.out.println("the format of the inter is not correct");
        }else{
            for (int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i)-48);
            }

        }
        list.forEach(System.out::print);
        System.out.println();
        System.out.println(list.size());
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size() - 1){

                num = (num+list.get(i))*10;
            }else{
                num = num + list.get(i);
            }

        }
        System.out.println(num);
    }
}
