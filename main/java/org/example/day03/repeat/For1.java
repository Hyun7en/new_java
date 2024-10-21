package org.example.day03.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        //3번 환영합니다. 출력
        for(int i=0; i < 3; i++){
            System.out.println("환영합니다");
        }

        //숫자를 100부터 200까지 출력
        for(int i=1; i <= 100; i++){
            System.out.println(i);
        }

        //Random한 정수값 5개 출력(범위는 0~99)
        Random r = new Random();
        for (int i = 0; i < 5; i++) { //0,1,2,3,4
            int num = r.nextInt(100);
            System.out.println(num);
        }

    }
}
