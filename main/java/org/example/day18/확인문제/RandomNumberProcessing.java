package org.example.day18.확인문제;

import java.util.*;
import java.util.stream.Collectors;

public class RandomNumberProcessing {
    public static void main(String[] args) {
        // 1. 랜덤한 정수 배열 생성
        Random random = new Random();
        int[] randomNumbers = random.ints(500, -200, 201).toArray();

        // 2. 0 이상의 짝수만 필터링
        List<Integer> filteredNumbers = Arrays.stream(randomNumbers)
                .filter(x -> x >= 0 && x % 2 == 0)
                .boxed() // int를 Integer로 변환
                .collect(Collectors.toList());

        // 3. 제곱근을 기준으로 그룹화
        Map<Double, List<Integer>> groupedBySqrt = filteredNumbers.stream()
                .collect(Collectors.groupingBy(num -> Math.sqrt(num)));

        System.out.println(groupedBySqrt);

        // 4. 각 그룹의 원래 숫자들의 합 계산
        Map<Double, Integer> sumByGroup = new HashMap<>();
        for (Map.Entry<Double, List<Integer>> entry : groupedBySqrt.entrySet()) {
            double sqrtValue = entry.getKey();
            List<Integer> group = entry.getValue();
            int sum = group.stream().mapToInt(Integer::intValue).sum();
            sumByGroup.put(sqrtValue, sum);
        }

        // 5. 합이 가장 큰 값 찾기
        Optional<Map.Entry<Double, Integer>> maxEntry = sumByGroup.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        // 6. 결과 출력
        if (maxEntry.isPresent()) {
            System.out.println("가장 큰 합: " + maxEntry.get().getValue());
            System.out.println("해당 그룹에 속한 숫자들: " + groupedBySqrt.get(maxEntry.get().getKey()));
        } else {
            System.out.println("그룹이 존재하지 않습니다.");
        }
    }
}


