package org.example.day16.추상클래스;

public class 전화기사용 {
    public static void main(String[] args) {
         //MegaPhone p1 = new MegaPhone(); //X, 인터페이스X
         //ApplePhone p2 = new ApplePhone(); //X, 추상클래스X
         ApplePhone1 p3 = new ApplePhone1(); //O, 일반클래스O
         ApplePhone2 p4 = new ApplePhone2(); //O, 일반클래스O
         ApplePhone p5 = p3;
        System.out.println(MegaPhone.DATA);
    }
}
