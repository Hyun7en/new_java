package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My Library");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        // Add title
        String[] titles = {"모자", "셔츠", "블랑킷", "청바지", "티셔츠"};

        // Add image paths
        String[] imgPaths = {"my01.jpg", "my02.jpg", "my03.jpg", "my04.jpg", "my05.jpg"};

        // Add price
        double[] prices = {25000, 140000, 30000, 156000, 35000};

        // Initial index
        int[] currentIndex = {0}; // 배열을 사용하여 인덱스 값 유지

        // Top label for title
        JLabel titleLabel = new JLabel(titles[currentIndex[0]]);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Center label for price
        JLabel priceLabel = new JLabel(String.valueOf(prices[currentIndex[0]]) + " 원");
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Under label for image
        JLabel imageLabel = new JLabel(new ImageIcon(imgPaths[currentIndex[0]]));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(priceLabel, BorderLayout.SOUTH);

        // Add buttons
        JButton btnPrev = new JButton("<<");
        JButton btnNext = new JButton(">>");

        // Action listeners for buttons
        btnPrev.addActionListener(e -> {
            if (currentIndex[0] > 0) {
                currentIndex[0]--; // 인덱스를 감소
                updateLabels(titleLabel, priceLabel, imageLabel, titles, prices, imgPaths, currentIndex[0]);
            }
        });

        btnNext.addActionListener(e -> {
            if (currentIndex[0] < titles.length - 1) {
                currentIndex[0]++; // 인덱스를 증가
                updateLabels(titleLabel, priceLabel, imageLabel, titles, prices, imgPaths, currentIndex[0]);
            }
        });

        frame.add(btnPrev, BorderLayout.WEST);
        frame.add(btnNext, BorderLayout.EAST);

        // Final frame settings
        frame.setVisible(true);
    }

    // Method to update labels based on current index
    private static void updateLabels(JLabel titleLabel, JLabel priceLabel, JLabel imageLabel, String[] titles, double[] prices, String[] imgPaths, int index) {
        titleLabel.setText(titles[index]);
        priceLabel.setText(String.valueOf(prices[index]) + " 원");
        imageLabel.setIcon(new ImageIcon(imgPaths[index])); // 이미지 아이콘 업데이트
    }
}
