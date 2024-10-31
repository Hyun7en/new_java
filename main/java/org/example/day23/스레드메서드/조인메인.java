package org.example.day23.스레드메서드;

class Counter {
    private int count = 0;

    //순서를 줘서 동시에 들어가는 일이 없게끔 하게 하려면 -> synchronized
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class 조인메인 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // 메인 스레드에서 count 값을 출력 (join() 메서드 필요)
        System.out.println("Final count: " + counter.getCount());
    }
}