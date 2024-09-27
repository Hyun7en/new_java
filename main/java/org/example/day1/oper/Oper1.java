package org.example.day1.oper;

import javax.swing.*;

public class Oper1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name"); // "홍길동"
        String age = JOptionPane.showInputDialog("Enter your age"); // 100
        //int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); // 100

        int age2 = Integer.parseInt(age);

        System.out.println(age + "살 " + name + "님 환영합니다.");
        //age2에 1을 더해서 age3에 넣었다가 프린트

        int age3 = age2 + 1;

        System.out.println(age3);

    }
}
