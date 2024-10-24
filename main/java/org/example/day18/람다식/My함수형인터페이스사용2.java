package org.example.day18.람다식;

//2. 이름없는 클래스(익명클래스)로 바로 구현해서 사용하는 방법
public class My함수형인터페이스사용2 {
    public static void main(String[] args) {
        My함수형인터페이스 my = new My함수형인터페이스() {
            @Override
            public void my메서드() {
                System.out.println("2번 이름없는 클래스로 구현함.");
            } //메서드
        }; //익명클래스

        my.my메서드();
    } //main
} //class