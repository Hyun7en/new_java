package org.example.day17.네트워크;

import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("서버가 시작되었습니다. 클라이언트를 기다립니다...");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 연결되었습니다.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String message;

            while ((message = in.readLine()) != null) {
                System.out.println("클라이언트: " + message);
                out.println("서버: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

