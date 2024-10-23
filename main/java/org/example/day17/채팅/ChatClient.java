package org.example.day17.채팅;

import org.example.day02.brickBreaker.GamePlay;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    private Socket socket;
    private PrintWriter out;
    private String nickname;

    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.startChat();
    }

    public void startChat() {
        JFrame frame = new JFrame("채팅방");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JTextField inputField = new JTextField();
        frame.add(inputField, BorderLayout.SOUTH);

        // 게임 시작 버튼 추가
        JButton startGameButton = new JButton("게임 시작");
        frame.add(startGameButton, BorderLayout.NORTH);

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame(); // 게임 시작 메서드 호출
            }
        });

        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText();
                sendMessage(message);  // 메시지 전송
                inputField.setText(""); // 입력 필드 초기화
            }
        });

        frame.setVisible(true);
        connectToServer(textArea); // 서버 연결 및 메시지 수신 처리
    }

    private void startGame() {
        // 게임 창 열기
        SwingUtilities.invokeLater(() -> {
            JFrame gameFrame = new JFrame();
            GamePlay gamePlay = new GamePlay();
            gameFrame.setBounds(10, 10, 700, 600);
            gameFrame.setTitle("Brick Breaker");
            gameFrame.setResizable(false);
            gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            gameFrame.add(gamePlay);
            gameFrame.setVisible(true);
        });
    }

    private void connectToServer(JTextArea textArea) {
        try {
            socket = new Socket("localhost", 8888); // 서버 주소와 포트 번호 설정
            out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 닉네임 설정 및 유효성 검사
            while (true) {
                nickname = JOptionPane.showInputDialog("닉네임을 입력하세요 (1~10자의 영문자와 한글 또는 숫자만 허용):");

                if (nickname == null) {
                    JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                    System.exit(0); // 닉네임 입력 없이 종료
                }

                // 닉네임이 1~10자의 영문자 또는 숫자만 포함하고 금지된 단어를 포함하지 않는지 확인
                if (nickname.matches("^[a-zA-Z0-9가-힣]{1,10}$") && !nickname.toLowerCase().contains("admin") && !nickname.toLowerCase().contains("server")) {
                    out.println(nickname); // 서버로 닉네임 전송
                    break; // 유효한 닉네임이면 루프 종료
                } else {
                    JOptionPane.showMessageDialog(null, "닉네임은 1~10자의 영문자와 한글 또는 숫자만 허용되며 'admin' 또는 'server'를 포함할 수 없습니다.");
                }
            }

            // 서버 메시지 수신 처리
            String message;
            while ((message = in.readLine()) != null) {
                textArea.append(message + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {
        if (out != null && !message.trim().isEmpty()) {
            out.println(message); // 빈 메시지 전송 방지
        }
    }
}
