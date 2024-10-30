package org.example.day22.문자열;

import java.util.TreeSet;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        //TreeSet<Integer> n = new TreeSet<>(); //오름차순 자동정렬
        TreeSet<Integer> n = new TreeSet<>(); //내림차순 자동정렬
        n.add(100);
        n.add(15);
        n.add(1);
        n.add(200);
        n.add(5);
        System.out.println(n);
    }
}
