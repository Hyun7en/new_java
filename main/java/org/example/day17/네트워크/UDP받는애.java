package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP받는애 {
    public static void main(String[] args) throws IOException {
        //공간 다 만들어두고 받을 준비를 먼저 하고 있어야 함.
        //누군가가 ip+port로 보내면 자동으로 받게해야함.
        //여러 번 받고 싶으면 무한루프를 설정해야함.
        //스트림 전송시 1 byte단위로 읽고 쓴다.
        //==> byte[]배열로 데이터를 설정하면 됨.
        byte[] data = new byte[256];
        //보낼 때는 DatagramPacket으로 보냄.
        //받을 때도 DatagramPacket으로 받을 수 있게 미리 객체를 만들어두자.!
        DatagramPacket packet = new DatagramPacket(data, data.length);
        //패킷으로 받으면 데이터(데이터그램)를 꺼내서 위에서 설정한 data배열에 넣어줘.!

        DatagramSocket socket = new DatagramSocket(7100);
        System.out.println("----- 데이터 전송되기를 기다리는 중...-----");
        socket.receive(packet);
        //현재까지 받은 데이터 어디에 들어있나요???
        System.out.println(new String(data));
        socket.close();
    }
}