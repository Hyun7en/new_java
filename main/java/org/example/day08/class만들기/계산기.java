package org.example.day08.class만들기;


public class 계산기 {

    //필드 X
    //함수명(파라메터,....)
    //파라메터 --> 매개변수
    //사용하는 곳과 실제 처리하는 곳에
    //중간 다리 역할의 변수라고 해서
    //매개변수라고 함.
    //인자, 파라메터, 매개변수 <--> 인수(데이터, argument)
    public int 더하기(int n1, int n2){
        System.out.println("더하기 기능 처리 내용");
        System.out.println(n1 + n2);
        return n1 + n2;
    }

    public void 빼기(int x, int y){
        System.out.println("빼기 기능 처리 내용");
        System.out.println(x - y);
    }

    public void  곱하기(int x, int y){
        System.out.println("곱하기 기능 처리 내용");
        System.out.println(x * y);
    }

    public void 나누기(int x, int y){
        System.out.println("나누기 기능 처리 내용");
        System.out.println(x / y);
    }
}