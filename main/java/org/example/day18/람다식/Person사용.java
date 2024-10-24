package org.example.day18.람다식;

public class Person사용 {
    public static void main(String[] args) {
        Person person = new Person();
        person.action1((x, y) -> {
            System.out.println(x + "님은");
            System.out.println(y + "입니다.");
        }, "임아무개", "프로그래머");

        //person.action1((x, y) -> System.out.println(x + "님은 "  + y + "입니다."));
        person.action2(x -> System.out.println(x + "가 내용입니다."), "배불러요!");
        person.action2(x -> 처리함수.staticPrint(x), "배불러요!");
        person.action2(처리함수::staticPrint, "배불러요!");

        처리함수 p = new 처리함수();
        person.action1((x, y) -> p.generalPrint(x, y), "임아무개", "프로그래머");
        person.action1(p::generalPrint, "임아무개", "프로그래머");
    }
}

