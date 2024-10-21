package org.example.day07.class사용;


import org.example.day07.class만들기.Dog;
import org.example.day07.class만들기.Television;

public class 내거실 {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.powerOn();
        //tv.changeCh();
        tv.powerOff();

        System.out.println(tv.size);
        System.out.println(tv.price);

        tv.size = "small";
        tv.price = 10000;

        System.out.println(tv.size);
        System.out.println(tv.price);

        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog.name = "메리";
        dog.age = 5;

        dog2.name = "꾸숑";
        dog2.age = 6;

        System.out.println(dog.name + " " + dog.age);
        System.out.println(dog2.name + " " + dog2.age);

        dog.꼬리를흔들다();
        dog2.자다();
    }
}