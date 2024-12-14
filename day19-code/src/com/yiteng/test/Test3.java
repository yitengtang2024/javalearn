package com.yiteng.test;
 /*

            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

         */

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid number");
        String str = sc.nextLine();
        int num = 0;
        if(!str.matches("[1-9]\\d{1,10}")){
            System.out.println("Invalid number");
        }else{
           num = Integer.parseInt(str);
        }
        int binaryInt = toBinary(num);
        System.out.println(binaryInt);


    }
    private static int toBinary(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = num;
        int mod = 0;

        int binaryInt =0;
        while(temp > 0){
            mod = temp % 2;
            list.add(mod);
            temp = temp / 2;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        for (int i = list.size()-1; i >=0; i--) {
            if(i !=0){
                binaryInt =(binaryInt + list.get(i)) *10;
            }else{
                binaryInt = binaryInt + list.get(i);
            }

        }
        return binaryInt;
    }
}
