package org.example.test;

public class Programmers {
    public static void main(String[] args) {

        int n = 3628800;
        int answer = 0;

        for(int i = 1 ; i <= 10; i++ ){
            int a = i;
            if((i *= i) <= n){
                answer = a-1;
            }
        }



        System.out.println(answer);

        //end
    }
}

