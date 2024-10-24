package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        //다음을 람다와 스트림을 이용하여 해결하시오.
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
//        ● 3보다 큰 수들을 필터링한 후,
//        ● 중복을 제거하여 목록을 출력하시오.
         List<Integer> list = Arrays.stream(arr).filter(x -> x > 3).distinct().boxed().collect(Collectors.toList());
        System.out.println(list);

        double[] arr2 = {5.0, 3.0, 1.0, 33.0, 35.0};
//         ● 모두 더한 수를 출력하시오.
        double list2 = Arrays.stream(arr2).sum();
        System.out.println(list2);

        String[] arr3 = {"정신과", "내과", "신경과", "정형외과"};
//         ● 모든 요소에 “사무실”을 뒤에 붙인 후,
//         ● 목록을 출력하시오.
        List<String> list3 = Arrays.stream(arr3).map(x -> x + "사무실").collect(Collectors.toList());
        System.out.println(list3);
    }
}
