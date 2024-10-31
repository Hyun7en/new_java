package org.example.day23.스레드메서드;

class Sum {
    private int sum = 0;
    public synchronized void sum(int n) {
        sum += n;
    }
    public int getSum() {
        return sum;
    }
}

public class 문제Main1 {
    public static void main(String[] args) throws InterruptedException {
        Sum s = new Sum();
        //==> 스레드간 전역변수(인스턴스 변수, 스태틱 변수) 공유!
        // 스레드1은 1부터 100까지 Sum클래스의 sum메서드를 호출하여 sum변수에 더하는 처리
        // 스레드2는 2부터 200까지 Sum클래스의 sum메서드를 호출하여 sum변수에 더하는 처리
        Thread t1 = new Thread(
                () -> {
                    for (int i = 1; i <= 100; i++) {
                        s.sum(i);
                    }
                }
        );

        Thread t2 = new Thread(
                () -> {
                    for (int i = 2; i <= 200; i++) {
                        s.sum(i);
                    }
                }
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //최종sum값을 getSum을 통해 프린트
        System.out.println("최종 sum값>> " + s.getSum());
    }
}