package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 메신저A extends JFrame {
    private JTextArea list;
    private JTextField input;
    private 메신저B 상대방;

    메신저A() {
        System.out.println("생성자 시작.");

        setTitle("메신저A");
        setSize(500, 500);
        getContentPane().setBackground(Color.PINK);

        list = new JTextArea();
        input = new JTextField();
        setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(list);
        add(scrollPane, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        list.setBackground(Color.PINK);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.WHITE);
        input.setFont(font);
        list.setLineWrap(true);
        list.setEditable(false);

        // 메시지 전송 기능
        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = input.getText();
                if (!message.isEmpty()) {
                    sendMessage("고병현: " + message);
                    input.setText(""); // 입력 필드 초기화
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 상대방에게 메시지를 설정하는 메서드
    public void set상대방(메신저B 상대방) {
        this.상대방 = 상대방;
    }

    // 메시지를 보내는 메서드
    public void sendMessage(String message) {
        list.append(message + "\n");
        if (상대방 != null) {
            상대방.receiveMessage(message);
        }
    }

    // 상대방으로부터 메시지를 받는 메서드
    public void receiveMessage(String message) {
        list.append(message + "\n");
    }

    public static void main(String[] args) {
        메신저A a = new 메신저A();
        메신저B b = new 메신저B();
        a.set상대방(b);
        b.set상대방(a);
    }
}
