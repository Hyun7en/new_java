package org.example.jdbc4.연습;

import java.util.ArrayList;

public class ProductListUI {
    public static void main(String[] args) throws Exception {
        ProductDAO dao = new ProductDAO(); //1-2단계
        //모든 리스트를 가지고 오자.
        ArrayList<ProductVO> list = dao.list();
        //반복해서 꺼내서 출력~!  {vo, vo}
        if(list != null ) {
            for (ProductVO bag : list) {
                System.out.println("검색한 productID>> " + bag.getProductID());
                System.out.println("검색한 productName>> " + bag.getProductName());
                System.out.println("검색한 price>> " + bag.getPrice());
                System.out.println("검색한 quantity>> " + bag.getQuantity());
                System.out.println("------------------------");
            }
        }else{
            System.out.println("상품 리스트가 없습니다.");
        }

        //end
    }
}
