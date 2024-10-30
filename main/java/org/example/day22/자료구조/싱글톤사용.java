package org.example.day22.자료구조;

public class 싱글톤사용 {
    public static void main(String[] args) {
        싱글톤 s1 = 싱글톤.getInstance();
        싱글톤 s2 = 싱글톤.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}