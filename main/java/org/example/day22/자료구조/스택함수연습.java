package org.example.day22.자료구조;

import java.util.Stack;

public class 스택함수연습 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("홍길동");
        stack.push("김길동");
        stack.push("정길동");
        System.out.println(stack);
        System.out.println(stack.get(0));
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.contains("홍길동"));
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println("꺼낼 것이 없음");
        }
    }
}
