package org.example.day1.doit;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("여행 지역을 입력하세요: ");
        String country = sc.nextLine();

        System.out.print("1인당 경비를 입력하세요: ");
        int cost = sc.nextInt();

        System.out.print("여행 인원을 입력하세요: ");
        int people = sc.nextInt();

        System.out.print("할인율(%)을 입력하세요: ");
        int discount = sc.nextInt();
        sc.nextLine();


        System.out.print("VIP 여부 (true/false)를 입력하세요: ");
        boolean vip = sc.nextBoolean();
        sc.nextLine();

        System.out.print("당부의 말을 입력하세요: ");
        String say = sc.nextLine();

        System.out.println();
        System.out.println();

        System.out.println("===== 여행 경비 계산 결과 =====");
        System.out.println("여행 지역: " + country);
        System.out.println("1인당 경비: " + (double)cost);
        System.out.println("여행 인원: " + people + "명");
        System.out.println("기본 할인율:" + discount + "%");
        System.out.println("VIP 추가 할인율: 5%");

        double finalDiscountRate = ((double)discount + 5);
        System.out.println("최종 할인율: " + finalDiscountRate + "%");

        double totalCost = (double)cost*people;
        System.out.println("총 경비: " + totalCost);
        System.out.println("할인 금액: " + totalCost*(finalDiscountRate/100));
        System.out.println("할인 후 총 경비: " + (totalCost - (totalCost*(finalDiscountRate/100))));
        System.out.println("당부의 말: " + say);


    }
}
