package org.example.day11.question;

public class Main {
    public static void main(String[] args) {
        Course csCourse = new Course("Programming",5,2);

        //과목 2개 등록
        Subject s1 = new Subject("Java",100);
        Subject s2 = new Subject("Python",100);

        // 학생 2명 등록
        Student st1 = new Student(18330001,"김준식",3,"조경학과");
        Student st2 = new Student(18330002,"이준익",3,"미래환경공학과");

        csCourse.addSubject(s1);
        csCourse.addSubject(s2);

        csCourse.addStudent(st1);
        csCourse.addStudent(st2);

        //출력
        csCourse.printCourseInfo();


    }
}
