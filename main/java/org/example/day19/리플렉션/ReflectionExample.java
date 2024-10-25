package org.example.day19.리플렉션;

public class ReflectionExample {
    public static void main(String[] args) {
        //클래스 정보 가져오기
        try {
            Class<?> clazz = Class.forName("org.example.day19.리플렉션.Person");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
