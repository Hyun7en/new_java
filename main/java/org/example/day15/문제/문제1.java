package org.example.day15.문제;

import java.util.ArrayList;
import java.util.List;

public class 문제1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("박소정");
        list.add("김경민");
        list.add("소지현");
        list.add("김개빈");

        System.out.println("초기 참가자 목록: " + list);
        list.remove("박소정");
        System.out.println("탈락 후 참가자 목록: " + list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(i + 1 + "등: " + list.get(i));
        }

    }
}
