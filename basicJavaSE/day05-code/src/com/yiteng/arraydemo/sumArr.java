package com.yiteng.arraydemo;
import java.util.Random;

class sumArr {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random random = new Random();
        int sum = 0;
        int count=0; //number of int in arr below the average
        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(101);//1-100 random int
        }
        System.out.println("the arr is ");
        for(int num : arr){
            System.out.print(num+ ",");
        }
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        System.out.println("the sum is "+sum);
        int average = sum/arr.length;
        for(int num : arr){
            if(num<average){
                count++;
            }
        }
        System.out.println("the average is "+average);
        System.out.println("the count is "+count);
    }
}
