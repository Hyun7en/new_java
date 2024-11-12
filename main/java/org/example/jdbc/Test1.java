package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) throws Exception {
     //1. java-mysql db연결하는 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
     //2. db연결(ip + port --> url, id, pw)
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        Connection con = DriverManager.getConnection(url,id,pw);
     //3. sql문 만들어서
        PreparedStatement ps =  con.prepareStatement("insert into test values (2,2)");
     //4. mysql로 보내자
        ps.executeUpdate();
     //5. sql실행은 mysql에서 함.

     //6. 결과를 자바에 보내주면 성공/ 실패 여부 판단 가능!

    }
}