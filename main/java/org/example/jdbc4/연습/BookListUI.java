package org.example.jdbc4.연습;

import java.util.ArrayList;

public class BookListUI {
    public static void main(String[] args) throws Exception {
        BookDAO dao = new BookDAO(); //1-2단계
        //모든 리스트를 가지고 오자.
        ArrayList<BookVO> list = dao.list();
        //반복해서 꺼내서 출력~!  {vo, vo}
        for (BookVO bag: list){
            System.out.println("검색한 id>> " + bag.getId());
            System.out.println("검색한 title>> " + bag.getTitle());
            System.out.println("검색한 author>> " + bag.getAuthor());
            System.out.println("검색한 publisher>> " + bag.getPublisher());
            System.out.println("검색한 published_Date>> " + bag.getPublished_date());
            System.out.println("검색한 price>> " + bag.getPrice());
            System.out.println("검색한 stock_quantity>> " + bag.getStock_quantity());
            System.out.println("------------------------");
        }

        //end
    }
}
