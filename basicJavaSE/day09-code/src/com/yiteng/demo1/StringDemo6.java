package com.yiteng.demo1;

import java.sql.SQLOutput;

/*
*read the chinese ID number
* display:
* D.O.B.: YEAR-MONTH-DAY
* GENDER: F/M
 */
public class StringDemo6 {
    public static void main(String[] args) {
        String id="450111197205054878";

        String dob = id.substring(6,14);
        String year = dob.substring(0,4);
        String month = dob.substring(4,6);
        String day= dob.substring(6);
        String gender = id.substring(16,17);// id.charAt(16) single char
        String genderS="";
        String displayDOB = year+"-"+month+"-"+day;
        int genderInt = Integer.parseInt(gender);
        if(genderInt%2 == 0){
            genderS = "M";
        }else{
            genderS = "F";
        }
        System.out.println(displayDOB);
        System.out.println(genderS);
    }
}
