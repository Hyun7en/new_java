package org.example.day19.스트림문제;

import java.util.Arrays;

public class 스트림문제2 {
    public static void main(String[] args) {
        /*
        2. double[] list2 = {11.1, 22.2, 33.3, 44.4};
   list2를 stream에 넣어 각각 10을 더한 후
   전체를 합해서 출력
         */
        double[] list2 = {11.1, 22.2, 33.3, 44.4};

        double sum = Arrays.stream(list2).map(x -> x + 10).sum();
        System.out.println(sum);
    }
}
