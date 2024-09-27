package org.example.day3.repeat;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        //의사 임시값!
        Random r = new Random(100); // 임의의값을 만들어주는 클래스
        r.setSeed(100); //시드값, 씨앗값

        for(int i = 0; i < 100; i++) {
            int num = r.nextInt(100); //  +-21억 ==> 0 ~ 99
            int num2 = r.nextInt(100) + 1; // == > 1~100

            System.out.println(num);
            System.out.println(num2);
        }

    }
}
