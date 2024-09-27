package org.example.day2.control;

public class 순차문2 {
    public static void main(String[] args) {
        String answer = "맑음";
//        날씨가 어때? 입력!
        //String answer1 = JOptionPane.showInputDialog("날씨가 어때!");

//        맑음과 같은지, 다른지 출력!
        //JOptionPane.showMessageDialog(null, answer.equals(answer1) ? "날씨는 화창해요" : "최악의 날씨에요");

        double temp = 21.2; // 온도
        double humid = 55.5; // 습도
//        현재 온도와 습도를 입력받아
//        온도가 temp 보다 높고 습도가 humid 보다 높은지 출력!
//        Double.parseDouble() 이용

        //double temp1 = Double.parseDouble(JOptionPane.showInputDialog("현재 온도를 입력하세요: "));
        //double humid1 = Double.parseDouble(JOptionPane.showInputDialog("현재 습도를 입력하세요: "));
        //JOptionPane.showMessageDialog(null, temp1 > temp && humid1 > humid ? "덥고 습하네요" : "쾌적하네요");

        //코드 정리 -> Ctrl + Alt + L

        double result = temp/humid;

        System.out.printf("온도를 습도로 나누면 %.2f",result);

    }
}
