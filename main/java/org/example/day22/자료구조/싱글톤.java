package org.example.day22.자료구조;

public class 싱글톤 {
    private static 싱글톤 instance;
    private 싱글톤(){
        System.out.println("싱글톤 객체 생성됨.");
    }
    public static 싱글톤 getInstance(){
        if (instance == null){
            instance = new 싱글톤();
        }
        return instance;
    }
}