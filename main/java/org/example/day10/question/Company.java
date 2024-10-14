package org.example.day10.question;

public class Company {
    public static void main(String[] args) {

        Employee e1 = new Employee("홍길동",25,'여');
        Employee e2 = new Employee("김길동",23,'남');
        Employee e3 = new Employee("이균",26,'여');


        //1) 우리 회사의 직원수는?(직원뽑을 때마다 자동 count 1씩 증가)
        System.out.println(Employee.employeeId);

        //2) 우리 회사의 직원 각각의 정보를 프린트
        Object[] arr = {e1,e2,e3};
        for(Object o : arr) {
            System.out.println(o);
        }

        //3) 우리 회사의 직원의 평균 나이를 프린트
        System.out.println(Employee.getAvgEmployeeAge());
    }
}
