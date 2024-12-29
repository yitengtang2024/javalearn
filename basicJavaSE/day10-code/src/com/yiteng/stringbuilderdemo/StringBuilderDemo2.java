package com.yiteng.stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        StringBuilder sb=new StringBuilder();
        sb = arrToString(sb, arr);
        //sb.toString();
        System.out.println(sb);
    }

    private static StringBuilder arrToString(StringBuilder sb, int[] arr) {
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(",");
            }

        }
        sb.append("]");
        return sb;
    }
}
