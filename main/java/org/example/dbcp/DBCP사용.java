package org.example.dbcp;

public class DBCP사용 {
    public static void main(String[] args) {
        DBCP dbcp1 = DBCP.getInstance();
        //없으면 만들어서 리턴, 있으면 있는거 리턴
        System.out.println(dbcp1);
        DBCP dbcp2 = DBCP.getInstance();
        //없으면 만들어서 리턴, 있으면 있는거 리턴
        System.out.println(dbcp2);
        
    }}
