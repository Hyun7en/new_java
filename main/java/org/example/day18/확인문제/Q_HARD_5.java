package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q_HARD_5 {
    public static void main(String[] args) {

        /*
        ● 정수 리스트가 다음과 같이 주어졌을 때, 다음의 순서대로 처리하고 결과를 출력하세요.
        ● 스트림과 람다를 이용하세요.
        */
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        //1. 각 숫자에 3 을 곱한다.
        Stream<Integer> list = numbers.stream().map(x ->  x*3);
        //2. 그 결과에서 짝수만 필터링한다.
        list = list.filter(x -> x % 2==0);
        //3. 남은 숫자들을 각각의 숫자의 제곱근으로 변환한다.
        Stream<Double> list2  = list.map(Math::sqrt);
        //4. 변환된 수들을 내림차순으로 정렬한다.
        list2 = list2.sorted(Comparator.reverseOrder());
        //5. 최종 리스트에서 최대 5 개의 요소만을 포함하는 새로운 리스트를 반환한다.
        List<Double> result = list2.limit(5).collect(Collectors.toList());

        System.out.println(result);

    }
}
