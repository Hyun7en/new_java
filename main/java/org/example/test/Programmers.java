package org.example.test;

public class Programmers {
    public static void main(String[] args) {
        int age = 23;

        String age1 = String.valueOf(age);

        for(int i = 0; i < age1.length(); i++){
            age1.charAt(i);
        }


        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');


        System.out.println(a);

    }
}

