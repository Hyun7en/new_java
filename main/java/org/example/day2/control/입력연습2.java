package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 2개를 입력 받아서 첫 번째 숫자가 두 번째 숫자보다 큰지 비교해서 출력

        System.out.print("첫 번째 숫자 입력>> ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력>> ");
        int num2 = sc.nextInt();

        System.out.println(num1 > num2 ? "첫 번째 숫자가 더 큽니다":"두 번째 숫자가 더 큽니다");

        sc.close();
    }
}
