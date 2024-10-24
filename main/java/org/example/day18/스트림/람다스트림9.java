package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림9 {
    public static void main(String[] args) {
       //문자열 리스트에서 각 문자열의 길이를 출력하기
        List<String> words = Arrays.asList("java", "lambda", "stream", "example");

        words.stream().map(x -> x.length()).forEach(System.out::println);
        words.stream().map(String::length).forEach(System.out::println);

    }
}