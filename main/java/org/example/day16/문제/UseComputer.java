package org.example.day16.문제;

public class UseComputer {
    public static void main(String[] args) {
        AppleComputer apple = new AppleComputer();
        apple.start();
        apple.shutdown();
        apple.restart();

        BananaComputer banana = new BananaComputer();
        banana.start();
        banana.shutdown();
        banana.restart();


    }
}
