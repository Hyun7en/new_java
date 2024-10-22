package org.example.day16.문제;

public class BananaComputer implements Computer {

    public BananaComputer() {
        System.out.println("-----Banana Computer-----");
    }

    @Override
    public void start() {
        System.out.println("Banana computer start");
    }

    @Override
    public void shutdown() {
        System.out.println("Banana computer shutdown");
    }

    @Override
    public void restart() {
        System.out.println("Banana computer restart");
    }
}
