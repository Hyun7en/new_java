package org.example.day13.상속;

import java.util.Date;

public class 시각스레드 extends Thread{

    public void run(){
        for (int i = 0; i < 3000; i++) {
            System.out.println("시각 >> " + new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}