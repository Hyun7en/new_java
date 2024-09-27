package org.example.day2.control;


public class 조건문switch2 {
    public static void main(String[] args) {
        // 1.
        int month = 11;
        //계절 판별

        switch (month) {
            case 3,4,5:
                System.out.println("이제는 볼 수 없는 봄");
                break;
            case 6,7,8,9:
                System.out.println("이제는 9월도 가을");
                break;
            case 10:
                System.out.println("10월만 가을");
                break;
            case 11,12,1,2:
                System.out.println("여름보다 겨울이 좋아");
                break;
        }


        //2.
        //먹고 싶은 음식이 짬뽕이면 중국집으로
        //               우동이면 분식집으로
        //               감자탕이면 한식으로
        //위에 것에 포함되지 않으면 집에서 먹자.

        String food = "짬뽕";

        switch (food){
            case "짬뽕":
                System.out.println("중국집");
                break;
            case "우동":
                System.out.println("분식집");
                break;
            case "감자탕":
                System.out.println("한식집");
                break;
            default:
                System.out.println("집밥");
        }
    }
}
