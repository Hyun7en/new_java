package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;

public class 인터페이스그래픽 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("나를 눌러요");
        JButton b2 = new JButton("나도 눌러요");

        Font font = new Font("궁서",Font.BOLD,20);
        b1.setFont(font);
        b2.setFont(font);

        버튼1처리클래스 bp = new 버튼1처리클래스();
        b1.addActionListener(bp);
        버튼2처리클래스 bp2 = new 버튼2처리클래스();
        b2.addActionListener(bp2);

        TextArea list = new TextArea(6,13);
        list.setFont(font);

        //add
        frame.add(b1);
        frame.add(b2);
        frame.add(list);

        //end
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
