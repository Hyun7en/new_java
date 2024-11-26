package org.example.dbcp;

import java.util.Scanner;

public class MemberInsertUIHikari {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("id입력>> ");
        String id값 = sc.next(); // 예: apple
        System.out.print("pw입력>> ");
        String pw값 = sc.next(); // 예: 1234
        System.out.print("name입력>> ");
        String name값 = sc.next(); // 예: apple
        System.out.print("tel입력>> ");
        String tel값 = sc.next(); // 예: 1111

        sc.close(); // 스캐너 종료

        // MemberDAOHikari를 통해 데이터베이스 작업
        MemberDAOHikari dao = new MemberDAOHikari();

        // MemberVO 객체 생성 후 입력값 세팅
        MemberVO vo = new MemberVO();
        vo.setId(id값);
        vo.setPw(pw값);
        vo.setName(name값);
        vo.setTel(tel값);

        // 1000개의 데이터를 삽입 (id값에 숫자 추가)
        for (int i = 0; i < 1000; i++) {
            vo.setId(id값 + i); // id에 i 값을 추가
            dao.insert(vo); // 데이터 삽입
            System.out.println("Inserted: " + vo.getId());
        }

        System.out.println("100개의 데이터 삽입 완료!");
    }
}