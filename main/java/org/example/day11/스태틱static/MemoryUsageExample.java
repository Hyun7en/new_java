package org.example.day11.스태틱static;

public class MemoryUsageExample {

    // static 변수를 사용하는 경우
    static class StaticExample {
        static Integer[] staticArray = new Integer[100000]; // 100,000개의 Integer 객체를 저장하는 static 배열
    }

    // static 변수를 사용하지 않는 경우
    static class NonStaticExample {
        Integer[] nonStaticArray;

        NonStaticExample() {
            nonStaticArray = new Integer[100000]; // 100,000개의 Integer 객체를 저장하는 non-static 배열
        }
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // static 변수를 사용하는 경우
        long beforeStatic = runtime.totalMemory() - runtime.freeMemory();
        StaticExample staticExample = new StaticExample(); // static 변수를 초기화
        long afterStatic = runtime.totalMemory() - runtime.freeMemory();
        long staticMemoryUsed = afterStatic - beforeStatic;

        // 메모리 사용량 출력
        System.out.println("Static Example - Memory Used: " + staticMemoryUsed / (1024 * 1024) + " MB");

        // 약간의 지연 추가
        try {
            Thread.sleep(100); // 100밀리초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // static 변수를 사용하지 않는 경우
        long beforeNonStatic = runtime.totalMemory() - runtime.freeMemory();
        NonStaticExample nonStaticExample = new NonStaticExample(); // non-static 변수를 초기화
        long afterNonStatic = runtime.totalMemory() - runtime.freeMemory();
        long nonStaticMemoryUsed = afterNonStatic - beforeNonStatic;

        // 메모리 사용량 출력
        System.out.println("Non-Static Example - Memory Used: " + nonStaticMemoryUsed / (1024 * 1024) + " MB");
    }
}
