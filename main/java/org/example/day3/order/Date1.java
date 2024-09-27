package org.example.day3.order;

import java.util.Date;
import java.util.Random;

public class Date1 {
    public static void main(String[] args) {
        //입력할 때 자동으로 년월일, 시분초로 구해주고 싶다.
        Date date = new Date();
        int year = date.getYear(); //년
        int month = date.getMonth(); //월
        int date1 = date.getDate(); //일
        int day = date.getDay(); //요일
        int hour = date.getHours(); //시
        int minute = date.getMinutes(); //분
        int second = date.getSeconds(); //초

        //System.out.println((1900 + year) + " " + (month + 1) + " " + date1 + " " + day + " " + hour + " " + minute + " " + second);

        //오늘 무슨 요일인가요? 프린트
        switch (day){
            case 1:
                System.out.println("오늘은 월요일 입니다");
                break;
            case 2:
                System.out.println("오늘은 화요일 입니다");
                break;
            case 3:
                System.out.println("오늘은 수요일 입니다");
                break;
            case 4:
                System.out.println("오늘은 목요일 입니다");
                break;
            case 5:
                System.out.println("오늘은 금요일 입니다");
                break;
            case 6:
                System.out.println("오늘은 토요일 입니다");
                break;
            case 7:
                System.out.println("오늘은 일요일 입니다");

        }


    }
}
