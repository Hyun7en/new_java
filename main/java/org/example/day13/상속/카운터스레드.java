package org.example.day13.상속;

public class 카운터스레드 extends Thread{
    //필드
    //메서드 --> 기능이 중요!!
    //public void run(){} : 동시에 실행하고 싶은 내용
    //                      비어있는 상태
    //override(== overwrite, 재정의)
    public void run(){
        for (int i = 500; i > 0; i--) {
            System.out.println("카운터 >> " + i);
            try {
                Thread.sleep(500); //1초(1000), 500(0.5초)
            } catch (InterruptedException e) {
                System.out.println("문제가 생김.");
            }
        }
    }
    //public void start(){ 구현된 상태! } :
    //JVM은 실행목록을 가지고 가지고 있음.
    //      실행할 것들을 실행목록에 리스트업해두고
    //      스레드는 왔다갔다하면서 조금씩 실행함.

}