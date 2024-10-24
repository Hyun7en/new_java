package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        //● 한 글자인 요소들을 필터링한 후,
        //● 목록을 생성 후 출력
         List<String> list = strings.stream().filter(x -> x.length() > 1).collect(Collectors.toList());

        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        //● jpeg으로 끝나는 요소들을 필터링한 후,
        //● 목록을 생성 후 출력하시오.
        List<String> list2 = images.stream().filter(x -> x.contains("jpeg")).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }
}
