package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 짝수홀수개수 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        Solution2 s = new Solution2();
        int[] a = s.solution(n); //주소, 100번
        System.out.println(Arrays.toString(a));
    }
}

class Solution2 {
    public int[] solution(int[] n) {
        int[] answer = new int[2]; //{0,0}
        //answer[0] //짝수개수,누적공간
        //answer[1] //홀수개수,누적공간
        for (int x : n){
            if (x % 2 == 0) answer[0]++;
            else  answer[1]++;
        }
        return answer;
    }
}
