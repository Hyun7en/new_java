package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        //입력
        //ram에 있어야함.
        //int x = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력>> "); //println(), printf()
        int age = sc.nextInt(); //모든 입력은 타입을 컴퓨터는 String으로 인식-> int로 변경
        System.out.print("아침을 먹었는지 입력(true/false)?");
        boolean result = sc.nextBoolean();

        //처리 ==> cpu
        int nextAge = age + 1;
        String text = null; //주소가 없음.(널), 기본형이 아닌 데이터는 null로 초기화
        if (result) {
            text = "점심을 조금 먹어도 되겠네요.!";
        } else {
            text = "점심을 많이 먹어야 되겠네요.!";
        }
        //출력
        System.out.println("내년 나이는 " + nextAge + "세");
        System.out.println("아침 식사 여부 결과 " + text);
    }
}





