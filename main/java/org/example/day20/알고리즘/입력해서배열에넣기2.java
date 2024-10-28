package org.example.day20.알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 입력해서배열에넣기2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); //0 ~ 99
        }

        System.out.println(Arrays.toString(numbers));
    }
}
