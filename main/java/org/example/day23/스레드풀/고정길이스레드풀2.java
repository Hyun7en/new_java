package org.example.day23.스레드풀;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 고정길이스레드풀2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
// 작업 제출
        // 작업을 여러 개 제출
        for (int i = 1; i <= 5; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " 스레드 실행 중 " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // 작업을 2초 동안 실행
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskNumber + " 인터럽트되어 중단");
                }
                System.out.println("Task " + taskNumber + " 스레드 실행 완료");
            });
        }

        executor.shutdownNow();
        executor.submit(() -> {
            System.out.println("Task6  스레드 실행 중 " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // 작업을 2초 동안 실행
            } catch (InterruptedException e) {
                System.out.println("Task6 인터럽트되어 중단");
            }
            System.out.println("Task6  스레드 실행 완료");
        });


        System.out.println("스레드 풀 전체 셧다운");
    }
}