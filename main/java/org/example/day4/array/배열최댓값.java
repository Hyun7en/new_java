package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열에 여러번 입력한 데이터를 넣어주는 패턴
        int[] save = new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자 입력>> ");
            save[i] = sc.nextInt(); //모든 입력은 String --> int로 변경하는 기능으로 포함.88
        }
        System.out.println(Arrays.toString(save));

        sc.close();//stream 닫힘. 맨 끝에 위치!

        Arrays.sort(save); //오름차순 정렬, 맨앞 최솟값, 맨끝 최댓값
        System.out.println("최소값 : " + save[0]);
        System.out.println("최대값 : " + save[save.length - 1]); //save.length - 1
    }
}