package org.example.day10.정규표현식;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규표현식01 {
    public static void main(String[] args) {
        String pt = "^[a-zA-Z]*$";
        System.out.println(Pattern.matches(pt,"abcaa"));
        System.out.println(Pattern.matches(pt,"123"));
        System.out.println(Pattern.matches(pt,""));
        System.out.println();

        Pattern p = Pattern.compile("^[a-zA-Z]*$");
        Matcher m = p.matcher("abcaa");
        System.out.println(m);
        System.out.println(m.find());


    }

}
