package org.example.day15.문제;

import java.util.ArrayList;
import java.util.List;

public class 문제2 {
    public static void main(String[] args) {
        /*
        시험일정 순서가 국어, 수학, 영어, 컴퓨터
        시험일정을 담은 컬렉션을 만드세요.
        ●시험을 보면 한과목씩 사라지게 해주세요.
        ○처음 시험별 과목: [국어, 수학, 영어, 컴퓨터]
         ○ 1회차 시험을 한 날은 과목: [수학, 영어, 컴퓨터]
         ○ 2회차 시험을 한 날은 과목: [영어, 컴퓨터]
         ○ 3회차 시험을 한 날은 과목: [컴퓨터]
         */
        List<String> subjects = new ArrayList<>();
        subjects.add("국어");
        subjects.add("수학");
        subjects.add("영어");
        subjects.add("컴퓨터");

        System.out.println("처음 시험별 과목: " + subjects);

        // 각 회차에 대해 반복
        for (int day = 0; day < subjects.size() + 1; day++) {
            // 첫 번째 과목 제거
            subjects.remove(0);
            // 현재 남아있는 과목 출력
            System.out.println((day + 1) + "회차 시험을 한 날은 과목: " + subjects);
        }
    }
}
