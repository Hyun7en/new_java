package org.example.jdbc4.연습;

import java.util.Scanner;

public class BookOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BookDAO dao = new BookDAO();
        System.out.print("검색할 책의 id를 입력하세요 >> ");
        int id = sc.nextInt();

        BookVO bag = dao.one(id);
        System.out.println(bag);

    }
}
