package org.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmers {

    public static void main(String args[]){
        String myString = "xabcxdefxghi";
        // "x"를 기준으로 문자열을 나누기
        String[] parts = myString.split("x",-1);

        // 각 부분 문자열의 길이를 저장할 리스트
        List<Integer> lengths = new ArrayList<>();

        // 각 부분 문자열의 길이를 리스트에 추가
        for (String part : parts) {
            lengths.add(part.length());
        }

        // 리스트를 배열로 변환
        int[] result = new int[lengths.size()];
        for (int i = 0; i < lengths.size(); i++) {
            result[i] = lengths.get(i);
        }

        System.out.println(Arrays.toString(result));




        //end
    }
}

