package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");
        //1. 각 요소를 모두 대문자로 변경한 후, 글자 수가 4를 초과하는 데이터들의 list를 생성해 출력하세요.
        List<String> list = words.stream().map(x -> x.toUpperCase()).filter(x -> x.length() > 4).collect(Collectors.toList());
        //2. 각 요소에 대해 “님"을 붙인 후, list를 생성해 출력하세요.
        List<String> list2 = words.stream().map(x -> x + "님").collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }
}
