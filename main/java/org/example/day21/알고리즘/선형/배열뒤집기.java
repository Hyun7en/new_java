package org.example.day21.알고리즘.선형;

import org.example.ArrPrint;

public class 배열뒤집기 {
    public static void main(String[] args) {
        //152 page!
        int[] num_list = {1, 2, 3, 4, 5};
        //그대로 옮겨보자.
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        //System.out.println(Arrays.toString(answer));
        ArrPrint.print(answer);
        //뒤집어서 옮겨보자.
        int[] answer2 = new int[num_list.length];
        //추가적인 j가 필요함.
        int j = answer2.length - 1;//4
        //num_list에서 i = 0부터 꺼내서
        //j = 4부터 넣어야함.
        for (int i = 0; i < num_list.length; i++) {
            answer2[j] = num_list[i];
            j--; //4,3,2,1,0
        }
        //System.out.println(Arrays.toString(answer2));
        ArrPrint.print(answer2);
    }
}
