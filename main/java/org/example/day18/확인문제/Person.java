package org.example.day18.확인문제;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age +
                " years old.");
    }
    private void sayGoodbye() {
        System.out.println("Goodbye from " + name);
    }

}
