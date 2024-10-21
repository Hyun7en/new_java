package org.example.day02.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        //JFrame 만들고
        // 버튼을 하나 만들어
        //그 위에 얹어보세요!
        //설정은 맘대로!

        JFrame frame = new JFrame();
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        Font font = new Font("궁서", Font.PLAIN, 50);


        frame.setSize(500,500);

        btn1.setText("안녕");
        btn2.setText("하세요");
        btn1.setSize(200,200);
        btn2.setSize(200,200);
        btn1.setBackground(Color.RED);
        btn2.setBackground(Color.RED);
        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);
        frame.add(btn1);
        frame.add(btn2);
        frame.setVisible(true);
    }
}
