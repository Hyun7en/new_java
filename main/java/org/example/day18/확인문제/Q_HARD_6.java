package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_HARD_6 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig");

        // 1. 문자열 길이가 5 이상인 것들만 필터링한다.
        Map<Character, Long> result = words.stream()
                .filter(word -> word.length() >= 5)               // 길이 5 이상 필터링
                .map(String::toLowerCase)                         // 소문자로 변환
                .collect(Collectors.groupingBy(
                        word -> word.charAt(0),                       // 첫 글자로 그룹화
                        Collectors.counting()                         // 각 그룹의 개수 계산
                ));

        // 5. 글자 순으로 정렬하고 출력
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())               // 키(첫 글자)로 정렬
                .forEach(System.out::println);                    // 출력
    }
}
