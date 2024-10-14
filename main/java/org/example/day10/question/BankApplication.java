package org.example.day10.question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========================================");
            System.out.println("은행 계좌 관리 애플리케이션");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록 보기");
            System.out.println("3. 계좌 정보 검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                sc.nextLine(); // Clear the invalid input
                continue; // Restart the loop
            }

            switch (choice) {
                case 1:
                    System.out.println("새 계좌 정보를 입력하세요.(형식: 계좌번호 소유자 잔액)");
                    String accountNumber = sc.nextLine();
                    String name = sc.nextLine();
                    int balance;
                    try {
                        balance = sc.nextInt();
                        sc.nextLine(); // Consume the newline character
                        Account.addAccount(accountNumber, name, balance);
                    } catch (InputMismatchException e) {
                        System.out.println("잔액은 숫자로 입력해야 합니다.");
                        sc.nextLine(); // Clear the invalid input
                    }
                    break;
                case 2:
                    Account[] accounts = Account.getAccounts(); // Get accounts using the getter method
                    boolean hasAccounts = false; // Flag to check if there are any accounts
                    for (Account account : accounts) {
                        if (account != null) {
                            System.out.println(account);
                            hasAccounts = true; // At least one account exists
                        }
                    }
                    if (!hasAccounts) {
                        System.out.println("등록된 계좌가 없습니다.");
                    }
                    break;
                case 3:
                    System.out.println("검색할 계좌번호를 입력하세요: ");
                    accountNumber = sc.nextLine();
                    Account.findAccount(accountNumber);
                    break;
                case 4:
                    System.out.println("삭제할 계좌번호를 입력하세요: ");
                    accountNumber = sc.nextLine();
                    Account.deleteAccount(accountNumber);
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close(); // Close the scanner resource
                    return; // Exit the program
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    break;
            }
        }
    }
}
