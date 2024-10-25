package org.example.day19.스트림;

import java.util.ArrayList;
import java.util.List;

public class 객체스트림만들기 {
    //컬렉션, 배열, 파일, 랜덤하게 만들 수도 있음.
    //1.컬렉션(list, set, map, queue)
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        //Stream<Integer>를 생성!
        //통로Stream[ Integer주소, Integer주소, Integer주소 ]
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
        list
                .stream()
                .map(x -> x + 100)
                .forEach(x -> System.out.println(x));

        System.out.println(
                list
                        .stream()
                        .map(x -> x + 100)
                        .mapToInt(Integer::intValue)
                        .sum()
        );
        //.mapToInt(Integer::intValue) ==>
        //.mapToInt(x -> Integer.intValue(x)) : intStream
    }


}