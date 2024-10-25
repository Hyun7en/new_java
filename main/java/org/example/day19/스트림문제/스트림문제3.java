package org.example.day19.스트림문제;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class 스트림문제3 {
    public static void main(String[] args) {
        /*
        3. 범위의 값 1500~3500까지를 만들어 stream에 넣어
   전체의 평균을 구한 후 출력
         */

        OptionalDouble avg = IntStream.rangeClosed(1500, 3500).average();
        //Optional~ : 결과가 있는지 없는지 체크하는 기능까지를 포함하는 객체
        if (avg.isEmpty()){
            System.out.println("결과값이 없음.");
        }else{
            System.out.println(avg.getAsDouble()); //2500.0
        }

    }
}
