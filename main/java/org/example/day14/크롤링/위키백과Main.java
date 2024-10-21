package org.example.day14.크롤링;

import java.util.Scanner;

public class 위키백과Main {
    public static void main(String[] args) {
        엑셀크롤러 excelCrawl = new 엑셀크롤러();
        Scanner sc = new Scanner(System.in);

        excelCrawl.saveExcelForYear();
    }
}