package org.example.day12.question;

public class Tread3 extends Thread {
    public void run() {
        String[] foods = {"a", "b", "c", "d", "e", "f"};

        for(String str : foods) {
            System.out.println(str);
        }
    }
}
