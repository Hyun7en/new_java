package org.example.jdbc2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductVO {
    private int no;
    private String name;
    private String content;
    private int price;

    @Override
    public String toString() {
        return "ProductVO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", price=" + price +
                '}';
    }
}