package org.example.day06.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //3
        //x를 누르면 프로그램 종료시킴 설정!

        frame.setSize(500,500);
        frame.setTitle("그래픽 연습");

        JButton btn = new JButton();
        btn.setText("나를 눌러!"); // 함수, 메서드, 명령어는 명령어(입력 데이터);

        JButton btn2 = new JButton();
        btn2.setText("나를 눌러");
        btn2.setBackground(Color.yellow);

        JButton btn3 = new JButton();
        btn3.setText("ㄹㄹ");
        btn3.setBackground(Color.YELLOW);

        JButton btn4 = new JButton();
        btn4.setText("<<");
        btn4.setBackground(Color.GREEN);

        JButton btn5 = new JButton();
        btn5.setText(">>");
        btn5.setBackground(Color.GREEN);

        frame.add(btn, BorderLayout.CENTER);
        frame.add(btn2, BorderLayout.NORTH);
        frame.add(btn3, BorderLayout.SOUTH);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.EAST);

        frame.setVisible(true);
        //end!
    }
}
