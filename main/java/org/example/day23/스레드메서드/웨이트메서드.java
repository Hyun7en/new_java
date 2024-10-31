package org.example.day23.스레드메서드;

class SharedResource {
    private boolean isProduced = false;

    public synchronized void produce() throws InterruptedException {
        if (isProduced) {
            wait(); // 자원이 소비될 때까지 대기
        }
        System.out.println("Producing resource...");
        isProduced = true;
        notify(); // 소비자에게 알림
    }

    public synchronized void consume() throws InterruptedException {
        if (!isProduced) {
            wait(); // 자원이 생성될 때까지 대기
        }
        System.out.println("Consuming resource...");
        isProduced = false;
        notify(); // 생산자에게 알림
    }
}

public class 웨이트메서드 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    resource.consume();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }

}