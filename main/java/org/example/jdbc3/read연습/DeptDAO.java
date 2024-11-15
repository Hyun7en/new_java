package org.example.jdbc3.read연습;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptDAO {
    Connection con;//전역변수가 됨, null로 초기화!

    public DeptDAO() throws Exception {
        //new MemberDAO()할 때 클래스이름과 동일한 메서드인 생성자메서드가
        //                     자동호출됨.(1-2단계를 실행해줌)
        //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    //기능은 메서드로 정의
    //row하나 검색 --> 워크벤치에서  sql문으로 먼저 테스트
    public DeptVO one(int deptno) throws Exception {

        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);
        ResultSet rs = ps.executeQuery();

        DeptVO vo = new DeptVO();
        if(rs.next()) {
            vo.setDeptno(rs.getInt("deptno"));
            vo.setDname(rs.getString("dname"));
            vo.setLoc(rs.getString("loc"));

        }

        return vo;
    }
}