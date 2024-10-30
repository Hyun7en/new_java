package org.example.day22.문제풀이;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        String x = "a234";
        boolean result = true;
        //1.문자열길이가 4 또는 6
        //2.x를 하나씩 문자로 분리해서
        //  숫자인지 판단하자!
        int size = x.length(); //4, 6

        if (size == 4 || size == 6){
            char[] c = x.toCharArray();
            for (char one: c){
                //if (one >= '0' && one <= '9'){ //숫자인지 조건
                if (one < '0' || one > '9'){ //숫자가 아닌지 조건
                    result = false;
                    break;//반복문의 break!
                }
            }//for
        }else {
            result = false;
        }
    }
}