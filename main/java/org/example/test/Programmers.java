package org.example.test;


import java.util.Arrays;

public class Programmers {
    public static void main(String[] args) {
        int[] answer = {};
        int n = 12345;
        String str = Integer.toString(n);
        answer = new int[str.length()];
        int i = 0;
        while(n > 0){
            answer[i++] = n%10;
            n = n/10;

        }


        //end
    }



}





