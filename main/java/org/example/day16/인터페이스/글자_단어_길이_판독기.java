package org.example.day16.인터페이스;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 글자_단어_길이_판독기 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout()); // Set layout

        // 제목
        frame.setTitle("글자/단어 길이 판독기");

        JLabel label = new JLabel("문장을 넣으세요:");
        frame.add(label);

        JTextArea textArea = new JTextArea(10, 40); // Set rows and columns
        textArea.setAutoscrolls(true);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        frame.add(new JScrollPane(textArea)); // Add scroll pane

        // 결과 표시
        JLabel resultLabel = new JLabel("길이 및 단어 수: ");
        frame.add(resultLabel);

        // 버튼
        Font font = new Font("궁서체", Font.BOLD, 20);
        JButton b1 = new JButton("길이 및 단어 수 확인");
        b1.setFont(font);
        frame.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                int length = text.length();
                String[] words = text.trim().isEmpty() ? new String[0] : text.trim().split("\\s+");
                int wordCount = words.length;

                resultLabel.setText("길이: " + length + " 문자, " + wordCount + " 단어");
            }
        });

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
