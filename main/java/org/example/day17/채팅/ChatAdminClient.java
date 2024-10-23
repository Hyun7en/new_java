package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatAdminClient {
    private static Socket socket;
    private static PrintWriter out;
    private static JTextArea textArea;
    private static final String ADMIN_NICKNAME = "관리자"; // 고정된 관리자 닉네임

    public static void main(String[] args) {
        JFrame frame = new JFrame("채팅방 관리자");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JTextField inputField = new JTextField();
        frame.add(inputField, BorderLayout.SOUTH);

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText();
                if (message.startsWith("/kick") || message.startsWith("/mute")) {
                    out.println(message); // 관리자 명령어 전송
                } else {
                    JOptionPane.showMessageDialog(frame, "관리자 명령어를 입력하세요.");
                }
                inputField.setText(""); // 입력 필드 초기화
            }
        });

        frame.setVisible(true);

        try {
            socket = new Socket("localhost", 7777); // 서버 주소 및 포트 번호
            out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 고정된 관리자 닉네임을 서버로 전송
            out.println(ADMIN_NICKNAME); // 닉네임을 서버로 전송

            String serverMessage;
            while ((serverMessage = in.readLine()) != null) {
                textArea.append(serverMessage + "\n"); // 서버에서 온 메시지 출력
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
