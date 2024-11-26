package com.yiteng;
/*
*copy an element from arr1 to arr2
 */
public class copyToArry {
    public static void main(String[] args) {
        //define a old arr1
       int[] arr1={1,2,3,4,5};
        //defin a new arr2
        int[] arr2=new int[arr1.length];

        // read arr1 and get the element from arr1 and save to arr2
        for (int i =0; i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for(int i =0; i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
