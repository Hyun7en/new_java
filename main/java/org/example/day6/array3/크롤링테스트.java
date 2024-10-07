package org.example.day6.array3;

import org.jsoup.Jsoup;

public class 크롤링테스트 {
    public static void main(String[] args) {
        Jsoup.connect("https://finance.naver.com/sise/");
        System.out.println("인터넷 사이트 연결 성공");
    }
}
