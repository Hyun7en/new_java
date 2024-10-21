package org.example.day15.참조형형변환;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class 참조형4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //가변길이, 여러개 데이터 다룰 때 사용
        list.add("hong"); //String -> Object(자동형변환)
        list.add(new Date()); //Date -> Object
        list.add(new Random()); //Random -> Object
        list.add(new Truck()); //Truck -> Object
        list.add(100); //정수
        //기본형을 참조형에 넣고 싶을 때
        //참조형(랩퍼클래스, 포장클래스)으로 만들어주면 된다.
        //자동 형변환인 경우 자동으로 해줌.
        // int -오토박싱-> Integer -자동형변환(업캐스팅)-> Object
        list.add(11.1); //실수, double -> Double -> Object
        list.add(true); //boolean -> Boolean -> Object
        list.add('a'); //char

        //System.out.println(list);
        //넣을 때는 다 모으고 싶어서 Object으로 형변환해서 다
        //집어 넣어놓음. add(Object o)
        System.out.println("----------------");
        //이제 꺼내보자.
        System.out.println(list.get(0)); //출력가능!
        Object name = list.get(0);
        //System.out.println(name.contains()); //XXX
        //Object으로 넣어두었기 때문에 Object으로 꺼내오게 되고
        //String메서드를 가지고 있지 않음.
        //꺼내서 String메서드를 쓸 때는 String으로 다시 만들어줘야
        //String메서드를 쓸 수 있다.
        String name2 = (String)list.get(0); //String(작) <- Object(큰)
        System.out.println(name2.contains("kim"));

        //날짜(Date) 꺼내서 현재 시/분을 프린트!

        Object date = list.get(1);
        //System.out.println(date.getHours()); //XXXX
        Date date2 = (Date)list.get(1); //Date <- Object
        System.out.println(date2.getHours() + ":" + date2.getMinutes() );
        int x = (Integer)list.get(4);
        //int <-오토언박싱- Integer <- Object
        Double y = (Double) list.get(5);
        double y2 = (double) list.get(5);
    }
}
