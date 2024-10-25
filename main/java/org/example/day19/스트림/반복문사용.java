package org.example.day19.스트림;

import java.util.Arrays;

public class 반복문사용 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        Arrays.stream(intArr).filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("=========================================================");

        int sum = Arrays.stream(intArr).filter(x -> x % 2 == 0).peek(x -> System.out.println(x)).sum();
        System.out.println(sum);

    }
}
