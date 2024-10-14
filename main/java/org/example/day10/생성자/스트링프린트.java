package org.example.day10.생성자;

import java.util.ArrayList;
import java.util.HashSet;

public class 스트링프린트 {
    public static void main(String[] args) {
        int[] n1 = {1,2,3}; //배열, 고정길이
        System.out.println(n1); //[I@5ca881b5

        ArrayList<Integer> list = new ArrayList<>(); //배열과 유사, 가변
        list.add(100);
        list.add(200);
        System.out.println(list); //[100,200]

        HashSet<Integer> set = new HashSet<>();//가변 + 중복제거!!
        set.add(100);
        set.add(100);
        set.add(200);
        System.out.println(set); //[100.200.300]


        //end
    }

}
