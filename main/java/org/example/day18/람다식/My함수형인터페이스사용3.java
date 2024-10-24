package org.example.day18.람다식;

//3. 람다식(람다함수, 익명함수)으로 바로 구현해서 사용하는 방법
public class My함수형인터페이스사용3 {
    public static void main(String[] args) {
       My함수형인터페이스 my = () -> System.out.println("3. 람다식으로 구현함.");
        my.my메서드();
    } //main
} //class
