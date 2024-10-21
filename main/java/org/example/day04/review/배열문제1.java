package org.example.day04.review;

public class 배열문제1 {
    public static void main(String[] args) {

        //3일의 휴가기간 동안 매일 다른 곳을 여행가려 함.
        //1. 여행가고 싶은 지역 3개를 배열에 넣기(처음부터 알고 있는 경우)
        //2. 여행지역마다의 경비(처음부터 알고 있는 경우)
        //3. 함께 가고 싶은 사람 이름(처음에는 모름.)
        //   첫 번째 여행지만 "친구"로 나중에 결정됨.
        //다음과 같이 출력
        //제주도   50000   친구
        //울릉도   40000   null
        //송도     10000   동생

        //1. 지역 3개
        String[] area = {"남극","북극","아마존"};
        //2. 지역마다 경비
        int[] money = {10000000,7000000,6000000};
        //3. 함께 가고 싶은 사람
        String[] name = new String[3];
        name[0] = "친구";
        name[2] = "동생";

        //==> int i 변수 역할 : 반복횟수 체크용, 배열의 인덱스용, 계산대상 데이터용
        for(int i = 0; i < area.length; i++){
            System.out.println(area[i] + " " + money[i] + " " + name[i]);
        }


    }
}
