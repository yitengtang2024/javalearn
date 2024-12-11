package com.yiteng.regularExpression;
  /*
            需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
            来黑马程序员学习Java，
            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，
            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，
            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090

            手机号的正则表达式:1[3-9]\d{9}
            邮箱的正则表达式:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}座机电话的正则表达式:θ\d{2,3}-?[1-9]\d{4,9}
            热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}

        */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strCrawlerPractice {
    public static void main(String[] args) {
        String s = "来黑马程序员学习Java，" +
                "电话:18512516758，18512508907" + "或者联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" + "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";

        Pattern cellphoneNumber = Pattern.compile("1\\d{10}");
        Pattern email = Pattern.compile("\\w+@\\w+.\\w{2,}");
        Pattern phone = Pattern.compile("010-?\\d{8}");
        Pattern hotPhone = Pattern.compile("400-?618-?\\d{4}");

        Matcher cellphoneNumberMatcher = cellphoneNumber.matcher(s);
        Matcher emailMatcher = email.matcher(s);
        Matcher phoneMatcher = phone.matcher(s);
        Matcher hotPhoneMatcher = hotPhone.matcher(s);

        while (cellphoneNumberMatcher.find()) {
            System.out.println("cell phone: "+cellphoneNumberMatcher.group());
        }

        while (emailMatcher.find()) {
            System.out.println("email: "+emailMatcher.group());
        }
        while (phoneMatcher.find()) {
            System.out.println("phone number: "+phoneMatcher.group());
        }
        while (hotPhoneMatcher.find()) {
            System.out.println("hotPhone number: "+hotPhoneMatcher.group());
        }
    }

}
