package org.example.day02.doit;

import java.util.Scanner;

public class deepQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("먹고싶은 음식: ");
        String food = sc.next();

        switch (food) {
            case "아메리카노","카페라떼","아아":
                System.out.println("카페로 가세요");
                break;
            case "국밥":
                System.out.println("국밥 가게로 가세요");
                break;
            default:
                System.out.println("그러면 물을 마셔요.");
        }

        System.out.print("당신의 나이는: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("당신은 내년에 " + (age + 1) + "살이 됩니다.");

        System.out.print("국어 점수: ");
        int koreanScore = sc.nextInt();

        System.out.print("수학 점수: ");
        int mathScore = sc.nextInt();

        int result = (koreanScore + mathScore) / 2;

        System.out.println("평균 점수는 " + result + "입니다.");


    }
}
