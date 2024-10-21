package org.example.day04.array;

import java.util.Random;

public class 배열토익 {
    public static void main(String[] args) {
        //1. 답안 배열, 내답 배열 생성
        //2. Random이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요.
        //3. 답안과 내답의 인덱스값을 각각 비교해서 맞으면 1점!
        //4. 총점을 출력해주세요.!
        //한 줄 삭제(컨트롤 + Y)
        int[] 답안 = new int[990]; //블록안잡고 한 줄 복사(컨트롤 + D)
        int[] 내답 = new int[990];
        Random r = new Random();
        //배열에 점수 넣는 부분
        for (int i = 0; i < 답안.length; i++) {
            답안[i] = r.nextInt(4) + 1; //0~3 ==> 1~4
            내답[i] = r.nextInt(4) + 1;
        }
        int jumsu = 0;
        //배열에 들어있는 답안과 내답을 채점하는 부분
        for (int i = 0; i < 답안.length; i++) {
            if (답안[i] == 내답[i]) {
                jumsu++;
            }
        }
        System.out.println(jumsu);

    }
}
