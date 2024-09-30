package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열로또 {
    public static void main(String[] args) {
        int[] lotto = new int[1000];
        //랜덤한 값(시드값 42) 1000개를 만들어서 넣으세요.
        //범위는 1부터 45까지
        Random r = new Random(42);
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45) + 1; //0~44 ==> 1 ~ 45
        }
        System.out.println(Arrays.toString(lotto)); //==> print(lotto);
        //카운트 누적 변수
        //패턴3번
        int count = 0;
        for (int x : lotto) {
            //조건문
            if(x >= 15) {
                count = count + 1; //count++;
            }
        }
        System.out.println(count);
    }
}
