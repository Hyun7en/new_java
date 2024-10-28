package org.example.day20.리플렉션;

public class Person {

    @MyAnnotation("나를 읽어가줘.")
    private String name;
    private int age;

    @MyAnnotation2("나는 생성자야. 읽어가줘.")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}