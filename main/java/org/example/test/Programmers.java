package org.example.test;

public class Programmers {
    public static void main(String[] args) {

        int n = 2;
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};

        int[][] answer = new int[num_list.length/n][n];

        int a= 0;
        for(int i = 0; i < answer.length; i++ ){
            for(int j  = 0; j < answer[0].length; j++){
                answer[i][j] = num_list[a++];
                System.out.println(answer[i][j]);
            }
            System.out.println();
        }

    }
}

