package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 1. 3초과인 데이터 들만 모은 list를 생성해 출력하세요.
        List<Integer> list =  numbers.stream().filter(x -> x > 3).collect(Collectors.toList());

        // 2. 각 요소에 대해 10을 곱한 후 list를 생성해 출력하세요.
        List<Integer> list2 = numbers.stream().map(x -> x * 10).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }
}
