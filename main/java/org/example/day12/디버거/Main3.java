package org.example.day12.디버거;

import org.example.day10.생성자.Car;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("첫 번째 함수 호출");
        double result1 = firstFunction(3, 4);
        System.out.println("두 번째 함수 호출");
        double result2 = secondFunction(7, 2);
        System.out.println(result1 + ", " + result2);

        Car car = new Car();
        car.speedUp();
    }
    public static int firstFunction(int a, int b) {
        int sum = a + b;
        System.out.println("첫 번째 함수 결과: " + sum);
        return sum;
    }
    public static int secondFunction(int x, int y) {
        int product = x * y;
        System.out.println("두 번째 함수 결과: " +
                product);
        return product;
    }
}
