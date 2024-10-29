package org.example.day21.알고리즘.선형;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class n의배수고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        //numlist를 하나씩 꺼내서 n의 배수가 아닌지 체크해야함.
        //아닌 것들만 모으자.!(가변) --> ArrayList필요
        //결과는 int[] answer에 모아서 리턴
        ArrayList<Integer> list = new ArrayList<>();
        for (int x: numlist){
            if(x % 3 == 0) list.add(x);
        }
        //컬렉션 sort(오름차순, 내림차순)
        Collections.sort(list); //오름차순
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
