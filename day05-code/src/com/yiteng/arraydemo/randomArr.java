package com.yiteng.arraydemo;

import java.util.Random;

public class randomArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=arr[0];
        Random random=new Random();
        for(int i=arr.length-1;i>0;i--){
            int randomNum=random.nextInt(i+1);
            temp=arr[i];
            arr[i]=arr[randomNum];
            arr[randomNum]=temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
