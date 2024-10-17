package org.example.day13.예외처리;

public class 에러발생2 {

    public void call(){
        try{
            System.out.println(10 / 0);
        }catch (Exception e){
            System.out.println("예외 처리 내가 함");
        }

    }

}
