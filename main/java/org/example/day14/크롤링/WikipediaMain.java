package org.example.day14.크롤링;

import java.util.Scanner;

public class WikipediaMain {
    public static void main(String[] args) {
        WikipediaCrawler wiki = new WikipediaCrawler();

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("원하는 달을 입력해 주세요: ");
            int month = sc.nextInt();
            wiki.crawl(month);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}