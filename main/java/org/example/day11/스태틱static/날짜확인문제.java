package org.example.day11.스태틱static;

import java.time.LocalDateTime;

public class 날짜확인문제 {

    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        LocalDateTime end = now.plusWeeks(2);
        System.out.println(now);
        System.out.println(end);


    }
}
