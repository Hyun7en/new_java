package org.example.day22.자료구조;

import org.example.ArrPrint;

import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        //70페이지
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]); //1
        for (int x: arr){
            if (x != stack.peek()) stack.push(x);
        }
        System.out.println(stack);
        int[] result = new int[stack.size()];
        //[1, 3, 0, 1]
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        ArrPrint.print(result);

    }

}
