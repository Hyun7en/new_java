package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림6 {
    public static void main(String[] args) {
        //리스트에서 각 문자열의 첫 글자만 추출하여 출력하기
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

//        words.stream().map(x -> x.charAt(0)).forEach(System.out::println);
        words.stream().map(x -> x.substring(0,1)).forEach(System.out::println);


    }
}