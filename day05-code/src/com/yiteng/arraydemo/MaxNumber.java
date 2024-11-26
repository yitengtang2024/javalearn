package com.yiteng.arraydemo;

class MaxNumber {
    public static void main(String[] args) {
        int [] arr={33,5,22,44,55,100};
        int temp = arr[0];
        for(int num:arr){
            if (num>temp){
                temp=num;
            }
        }
        System.out.println("max num is "+temp);
    }



}
