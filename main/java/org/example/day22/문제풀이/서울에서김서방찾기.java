package org.example.day22.문제풀이;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                System.out.println("김서방은 " + i + "에 있다.");
            }
        }//for

        //이진검색!
        System.out.println(Arrays.binarySearch(seoul, "Kim")); //1
        System.out.println(Arrays.binarySearch(seoul, "Jane")); //0
        System.out.println(Arrays.binarySearch(seoul, "Park")); //음수
        //3, 5, 7, 8, 1
        //1-3-5-7-8
    }
}