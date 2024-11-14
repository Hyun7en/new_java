package org.example.jdbc2;

import java.util.Scanner;

public class BoardInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no = sc.nextInt(); //apple
        System.out.print("title입력>> ");
        String title = sc.next(); //1234
        sc.nextLine();

        System.out.print("content입력>> ");
        String content = sc.nextLine(); //apple
        System.out.print("writer입력>> ");
        String writer = sc.next(); //1111
        sc.close();

        BoardDAO dao = new BoardDAO();
        dao.insert(no,title,content,writer);
    }
}