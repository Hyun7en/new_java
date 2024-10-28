package org.example.day20.리플렉션;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class ReflectionAnnotation {
    public static void main(String[] args) {
        try {
            // 클래스 정보 가져오기
            Class<?> clazz = Class.forName("org.example.day20.리플렉션.Person");
            Constructor<?> con = clazz.getConstructor(String.class, int.class);
            // 필드 정보 가져오기
            Field nameField = clazz.getDeclaredField("name");

            // 애노테이션 정보 가져오기
            if (nameField.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = nameField.getAnnotation(MyAnnotation.class);
                System.out.println("Field 'name' annotation value: " + annotation.value());
            }
            if (con.isAnnotationPresent(MyAnnotation2.class)) {
                MyAnnotation2 annotation = con.getAnnotation(MyAnnotation2.class);
                System.out.println("Field 'name' annotation value: " + annotation.value());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 예제용 애노테이션
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface MyAnnotation2 {
    String value();
}