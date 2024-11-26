package org.example.dbcp;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAOHikari {
    private final DataSource dataSource;

    public MemberDAOHikari() {
        this.dataSource = HikariCPDataSource.getInstance().getDataSource(); // 싱글톤 인스턴스 활용
    }

    public MemberVO one(String id) throws Exception {
        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM member WHERE id = ?")) {
            ps.setString(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    MemberVO vo = new MemberVO();
                    vo.setId(rs.getString("id"));
                    vo.setPw(rs.getString("pw"));
                    vo.setName(rs.getString("name"));
                    vo.setTel(rs.getString("tel"));
                    return vo;
                }
            }
        }
        return null;
    }

    public void update(String id, String tel) throws Exception {
        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement("UPDATE member SET tel = ? WHERE id = ?")) {
            ps.setString(1, tel);
            ps.setString(2, id);
            int result = ps.executeUpdate();
            System.out.println("Update 완료: " + result + "개 행 수정됨");
        }
    }

    public void delete(String id) throws Exception {
        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM member WHERE id = ?")) {
            ps.setString(1, id);
            int result = ps.executeUpdate();
            System.out.println("Delete 완료: " + result + "개 행 삭제됨");
        }
    }

    public void insert(MemberVO vo) throws Exception {
        try (Connection con = dataSource.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO member VALUES (?, ?, ?, ?)")) {
            ps.setString(1, vo.getId());
            ps.setString(2, vo.getPw());
            ps.setString(3, vo.getName());
            ps.setString(4, vo.getTel());
            int result = ps.executeUpdate();
            System.out.println("Insert 완료: " + result + "개 행 추가됨");
        }
    }
}