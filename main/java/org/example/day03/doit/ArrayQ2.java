package org.example.day03.doit;

import java.util.Arrays;
import java.util.Random;

public class ArrayQ2 {
    public static void main(String[] args) {
        /*
        다음의 순서대로 프로그래밍하시오.

        1. 두 개의 정수 배열을 생성하여 각각 출력
            첫 번째 배열은 1에서 50 사이의 랜덤 값 10개
            두 번째 배열은 51에서 100 사이의 랜덤 값 10개
        2. 첫 번째 배열과 두 번째 배열을 각각 오름차순으로 정렬
        3. 두 배열에서 각각 가장 큰 값들을 더한 결과값 출력
        4. 두 배열에서 각각 가장 작은 값들을 더한 결과값 출력

         */

        // 1. 두 개의 정수 배열 생성
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Random random = new Random();

        // 첫 번째 배열: 1에서 50 사이의 랜덤 값 10개
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(50) + 1;
        }

        // 두 번째 배열: 51에서 100 사이의 랜덤 값 10개
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(50) + 51;
        }

        // 배열 출력
        System.out.println("첫 번째 배열: " + Arrays.toString(array1));
        System.out.println("두 번째 배열: " + Arrays.toString(array2));

        // 2. 오름차순으로 정렬
        Arrays.sort(array1);
        Arrays.sort(array2);

        // 정렬된 배열 출력
        System.out.println("정렬된 첫 번째 배열: " + Arrays.toString(array1));
        System.out.println("정렬된 두 번째 배열: " + Arrays.toString(array2));

        // 3. 가장 큰 값들의 합
        int maxSum = array1[array1.length - 1] + array2[array2.length - 1];
        System.out.println("가장 큰 값들의 합: " + maxSum);

        // 4. 가장 작은 값들의 합
        int minSum = array1[0] + array2[0];
        System.out.println("가장 작은 값들의 합: " + minSum);

    }
}
