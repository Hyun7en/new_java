package org.example.test;


import java.util.Arrays;

public class Programmers {
    public static void main(String[] args) {

        int k = 3;
        int num = 13445;
        int answer = 0;
        String a = num + "";

        for(int i =0; i < a.length(); i++){
            if(a.charAt(i) == k){
                answer = i+1;
            }
        }

        System.out.println(answer);
    }
}
