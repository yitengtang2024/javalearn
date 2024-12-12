package com.yiteng.narcissisticNumber;
/*
*for example a number 153, sum = 1^3+5^3+3^3 = 153 return true
* another example 1634 1^4+6^4+3^4+4^4 = 1634 return true
* 一位自幂数：独身数
三位自幂数：水仙花数
四位自幂数：四叶玫瑰数
五位自幂数：五角星数
六位自幂数：六合数
七位自幂数：北斗七星数
八位自幂数：八仙数
九位自幂数：九九重阳数
十位自幂数：十全十美数
 */

import java.util.ArrayList;

public class narcissisticNumber {
    private static int numberDigit = 0;
    private static ArrayList<Integer> digits= new ArrayList<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        isNarcissicNumber(1000,9999);
        long end = System.currentTimeMillis();

        System.out.println(end - start);

    }
    private static ArrayList<Integer> intDigit(int num) {
        int temp = num;
        numberDigit = 0;
        if(digits != null) {
            digits.clear();
        }
        while (temp > 0) {
            digits.add(temp % 10);
            temp = temp / 10;
            numberDigit++;
        }
        return digits;
    }
    private static int sumDigit(){
        double sum =0;
        for (int i = 0; i < digits.size(); i++) {
            int num = digits.get(i);
            sum += Math.pow(num, numberDigit);

        }
        return (int)sum;
    }
    private static void isNarcissicNumber(int start, int end) {
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            intDigit(i);
            sum = sumDigit();
            if (sum == i) {
                System.out.println("it is narcissiticNumber");
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

    }
}
