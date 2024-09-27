package org.example.test;


import java.util.StringTokenizer;

public class Programmers {
    public static void main(String[] args) {
        String a= "a1da35";

        StringTokenizer st = new StringTokenizer(a);

        for(int i = 0; i < a.length(); i++){
            System.out.println(st.nextToken());
        }

    }
}
