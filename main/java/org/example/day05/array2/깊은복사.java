package org.example.day05.array2;

public class 깊은복사 {
    public static void main(String[] args) {
        String[] subject = {"국어","영어","수학","컴퓨터","회화"};

        int[] firstS = {44,66,22,99,100};
        int[] secondS = {22,66,88,99,100};

        //배열의 깊은 복사 이용
        /*
        전체 1학기, 2학기 성적 프린트
        1학기, 2학기 성적 중 동일한 성적 과목수
        1학기, 2학기 성적 중 오른 과목수
        1학기, 2학기 성적 중 오른 과목명
         */

        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i  = 0; i < subject.length; i++){
            if(firstS[i] == secondS[i]){
                cnt++;
            } else if (firstS[i] < secondS[i]) {
                cnt1++;
            }
        }
        System.out.println("1학기, 2학기 성적 중 동일한 성적 과목수: " + cnt);
        System.out.println("1학기, 2학기 성적 중 오른 과목수: " + cnt1);
        System.out.print("1학기, 2학기 성적 중 오른 과목명:");
        for(int i  = 0; i < subject.length; i++){
             if (firstS[i] < secondS[i]) {
                cnt1++;
                System.out.print( " " + subject[i]);
            }
        }
    }
}
