package org.example.day16.추상클래스;

public class ApplePhone1 extends ApplePhone{
    @Override
    public void camera() {
        System.out.println("렌즈 1개짜리 카메라로 찍다.");
    }
    //추상클래스를 상속받은 경우
    //무조건!!!!! 추상메서드를 일반메서드로 오버라이드해서
    //구현해주어야 함.

}
