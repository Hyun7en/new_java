package org.example.day12.question;

public class Main {
    public static void main(String[] args) {
        Laptop l = new Laptop(70,"silver");
        Tablet t = new Tablet(70,"blue",false);
        Smartphone s = new Smartphone(80,"red",20);

        System.out.println(l);
        System.out.println(t);
        System.out.println(s);

    }
}
