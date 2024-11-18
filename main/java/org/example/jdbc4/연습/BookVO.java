package org.example.jdbc4.연습;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class BookVO {
//    id INT AUTO_INCREMENT PRIMARY KEY, -- 고유 ID (자동 증가)
//    title VARCHAR(255) NOT NULL,       -- 책 제목 (필수)
//    author VARCHAR(100) NOT NULL,      -- 저자 이름 (필수)
//    publisher VARCHAR(100),            -- 출판사
//    published_date DATE,               -- 출판일
//    price DECIMAL(10, 2),              -- 가격 (소수점 2자리까지)
//    stock_quantity INT DEFAULT 0       -- 재고 수량 (기본값 0)
    private int id;
    private String title;
    private String author;
    private String publisher;
    private Date published_date;
    private int price;
    private int stock_quantity;
}
