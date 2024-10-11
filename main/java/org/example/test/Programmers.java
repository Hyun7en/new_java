package org.example.test;

public class Programmers {
    public static void main(String[] args) {

        String before = "olleh";
        String after = "hello";
        int answer = 0;

        String reversedBefore = new StringBuilder(before).reverse().toString();

        if (reversedBefore.equals(after)) {
            answer = 1;
        } else {
            answer =  0;
        }

        System.out.println(answer);
        //end
    }


}

