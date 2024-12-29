package com.yiteng.demo1;

import java.util.Scanner;

public class stringDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input any string: ");
        String str = scanner.nextLine();

        int upperCount= 0;
        int lowerCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < str.length(); i++) {//also can use the enhanced for loop for (char c:str.toCharArray()){}
            System.out.print(str.charAt(i));
            System.out.println();

            if (Character.isUpperCase(str.charAt(i))){// it alos an test the by comparing it with the ASCII values
                upperCount++;
            }else if(Character.isLowerCase(str.charAt(i))){
                lowerCount++;
            }else if(Character.isDigit(str.charAt(i))){
                numberCount++;
            }else{
               otherCount++;
            }

        }
        System.out.println("The number of upper letters is: " + upperCount);
        System.out.println("The number of lower letters is: " + lowerCount);
        System.out.println("The number of numbers is: " + numberCount);
        System.out.println("The number of other letters is: " + otherCount);
    }
}
