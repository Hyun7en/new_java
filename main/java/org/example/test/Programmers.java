package org.example.test;



public class Programmers {
    public static void main(String[] args) {
        int n = 144;

        int answer = 0;

        double sqrt = Math.sqrt(n);
        if (sqrt == Math.floor(sqrt)) {
            answer =  1; // 제곱수인 경우
        } else {
            answer =  2; // 제곱수가 아닌 경우
        }

        System.out.println(Math.floor(sqrt));

    }
}
