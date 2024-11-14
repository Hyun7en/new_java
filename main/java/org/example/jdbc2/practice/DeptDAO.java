package org.example.jdbc2.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptDAO {
    private Connection con = null;

    public DeptDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public void insert(DeptVO vo) throws Exception {
        String sql = "insert into dept values(?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, vo.getDeptNo());
        ps.setString(2, vo.getDName());
        ps.setString(3, vo.getLoc());
        System.out.println("3. sql준비 --> sql객체 성공!");

        int result = ps.executeUpdate();
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();

    }

    public void update(DeptVO vo) throws Exception {
        String sql = "update DEPT set LOC = ? where DEPTNO = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, vo.getLoc());
        ps.setInt(2, vo.getDeptNo());

        System.out.println("3. sql준비 --> sql객체 성공!");

        int result = ps.executeUpdate();
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close();

    }
}
