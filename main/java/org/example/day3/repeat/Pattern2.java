package org.example.day3.repeat;

import javax.swing.*;

public class Pattern2 {
    public static void main(String[] args) {
        // 1. 1부터 499까지 누적해서 프린트
        int sum = 0;
        for(int i = 1; i <= 499; i++){
            sum += i;
        }

        System.out.println(sum);


        // 2. 1부터 100까지 중 4의 배수만 누적해서 프린트
        int sum2 = 0;

        for(int i = 1; i <= 100; i*=4){
            sum2 += i;
        }

        System.out.println(sum2);

        // 3. 500부터 1까지 2씩 감소하면서 5의 배수는 빼고,
        //누적해서 프린트.

        int sum3 = 0;

        for(int i = 500; i >= 1; i-=2){
            if(i%5==0){
                continue;
            }
            sum3 += i;
        }
        System.out.println(sum3);

    }
}
