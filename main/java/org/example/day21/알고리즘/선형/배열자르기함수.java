package org.example.day21.알고리즘.선형;

import java.util.Arrays;

public class 배열자르기함수 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] sub1 = Arrays.copyOfRange(list, 1, 3);
        //3,4,5
        //1,2,3
        int[] sub2 = Arrays.copyOfRange(list, 2, 5);
        int[] sub3 = Arrays.copyOfRange(list, 0, 3);
        System.out.println(Arrays.toString(sub1));
        System.out.println(Arrays.toString(sub2));
        System.out.println(Arrays.toString(sub3));
    }
}
