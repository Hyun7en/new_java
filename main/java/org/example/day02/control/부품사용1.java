package org.example.day02.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        f.setSize(300,300);

        b1.setText("나를 클릭하세요.");
        b2.setText("나도 클릭하세요.");
        b1.setBackground(Color.RED); //배경색
        b1.setForeground(Color.YELLOW); //글자색
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLUE);

        Font font = new Font("궁서",Font.BOLD,20);
        b1.setFont(font);
        b2.setFont(font);


        //배치해주는 부품.
        //물 흐르는 것처럼 순서대로 다 붙여주는 레이아웃

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(b1);
        f.add(b2);



        //맨끝!
        f.setVisible(true);
    }
}
