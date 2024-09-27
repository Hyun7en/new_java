package org.example.day2.control;

public class 조건문switch {
    public static void main(String[] args) {
        int day = 5; //목
        //주말인지 판단하고 싶음.
        switch (day){ //실수X, LongX, Char, String
            case 1: case7:
                System.out.println("주말");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("평일");
                break;
        }
    }
}
