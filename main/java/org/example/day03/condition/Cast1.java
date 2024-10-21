package org.example.day03.condition;

public class Cast1 {
    public static void main(String[] args) {
        //타입이 다른 변수에 너허어야 하는 경우
        // 자동(작은 공간에 있던 데이터 --> 큰 공간에 넣을 때)
        byte x = 100;
        int y = x;
        System.out.println(x + " " + y);

        //강제(큰 공간에 있던 데이터 --> 작은 공간에 넣을 때)
        //강제형변환, 명시적 형변환
        int x2 = 100;
        byte y2 = (byte) x2;
        System.out.println(x2 + " " + y2);


    }
}
