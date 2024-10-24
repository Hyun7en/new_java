package org.example.day18.스트림;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }

        List<int[]> list = Arrays.asList(arr);



    }
}
