package com.yiteng.test;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "321";

        // use ASCII change the string to a number 48-57
        int num1 = convertInt(s1);
        int num2 = convertInt(s2);
        //s1*s2
        int numMultiple = num1 * num2;
        System.out.println(numMultiple);
        String results = convertString(numMultiple);
        System.out.println(results);




    }
    private static int convertInt(String s) {
        char[] chars = s.toCharArray();
        int[] ints = new int[chars.length];
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
           ints[i] = (int) (chars[i]-48);
        }
        for (int i = 0; i < ints.length; i++) {
            num = num * 10 + ints[i];
        }
        return num;
    }
    private static String convertString(int num) {
        int temp = num;
        int temp2 = num;
        int count = 0;
        while(temp >0){
            temp = temp/10;
            count++;
        }
        System.out.println(count);
        int[] ints = new int[count];
        for (int i = 0; i < count; i++) {
            ints[i] = temp2%10;
            temp2 = temp2/10;
        }
        int[] reversed = new int[count];
        for (int i = 0; i < ints.length; i++) {
            reversed[count-i-1] = ints[i];

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < reversed.length; i++) {
            char c = (char)(reversed[i]+48);
            sb.append(c);

        }

        return sb.toString();
    }

}
