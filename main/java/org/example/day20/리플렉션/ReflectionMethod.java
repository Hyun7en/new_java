package org.example.day20.리플렉션;

import java.lang.reflect.Method;

public class ReflectionMethod {
    public static void main(String[] args) {
        //클래스 정보 가져오기
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");

            //메서드 정보 가져오기
            Method addMethod = clazz.getMethod("add", Object.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
