package org.example.day23.스레드기본;

public class 스레드메인인터페이스 {
    public static void main(String[] args) {
        //함수형 인터페이스(functional interface)는 추상메서드가 1개만 정의된 인터페이스를 통칭하여 일컫는다.
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println("hi");
                }
            }
        });

        //이 인터페이스 형태의 목적은 자바에서 람다 표현식(Lambda Expression)Visit Website을 이용해 함수형 프로그래밍을 구현하기 위해서 이다.
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println("hello");
                }
            }
        });


        t1.start();
        t2.start();

        //end
    }
}
