package org.example.day8.class사용;

import org.example.day8.class만들기.계산기;

public class 내가게 {
    public static void main(String[] args) {
        계산기 cal = new 계산기();
        int result1 = cal.더하기(100, 200);
        int result2 = cal.더하기(1000, 2000);

        //위에서 더했던 두 개의 값을
        //더해서 총합을 구하고 싶음.
        int total = cal.더하기(result1, result2);
        System.out.println("두 번 더한 총합은 " + total);

        System.out.println(cal.더하기(300, 200));
        // System.out.println(cal.빼기(300, 200));
        // --> void인 경우, 바로 출력할 수도, 연산도 불가능!

    }
}