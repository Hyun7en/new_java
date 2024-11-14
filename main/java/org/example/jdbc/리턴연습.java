package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

public class 리턴연습 {
    public Date getDate(){
        Date date = new Date(); //호출했을 때의 년월일시분초
        return date;
    }

    public int[] getArray(){
        int[] arr = {1, 2, 3};
        return arr;
    }

    public Connection getConnection(String url) throws Exception {
        Connection con = DriverManager.getConnection(url);
        return con;
    }

    public Connection getConnection(String url, String id, String pw) throws Exception {
        Connection con = DriverManager.getConnection(url, id, pw);
        return con;
    }

    public void getSum(int x, double y){
        System.out.println(x + y);
    }

    public int getSum(int x){
        return x + 1000; // 포인트 추가
    }
}