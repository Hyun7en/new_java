package org.example.day19.스트림문제;

import java.util.ArrayList;
import java.util.List;

public class 스트림문제1 {
    public static void main(String[] args) {
        /*
        1. List<Double> list1 = new ArrayList<>();
   1000, 2000, 3000, 4000, 5000을 넣은 후
   list1을 stream에 넣어 각각 1000을 뺀 후
   전체 출력
         */
        List<Double> list1 = new ArrayList<>();
        list1.add(1000.0);
        list1.add(2000.0);
        list1.add(3000.0);
        list1.add(4000.0);
        list1.add(5000.0);
        list1.stream().map(x -> x -1000).forEach(System.out::println);


    }
}
