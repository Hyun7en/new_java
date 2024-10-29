package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;

public class 가변을배열로옮기기 {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5};
        //n배열
        // 중 3이상 숫자를 찾아서
        //10을 곱한 후 list에 모은 후
        //배열로 옮긴 후
        //정렬후 프린트
        ArrayList<Integer> list = new ArrayList<>();
        for (int x: n){
            if (x >= 3){
                System.out.println(x);
                list.add(x * 10);
            }//if
        }//for
        int[] answer = null;
        if (list.size() == 0){
            System.out.println("없음.");
        }else{
            answer = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }//for
        }//else

        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }//main
}
