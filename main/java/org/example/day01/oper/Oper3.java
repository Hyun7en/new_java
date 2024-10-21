package org.example.day01.oper;

import javax.swing.*;

public class Oper3 {
    public static void main(String[] args) {
        //JOptionPane.showInputDialog() 이용
        //정수1 입력 --> a변수 저장, 333
        //정수2 입력 --> b변수 저장, 222

        //입력을 받은 데이터를 int로 각각 변환하여 a2,b2로 저장
        //두 입력값의 평균을 구하시오.(실수로)

        int a = Integer.parseInt(JOptionPane.showInputDialog("정수1 입력"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("정수2 입력"));

        //System.out.println("두 입력값의 평균은 " + ((double)a+b)/2 + "입니다.");
        JOptionPane.showMessageDialog(null,"두 입력값의 평균은 " + ((double)a+b)/2 + "입니다." );

    }
}
