package org.example.day6.array3;

import javax.swing.*;

public class 그래픽2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JButton btn = new JButton();
        btn.setText("눌러주세요");

        frame.add(btn);

        frame.setVisible(true);
        //end
    }
}
