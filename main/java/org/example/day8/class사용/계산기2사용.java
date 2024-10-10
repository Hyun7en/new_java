package org.example.day8.class사용;

import org.example.day8.class만들기.계산기2;

import java.util.Arrays;

public class 계산기2사용 {
    public static void main(String[] args) {
        계산기2 cal2 = new 계산기2();
        //계산기2에 있는 모든 메서드를 호출하여
        //변수에 넣은 후, 출력
        int[] result1 = cal2.add();
        System.out.println(result1[0]);
        //배열 전체 값 출력 3가지
        //1. for(int i~) : 입출력
        //2. for(int x: 배열명) : 출력
        //3. Arrays.toString(배열명)
        System.out.println(Arrays.toString(result1));

        int result2 = cal2.add(500, 100);
        double result3 = cal2.add(100, 11.11);
        System.out.println(result2 + " " + result3);

        double result4 = cal2.add(11.11, 22.22);
        String result5 = cal2.add("오늘은 ", 10);
        System.out.println(result4);
        System.out.println(result5 + "일입니다.");

        int result6 = cal2.call();
        System.out.println("오늘은 " + result6 + "월입니다.");

    }
}