package org.example.day5.array2;

import java.util.Arrays;

public class 참조형복사 {
    public static void main(String[] args) {
        int[] term1 = {100, 200, 300};
        int[] term2 = term1.clone();
        term2[0] = 96;
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));
        System.out.println(term1 + " " + term2);
    }
}
