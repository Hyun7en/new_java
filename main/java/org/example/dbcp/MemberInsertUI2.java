package org.example.dbcp;

import java.util.Scanner;

public class MemberInsertUI2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id입력>> ");
        String id값 = sc.next(); //apple
        System.out.print("pw입력>> ");
        String pw값 = sc.next(); //1234
        System.out.print("name입력>> ");
        String name값 = sc.next(); //apple
        System.out.print("tel입력>> ");
        String tel값 = sc.next(); //1111
        sc.close();

        //Member테이블에 연결해서 입력받은 데이터를 주고 insert해달라고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 insert()호출!
        MemberDAO2 dao = new MemberDAO2();
        //가방만들기(new) -> 넣기(set) -> 전달
        MemberVO vo = new MemberVO();
        vo.setId(id값);
        vo.setPw(pw값);
        vo.setName(name값);
        vo.setTel(tel값);

        for (int i = 0; i <100; i++) {
            vo.setId(id값 + i);
            dao.insert(vo);
        }
    }
}
