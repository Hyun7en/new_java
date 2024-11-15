package org.example.jdbc3.read연습;

import javax.swing.*;
import java.util.Scanner;

public class MemberOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 id입력>> ");
        String id = sc.next();

        MemberDAO2 dao = new MemberDAO2();
        MemberVO bag = dao.one(id); //MemberVO가 리턴
        //가방 받은 쪽에서 변수 bag만들어서 저장, 하나씩 꺼내어 처리!
        String total = bag.getId() + " " + bag.getPw() + " " + bag.getName() +" " + bag.getTel();
        JOptionPane.showMessageDialog(null, total);
        sc.close();
    }
}