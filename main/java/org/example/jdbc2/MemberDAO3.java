package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO3 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // 1. 드라이버 설정
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("1. 드라이버 설정 성공!");

            // 2. DB 연결
            String url = "jdbc:mysql://localhost:3306/shop2";
            String id = "root";
            String pw = "1234";
            con = DriverManager.getConnection(url, id, pw);
            System.out.println("2. DB 연결 성공!");

            // 3. SQL 준비
            String sql = "insert into member values(?,?,?,?)";
            ps = con.prepareStatement(sql);

            int totalInserted = 0;

            // 반복문으로 여러 개의 행 삽입
            for (int i = 1; i <= 1000; i++) {
                ps.setInt(1, i);
                ps.setInt(2, i);
                ps.setInt(3, i);
                ps.setInt(4, i);

                // SQL 실행
                int result = ps.executeUpdate();
                totalInserted += result;
            }

            System.out.println("4. SQL 전송 성공!");
            System.out.println("총 삽입된 row 수: " + totalInserted + "개");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
