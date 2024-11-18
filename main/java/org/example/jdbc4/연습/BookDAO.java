package org.example.jdbc4.연습;

import java.sql.*;
import java.util.ArrayList;

public class BookDAO {
    private Connection con;

    public BookDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");

    }

    public BookVO one(int id) throws SQLException {
        BookVO bag = new BookVO();

        String sql = "select * from book where id =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            bag.setId(rs.getInt("id"));
            bag.setTitle(rs.getString("title"));
            bag.setAuthor(rs.getString("author"));
            bag.setPublisher(rs.getString("publisher"));
            bag.setPublished_date(rs.getDate("published_date"));
            bag.setPrice(rs.getInt("price"));
            bag.setStock_quantity(rs.getInt("stock_quantity"));


        }

        return bag;
    }

    public ArrayList<BookVO> list() throws SQLException {
        ArrayList<BookVO> list = new ArrayList<>();

        String sql = "select * from book";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet table = ps.executeQuery();
        while(table.next()){
            BookVO bag = new BookVO();
            bag.setId(table.getInt("id"));
            bag.setTitle(table.getString("title"));
            bag.setAuthor(table.getString("author"));
            bag.setPublisher(table.getString("publisher"));
            bag.setPublished_date(table.getDate("published_date"));
            bag.setPrice(table.getInt("price"));
            bag.setStock_quantity(table.getInt("stock_quantity"));
            list.add(bag);
        }

        return list;
    }
}
