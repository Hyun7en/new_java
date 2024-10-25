package org.example.day18.확인문제;

import java.util.Arrays;
import java.util.List;

public class Q_HARD_7 {
    public static void main(String[] args) {
        /*
        department가 Manager인 조건에 맞는 직원들의 평균 나이를 계산(소수점 2번째 자리까지)하여 출력하시오.

         */
        List<Employee> employees = Arrays.asList(
                new Employee("Michael", "Manager", 35),
                new Employee("Sarah", "HR", 32),
                new Employee("Roger", "Manager", 44),
                new Employee("Mike", "Manager", 30),
                new Employee("Maureen", "IT", 37) );

        //1) stream()함수를 이용해 stream으로 만든다.
        //2) filter()메서드를 이용해 department가 Manager인 것만 필터링한다.
        //3) mapToInt(Employee의 getAge()메서드만 호출)를 이용해 IntStream을 생성한다.
        //4) 3번에서 생성한 IntStream에 대해 average()메서드로 평균을 구한다.
        //5) orElse()메서드로 4번까지의 적합한 값이 존재하지 않는 경우 0을 기본 평균값으로 사용한다.
        double averageAge = employees.stream().filter(x -> x.department == "Manager")
                .mapToInt(x -> x.getAge())
                .average()
                .orElse(0);

        System.out.printf("Average age of Managers: %.2f%n", averageAge);

    }
}
