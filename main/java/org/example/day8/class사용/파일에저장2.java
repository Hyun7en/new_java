package org.example.day8.class사용;

import javax.swing.*;
import java.io.FileWriter;
import java.util.Arrays;

public class 파일에저장2 {
    public static void main(String[] args) {
        //주말동안 할 일 입력받아 저장
        //할 일이 "운동"이면 파일명은 "운동.txt"
        //저장 위치는 c:/data/운동.txt(절대경로)로 생성되게 하시오.
        //스트림 생성 및 저장, 클로징시 try-catch로 예외처리
        //입력은 2회 받음.
        //1. 주말동안 할 일은?(예, 운동, 코딩, 여행 등)
        //                  운동
        //2. 구체적인 내용 입력?(예, 장소-시간-내용을 입력)
        //                  잠실운동장-2시간-뛰기
        //파일은 3개 이상 만들어지도록 처리

        String s1 = JOptionPane.showInputDialog("주말동안 할 일은?");
        String s2 = JOptionPane.showInputDialog("구체적인 내용 입력?(예, 장소-시간-내용을 입력)");
        String[] total = s2.split("-");
        System.out.println(total.length);
        System.out.println(Arrays.toString(total));

        try {
            FileWriter file = new FileWriter("c:/data/" + s1+ ".txt");
            for (String x: total){
                file.write(x + "\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("에러 발생");
        }

        System.out.println("저장 끝~~~~~~~~~~!!");

    }
}