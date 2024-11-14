package org.example.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;

public class SchoolDBConnect {
    public static void main(String[] args) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. MYSQL 자바 연결할 DRIVER 설정 성공.");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pwd = "1234";

        Connection con = DriverManager.getConnection(url,id,pwd);
        System.out.println("2. MYSQL 연결 성공");




    }
}
