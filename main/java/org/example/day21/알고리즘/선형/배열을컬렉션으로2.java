package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로2 {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3, 4, 5};
//        1. x배열의 원소에 10을 곱해서 역순으로 정렬하여 프린트
//                (1번 방법으로)
//        1-1. x배열의 원소를 하나씩 꺼내서 10을 곱한 후
//        list에 모으세요.
        List<Integer> list = new ArrayList<>();
        for (int one: x){
            list.add(one * 10);
        }
        Collections.reverse(list);
        System.out.println(list);

//        1-2. Collections.reverse()로 역순으로 정렬
//        1-3. 프린트

//        2. x배열의 원소에 뒤에 6, 7을 각각 추가하여 목록을 프린트
//                (3번 방법으로)
//        2-1. x배열로 list를 생성
//        2-2. 6과 7을 추가후 목록 프린트
        List<Integer> list2 = new ArrayList<>(Arrays.asList(x));
        list2.add(6);
        list2.add(7);
        System.out.println(list2);
    }
}
