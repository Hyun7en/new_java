package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        //1. 중복을 제거하여 프린트하시오.

        numbers.stream().distinct().forEach(System.out::println);

        List<String> strings = Arrays.asList("apple", "good", "grape", "ice", "melon");
        // 2. 5글자 이상 문자열만 필터링하여 목록을 생성 후 출력하시오.
        strings.stream().filter(x -> x.length() >= 5).forEach(System.out::println);
    }
}
