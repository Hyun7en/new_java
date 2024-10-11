package org.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmers {
    public static void main(String[] args) {

        // 정규식을 미리 컴파일하여 Pattern 객체로 저장
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");  // 예: 전화번호 형식

        // 입력 문자열에 대해 패턴 매칭 수행
        String input = "Phone number: 123-456-7890";
        Matcher matcher = pattern.matcher(input);

        // 패턴과 일치하는 부분 찾기
        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("No match found");
        }
        //end
    }


}

