package org.example.day02.control;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {
        //수동 import ==> Alt + Enter
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력>> ");
        String name = sc.next();//한 단어만 입력, 홍길동

        System.out.print("나이 입력>> ");
        int age = sc.nextInt(); // String --> int

        System.out.print("몸무게 입력>> ");
        double w = sc.nextDouble(); // String --> double

        System.out.println(name + " " + age + " " + w);
        sc.close();



    }
}
