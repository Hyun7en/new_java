package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 메신저A extends JFrame {
    JTextArea list;
    메신저A(){
        //여기에 코드 다하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");

        setTitle("메신저A");
        setSize(500, 500);
        getContentPane().setBackground(Color.pink);

        list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);
        //list->색, 세로 스크롤, 가로 글자넘어가는 것 방지, 글자크기 30으로 설정
        //input->색, 글자크기 30으로 설정
        list.setBackground(Color.pink);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true); //글자많아지면 옆으로 벗어나지 않게!
        list.setAutoscrolls(true); //스크롤만드는 기능
        list.setEditable(false); //textarea에 입력 불가능
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //엔터쳤을 때 실행하고 싶은 내용을 쓰자.
                //1. input에 입력한 데이터를 가지고 와서
                String data = input.getText();
                //1. list 끝에 붙이세요.
                list.append("고뱅: "  + data + "\n");
                input.setText("");//2. 입력한거 지우기!
                //3. 입력한 내용을 상대방에게 보내자. --> 예외처리!필요!
                //전화기 역할 소켓필요.
                try {
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data2 = data.getBytes();
                    InetAddress ip = InetAddress.getByName("192.168.60.22");
                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 7777);
                    socket.send(packet);
                    socket.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                //입력한 데이터를 바이트 배열로 만들어서
                //소켓만들고
                //보내기
            }
        });

        //맨 끝!
        setVisible(true);
    }

    public void process() throws Exception {
        //메신저가 시작하자마자 무한루프로 받는거 돌아가게 해야함.
        //전화기 역할 소켓만들고!
        DatagramSocket socket = new DatagramSocket(5555);
        while (true) {
            //공간 byte[], packet만들어주고
            byte[] data = new byte[30];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            //받아라!
            socket.receive(packet);
            System.out.println(socket.getLocalPort());
            list.append("마이스터조: " + new String(data) + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        메신저A m = new 메신저A();
        m.process();
    }
}
