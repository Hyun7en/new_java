package org.example.day10.정규표현식;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aa\\-"); //aa다음에 무조건 -
        Matcher m = p.matcher("aa-"); //true
        Matcher m1 = p.matcher("aa~"); //false
        System.out.println(m.find());
        System.out.println(m1.find());

        Pattern p2 = Pattern.compile("aa-");
        Matcher m2 = p2.matcher("aa-"); //true
        Matcher m22 = p2.matcher("aa~"); //false
        System.out.println(m2.find());
        System.out.println(m22.find());

        Pattern p3 = Pattern.compile("aa\\.");//aa다음에 무조건 .
        Matcher m3 = p3.matcher("aa."); //true
        Matcher m33 = p3.matcher("aa~"); //false
        System.out.println(m3.find());
        System.out.println(m33.find());

        Pattern p4 = Pattern.compile("aa."); //aa다음에 어떤 문자가 와도 됨.
        //.포함
        Matcher m4 = p4.matcher("aa."); //true
        Matcher m44 = p4.matcher("aa~"); //true
        System.out.println(m4.find());
        System.out.println(m44.find());
    }
}