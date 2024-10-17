package org.example.day13.timerTest;

import java.util.TimerTask;

public class MyTimer extends TimerTask {


    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("tasktasktasktask================");
        }
        System.out.println("게임이 종료되었습니다.");
    }
}
