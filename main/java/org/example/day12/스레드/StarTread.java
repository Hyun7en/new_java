package org.example.day12.스레드;

public class StarTread extends Thread {

    @Override
    public void run() {
        String star = "*";
        for(int i = 0; i < 10; i++){
            System.out.println(star);
            star +=  "*";
        }
    }
}
