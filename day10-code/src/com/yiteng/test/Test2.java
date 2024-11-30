package com.yiteng.test;
/*
* string A ='abcde'
* A rotation is A ='bcdea' every time rotate one char
* after few round, if A=B then true
 */
public class Test2 {
    public static void main(String[] args) {
        String a ="abcde";
        String b="cdeab";
        System.out.println(strCompare(a,b));
    }
    private static String strRotate(String str){
        String firstChar = str.substring(0,1);
        String restStr = str.substring(1);
        StringBuilder builder = new StringBuilder();
        builder.append(restStr).append(firstChar);
        System.out.println(builder.toString());
        return builder.toString();
    }
    private static boolean strCompare(String str1, String str2){
        boolean flag = false;
        for (int i = 0; i < str1.length(); i++) {
            str1 =strRotate(str1);
            if (str1.equals(str2)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
