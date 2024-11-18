package org.example.jdbc4.연습;

import java.sql.*;
import java.util.ArrayList;

public class ProductDAO {
    private Connection con;

    public ProductDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");

    }

    public ProductVO one(int id) throws SQLException {
        ProductVO bag = null;
        String sql = "select * from Product where productID =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            bag = new ProductVO();

            bag.setProductID(rs.getInt("productID"));
            bag.setProductName(rs.getString("productName"));
            bag.setPrice(rs.getInt("price"));
            bag.setQuantity(rs.getInt("quantity"));


        }

        return bag;

    }

    public ArrayList<ProductVO> list() throws SQLException {
        ArrayList<ProductVO> list = null;
        //good
        String sql = "select * from Product";
        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet table = ps.executeQuery();
        while(table.next()){
            if ( list == null) {
                list = new ArrayList<>();
            }

            ProductVO bag = new ProductVO();
            bag.setProductID(table.getInt("productID"));
            bag.setProductName(table.getString("productName"));
            bag.setPrice(table.getInt("price"));
            bag.setQuantity(table.getInt("quantity"));

            list.add(bag);
        }

        return list;
    }
}
