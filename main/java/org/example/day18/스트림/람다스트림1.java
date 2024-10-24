package org.example.day18.스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class 람다스트림1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("홍길동");
        names.add("김길동");
        names.add("송길동");
        names.add("정길동");
        names.add("이길동");

       List result =  names.stream().filter(x -> x.startsWith("홍")).collect(Collectors.toList());
        System.out.println(result);

    }
}