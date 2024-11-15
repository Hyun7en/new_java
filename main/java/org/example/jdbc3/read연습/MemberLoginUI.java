package org.example.jdbc3.read연습;

import java.util.Scanner;

public class MemberLoginUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("로그인할 id입력>> ");
        String id = sc.next();
        System.out.print("로그인할 pw입력>> ");
        String pw = sc.next();
        sc.close();

        MemberDAO2 dao = new MemberDAO2();
        //vo쓰는 기준!!!
        //가방만들고 값넣고 전달하고
        MemberVO bag = new MemberVO();
        bag.setId(id);
        bag.setPw(pw);
        boolean result = dao.login(bag);
        if (result){
            System.out.println("로그인 성공!");
        } else {
            System.out.println("로그인 실패!");
        }
        //결과 출력 UI에 해야함.!
    }
}