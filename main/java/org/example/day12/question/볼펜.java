package org.example.day12.question;

public class 볼펜 extends 학용품 {
     int thick;

    public 볼펜(int price, String company, int thick) {
        super(price, company);
        this.thick = thick;
    }

    public void write(){
        System.out.println("글을 쓰다");
    }

    @Override
    public String toString() {
        return "볼펜{" +
                "thick=" + thick +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
}
