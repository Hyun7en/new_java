package org.example.day20.알고리즘;

import java.util.Arrays;

public class 문제 {
    public static void main(String[] args) {
//        1. { 11, 55, 33, 22, 44 } 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] arr = { 11, 55, 33, 22, 44};
        int result = Arrays.stream(arr)
                        .flatMap(i -> Arrays.stream(arr)
                        .filter(j -> i != j)
                        .map(j -> i * j))
                        .max()
                        .orElseThrow();

        System.out.println(result);
//        2. { 22, -88, -4, 11, 55} 중 두 수를 곱해서 나올 수 있는 최대값은?
        int[] arr1 = { 22, -88, -4, 11, 55};
        int result1 = Arrays.stream(arr1)
                .flatMap( i -> Arrays.stream(arr1)
                .filter(j -> i != j)
                .map(j -> i * j))
                .max()
                .orElseThrow();
        System.out.println(result1);
//        3. {66, 33, 55, 22, 11} 중 크기를 기준으로 중앙값은?
//        배열의 요소의 길이가 홀수일때는 가운데 있는 값을 찾음.
        int[] arr2 = {66, 33, 55, 22, 11};
        int result2 = Arrays.stream(arr2).sorted().skip(arr.length / 2).findFirst().getAsInt();
        System.out.println(result2);

//        4. {66, 33, 55, 22, 11, 66} 중 크기를 기준으로 중앙값은?
//        배열의 요소의 길이가 짝수일때는 가운데 있는 값들을 찾아
//        더한 후 2로 나누어서 찾음.
        int[] arr3 = {66, 33, 55, 22, 11, 66};
        double result3 = Arrays.stream(arr3).sorted().skip(arr3.length / 2 -1).limit(2).average().orElseThrow();
        System.out.println(result3);

//        5. 중복된 숫자 개수문제(p130)
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int result4 = (int)Arrays.stream(array).filter(x -> x == n).count();
        System.out.println(result4);
//        6. 점의 위치 구하기 문제(p129)
        int[] dot = {2, 4};
        int result5 = dot[0] > 0 ? (dot[1] > 0  ? 1 : 4) : (dot[1] > 0 ? 2 : 3);
        System.out.println(result5);

//        7. 머쓱이보다 키 큰 사람(p127)
        int[] array2 = {149, 180, 192, 170};
        int height = 167;
        int result6 = (int)Arrays.stream(array2).filter(x -> x > height).count();
        System.out.println(result6);

//        8. 배열의 평균값(p115)
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         Arrays.stream(numbers).average().ifPresent(System.out::println);

//        9. 옷가게 할인 받기(p112)
        int price = 150000;

        int answer = 0;

        if(price >= 500000){
            answer = price*(100 - 20)/100;
        }else if(price >= 300000){
            answer = price*(100 - 10)/100;
        }else if(price >= 100000){
            answer = price*(100 - 5)/100;
        }
        System.out.println(answer);
//        10. 피자 나눠 먹기(2)(p111)
        
    }
}
