package org.example.day13.예외처리;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장클래스 {
    public static void main(String[] args) {
        FileWriter file = null;
        try {
            file = new FileWriter("c:/test.txt");
            //폴더나 파일은 읽기만, 읽기/쓰기 가능한 경우
            //리눅스로 서버만들어서 폴더와 파일 변경해주어야하는 경우가 있음.
            System.out.println(3/0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e1){
            e1.printStackTrace();
        } finally {
            System.out.println("이건 꼭 실행.");
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("나는 실행될까요....");
    }
}