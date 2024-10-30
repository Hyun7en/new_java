package org.example.day22.자료구조;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        //String s = "()()";
        String s = "(()))";
        //String s = "()))))(";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push('(');
            }else{ // ')'
                try {
                    stack.pop();
                } catch (Exception e) {
                    System.out.println(false);
                }
            }
        } //for


        if (stack.empty()) System.out.println(true);
        else System.out.println(false);
    }
}
