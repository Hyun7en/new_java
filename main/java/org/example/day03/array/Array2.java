package org.example.day03.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리 가족 정보를 배열에 넣어보자.
        //5명, 이름, 나이, 키, 성별, 아침밥여부
        String[] names = {"홍길동", "김길동", "박길동", "정길동", "이길동"};
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // System.out.println(names[2]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //for-each
        for(String s : names){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(names));

        System.out.println(names.length);
        //이름, 나이, 키, 성별, 아침밥여부
        int[] ages = {100, 80, 50, 33, 10};
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        //for-each
        for(int x : ages){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(ages));

        double[] h = {199.9, 188.8, 177.7, 166.6, 155.5};
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i]);
        }
        for (double x : h) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(h));

        char[] gender = {'남', '여', '남', '여', '남'};
        for (int i = 0; i < gender.length; i++) {
            System.out.println(gender[i]);
        }
        for (char x : gender) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(gender));


        boolean[] food = {true, true, false, true, false};
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
        for (boolean x : food) {
            System.out.println(x);
        }
        System.out.println(Arrays.toString(food));
    }
}
