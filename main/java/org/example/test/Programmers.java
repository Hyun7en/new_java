package org.example.test;


import java.util.Arrays;
import java.util.StringTokenizer;

public class Programmers {
    public static void main(String[] args) {

        int k = 3;
        int num = 13445;
        int answer = -1;  // 값이 없을 경우를 대비해 -1로 초기화
        String a = String.valueOf(k);  // k를 문자열로 변환
        String a1 = String.valueOf(num);  // num을 문자열로 변환

        answer = a1.indexOf(a);

        System.out.println(answer + 1);

    }
}

