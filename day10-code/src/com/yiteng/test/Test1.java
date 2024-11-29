package com.yiteng.test;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //use while loop to check the input number is less than 9 in length
        String number;
        while(true){
            System.out.println("please input a number (length less than 9):");
            number = sc.nextLine();
            if(number.length() <= 9 && isNumber(number)){
                break;
            }else{
                System.out.println("The number is out of range!");
            }
        }

        String RomaNumber = convertNumber(number);
        System.out.println(RomaNumber);


    }
    private static boolean isNumber(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                return true;
            }

        }
        return false;
    }
    private static String convertNumber(String number){
        String[] romaNumbers ={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < number.length(); i++) {
            joiner.add(romaNumbers[(int)(number.charAt(i)-48)]);
        }
        return joiner.toString();
    }
}
