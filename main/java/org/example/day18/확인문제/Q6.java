package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Q6 {
    public static void main(String[] args) {
//        다음을 람다와 스트림을 이용하여 해결하시오.
////        1) stream()함수를이용해 stream으로만든다.
////        2) mapToInt(Student getScore()메서드만호출)를 이용해 IntStream을 생성한다.
////        3) 3번에서생성한 IntStream에 대해 average()메서드로평균을구한다.
////        4) isPresent()메서드로평균값이존재하는경우 “3번에서구한평균출력”하고, 존재하지않으면 “평균값을구할수 없음”을
////        출력한다.

        List<Student> list = Arrays.asList(
                new Student("hong", 100),
                new Student("kim", 90),
                new Student("jung", 80),
                new Student("park", 70),
                new Student("moon", 95)
        );

       OptionalDouble averageScore =  list.stream().mapToInt(Student::getScore).average();

        if (averageScore.isPresent()) {
            System.out.println("평균 점수: " + averageScore.getAsDouble());
        } else {
            System.out.println("평균값을 구할 수 없음");
        }


    }
}
