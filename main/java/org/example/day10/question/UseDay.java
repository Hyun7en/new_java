package org.example.day10.question;

public class UseDay {
    public static void main(String[] args) {
        Day day1 = new Day("자바 공부","강남", 10);
        System.out.println(Day.count + "개 생성됨");

        Day day2 = new Day("자바 공부","역삼", 20);
        System.out.println(Day.count + "개 생성됨");

        Day day3 = new Day("자바 공부","청담", 30);
        System.out.println(Day.count + "개 생성됨");

        // 1) 전체 하는 일의 시간을 구하시오. static변수 이용해서!
        System.out.println("전체 공부 시간은 " + Day.totalHour + "시간 입니다.");

        // 2) 평균 하는 일의 시간을 구하시오.
        System.out.println("평균 공부 시간은 " + Day.getWorkAvg() + "입니다");

        // 3) 매일 무엇을 얼마나 어디에서 했는지 프린트 :
        Object[] arr = {day1, day2, day3};

        for(int i = 0; i < Day.count; i++ ){
            System.out.println(arr[i]);
        }

    }
}
