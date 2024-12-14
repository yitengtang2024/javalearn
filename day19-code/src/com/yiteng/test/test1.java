package com.yiteng.test;

import java.util.ArrayList;
import java.util.Scanner;
 /*
            键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (!sumList(list)) {
            System.out.println("Please enter a number:");
            String str = sc.nextLine();
            int num = 0;
            if (str.matches("\\d{1,2}")){
                num = Integer.parseInt(str);
            }else{
                System.out.println("Please enter a valid number 1-99");
                continue;
            }


            if (num <1 || num > 100) {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }
            list.add(num);


        }
    }

    private static boolean sumList(ArrayList<Integer> list) {
        Integer sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);
        return sum > 200;
    }
}
