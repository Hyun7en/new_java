package org.example.day11.스태틱static;

import java.text.DecimalFormat;

public class Test2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(123.1));   // 출력: 123.1
        System.out.println(df.format(123.12));  // 출력: 123.12
        System.out.println(df.format(123));     // 출력: 123
        System.out.println(df.format(0.5));     // 출력: 0.5
        System.out.println(df.format(0.123));   // 출력: 0.12

        System.out.println();
        //DecimalFormat df2 = new DecimalFormat("0.00");
        //0.50
        //0.12
        //0.12
        DecimalFormat df2 = new DecimalFormat("#.00");
        //.50
        //.12
        //.12
        System.out.println(df2.format(123.1));   // 출력: 123.10
        System.out.println(df2.format(-123.1));   // 출력: -123.10
        System.out.println(df2.format(123.12));  // 출력: 123.12
        System.out.println(df2.format(123));     // 출력: 123.00
        System.out.println(df2.format(0.5));     // 출력: 0.50
        System.out.println(df2.format(0.123));   // 출력: 0.12
        System.out.println(df2.format(0.123));   // 출력: 0.12
    }
}