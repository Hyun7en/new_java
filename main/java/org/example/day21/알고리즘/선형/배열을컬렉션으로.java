package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열을컬렉션으로 {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c"};
        //배열을 리스트로 변경하는 방법
        //1. 리스트만들어서 배열--> 리스트로 옮긴다.
        List<String> list1 = new ArrayList<>();
        for (String x: s){
            list1.add(x);
        }
        System.out.println(list1);

        //2. 배열을 바로 list로 만든다. asList()
        List<String> list2 = Arrays.asList(s);
        System.out.println(list2);
        //list2.add("추가");
        //list2.remove(0);
        //--> 길이 조정 불가능!
        list2.set(0, "바꾸는 스트링");
        //--> 값은 변경 가능!
        System.out.println(list2);

        //3. 가변이 가능한 list로 만들고 싶은 경우
        //  -->배열 데이터를 가지고 새로운 리스트로 만들기
        List<String> list3
                = new ArrayList<>(Arrays.asList(s));
        list3.add("새로운 리스트");
        System.out.println(list3);
    }

}
