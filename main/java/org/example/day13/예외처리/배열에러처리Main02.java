package org.example.day13.예외처리;

public class 배열에러처리Main02 {
    public static void main(String[] args) {
        배열에러02 arr2 = new 배열에러02();
        try {
            arr2.array();
        } catch (Exception e) {
            System.out.println("예외 처리 Main에서 함");
        }

    }

}
