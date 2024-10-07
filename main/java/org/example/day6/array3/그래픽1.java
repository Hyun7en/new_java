package org.example.day6.array3;

import javax.swing.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //3
        //x를 누르면 프로그램 종료시킴 설정!

        frame.setSize(500,500);
        frame.setTitle("그래픽 연습");

        JButton btn = new JButton();
        btn.setText("나를 눌러!"); // 함수, 메서드, 명령어는 명령어(입력 데이터);

        frame.add(btn);

        frame.setVisible(true);
        //end!
    }
}
