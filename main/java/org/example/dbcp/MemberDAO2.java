package org.example.dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO2 {
    Connection con;//전역변수가 됨, null로 초기화!
    DBConnectionMgr dbcp;

    public MemberDAO2() throws Exception {
        //싱글톤을 생성된 DBCP객체 획득
        dbcp = DBConnectionMgr.getInstance();
    }

    public MemberVO one(String id) throws Exception {
        con = dbcp.getConnection();
        String sql = "select * from member where id  = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        ResultSet table  = ps.executeQuery(); //테이블 형태로 mysql로 부터 받아와야할 때 사용


        //UI로 ResultSet에 있는 것 있으면 꺼내서 vo에 넣어서 전달하자!
        MemberVO vo = new MemberVO();
        if(table.next()){
            vo.setId(table.getString("id")); //컬럼명 선호!
            vo.setPw(table.getString("pw")); //인덱스 사용 가능!
            vo.setName(table.getString("name"));
            vo.setTel(table.getString("tel"));
        }
        dbcp.freeConnection(con, ps, table);
        return vo;
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

        //dbcp.freeConnection(con, ps);
    }
}