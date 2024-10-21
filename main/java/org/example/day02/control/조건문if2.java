package org.example.day02.control;

public class 조건문if2 {
    public static void main(String[] args) {
        int hour = 16;

        while(true) {
            if (hour <= 11) {
                System.out.println("아직 멀었네...");
            } else if (hour < 14) {
                System.out.println("좀 많이 남았네");
            } else if (hour < 18) {
                System.out.println("조금 남았다");
                break;
            } else {
                System.out.println("집 가는중");

            }//else
        }//while
        System.out.println("공부 많이 함.");
    }
}
