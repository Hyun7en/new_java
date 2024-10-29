package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 배열원소길이 {
    public static void main(String[] args) {
        String[] n = {"I", "Love", "Programmers."};
        Solution3 s = new Solution3();
        int[] a = s.solution(n); //주소, 100번
        System.out.println(Arrays.toString(a));
    }
}

class Solution3 {
    public int[] solution(String[] n) {
        int[] answer = new int[n.length];
        //n배열에 있는 꺼내어
        //길이를 구한후 answer배열의 같은 인덱스 위치에
        //길이를 넣으세요.!
        for (int i = 0; i < n.length; i++) {
            answer[i] = n[i].length();
        }
        return answer;
    }
}
