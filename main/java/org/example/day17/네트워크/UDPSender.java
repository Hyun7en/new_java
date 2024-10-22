package org.example.day17.네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPSender {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost"); // 수신자 IP 주소
            int port = 9876; // 수신자 포트 번호

            System.out.println("메시지를 입력하세요 (종료하려면 'exit' 입력):");
            String message;

            while (!(message = scanner.nextLine()).equalsIgnoreCase("exit")) {
                byte[] buffer = message.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);
                socket.send(packet);
                System.out.println("보낸 메시지: " + message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
            scanner.close();
        }
    }
}
