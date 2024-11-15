package org.example.jdbc3.read연습;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("금요일");
        list.add("토요일");
        list.add("일요일");
        System.out.println(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=============================");
        ArrayList<MemberVO> list2 = new ArrayList<>();
        MemberVO vo1 = new MemberVO();
        vo1.setId("11");
        vo1.setPw("11");

        MemberVO vo2 = new MemberVO();
        vo2.setId("22");
        vo2.setPw("22");

        list2.add(vo1);
        list2.add(vo2);
        System.out.println(list2);
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));


    }
}
