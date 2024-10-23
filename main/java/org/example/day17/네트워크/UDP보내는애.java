package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP보내는애 {
    public static void main(String[] args) throws IOException {
        //보내는 전화기역할 부품 --> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //주소: ip(InetAddress) + port(int)
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        //데이터: String --> byte[]
        //패킷 --> DatagramPacket(데이터, 주소)
        //소켓으로 패킷을 보내자.
        //소켓 자원해제.
        
        //end
    }

}