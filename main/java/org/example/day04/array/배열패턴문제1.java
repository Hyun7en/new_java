package org.example.day04.array;

import java.util.Random;

public class 배열패턴문제1 {
    public static void main(String[] args) {
        // 1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        // 1-1. length가 10인 int배열 생성
        int[] arr = new int[10];

        // 1-2. Random을 이용하여 값을 넣기(범위 1~100, r.nextInt(100) + 1)
        Random r = new Random(55); // Random의 씨앗값(seed)는 55
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1; // 1부터 100까지의 값
        }

        // 1-3. 생성된 배열 요소 전체 출력
        System.out.print("생성된 배열: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // 줄바꿈

        // 2. 배열에 있는 값을 꺼내어 누적
        // 2-1. 감소하여 누적하는 변수 minus선언하여 초기화
        int minus = 0;

        // 2-2. 배열에 있는 값을 꺼내어 계속 감소
        for (int num : arr) {
            minus -= num; // 누적 감소
        }

        // 2-3. minus값 출력
        System.out.println("누적 감소 값: " + minus);

        // 3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        // 3-1. 더해서 누적하는 함수 sum선언하여 초기화
        int sum = 0;

        // 3-2. 배열에 있는 값 중 50보다 큰 것만 누적
        for (int num : arr) {
            if (num > 50) {
                sum += num; // 조건에 맞는 값만 누적
            }
        }

        // 3-3. sum값 출력
        System.out.println("50보다 큰 값의 누적 합: " + sum);

        // 4. 배열에 있는 값을 가지고 위치를 찾는 경우
        // 4-1. 배열내에 80보다 큰 값의 위치를 맨 앞부터 하나만 찾아 위치 프린트
        boolean found = false; // 찾았는지 여부를 표시
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 80) {
                System.out.println("80보다 큰 값의 위치: " + i);
                found = true; // 값을 찾았으므로 true로 설정
                break; // 반복문 종료
            }
        }

        // 4-2. 값이 없을 경우
        if (!found) {
            System.out.println("80보다 큰 값이 없습니다.");
        }
    }
}
