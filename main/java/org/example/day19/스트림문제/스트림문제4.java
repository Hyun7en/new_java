package org.example.day19.스트림문제;

import java.util.Random;
import java.util.stream.IntStream;

public class 스트림문제4 {
    public static void main(String[] args) {
        /*
        4. 랜덤한 정수 값 100개, 3500부터 4000까지 만들어 stream에 넣어
   중복 제거후 오름차순으로 정렬 후 출력
         */
        Random random = new Random();
        IntStream is = random.ints(100,3500,4000);
        is.distinct().sorted().forEach(System.out::println);
    }
}
