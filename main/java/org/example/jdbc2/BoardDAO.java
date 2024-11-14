package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDAO {
    private Connection con = null;

    public BoardDAO() throws Exception {

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
    public void insert(int no, String title, String content, String writer) throws Exception {

        //3. sql준비 --> sql객체

        String sql = "insert into BOARD values (?,?,?,?)";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, no); //1은 ?번호
        ps.setString(2, title);
        ps.setString(3, content);
        ps.setString(4, writer);
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    //수정
    public void update(int no, String writer) throws Exception {

        //3. sql준비 --> sql객체

        String sql = "update BOARD set writer =? where no = ?";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, writer); //1은 ?번호
        ps.setInt(2, no);
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

    //삭제
    public void delete(int no) throws Exception {

        //3. sql준비 --> sql객체

        String sql = "delete from BOARD where no = ?";

        //insert into member values ('apple',...)
        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, no); //1은 ?번호
        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        ps.close();
        con.close(); //관련 자원들 메모리에서 해제!
    }

}