package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림4 {
    public static void main(String[] args) {
        //숫자 리스트에서 각 숫자에 2를 곱한 후 출력하기
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().map(x -> x*2).forEach(System.out::println);


    }
}