package org.example.day09.uml문제;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "햄버거";
        item1.price = 50.5;
        Item item2 = new Item();
        item2.name = "냉면";
        item2.price = 60.5;
        Item item3 = new Item();
        item3.name = "커피";
        item3.price = 5.5;
        Item[] items = {item1, item2, item3};
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 메뉴 중 3번 주문하세요. (번호입력: 주문, x: 종료)");
        //메뉴 출력
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + "-> " + items[i].getName() + ": " + items[i].getPrice() + "$");
        }
        //메뉴 보고 주문
        String n = sc.nextLine(); //"1 2 3"
        String[] s = n.split(" ");//{"1", "2", "3"}
        System.out.println("주문 내용입니다.--------------");
        for (int i = 0; i < s.length; i++) {
            int s2 = Integer.parseInt(s[i]); //1 <-- "1"
            System.out.println(items[s2 - 1].getName() + " " + items[s2 - 1].getPrice() + "$");
        }
        sc.close();

        System.out.println();
        //System.out.println("1-> " + item1.getName() + ": " + item1.getPrice() + "$");
        //System.out.println("2-> " + item2.getName() + ": " + item2.getPrice() + "$");
        //System.out.println("3-> " + item3.getName() + ": " + item3.getPrice() + "$");

    }
}