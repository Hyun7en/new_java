package org.example.day1.oper;

public class Oper2 {
    public static void main(String[] args) {
        int x = 200;
        int y = 100;

        int sum = x + y;// 정수 + 정수 ==> 결과는 무조건 정수
        System.out.println(sum);

        double div = y/x; // 0.0 = 100/200(x)

        //자바는 정적타입핑이라 정수변수를 실수변수로 바꿀수는 없음.
        //cpu가 값을 가지공 와서 실수로 변경해주어야 한다.

        double div2 =  (double)y / x;
        //cpu가 타입을 변환하는 것을 casting(캐스팅)

        System.out.println(div2);

    }
}
