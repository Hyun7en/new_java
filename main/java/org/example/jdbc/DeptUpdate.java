package org.example.jdbc3;

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

        String sql = "update dept2 set loc = ? where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,loc);
        ps.setInt(2,deptNo);
        ps.executeUpdate();
        ps.close();
        con.close();


    }
}
