package org.example.day23.스레드기본;

public class 스레드메인익명클래스 {
    public static void main(String[] args) {

        //이 방법을 실무에서 더 많이 쓴다고 하심.
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println("-- 나는 별");
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println("-- 나는 $");
                }
            }
        };


        t1.start();
        t2.start();

        //end
    }
}
