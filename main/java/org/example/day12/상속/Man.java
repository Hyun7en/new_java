package org.example.day12.상속;

public class Man  extends Person{

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void powerUp(){
        System.out.println("힘이 나름 쎔");
    }

    public void runQuickly(){
        System.out.println("빨리 달림");
    }
}
