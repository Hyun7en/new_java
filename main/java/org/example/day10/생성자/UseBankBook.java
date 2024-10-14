package org.example.day10.생성자;

public class UseBankBook {
    public static void main(String[] args) {
        //인스턴스 변수 --> 3개
        ///인스턴스 변수는 생성된 객체(클래스의 인스턴스)의 실제값(인스턴스)을
        //저장하기 위한 변수
        //==> 객체 생성할 때마다 힙영역에 생긴다!
        BankBook dad = new BankBook("홍길동","111",10000);
        System.out.println(dad);

        BankBook me = new BankBook("고병현","12222",90000000);
        System.out.println(me);

        System.out.println(dad.getAvg());



        //end
    }
}
