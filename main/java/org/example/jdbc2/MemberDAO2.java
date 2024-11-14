package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
    private Connection con = null;

    public MemberDAO2() throws Exception {
        //new MemberDAO()할 때 클래스이름과 동일한 메서드인 생성자메서드가 자동호출됨.(1 - 2 단계를 실행해줌)
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


    //삽입
    public void insert(MemberVO vo) throws Exception {

        //3. sql준비 --> sql객체

        String sql = "insert into member values (?,?,?,?)";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, vo.getId()); //1은 ?번호
        ps.setString(2, vo.getPw());
        ps.setString(3, vo.getName());
        ps.setString(4, vo.getTel());
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    //삭제
    public void delete(String id값) throws Exception {

        //3. sql준비 --> sql객체

        String sql = "delete from member where id = ?";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id값); //1은 ?번호
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    //수정
    public void update(String id값, String tel값) throws Exception {

        //3. sql준비 --> sql객체

        String sql = "update member set tel = ? where id = ?";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tel값);
        ps.setString(2, id값);
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }
}