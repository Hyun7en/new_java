package org.example.day10.question;

public class Employee {
    String name;
    int age;
    char gender;
    static int employeeId;
    static int sumAge;

    public Employee(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        employeeId++;
        sumAge += age;
    }

    public static int getAvgEmployeeAge() {
        return sumAge/employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
