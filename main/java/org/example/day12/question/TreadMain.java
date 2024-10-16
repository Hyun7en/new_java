package org.example.day12.question;

public class TreadMain {
    public static void main(String[] args) {
        Tread1 t1 = new Tread1();
        Tread2 t2 = new Tread2();
        Tread3 t3 = new Tread3();


        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();  // t1이 완료될 때까지 대기
            t2.join();  // t2가 완료될 때까지 대기
            t3.join();  // t3가 완료될 때까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
}




