package com.yiteng;
/*
*for a digi pass word to encrypt
* 1st every digit plus 5
* 2nd % every digit
* 3rd revers every digit
* So far I cannot solve the 0 issue, as and int, it cannot display the 0 at the first char
* it is maybe better use String to save the password
 */

import java.util.Scanner;

public class passEncrypt {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please input your pass word");
        int n = sc.nextInt();
        int count = getCount(n);
        int[] passwordArr = getDigits(n,count);
        printArray(passwordArr);
       int newpassword = encrypt(passwordArr, count);
        System.out.println(newpassword);
        //decode the password
        int[] decodepass= getDigits(newpassword,count);
        System.out.println();
        printArray(decodepass);
        decodepass = decrypt(decodepass, count);
        System.out.println();
        printArray(decodepass);
    }
    // COUNT THE number of didgit in a pass word
    public static int getCount(int n){
        int temp = n;
        int count = 0;
        while (temp>0){
            temp = temp/10;
            count++;
        }
        return count;
    }
    // put every digit in an arry
    public static int[] getDigits(int n, int count) {
        int temp = n;
        int[] digits = new int[count];
        while (temp >0){
            digits[count-1] = temp%10;
            temp = temp/10;
            count--;
        }
        return digits;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // every digit plus 5
    public static int encrypt(int[] passwordArr, int count){
        // every digit plus 5
        // every digit %
        int numberofcycle = count/2;
        for (int i = 0; i < passwordArr.length; i++) {
            passwordArr[i] = (passwordArr[i] + 5)%10;
        }
        System.out.println("password +5 % is");
        printArray(passwordArr);
        // every digit reverse
        /*int temp = passwordArr[0];
        for (int i = 0; i < numberofcycle; i++) {
            temp = passwordArr[i];
            passwordArr[i] = passwordArr[passwordArr.length -i-1];
            passwordArr[passwordArr.length -i-1] = temp;
        }*/
        passwordArr =reverseArray(passwordArr, count);
        System.out.println("password reverse is");
        printArray(passwordArr);


        int newpassword = passwordArr[0];
        for (int i = 1; i < passwordArr.length; i++) {
            newpassword = newpassword*10 + passwordArr[i];

        }
        return newpassword;
    }
    // reverse and arry
    public static int[] reverseArray(int[] arr, int count) {
        // every digit reverse
        int numberofcycle = count/2;
        int temp = arr[0];
        for (int i = 0; i < numberofcycle; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length -i-1];
            arr[arr.length -i-1] = temp;
        }
        return arr;
    }

   //decode the pass word
   public static int[] decrypt(int[] passwordArr, int count){
        int[] decodepassword = new int[count];
       for (int i = 0; i <passwordArr.length ; i++) {
           if (passwordArr[i]>=6 && passwordArr[i]<=9){
               decodepassword[i] = passwordArr[i]-5;
           }else if(passwordArr[i]>=0 && passwordArr[i]<=4){
               decodepassword[i] = passwordArr[i]+5;
           }

       }
       decodepassword = reverseArray(decodepassword, count);
       return decodepassword;
   }
}
