package org.example.day16.문제;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);

        System.out.println("서버 시작 중...");

            while (true) {
                // 클라이언트 연결 대기

                System.out.println("클라이언트 연결 성공");
                Socket socket = serverSocket.accept();
                // 데이터 전송
                String data = "i am a java programmer!!!!!";
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.print(data);

                // 소켓 닫기
                out.close();
                socket.close();
            }
        }

        // 종료
    }

