package org.example.day18.확인문제;

import java.util.Random;
import java.util.stream.IntStream;

public class Q_HARD_3 {
    public static void main(String[] args) {
        /*
        ● 100개의 랜덤한 정수를 생성하여 데이터로 사용하세요.
        ● 이 정수들은 -100에서 100 사이의 값을 가진다.
        ● 이 정수들을 스트림으로 처리하여 다음 연산을 수행하세요.
        1. 양수만 필터링합니다.
        2. 각 수의 제곱값을 계산합니다.
        3. 제곱값이 1000을 초과하는 수만을 추출합니다.
        4. 최종적으로 추출된 수들의 평균값을 계산합니다.
         */
        Random random = new Random();

        int[] randomNumbers = random.ints(100, -100, 101).toArray();

        double average = IntStream.of(randomNumbers)
                .filter(num -> num > 0) // 1. 양수만 필터링
                .map(num -> num * num) // 2. 각 수의 제곱값 계산
                .filter(squaredNum -> squaredNum > 1000) // 3. 제곱값이 1000을 초과하는 수만 추출
                .average() // 평균값 계산
                .orElse(Double.NaN); // 값이 없을 경우 NaN 반환

        // 결과 출력
        if (Double.isNaN(average)) {
            System.out.println("양수의 제곱값 중 1000을 초과하는 값이 없습니다.");
        } else {
            System.out.println("추출된 수들의 평균값: " + average);
        }


    }
}
