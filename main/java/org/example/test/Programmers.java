package org.example.test;


import java.util.Arrays;

public class Programmers {
    public static void main(String[] args) {

        String a = "hello";
        String b = "";
        int num1 = 1,num2 =2;
        for(int i = 0; i < a.length(); i++) {
            if( i == num1){
                b+=a.charAt(num2);
                continue;
            }else if( i == num2){
                b+=a.charAt(num1);
                continue;
            }
            b += a.charAt(i);
        }


        System.out.println(b);
    }
}
