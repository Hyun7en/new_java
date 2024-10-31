package org.example.day23.스레드기본;

public class ThreadCreate implements Runnable {
    //Runable Interface 동시에 돌아가게 하고 싶은 것 넣어서 만들기
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("냐옹이");
        }
    }
}
