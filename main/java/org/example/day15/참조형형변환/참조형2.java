package org.example.day15.참조형형변환;

public class 참조형2 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck(); //Car(부모) <--- Truck(자식), Taxi(자식)
        사람 person = new 사람(); //Car, Truck상관없음.

        car = truck; //부모클래스(개념적으로 크다.) <-- 자식클래스(개념적으로 작다.)
        //자동형변환
        truck = (Truck) car; //자식(작) <-- 부모(크), 강제형변환
        //person = car; 상속이 아니면 개념적으로 완전히 다르기 때문에 형변환 불가능!!!
        //public void call(Car c)
        //call(택시), call(트럭) : 가능
        //call(사람) : 불가능.!

    }
}
