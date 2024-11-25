package org.example.dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class T1 {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        PreparedStatement ps = null, ps2 = null;

        try {
            // DB 연결 설정
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop2", "root", "1234");

            // 트랜잭션 시작
            con.setAutoCommit(false); // autocommit 끄기

            // 첫 번째 insert 실행
            String sql1 = "INSERT INTO member VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql1);
            ps.setString(1, "user1");
            ps.setString(2, "pw1");
            ps.setString(3, "name1");
            ps.setString(4, "010-1111-1111");
            ps.executeUpdate();

            String sql2 = "INSERT INTO member VALUES (?, ?, ?, ?)";
            ps2 = con.prepareStatement(sql2);
            ps2.setString(1, "user1");
            ps2.setString(2, "pw1");
            ps2.setString(3, "name1");
            ps2.setString(4, "010-1111-1111");
            ps2.executeUpdate();
            // 정상 실행 시 커밋
            con.commit();
            System.out.println("트랜잭션 커밋 성공!");

        } catch (Exception e) {
            try {
                // 오류 발생 시 롤백
                if (con != null) {
                    con.rollback();
                    System.out.println("트랜잭션 롤백 실행!");
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
}