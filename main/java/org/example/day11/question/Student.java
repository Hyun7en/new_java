package org.example.day11.question;

public class Student {
    private int id; // 학번
    private String name; // 이름
    private int grade; // 학년
    private String department; // 학과

    public Student(int id, String name, int grade, String department) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    public int getId() {
        return id++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", department='" + department + '\'' +
                '}';
    }
}
