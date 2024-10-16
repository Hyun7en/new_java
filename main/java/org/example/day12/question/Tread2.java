package org.example.day12.question;

import java.text.DateFormat;
import java.util.Date;

public class Tread2 extends Thread {
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.println(DateFormat.getDateTimeInstance().format(new Date()));
        }
    }
}
