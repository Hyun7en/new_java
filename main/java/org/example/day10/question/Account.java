package org.example.day10.question;

public class Account {
    private String accountNumber;
    private String name;
    private int balance;
    private static Account[] accounts = new Account[3];
    private static int accountCount = 0;

    public Account(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public static void addAccount(String accountNumber, String name, int balance) {
        if (accountCount < accounts.length) {
            for (Account account : accounts) {
                if (account != null && account.accountNumber.equals(accountNumber)) {
                    System.out.println("이미 존재하는 계좌 번호입니다.");
                    return;
                }
            }
            accounts[accountCount++] = new Account(accountNumber, name, balance);
            System.out.println("계좌가 생성되었습니다.");
        } else {
            System.out.println("더 이상 계좌를 생성할 수 없습니다.");
        }
    }

    public static Account[] getAccounts() {
        return accounts; // Getter method to return the accounts array
    }

    public static void findAccount(String accountNumber) {
        boolean found = false; // 계좌 발견 여부 확인
        for (Account account : accounts) {
            if (account != null && account.accountNumber.equals(accountNumber)) {
                System.out.println(account);
                found = true; // 계좌 발견
                break; // 계좌를 찾으면 반복 종료
            }
        }
        if (!found) {
            System.out.println("Account number does not match"); // 계좌를 찾지 못한 경우
        }
    }

    public static void deleteAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i] != null && accounts[i].accountNumber.equals(accountNumber)) {
                accounts[i] = null; // 계좌 삭제
                System.out.println("Account deleted");
                // 계좌 삭제 후 남은 계좌를 앞쪽으로 이동
                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[--accountCount] = null; // 마지막 계좌를 null로 설정
                return; // 메서드 종료
            }
        }
        System.out.println("Account number does not match"); // 계좌를 찾지 못한 경우
    }

    @Override
    public String toString() {
        return "계좌번호: " + accountNumber + ", 소유자: " + name + ", 잔액: " + balance;
    }
}
