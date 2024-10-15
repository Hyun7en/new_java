package org.example.day11.스태틱static;

public class Musinsa {
    //관리자, 카테고리, 상품명, 상품수, 가격
    private static int admin;
    private String category;
    private String productName;
    private int productStock;
    private int price;

    public Musinsa(String category, String productName, int productStock, int price) {
        this.category = category;
        this.productName = productName;
        this.productStock = productStock;
        this.price = price;
    }


    @Override
    public String toString() {
        return " < Musinsa > " + "\n" +
                "category = " + category +
                " productName = " + productName + "\n" +
                "productStock = " + productStock +
                " price = " + price  + " 등록 완료!";
    }
}
