package org.example.day19.디자인패턴;

public class User implements Observer{
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "가 메서드를 보냄>> " + message);
    }
}