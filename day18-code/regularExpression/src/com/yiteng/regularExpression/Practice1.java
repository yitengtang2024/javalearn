package com.yiteng.regularExpression;
/*
*1st check a cellphone number is fit with standard
* 2nd check a Email address is correct format
* 3rd check home phone number check
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Practice1 {
    public static void main(String[] args) {
        String cellphonePattern = "^[1-9][0-9]{2}-[0-9]{3}-[0-9]{4}";//^ matching from start of the string, if no ^, it will match the pattern anyweher
        String cellphonePattern2 ="[1-9][0-9]{2}-?[0-9]{3}-?[0-9]{4}";//? indiciate exist or not
        String cellphonePattern1 = "[1-9][0-9]{2}-[0-9]{3}-[0-9]{4}";//^ matching from start of the string, if no ^, it will match the pattern anyweher
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9]+{2,}$";

        String simplePattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";


        System.out.println("419-819-5566".matches(cellphonePattern));//true
        System.out.println("4198195566".matches(cellphonePattern));//false
        System.out.println("4198195566".matches(cellphonePattern2));//true
        System.out.println("abc419-819-5566".matches(cellphonePattern1));//false this will auto add ^ and $(end sign)
        //to match anywhere
        Pattern pattern = Pattern.compile(cellphonePattern1);
        Matcher matcher = pattern.matcher("abc419-819-5566");
        System.out.println(matcher.find());//true
        System.out.println("t313921915@hotmail.com".matches(emailPattern));//true

    }

}
