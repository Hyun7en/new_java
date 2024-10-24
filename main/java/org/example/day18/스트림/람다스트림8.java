package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림8 {
    public static void main(String[] args) {
       //문자열 리스트에서 'a'를 포함하는 문자열만 필터링하여 출력하기
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        words.stream().filter(x -> x.contains("a")).forEach(System.out::println);

    }
}