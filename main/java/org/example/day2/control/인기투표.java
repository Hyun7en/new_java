package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 인기투표 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(380,700);

        Font font = new Font("궁서",Font.BOLD,20);
        FlowLayout layout = new FlowLayout();
        f.setLayout(layout);

        //버튼 만들기
        JButton btn = new JButton();
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();

        //btn.setText("아이유");
        //btn1.setText("프로미스 나인");
        //btn2.setText("스테이시");

        //라벨 만들기
        JLabel l1 = new JLabel();
        l1.setText("인기투표 시스템");
        l1.setFont(font);

        JLabel l2 = new JLabel();
        l2.setText("아이유");
        l2.setFont(font);

        JLabel l3 = new JLabel();
        l3.setText("프로미스 나인");
        l3.setFont(font);

        JLabel l4 = new JLabel();
        l4.setText("스테이시");
        l4.setFont(font);

        ImageIcon icon1 = new ImageIcon("001.png");
        ImageIcon icon2 = new ImageIcon("002.png");
        ImageIcon icon3 = new ImageIcon("003.png");
        btn.setIcon(icon1);
        btn1.setIcon(icon2);
        btn2.setIcon(icon3);

        f.add(l1);
        f.add(btn); f.add(l2);
        f.add(btn1); f.add(l3);
        f.add(btn2); f.add(l4);

        btn.addActionListener(new ActionListener() {
            int iu = 0;
            public void actionPerformed(ActionEvent e) {
                iu++;
                l2.setText("아이유>> " + iu);
                //btn이 클릭될 때마다 자동으로 실행되는 코드!
                System.out.println("아이유의 라일락");
            }
        });

        btn1.addActionListener(new ActionListener() {
            int fromis = 0;
            public void actionPerformed(ActionEvent e) {
                fromis++;
                l3.setText("프로미스 나인>> " + fromis);
                System.out.println("프로미스 나인의 뭐");
            }
        });

        btn2.addActionListener(new ActionListener() {
            int stacy = 0;
            public void actionPerformed(ActionEvent e) {
                stacy++;
                l4.setText("스테이시>> " + stacy);
                System.out.println("스테이시의 뭐");
            }
        });

        //end
        f.setVisible(true);
    }
}
