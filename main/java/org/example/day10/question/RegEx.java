package org.example.day10.question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        System.out.println("======================= CLASS 심화 문제 1 =======================");

        // 아래의 문자열에서 전화번호 패턴을 포함하고 있는지 정규식을 이용해서 확인하시오.
        String text = "안녕하세요. 제 전화번호는 010-1234-5678이고, 회사번호는 02-9876-5432입니다.";

        // 전화번호 패턴 (예: 010-1234-5678 또는 02-9876-5432)
        String regex = "(\\d{2,3}-\\d{3,4}-\\d{4})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String phoneNumber = matcher.group();
            System.out.println("전화번호를 찾아냈습니다. 전화번호는 " + phoneNumber + " 입니다.");
        }

        System.out.println();
        System.out.println("======================= CLASS 심화 문제 2 =======================");



    }
}
