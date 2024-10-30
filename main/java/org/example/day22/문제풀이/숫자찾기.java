package org.example.day22.문제풀이;

public class 숫자찾기 {
    public static void main(String[] args) {
        char c = '1';
        char c2 ='2';
        System.out.println(c + c2); //99
        //int로 변경후 더해야함.
        int ic = c - '0'; //49 - 48 = 1
        int ic2 = c2 - '0'; //50 - 48 = 2
        System.out.println(ic + ic2);

        String s = "1234";
        //char 배열로 변경하여
        //각 값들을 다 더하세요! //10
        int answer = 0;
        for(char one : s.toCharArray()){
            answer += one - '0';
        }

        System.out.println(answer);
    }
}