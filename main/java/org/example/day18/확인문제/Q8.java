package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {
        //다음을 람다와 스트림을 이용하여 해결하시오.
        //1. int[] arr = {1, 2, 3, 4, 5}; 홀수만 필터링하여 합을 구한 후, 출력하시오.
        int[] arr = {1, 2, 3, 4, 5};
        int a =  Arrays.stream(arr).filter(x -> x%2==1).sum();
        System.out.println(a);

        //2. int[] arr2 = {5, 3, 10, 40, 2}; 가장 큰 값을 구한 후, 출력하시오.
        int[] arr2 = {5, 3, 10, 40, 2};
        Arrays.stream(arr2).max().ifPresent(x -> System.out.println(x));

        //3. int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10}; 5보다 큰 수들을 필터링하여 중복을 제거한 후, 목록을 출력하시오.
        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        List<Integer> list = Arrays.stream(arr3).filter(x -> x > 5).distinct().boxed().collect(Collectors.toList());
        System.out.println(list);
    }
}
