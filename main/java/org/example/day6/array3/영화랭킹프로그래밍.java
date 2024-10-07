package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 영화랭킹프로그래밍 {
    public static void main(String[] args) {
        // 영화 정보와 이미지 경로
        String[][] movie = {
                {"insideout", "15000"},
                {"deadpool", "23000"},
                {"quietplace", "18000"},
                {"yourname", "21000"},
                {"5centimeter", "19000"},
        };
        String[] imgPath = {"insideout.png", "deadpool.png", "quietplace.png", "yourname.png", "5centimeter.png"};

        JFrame frame = new JFrame("네이버 시리즈온 실시간 영화 목록");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int[] currentIndex = {0}; // 현재 인덱스

        // 상단 제목
        JLabel titleLabel = new JLabel("네이버 시리즈온 실시간 영화 목록", SwingConstants.CENTER);
        titleLabel.setFont(new Font("궁서", Font.BOLD, 20));
        frame.add(titleLabel, BorderLayout.NORTH);

        // 중앙 포스터
        JLabel poster = new JLabel(new ImageIcon(imgPath[currentIndex[0]]), SwingConstants.CENTER);
        frame.add(poster, BorderLayout.CENTER);

        // 하단 패널 및 정보 라벨과 버튼 패널
        JPanel infoPanel = new JPanel(new BorderLayout());
        JLabel checkInfo = new JLabel(movie[currentIndex[0]][0] + " - " + movie[currentIndex[0]][1] + "원", SwingConstants.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton btnPrev = new JButton("<<");
        JButton btnNext = new JButton(">>");
        JButton btnInfo = new JButton("정보 확인");

        buttonPanel.add(btnPrev);
        buttonPanel.add(btnNext);
        buttonPanel.add(btnInfo);

        // 버튼 리스너 추가
        btnPrev.addActionListener(e -> {
            if (currentIndex[0] > 0) {
                currentIndex[0]--;
                updateMovieInfo(poster, checkInfo, imgPath, movie, currentIndex[0]);
            }
        });

        btnNext.addActionListener(e -> {
            if (currentIndex[0] < movie.length - 1) {
                currentIndex[0]++;
                updateMovieInfo(poster, checkInfo, imgPath, movie, currentIndex[0]);
            }
        });

        btnInfo.addActionListener(e -> {
            String input = JOptionPane.showInputDialog("정보를 확인하고 싶은 영화 번호를 선택하세요(1-5): ");
            try {
                int selectedIndex = Integer.parseInt(input) - 1; // Convert input to 0-based index
                if (selectedIndex >= 0 && selectedIndex < movie.length) {
                    currentIndex[0] = selectedIndex;
                    updateMovieInfo(poster, checkInfo, imgPath, movie, currentIndex[0]);
                } else {
                    JOptionPane.showMessageDialog(frame, "올바른 번호를 입력하세요 (1-5).", "잘못된 입력", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "숫자를 입력하세요.", "잘못된 입력", JOptionPane.ERROR_MESSAGE);
            }
        });

        // 패널에 추가
        infoPanel.add(checkInfo, BorderLayout.CENTER);
        infoPanel.add(buttonPanel, BorderLayout.SOUTH);
        frame.add(infoPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // 영화 정보 업데이트 메서드
    private static void updateMovieInfo(JLabel poster, JLabel checkInfo, String[] imgPath, String[][] movie, int index) {
        poster.setIcon(new ImageIcon(imgPath[index]));
        checkInfo.setText((index + 1) + ".   " + movie[index][0] + " - " + movie[index][1] + "원");
    }
}
