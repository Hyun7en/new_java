package org.example.day02.review;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String id = sc.nextLine();
        String pw = sc.nextLine();

        System.out.println(id.equals("root") && pw.equals("1234"));

    }
}
