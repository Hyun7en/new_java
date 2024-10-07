package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);//add()한 순서래도 물흐르듯이 뒤에다 붙여줌.!

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //버튼클릭했을 때 실행되는 내용!
                    //버튼클릭하면 ActionListener안에 있는 actionPerformed()라는
                    //함수가 자동 실행!
                    String s = e.getActionCommand();//버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s+"번 예매됨.");
                    button.setEnabled(false);
                    button.setBackground(Color.red);
                }
            });
        }
        //맨 끝!
        frame.setVisible(true);
    }
}