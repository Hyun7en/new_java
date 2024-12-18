package org.example.day12.상속;

public class SuperMan extends Man {

    public SuperMan(String name, char gender, int power) {
        super(name, gender, power);
        this.power = power;
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void powerUp() {
        super.powerUp();
    }

    @Override
    public void runQuickly() {
        super.runQuickly();
    }

    public void fly(){
        System.out.println("날음.");
    }
}
