package org.example.day3.doit;

import java.util.Arrays;
import java.util.Random;

public class ArrayQ1 {
    public static void main(String[] args) {
    /*
    다음의 순서대로 프로그래밍 하시오.

    1. 랜덤한 값 1부터 100사이의 값을 20개 만들어 배열에 넣어 출력
    2. 배열에 있는 값들을 오름차순으로 정렬 후 출력
    3. 배열에 들어있는 값의 최대값을 찾아 출력
    4. 배열에 들어있는 값의 최소값을 찾아 출력
    */

    //1
    Random r = new Random();
    int[] arr = new int[20];
    for(int i = 0; i < 20; i++){
        int num = r.nextInt(100) + 1;
        arr[i] = num;
    }

    System.out.println("배열 프린트: " + Arrays.toString(arr));

    //2
    Arrays.sort(arr);

    System.out.println("오름차순 정렬 후 프린트: "+Arrays.toString(arr));

    //3
    System.out.println("MAX: " + arr[arr.length-1]);
    System.out.println("MIN: " + arr[0]);

    }
}
