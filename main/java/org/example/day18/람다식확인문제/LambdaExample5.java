package org.example.day18.람다식확인문제;

public class LambdaExample5 {
    public static void main(String[] args) {
        DifferenceFunctionalInterface diff = (a, b) -> a - b;
        System.out.println(diff.subtract(15,2));

    }

}
