package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        // 기본형 변수를 정리 - 정수, 실수, 문자1, 논리
        float temp = 23.5f; // ==>> double
        byte date = 26; // -128 ~ 127 ==> int
        char day = '목';
        boolean food = false;
        food = true;

        String roomNo = "강의장 6호";

        // 콘솔로 변수 데이터를 출력하는 코드
        System.out.println("온도: " + temp);
        System.out.println("날짜: " + date);
        System.out.println("요일: " + day);
        System.out.println("음식 유무: " + food);
        System.out.println("강의실 번호: " + roomNo);
    }
}
