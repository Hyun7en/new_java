package org.example.test;

import java.util.StringTokenizer;

public class Programmers {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        for(int i = 4; i <= n; i ++){
            int divisor = 0;
            for(int j = 1; j <= i; j ++){

                if(i%j == 0){
                    divisor++;
                }
                if(divisor >= 3){
                    answer++;
                    break;
                }
            }

        }

        System.out.println(answer);

    }
}

