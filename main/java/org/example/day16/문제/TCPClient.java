package org.example.day16.문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            try (Socket client = new Socket("localhost", 5000);
                 BufferedReader bf = new BufferedReader(new InputStreamReader(client.getInputStream()))) {

                System.out.println((i + 1) + "번: 클라이언트가 5000포트 서버에 연결을 요청함");
                String data = bf.readLine();
                System.out.println("서버로부터 받은 데이터 >> " + data);
            } catch (IOException e) {
                System.out.println("연결 실패: " + e.getMessage());
            }
        }
    }
}
