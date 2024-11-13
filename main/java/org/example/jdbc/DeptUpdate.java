package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeptUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pwd = "1234";

        Connection con = DriverManager.getConnection(url,id,pwd);

        System.out.print("dept  no : ");
        int deptNo = sc.nextInt();

        System.out.print("loc: ");
        String loc = sc.next();

        sc.close();

        String sql = "update dept2 set loc = ? and deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,deptNo);
        ps.setString(2,loc);
        ps.executeUpdate();
        ps.close();
        con.close();


    }
}
