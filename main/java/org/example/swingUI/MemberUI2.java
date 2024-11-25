package org.example.swingUI;

import org.example.dbcp.MemberDAO2;
import org.example.dbcp.MemberVO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemberUI2 extends JFrame {
    JLabel top, l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    MemberUI2() {
        //객체생성시 화면을 만들자.
        setTitle("Member UI");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); //수동으로 위치를 잡아주어야함.

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

        top.setFont(new Font("굴림", Font.BOLD, 70));
        Font font = new Font("굴림", Font.BOLD, 35);
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

        //add하기 전에 위치잡아주어야 한다.
        top.setBounds(200, 50, 300, 100);
        add(top);
        l1.setBounds(100, 150, 150, 50);
        add(l1);
        t1.setBounds(300, 150, 300, 50);
        add(t1);
        l2.setBounds(100, 250, 150, 50);
        add(l2);
        t2.setBounds(300, 250, 300, 50);
        add(t2);
        l3.setBounds(100, 350, 150, 50);
        add(l3);
        t3.setBounds(300, 350, 300, 50);
        add(t3);
        l4.setBounds(100, 450, 150, 50);
        add(l4);
        t4.setBounds(300, 450, 300, 50);
        add(t4);
        b1.setBounds(100, 550, 200, 50);
        add(b1);
        b2.setBounds(300, 550, 200, 50);
        add(b2);
        b3.setBounds(500, 550, 200, 50);
        add(b3);

        getContentPane().setBackground(Color.green);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //클릭했을 때 처리할 내용이 구현되어있어야함.
                //1. id, pw, name, tel입력한 것 가지고 와서
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = t3.getText();
                String s4 = t4.getText();
                //2. vo에 넣어주어야함.
                MemberVO bag = new MemberVO();
                bag.setId(s1);
                bag.setPw(s2);
                bag.setName(s3);
                bag.setTel(s4);
                //3. dao에 vo를 전달하면서 insert해달라고 요청!
                try {
                    MemberDAO2 dao = new MemberDAO2();
                    dao.insert(bag);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //클릭했을 때 처리할 내용이 구현되어있어야함.
                //1. 입력한 값 가지고 오기
                String id = t1.getText();
                String tel = t4.getText();
                //2. dao에게 입력한 값 주면서 update해달라고 요청
                try {
                    MemberDAO2 dao = new MemberDAO2();
                    dao.update(id, tel);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //클릭했을 때 처리할 내용이 구현되어있어야함.
                //1. id입력한 값 가지고 온다.
                String id = t1.getText();
                //2. dao에게 id주면서 검색해달라고 요청
                try {
                    MemberDAO2 dao = new MemberDAO2();
                    MemberVO bag = dao.one(id);
                    t1.setText(bag.getId());
                    t2.setText(bag.getPw());
                    t3.setText(bag.getName());
                    t4.setText(bag.getTel());
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                //3. dao로부터 받아온 vo를 ui에 보여지게 하자.

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MemberUI2();
    }
}