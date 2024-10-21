package org.example.day01.var;

public class Basic3 {
    public static void main(String[] args) {
        System.out.println("기본형 연습3");

        //정수 : byte(127), short, int , long
        byte age = 120; //120
        short  count = 25000; //+-3만
        int money = 1000000; // +- 21억
        long bank = 22222222222l; // l or L을 붙여줘야됨

        //실수 : float, double
        float  weight = 55.55555555f; //f or F를 붇여줌 double이 기본형이라
        double height = 188.88888;

        String name = "홍길동"; // 0글자 이상 (문자열)
        String job = "자바 프로그래머";

        //내가 미래에 가질 재산 프린트(money + bank)
        // 홍길동은 자바 프로그래머이다. 프린트(name + job)

        System.out.println("내가 미래에 가질 재산은 " + money + bank + "이다");
        System.out.println(name + "은 " + job + "이다");


    }
}
