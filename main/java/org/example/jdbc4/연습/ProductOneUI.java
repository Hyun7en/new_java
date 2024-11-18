package org.example.jdbc4.연습;

import java.util.Scanner;

public class ProductOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();
        System.out.print("검색할 상품의 id를 입력하세요 >> ");
        int id = sc.nextInt();


        ProductVO bag = dao.one(id);
        if(bag != null) {
            System.out.println(bag);
        }else{
            System.out.println("검색한 상품이 없습니다.");
        }

    }
}
