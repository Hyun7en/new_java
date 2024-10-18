package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class 크롤링테스트4 {
    public static void main(String[] args) {

        try {
            Document document = Jsoup.connect("https://news.naver.com/?viewType=pc").get();
            Elements list = document.select("Nitem_link_menu");
                //class가 nav인 태그를 다 찾ㄷ아서 묶어서 와줘!
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                Element element = list.get(i);
                System.out.println(i + " " + element.text());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
