package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 셋Set {
    public static void main(String[] args) {
        //로또 중복되지 않은 값 6개, 랜덤하게.
        Random r = new Random();
        HashSet lotto = new HashSet();
        System.out.println(r.nextInt(45) + 1); // 1 ~ 45

        while (lotto.size() < 6) {
            int data = r.nextInt(45) + 1;
            lotto.add(data);
        }

        System.out.println(lotto);
    }
}
