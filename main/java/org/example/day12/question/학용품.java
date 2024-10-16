package org.example.day12.question;

public class 학용품 {
     int price;
     String company;


    public 학용품(int price, String company) {
        this.price = price;
        this.company = company;
    }

    public void buy(){
        System.out.println("학용품을 사다");
    }
}
