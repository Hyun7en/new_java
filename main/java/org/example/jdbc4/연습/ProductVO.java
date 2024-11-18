package org.example.jdbc4.연습;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductVO {
//    ProductID INT AUTO_INCREMENT PRIMARY KEY,
//    ProductName VARCHAR(100) NOT NULL,
//    Price DECIMAL(10, 2) NOT NULL,
//    Quantity INT NOT NULL
    private int productID;
    private String productName;
    private int price;
    private int quantity;

}
