package org.example.day12.상속;

public class Person {
    String name;
    char gender;

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void sleep(){
        System.out.println("잠을 잠.");
    }

    public void eat(){
        System.out.println("밥을 먹음.");
    }
}
