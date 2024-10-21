package org.example.day02.control;

import javax.swing.*;

public class 순차문1 {
    public static void main(String[] args) {


        String id = "root";
        String pw = "1234";

        //입력하는 처리 필요
        String id1 = null; // null -> 기본형 아닌 것.
        String pw1 = null;

        id1= JOptionPane.showInputDialog("id1을 입력하세요: "); //"admin", "root"
        pw1= JOptionPane.showInputDialog("pw1을 입력하세요: "); // "1111", "1234"



        System.out.println(id.equals(id1) && pw.equals(pw1));


    }
}
