package com.yiteng.demo1;
/*
* convert a number to Chinese number
 */
import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        while (true) {
            System.out.println("Please input a number: ");
            money = scanner.nextInt();
            if(money >=0 && money <9999999){
                break;
            }else{
                System.out.println("The number is not valid!");
            }


        }
        //String capitalnumber = getCapitalNumber(money);
        //System.out.println(capitalnumber);
        int length = getMoneyLength(money);
        //System.out.println(length);
        int[] moneyArry = getMoneyArray(money);
//        for (int i : moneyArry) {
//            System.out.print(i);
//
//        }
        String[] capitalMoneyArray = getCapitalNumberArray(moneyArry);
        String results = moneyToString(capitalMoneyArray);
        System.out.println(results);


    }
    //define a method that convert the int to be a chinese letter
    private static String getCapitalNumber(int number) {
        String[] arr ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾","佰","仟","萬"};
        return arr[number];
    }
    private static int getMoneyLength(int money) {
        int count = 0;
        int temp= money;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        return count;
    }
    private static int[] getMoneyArray(int money) {
        int[] arr = new int[7];
        int temp = money;
        for (int i = 6; i >=0; i--) {
            arr[i] = temp%10;
            temp = temp/10;

        }
       return arr;
    }
    private static String[] getCapitalNumberArray(int[] money) {
        String[] arr = new String[7];
        for (int i = 6; i >=0; i--) {
            String capitalnumber = getCapitalNumber(money[i]);
            arr[i] = capitalnumber;

        }
        return arr;

    }
    private static String moneyToString (String[] moneyArr){
        String[] arr ={"拾","佰","仟","萬"};
        return moneyArr[0]+arr[1]+moneyArr[1]+arr[0]+moneyArr[2]+arr[3]+
                moneyArr[3]+arr[2]+moneyArr[4]+arr[1]+moneyArr[5]+arr[0]+
                moneyArr[6]+"YUAN";
    }
}
