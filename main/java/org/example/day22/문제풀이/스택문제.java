package org.example.day22.문제풀이;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 스택문제 {
    public static void main(String[] args) {
        Stack stack = new Stack();

//        1. 스택을 이용해서 푸세요.
//                String[] s = {"밥", "커피", "밥", "커피", "밥", "밥"};
//        식사(밥)먹은 후에 커피를 마셨으면  true, 아니면 false
        String[] s = { "커피", "밥", "커피", "밥", "밥","커피","커피","밥", "커피","커피"};
        //밥 커피/ 밥 밥/ 커피 밥 / 커피 커피

        for (String meal : s) {
            if (meal.equals("밥")) {
                if (stack.empty()) {
                    stack.push(meal);
                }else if (!stack.empty() && stack.peek().equals("밥")) {
                    stack.pop();
                    System.out.println("false");
                }else if (!stack.empty() && stack.peek().equals("커피")) {
                    stack.pop();
                    System.out.println("false");
                }

            } else if (meal.equals("커피")) {
                if (stack.empty()) {
                    stack.push(meal);
                }else if (!stack.isEmpty() && stack.peek().equals("밥")) {
                    stack.pop();
                    System.out.println("true");
                }else if (!stack.isEmpty() && stack.peek().equals("커피")) {
                    stack.pop();
                    System.out.println("false");
                }
            }
        }


//        2. HashMap을 이용해서 푸세요.
//                String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
//        밥과 커피먹은 횟수 구하여 출력
//        밥을 더 많이 먹었으면 "밥을 더 먹었군요"
//        커피를 더 많이 마셨으면 "커피를 더 마셨군요"
        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};
        Map map = new HashMap();



//        3. TreeSet을 이용해서 푸세요.
//        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3}을 중복을 제거후 오름차순으로
//        정렬 후 가장 큰 값과 가장 작은 값을 출력하세요.
        int[] s3 = {11, 3, 78, 9, 2, 2, 100, 3};

//        4. int[] s4 = {11, 3, 78, 9, 2, 100} 오름차순 정렬 후
//        2번째 큰 값과 2번째 작은 값을 구하세요.
        int[] s4 = {11, 3, 78, 9, 2, 100};

//        5. String s5 = "감고나무감나무신세계신"; 각 글자가 몇 번 나왔는지 프린트
//        (HashMap을 이용해서 푸세요.
        String s5 = "감고나무감나무신세계신";

//        6. int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};
//        int[] s6 = new int[s5.length];
//        s5의 원소들을 s6으로 역순으로 옮겨 프린트

//        7. int s7 = 234534567;에서 중복된 수를 제외하고 각 자리수를 더하시오.

//        8. int[] s5 = {11, 3, 78, 9, 2, 2, 100, 3};를 Stack<Integer>로 옮겨
//        인덱스 0, 3, 5위치의 값을 각각 더한 후, top에서 3개를 pop하여
//        stack에 들어있는 목록을 프린트

//        9. 268페이지 확인문제 - String에서 char[]로 옮기기

//        10. int[] s8 = {1,2,3}; int[] s9 = {1,2,3};이 같은지/다른지 비교하여 프린트
    }
}
