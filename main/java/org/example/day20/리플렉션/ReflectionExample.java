package org.example.day20.리플렉션;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            //클래스 정보 가져오기
            Class<?> clazz = Class.forName("org.example.day20.리플렉션.Person");

            //생성자 정보 가져오기 및 객체 생성
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object person = constructor.newInstance("Jhon",30);

            //메서드 정보 가져오기 및 메서드 호출
            Method setNameMethod = clazz.getMethod("setName", String.class);
            setNameMethod.invoke(person, "Jane");

            Method getNameMethod = clazz.getMethod("getName");
            String name = (String)getNameMethod.invoke(person);
            System.out.println("Name: " + name);

            //필드 정보 가져오기 및 필드 값 설정
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true); // private 필드 접근 허용
            ageField.setInt(person, 35);

            int age = ageField.getInt(person);
            System.out.println("Age: " + age);

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
