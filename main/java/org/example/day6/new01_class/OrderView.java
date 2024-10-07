package org.example.day6.new01_class;

import java.util.Scanner;

public class OrderView {

    public void orderView(){
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("주문 가능한 메뉴입니다.");
            System.out.println("================================================");
            System.out.println("1>> Burger: $5.99");
            System.out.println("2>> Fries: $2.99");
            System.out.println("3>> Soda: $1.99");

            System.out.print("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x'입력 >> ");
            int orderNum = sc.nextInt();
            sc.nextLine();

            switch(orderNum){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("종료 합니다.");
                    return;
            }
        }

    }
}
