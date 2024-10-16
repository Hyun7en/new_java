package org.example.day12.question;

public class Tread1 extends Thread {
    public void run() {
        for(int i = 500; i > 0; i--){
            System.out.println(i);
        }
    }
}
