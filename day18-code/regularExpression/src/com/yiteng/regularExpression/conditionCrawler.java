package com.yiteng.regularExpression;

import org.w3c.dom.ls.LSOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class conditionCrawler {
    /*
           有如下文本，按要求爬取数据。
               Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
               因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


           需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
           需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
           需求3:爬取除了版本号为8，11.17的Java文本，
       */
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p = Pattern.compile("(Java)\\d{0,2}");
        Matcher m = p.matcher(s);
        System.out.println("only Java print out");
        while (m.find()) {
            System.out.println(m.group(1));
        }

        Pattern p1 = Pattern.compile("(Java)(\\d{1,2})");
        Matcher m1 = p1.matcher(s);
        System.out.println("only Number print out");
        while (m1.find()) {
            System.out.println(m1.group(2));
        }

        Pattern p2 = Pattern.compile("(Java)(?=8|11|17)");//Java with a version 8 11 or 17
        Matcher m2 = p2.matcher(s);
        System.out.println("only Java8 print out");
        while (m2.find()) {
            System.out.println(m2.group(1));
        }

        Pattern p3 = Pattern.compile("Java(?=\\d)");//match Java fellowed with number, ?= positive lookahead
        Matcher m3 = p3.matcher(s);
        System.out.println("only Java with version print out");
        while (m3.find()) {
            System.out.println(m3.group());
        }
        Pattern p4 = Pattern.compile("Java(?!\\d)");// match only Java without number, ?! negative lookahead
        Matcher m4 = p4.matcher(s);
        System.out.println("only Java without version print out");
        while (m4.find()) {
            System.out.println(m4.group());
        }

        Pattern p5 = Pattern.compile("((?i)Java)(?:8|11|17)");
        Matcher m5 = p5.matcher(s);
        System.out.println("only Java with 8|11|17 print out");
        while (m5.find()) {
            System.out.println(m5.group());
        }
    }



}
