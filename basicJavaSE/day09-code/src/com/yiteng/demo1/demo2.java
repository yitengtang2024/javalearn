package com.yiteng.demo1;

/*
* input an int[] arr ={1,2,3}
* output an String [1,2,3]
 */
public class demo2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        char[] chars= new char[arr.length*2+1];
        chars[0]='[';
        chars[chars.length-1]=']';

        int index = 1;
        int commaIndex = 2;

        for (int i=0;i<arr.length;i++){
            String num = String.valueOf(arr[i]);
            chars[index]=num.charAt(0);
            if (index<(chars.length-2)){
                chars[commaIndex]=',';
                commaIndex+=2;
                index+=2;
            }
        }
        for (int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.println();
        String str = new String(chars);
        System.out.println(str);


    }
}
