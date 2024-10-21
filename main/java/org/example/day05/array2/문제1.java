package org.example.day05.array2;

public class 문제1 {
    public static void main(String[] args) {
        /*
        전화번호 입력>> 011-245-1234
        1)양쪽 공백을 제거하시오
        2)-을 기준으로 분리해내세요.(String[])
        3)첫번째 문자열이 011이면 SK, 019이면 LG, 나머지면 APPLE
        4)두번째 문자열의 길이가 길이가 4개 이상이면 최신폰, 아니면 올드폰
        5)전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호 아니면 유효하지 않은 전화번호
         */
        String phoneNumber = " 011-245-1234 ";
        //1.
        phoneNumber = phoneNumber.trim();

        //2,3.
        String[] phoneNumber1 =  phoneNumber.split("-");

        for(String phone : phoneNumber1) {
            if(phone.equals("011")){
                System.out.println("SK");
                break;
            } else if (phone.equals("019")) {
                System.out.println("LG");
                break;
            }else{
                System.out.println("APPLE");
                break;
            }
        }
        //4.
        if(phoneNumber1[1].length() > 4){
            System.out.println("최신폰");
        }else{
            System.out.println("올드폰");
        }
        //5.
        int length = 0;
        for(String phone : phoneNumber1) {
            length += phone.length();
        }

        if(length >= 10){
            System.out.println("유효한 전화번호");
        }else{
            System.out.println("유효하지 않은 전화번호");
        }


        /*
        1. String[] 로 바꿔보세요.
        2. 바꿨더니 공백이 포함되어있다면, 공백을 모두 제거 후, 다시 배열에 넣으세요.
        3. 과목수는?
        4. 컴퓨터의 위치는?
        5. 과목명이 3글자 미만인 과목수는?
         */

        String all = "국어, 영어, 수학, 컴퓨터";
        //1,2.
        String[] allArray = all.split(", ");
        //3.
        int subject = allArray.length;
        System.out.println("과목수는 " + subject + "개 입니다.");

        //4.
        for(int i = 0; i < allArray.length; i++){
            if(allArray[i].equals("컴퓨터")){
                System.out.println("컴퓨터의 위치는 " + i + "번째 입니다.");
            }
        }

        //5.
        int cnt = 0;
        for(String arr : allArray){
            if(arr.length() < 3){
                cnt++;
            }
        }
        System.out.println("과목명이 3글자 미만인 과목수는: " + cnt + "개 입니다.");

        //end!
    }
}
