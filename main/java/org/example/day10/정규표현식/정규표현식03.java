package org.example.day10.정규표현식;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 정규표현식03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //우리 회사 직원 정보 입력을 받아보자!
        while(true) {

            System.out.print("이름 입력>> ");  // 한글 입력, 3-4글자이어야 함.
            String name = sc.nextLine();     // 제대로 입력했으면 "이름님 환영합니다" 출력
                                            // 아니면 "다시 입력해야합니다." 출력
            if (Pattern.matches("^[가-힣]{3,4}$", name)) {
                System.out.println(name + "님 환영합니다.");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }

        }

        while(true) {

            System.out.print("나이 입력>> "); // 숫자만으로 이루어졌는지 확인
            String age = sc.nextLine();     // 숫자로 이루어졌으면 Integer.parseInt()로
                                            // 숫자로 변환 후, 만으로 계산(-1)후 출력
            if (Pattern.matches("^\\d+$", age)) {
                System.out.println("만나이는 " + (Integer.parseInt(age) - 1) + "살 입니다.");
                break;
            }else{
                System.out.println("다시 입력해주세요.");
            }
        }

        while (true) {
            System.out.print("이메일(com) 입력>> "); // 영문 + 숫자 + _ (언더바,밑줄)포함한 5-8글자
            String email = sc.nextLine();          // new.com을 포함하고 있어야 함.
                                                   // 유효하면 "이메일이 유효합니다." 출력
                                                   // 유효하지 않으면 "이메일이 유효하지 않습니다." 출력

            if (Pattern.matches("^[a-zA-Z0-9_]{5,8}@new\\.com$", email)) {
                System.out.println("이메일이 유효합니다.");
                break;
            }else{
                System.out.println("이메일이 유효하지 않습니다, 다시 입력해주세요.");
            }
        }


        //end
        sc.close();
    }
}
