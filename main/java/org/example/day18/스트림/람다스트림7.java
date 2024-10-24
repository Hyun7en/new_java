package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림7 {
    public static void main(String[] args) {
        //숫자 리스트에서 홀수 숫자의 제곱을 구하여 출력하기
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numbers.stream().filter(x -> x%2==1).map(x -> x*x).forEach(System.out::println);

    }
}