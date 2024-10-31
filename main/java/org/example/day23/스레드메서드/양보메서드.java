package org.example.day23.스레드메서드;

class MyThread2 extends Thread {
    private String name;
    private int startNumber;

    public MyThread2(String name, int startNumber) {
        this.name = name;
        this.startNumber = startNumber;
    }

    public void run() {
        for (int i = startNumber; i <= 10; i += 2) {
            System.out.println(name + ": " + i);
            // CPU 양보 요청
            Thread.yield();
        }
    }
}



public class 양보메서드 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("Even Thread", 0); // 짝수만 출력
        MyThread2 t2 = new MyThread2("Odd Thread", 1);  // 홀수만 출력

        t1.start();
        t2.start();
    }
}


