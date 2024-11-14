package org.example.jdbc2;

import java.util.Scanner;

public class BoardUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no = sc.nextInt(); //apple
        System.out.print("writer입력>> ");
        String writer = sc.next(); //1111
        sc.nextLine();
        sc.close();

        BoardDAO dao = new BoardDAO();
        dao.update(no,writer);
    }
}