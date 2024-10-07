package org.example.test;

public class Programmers {
    public static void main(String[] args) {

        int answer = 0;
        int k = 2;
        for(int i = 0; i < 10; i ++){
            if((i + "").equals(k + "")){
                answer++;
            };
        }

        System.out.println(answer);
    }
}

