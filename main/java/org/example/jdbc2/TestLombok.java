package org.example.jdbc2;

import org.apache.commons.math3.stat.descriptive.summary.Product;

public class TestLombok {
    public static void main(String[] args) {
        //1. 가방을 만들자.
        ProductVO vo = new ProductVO();

        //2. 가방에 데이터를 넣는다.
        vo.setNo(1);
        vo.setName("신발");
        vo.setContent("부츠");
        vo.setPrice(10000);

        //3. 가방을 전달하자.
        //4. 가방을 데이터화 하자.
        int no = vo.getNo();
        String name = vo.getName();
        String content = vo.getContent();
        double price = vo.getPrice();

        System.out.println(no + " " + name + " " + content + " " + price);
        System.out.println(vo);
    }
}
