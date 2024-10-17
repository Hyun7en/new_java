package org.example.day13.예외처리;

public class 배열에러01 {

    public void array(){
        int[] arr = {1,2,3};

        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("예외 처리 내가 함");
        }
    }

}