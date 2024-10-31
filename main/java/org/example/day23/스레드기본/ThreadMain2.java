package org.example.day23.스레드기본;

public class ThreadMain2 {
    public static void main(String[] args) {
       Thread t1 = new Thread(new ThreadCreate());
       Thread t2 = new Thread(new ThreadCreate2());
       t1.start();
       t2.start();

    }
}
