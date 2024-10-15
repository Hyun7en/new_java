package org.example.day11.question;

public class Course {
    private String courseName; //강좌명
    private int maxStudents; // 최대 수강 인원
    private int currentStudents; // 현재 수강 인원
    private Student[] students = new Student[5]; // 수강 신청한 학생 목록
    private Subject[] subjects = new Subject[5]; // 과목 목록

    public Course(String courseName, int maxStudents, int currentStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = currentStudents;
    }

    public void addStudent(Student student) {
        if (currentStudents >= maxStudents) {
            System.out.println("더 이상 학생 등록을 할 수 없습니다.");
            return;
        }

        for (Student s : students) {
            if (s != null && s.getId() == student.getId()) { // 학생 ID로 중복 체크
                System.out.println("이미 등록된 학생입니다.");
                return;
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                currentStudents++; // 수강 인원 증가
                break; // 학생을 추가한 후 반복 종료
            }
        }
    }

    public void addSubject(Subject subject) {
        for (Subject s : subjects) {
            if (s != null && s.getSubjectName().equals(subject.getSubjectName())) { // 과목 이름으로 중복 체크
                System.out.println("이미 등록된 과목입니다.");
                return;
            }
        }

        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                break; // 과목을 추가한 후 반복 종료
            }
        }
    }


    public void printCourseInfo() {
        System.out.println("===============================================");
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Students: " + maxStudents);
        System.out.println("Current Students: " + currentStudents);

        for(Student s : students) {
            if(s != null) {
                System.out.println("students: " + s.getName());
            }

        }

        for(Subject s : subjects) {
            if(s != null) {
                System.out.println("subjects: " + s.getSubjectName());

            }

        }


    }
}
