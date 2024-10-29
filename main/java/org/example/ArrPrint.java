package org.example;

import java.util.Arrays;

public class ArrPrint {

    //배열만 프린트하는 기능 --> 메서드 정의
    public static void print(int[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void print(Object[] x){
        System.out.println(Arrays.toString(x));
    }

    public static void print(double[] x){
        System.out.println(Arrays.toString(x));
    }
}