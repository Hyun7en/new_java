package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림3 {
    public static void main(String[] args) {
        //문자열 리스트에서 길이가 3 이상인 문자열만 필터링하기
        List<String> words = Arrays.asList("hi", "hello", "sun", "sky", "sea");

        words.stream().filter(x -> x.length() >= 3).forEach(System.out::println);



    }
}