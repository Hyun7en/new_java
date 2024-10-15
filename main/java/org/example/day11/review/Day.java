package org.example.day11.review;

public class Day {
    String doing;//한 일
    int time; //시간
    String location; //장소

    static int count;
    //static변수는 공유목적, 누적목적 ==> 정적변수, 클래스변수
    static int sum; //time누적!

    //객체생성시 멤버변수 초기화할 목적으로!
    //생성자 메서드, 객체 생성시 자동 호출!
    //생성자 메서드가 되기 위한 조건
    //1. 클래스이름과 무조건 동일해야함.
    //2. 리턴타입을 명시하면 자동호출되지 않음.
    //생성자의 특징
    //1. 오버로딩할 수 있음.
    //2. 프로그래머가 하나도 생성자를 명시하지 않으면 컴파일러가 하나를 추가해줌.
    //   public 클래스명(){...} --> 입력매개변수가 없는 메서드를 생성해줌!
    //   기본생성자(default constructor) --> 입력매개변수가 없는 생성자 메서드

    //멤버변수 초기화! 생성자.
    public Day(String doing, int time, String location) {
        this.doing = doing;
        this.time = time;
        this.location = location;
        count++;
        sum = sum + time; //sum += time;
    }


    public static double getAvg(){
        return sum / (double)count;
    }

    //멤버변수를 프린트할 목적!
    //@Override --> 생략가능!
    public String toString() {
        return "하루{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';

        // ==> 이 클래스로 생성된 객체(참조형변수, day1)를 프린트할 때
        //     프린트할 스트링을 자동으로 만들어주는 것!
        //     모든 클래스는 toString()메서드를 가지고 시작함.(묵시적)
        //     패키지명.클래스명@주소--> 원래는 이렇게 스트링을 만들어줌.
    }
}