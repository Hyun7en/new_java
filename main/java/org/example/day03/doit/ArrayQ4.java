package org.example.day03.doit;

import java.util.Scanner;

public class ArrayQ4 {


    public static void main(String[] args) {
        /*
        다음 화면을 구현하시오.

        -영화예매 좌석 1부터 10까지 번호 출력 후
        -아직 예매되지 않았으면 0으로 출력
        -예매한 경우 해당 번호의 좌석을 1로  변경
        -원할 때 까지 좌석을 예매
        -예매 종료시 예매수와 총 금액 출력
        -좌석당 10000원

         */

        Scanner sc = new Scanner(System.in);
        int seat1 = 0, seat2 = 0, seat3 = 0, seat4 = 0, seat5 = 0;
        int seat6 = 0, seat7 = 0, seat8 = 0, seat9 = 0, seat10 = 0;
        while(true){

            if(seat1 + seat2 + seat3 + seat4 + seat5 + seat6 + seat7 + seat8 + seat9 + seat10 == 10 ){
                System.out.println("모든 좌석이 예매되었습니다.");
                return;
            }
            System.out.println("현재 좌석 상태:");
            System.out.println("1:" + seat1 + ",2:" + seat2 + ",3:" + seat3
                    + ",4:" + seat4 + ",5:" + seat5 + ",6:" + seat6 + ",7:"
                    + seat7 + ",8:" + seat8 + ",9:" + seat9 + ",10:" + seat10);

            System.out.print("예매할 좌석 번호를 입력하세요(종료하려면 0 입력): ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.println("================================================");

            switch (num){
                case 1:
                    if(seat1 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("1번 좌석이 예매되었습니다.");
                    seat1=1;
                    break;
                case 2:
                    if(seat2 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("2번 좌석이 예매되었습니다.");
                    seat2=1;
                    break;
                case 3:
                    if(seat3 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("3번 좌석이 예매되었습니다.");
                    seat3=1;
                    break;
                case 4:
                    if(seat4 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("4번 좌석이 예매되었습니다.");
                    seat4=1;
                    break;
                case 5:
                    if(seat5 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("5번 좌석이 예매되었습니다.");
                    seat5=1;
                    break;
                case 6:
                    if(seat6 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("6번 좌석이 예매되었습니다.");
                    seat6=1;
                    break;
                case 7:
                    if(seat7 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("7번 좌석이 예매되었습니다.");
                    seat7=1;
                    break;
                case 8:
                    if(seat8 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("8번 좌석이 예매되었습니다.");
                    seat8=1;
                    break;
                case 9:
                    if(seat9 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("9번 좌석이 예매되었습니다.");
                    seat9=1;
                    break;
                case 10:
                    if(seat10 == 1){
                        alreadyBooked(num);
                        break;
                    }
                    System.out.println("10번 좌석이 예매되었습니다.");
                    seat10=1;
                    break;
                case 0:
                    int result = seat1 + seat2 + seat3 + seat4 + seat5 + seat6 + seat7 + seat8 + seat9 + seat10;
                    System.out.println("예매된 좌석수: " + result);
                    System.out.println("총 예매 금액: " + result*10000 + "원");
                    return;
            }

        }

        //end
    }

      public static void alreadyBooked(int seat){
          System.out.println(seat +"번은 이미 예매된 좌석입니다. 다른 좌석을 예매해주세요;");
    }

}
