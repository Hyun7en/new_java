package org.example.day18.람다식확인문제;

public class LambdaExample4 {
    public static void main(String[] args) {

//        StringLengthFunctionalInterface my = input -> input.length();
        StringLengthFunctionalInterface my = input ->{
            int cnt = 0;
            for(char c : input.toCharArray()){
                cnt++;
            }
            return cnt;
        };

        System.out.println(my.getLength("give me String length please"));
    }
}

