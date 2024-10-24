package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림5 {
    public static void main(String[] args) {
//        리스트에서 음수 숫자만 필터링하여 출력하기
        List<Integer> numbers = Arrays.asList(-3, 5, -1, 7, -8, 2);

        numbers.stream().filter(x -> x<0).forEach(System.out::println);

    }
}