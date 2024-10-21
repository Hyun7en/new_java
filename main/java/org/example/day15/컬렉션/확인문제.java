package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class 확인문제 {
    public static void main(String[] args) {
        HashSet tour = new HashSet();
        tour.add("제주도");
        tour.add("울릉도");
        tour.add("독도");
        tour.add("일본");
        tour.add("대만");
        System.out.println(tour);
        //반복문이용해서 하나씩꺼내와서 처리
        //순서X, 인덱스없음.
        //인덱스가 없어도 for-each는 가능.
        for (Object x: tour){
            // System.out.println(x);
        }
        //반복해서 꺼내주는 부품을 달아주세요.
        //반복자(iterator,이터레이터)
        Iterator it = tour.iterator();
//        while (true){
//            if(it.hasNext()){
//                //꺼내줄꺼 있는지 체크먼저 해야함.
//                Object x = it.next();//꺼내줌.
//                System.out.println(x);
//            }
//        }//
        while (it.hasNext()){
            //꺼내줄꺼 있는지 체크먼저 해야함.
            Object x = it.next();//꺼내줌.
            System.out.println(x);
        }
    }
}