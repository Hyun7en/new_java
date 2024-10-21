package org.example.day01.doit;

import javax.swing.*;

public class AverScore {
    public static void main(String[] args) {
        int mathScore = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요:"));
        int mathScore2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요:"));

        int englishScore = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요:"));
        int englishScore2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요:"));

        double averMathScore = (mathScore + mathScore2) / 2;
        double averEnglishScore = (mathScore2 + englishScore2) / 2;

        JOptionPane.showMessageDialog(null,"수학 평균 점수: " + averMathScore + "\n영어 평균 점수: " + averEnglishScore);

    }
}
