package org.example.day04.array;

import java.util.Random;
import java.util.Scanner;

public class 배열문제 {
    public static void main(String[] args) {
//        1. ppt p.48 성적변동문제
        System.out.println("================== 1번 ==================");
        int[] term1 = {77,88,99,55,70};
        int[] term2 = {99,100,88,80,70};
        //1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
        //2. 성적이 1,2학기 동일한 학생의 수를 카운트해서 프린트
        int count1 = 0,count2 = 0;
        for(int i = 0; i < term1.length; i++){
            if(term1[i] < term2[i]){
                count1++;
            }else if(term1[i] == term2[i]){
                count2++;
            }
        }
        System.out.println("성적이 2학기에 향상된 학생의 수: " + count1);
        System.out.println("성적이 1,2학기 동일한 학생의 수: " + count2);

//        2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        숫자 입력 : 55
//        숫자 입력 : 77
//        숫자 입력 : 11
//                ----------------
//        합계 143
//        평균 47.666666667
        System.out.println("================== 2번 ==================");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            System.out.print("숫자 입력: ");
             num[i] = sc.nextInt();
             sum += num[i];
        }
        sc.nextLine();

        System.out.println("---------------------");

        System.out.println("합계: " + sum);
        System.out.printf("평균 %.9f", (double)sum/num.length);
        System.out.println();

//        3. int[] n = new int[1000];
//        random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
//        3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
//        3-2. 전체 합계와 평균 출력
//        4:55
        System.out.println("================== 3번 ==================");
        int[] n = new int[1000];
        Random r = new Random(44);
        int sum1 = 0;

        for(int i = 0; i < n.length; i++){
            n[i] = r.nextInt(1000) + 1;
            sum1 += n[i];
        }
        int result = n[0] + n[2] + n[4] + n[99] + n[989];
        System.out.println(result);
        System.out.println("전체 합계: " + sum1);
        System.out.println("평균: " + sum1/n.length);


//        4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
//        가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
//        당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.
//        4:59
        System.out.println("================== 4번 ==================");

        while(true) {
            System.out.println("가고 싶은 곳을 골라주세요");
            System.out.print("1) 백두산 2) 한라산 3) 후지산 0) 종료: ");
            int vehicle = sc.nextInt();
            String location = "";
            switch(vehicle){
                case 1: location = "백두산은 열차";
                    break;
                case 2: location = "한라산은 배";
                    break;
                case 3: location = " 후지산은 비행기";
                    break;
                case 0:
                    System.out.println("종료합니다");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue; // 올바른 입력이 나올 때까지 다시 반복
            }
            if (vehicle == 0) {
                break; // case 0일 때 while 루프 종료
            }
            System.out.println("당신이 가고 싶은 곳인 " + location + "를 타고 가야합니다.");
        }


//        5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
//        80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
        System.out.println("================== 5번 ==================");
        r = new Random(555);
        int[] arr = new int[1000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100) + 1;
        }
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 80){
                cnt1++;
            }else if(arr[i] >= 70){
                cnt2++;
            } else if (arr[i] >= 50) {
                cnt3++;
            }else{
                cnt4++;
            }
        }

        System.out.println("80이상인 개수: " + cnt1 +
                " 70~79인 수 개수: " + cnt2 +
                " 50~69인 수 개수: " + cnt3 +
                " 49보다 작은 수 개수: " + cnt4);


    }
}
