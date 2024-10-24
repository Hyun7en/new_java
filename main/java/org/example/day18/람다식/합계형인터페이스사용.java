package org.example.day18.람다식;

public class 합계형인터페이스사용 {
    public static void main(String[] args) {
        합계인터페이스 sum = (a, b) -> a + b;
        System.out.println(sum.add(100,200));

        합계인터페이스 sum2 = (a, b) -> (a + 100) + (b - 100);
        System.out.println(sum2.add(100,50));
    }
}
