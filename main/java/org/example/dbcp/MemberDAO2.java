package org.example.dbcp;

import org.example.jdbc2.MemberVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO2 {
    Connection con;//전역변수가 됨, null로 초기화!
    DBConnectionMgr dbcp;

    public MemberDAO2() throws Exception {
        //싱글톤을 생성된 DBCP객체 획득
        dbcp = DBConnectionMgr.getInstance();
    }

    public void update(String id값, String tel값)
            throws Exception {

        con = dbcp.getConnection();
        //3. sql준비 --> sql객체
        String sql = "update member set tel = ? where id = ?";
        //==> MemberDAO의 update메서드를 수정하세요.
        //==> MemberUpdateUI.java를 만들어서 update처리해보세요.!

        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tel값); //1은 ?번호
        ps.setString(2, id값);

        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        dbcp.freeConnection(con, ps);
    }

    public void delete(String id값)
            throws Exception {

        con = dbcp.getConnection();
        //3. sql준비 --> sql객체

        String sql = "delete from member where id = ?";

        //ps가 ?를 셋팅하는 역할!
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id값); //1은 ?번호

        System.out.println("3. sql준비 --> sql객체 성공!");

        //4. sql전송 --> ps가 전송하는 기능을 가지고 있음.
        int result = ps.executeUpdate(); //실행된 row수, update, delete
        System.out.println("4. sql전송 성공!");
        System.out.println("실행된 row수 --> " + result + "개");

        dbcp.freeConnection(con, ps);
    }

    public void insert(MemberVO vo)
            throws Exception {

        con = dbcp.getConnection();

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

        dbcp.freeConnection(con, ps);
    }
}