package org.example.day18.확인문제;

public class Employee {
    String name;
    String department;
    int age;

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getAge() { return age; }
}
