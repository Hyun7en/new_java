package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class 람다스트림2 {
    public static void main(String[] args) {
        //배열에 있는 데이터를 바로 List에 넣을 수 있음
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        arr.stream().filter(x -> x%2==0).forEach(System.out::println);



    }
}