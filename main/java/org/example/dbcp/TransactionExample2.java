package org.example.dbcp;

import java.sql.*;

public class TransactionExample2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement psBoard = null;
        PreparedStatement psMember = null;
        try {
            // DB 연결 설정
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop2", "root", "1234");
            // 트랜잭션 시작
            con.setAutoCommit(false); // autocommit 끄기
            // Board 테이블에 데이터 삽입
            String sqlBoard = "INSERT INTO board VALUES (?, ?, ?, ?)";
            psBoard = con.prepareStatement(sqlBoard);
            psBoard.setInt(1, 1); // id
            psBoard.setString(2, "First Title"); // title
            psBoard.setString(3, "This is the content."); // content
            psBoard.setString(4, "writer1"); // writer
            psBoard.executeUpdate();
            // Member 테이블에 데이터 삽입
            String sqlMember = "INSERT INTO member VALUES (?, ?, ?, ?)";
            psMember = con.prepareStatement(sqlMember);
            psMember.setString(1, "user1"); // id → // 오류 유발 코드 (동일한 PK 사용으로 에러 발생)
            psMember.setString(2, "password1"); // pw
            psMember.setString(3, "John Doe"); // name
            psMember.setString(4, "010-1234-5678"); // tel
            psMember.executeUpdate();
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
                if (psBoard != null) psBoard.close();
                if (psMember != null) psMember.close();
                if (con != null) con.close();
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }

        //end!

    }
    
}
