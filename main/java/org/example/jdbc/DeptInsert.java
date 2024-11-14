package org.example.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 자바 연결할 부품 설정 성공.");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pwd = "1234";

        Connection con = DriverManager.getConnection(url,id,pwd);
        System.out.println("2. MYSQL 연결 성공.");

        System.out.println("deptNo >> ");
        int deptNo = sc.nextInt();
        sc.nextLine();

        System.out.println("deptName >> ");
        String deptName = sc.nextLine();

        System.out.println("loc >> ");
        String loc = sc.nextLine();

        sc.close();

        String sql = "insert into dept2 values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,deptNo);
        ps.setString(2,deptName);
        ps.setString(3,loc);
        System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

        int result = ps.executeUpdate();
        System.out.println("4. SQL문 MYSQL로 보내기 성공.");

        con.close();
    }
}
