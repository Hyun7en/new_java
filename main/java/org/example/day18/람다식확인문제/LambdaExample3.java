package org.example.day18.람다식확인문제;

public class LambdaExample3 {
    public static void main(String[] args) {
        StringFunctionalInterface StringToUpperCase = (a) -> {
            String str = "";
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if (97 <= c && c <= 122) {  // 소문자 a~z의 아스키 코드 범위
                    str += (char) (c - 32);  // 소문자를 대문자로 변환
                } else {
                    str += c;  // 이미 대문자이거나 소문자가 아니면 그대로 추가
                }
            }
            return str;  // 변환된 문자열 반환
        };

        System.out.println(StringToUpperCase.convert("java joa"));  // 출력: JAVA JOA
    }
}
