package org.example.day13.상속;

public class 배열스레드 extends Thread{
    String[] foods = {"a", "b", "c", "d", "e", "f"};

    public void run(){
        for (int i = 0; i < foods.length; i++) {
            System.out.println("배열 >> " + foods[i]);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
}