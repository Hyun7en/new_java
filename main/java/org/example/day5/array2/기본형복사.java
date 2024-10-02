package org.example.day5.array2;

public class 기본형복사 {
    public static void main(String[] args) {
        int 수학1 = 100;
        int 수학2 = 수학1; //기본형 복사!
        //변수에 들어있는 값을 다른 변수에 넣어주는 것!
        수학2 = 96;
        System.out.println(수학1 + " " + 수학2);
    }
}
