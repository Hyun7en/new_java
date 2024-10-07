package org.example.day6.mini;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class DogCareGame extends JFrame {
    private int hunger = 50;  // 배고픔 수치
    private int happiness = 50;  // 행복 수치
    private JLabel hungerLabel;
    private JLabel happinessLabel;
    private JLabel messageLabel;

    public DogCareGame() {
        setTitle("강아지 키우기 게임");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // UI 요소 설정
        hungerLabel = new JLabel("배고픔: " + hunger);
        happinessLabel = new JLabel("행복: " + happiness);
        messageLabel = new JLabel("강아지와 즐거운 시간을 보내세요!");

        JButton feedButton = new JButton("먹이 주기");
        JButton playButton = new JButton("놀아주기");

        feedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedDog();
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playWithDog();
            }
        });

        // 레이아웃 설정
        setLayout(new GridLayout(5, 1));
        add(hungerLabel);
        add(happinessLabel);
        add(messageLabel);
        add(feedButton);
        add(playButton);

        // 주기적으로 상태 변경하는 타이머
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                updateStatus();
            }
        }, 0, 3000);  // 3초마다 상태 업데이트
    }

    // 먹이 주기
    private void feedDog() {
        hunger = Math.max(0, hunger - 20);  // 배고픔 감소 (최소 0)
        happiness = Math.min(100, happiness + 5);  // 행복 증가 (최대 100)
        messageLabel.setText("강아지가 맛있게 먹었어요!");
        updateLabels();
    }

    // 놀아주기
    private void playWithDog() {
        happiness = Math.min(100, happiness + 20);  // 행복 증가
        hunger = Math.min(100, hunger + 10);  // 배고픔 증가
        messageLabel.setText("강아지가 즐거워해요!");
        updateLabels();
    }

    // 배고픔과 행복 상태 업데이트
    private void updateStatus() {
        hunger = Math.min(100, hunger + 5);  // 시간이 지나면 배고픔 증가
        happiness = Math.max(0, happiness - 5);  // 시간이 지나면 행복 감소

        if (hunger >= 100) {
            messageLabel.setText("강아지가 배고파요!");
        } else if (happiness <= 0) {
            messageLabel.setText("강아지가 슬퍼해요...");
        } else {
            messageLabel.setText("강아지와 즐거운 시간을 보내세요!");
        }

        updateLabels();
    }

    // 라벨 업데이트
    private void updateLabels() {
        hungerLabel.setText("배고픔: " + hunger);
        happinessLabel.setText("행복: " + happiness);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DogCareGame game = new DogCareGame();
            game.setVisible(true);
        });
    }
}

