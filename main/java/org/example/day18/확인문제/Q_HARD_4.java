package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Q_HARD_4 {
    public static void main(String[] args) {
        /*
         주어진 500개의 랜덤한 정수 배열에서 다음 작업을 수행하시오.
        1. 랜덤한 정수는 -200에서 200 사이의 값으로 구성됩니다.
        2. 배열에서 0 이상의 짝수만을 필터링합니다.
        3. 필터링된 결과에서 각 숫자의 제곱근을 구합니다.
        4. 제곱근 결과를 기준으로 각 숫자를 그룹화하고, 각 그룹 내에서 원래 숫자의 합을 계산합니다.
        5. 각 그룹의 합이 가장 큰 값을 찾습니다.
        6. 이 값과 해당 그룹에 속한 숫자들을 출력합니다
         */

        Random r = new Random();
        
        //1. -200 ~ 200 사이의 값
        int[] arr = r.ints(500,-200,201).toArray();
        
        //2. 0이상의 짝수만을 필터링
        List<Integer> list = Arrays.stream(arr).filter(x -> x > 0 && x % 2 == 0).boxed().collect(Collectors.toList());

        //3. 제곱근 구하기
        
    }
}
