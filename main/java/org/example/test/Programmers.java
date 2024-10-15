package org.example.test;

import java.util.Arrays;

public class Programmers {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};

        // arr의 1번 인덱스부터 끝까지 복사
        int[] arr2 = Arrays.copyOfRange(arr, 1, arr.length);
        // arr의 0번 인덱스부터 1개만 복사
        int[] arr3 = Arrays.copyOfRange(arr, 0, 1);

        // answer 배열 초기화: arr2와 arr3의 길이를 더한 크기로
        int[] answer = new int[arr2.length + arr3.length];

        // arr2의 요소를 answer에 추가
        for (int i = 0; i < arr2.length; i++) {
            answer[i] = arr2[i];
        }

        // arr3의 요소를 answer에 추가
        for (int i = 0; i < arr3.length; i++) {
            answer[arr2.length + i] = arr3[i];
        }

        // 결과 출력
        System.out.println(Arrays.toString(answer));
    }
}
