package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_test {
    public static void main(String[] args) throws Exception {
        //자바(언어)에서 db를 연결하는 프로그램 4단계
        //Java DB Connectivity(JDBC) 4단계
        //1단계 - 사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1단계 드라이버 설정 성공!");
        //2단계 - db연결 --> 데이터~!(실무 설정)
        String url = "jdbc:mysql://localhost:3306/shop2"; //ip+port+db명
        String id = "root";
        String pw = "1234";

        Connection con = DriverManager.getConnection(url, id, pw);
        System.out.println("2단계 shop2 db연결 성공!");

        //3단계 - sql작성
        String sql = "insert into test values ('7', '3시가 되어간다.')";
        PreparedStatement ps = con.prepareStatement(sql);

        //4단계 - dbms로 sql문 전송
        ps.executeUpdate();
    }
}