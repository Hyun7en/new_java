package org.example.test;

public class Programmers {
    static int a = 10;
    public static void main(String args[]) {
        a =11;
        Programmers.add();
        Programmers.add();
    }

    public static void add(){
        a = a + 1;
        System.out.println(a);
    }
}
