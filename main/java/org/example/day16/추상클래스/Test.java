package org.example.day16.추상클래스;

public class Test extends ApplePhone{
    @Override
    public void camera() {
        System.out.println("추상클래스를 상속한 경우 반드시 구현!");
    }
}
