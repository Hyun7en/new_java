package org.example.day16.인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 버튼1처리클래스 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("b1클릭함.");
    }
}
