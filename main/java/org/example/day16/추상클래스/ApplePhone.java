package org.example.day16.추상클래스;

public abstract class ApplePhone implements MegaPhone{

    int size; //필드 가능

    public abstract void camera();
    //상속받은 곳에서 반드시 구현하도록 강제성을 클래스에서 지정하고 싶을 때
    //클래서내에서 추상메서드 사용 가능.!
    //이 클래스로는 객체 생성불가능!

    @Override
    public void siri() {
        System.out.println("시리기능 구현");
    }

    @Override
    public void map() {
        System.out.println("지도 기능 구현");
    }

    @Override
    public void internet() {
        System.out.println("지도 기능 구현");
    }

    @Override
    public void call() {
        System.out.println("전화 기능 구현");
    }

    @Override
    public void text() {
        System.out.println("문자 기능 구현");
    }

    @Override
    public void kakao() {
        System.out.println("kakao 기능 구현");
    }
}
