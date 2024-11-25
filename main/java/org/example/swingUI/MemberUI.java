package org.example.swingUI;

import javax.swing.*;
import java.awt.*;

public class MemberUI extends JFrame {
    JLabel top, l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    MemberUI() {
        //객체생성시 화면을 만들자.
        setTitle("Member UI");
        setSize(400, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        top = new JLabel("Member");
        l1 = new JLabel("아이디");
        l2 = new JLabel("비밀번호");
        l3 = new JLabel("이 름");
        l4 = new JLabel("연락처");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        b1 = new JButton("회원가입");
        b2 = new JButton("회원수정");
        b3 = new JButton("회원검색");

        top.setFont(new Font("굴림", Font.BOLD, 90));
        Font font = new Font("굴림", Font.BOLD, 40);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);
        t4.setFont(font);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);

        add(top);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        add(b2);
        add(b3);

        getContentPane().setBackground(Color.green);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MemberUI();
    }
}
