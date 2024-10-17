package org.example.day13.timerTest;

import java.util.Date;
import java.util.Timer;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerAction timerAction = new TimerAction();
        System.out.println("5초 동안 게임을 할 수 있습니다.");
        timer.schedule(timerAction,5000);
        System.out.println("5초가 count 되는 중입니다.");
        for(int i = 0 ; i < 10; i++){
            System.out.println(i + ">> MainMainMainMainMain");
            Date date = new Date();
            System.out.println(date.getSeconds());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //end
    }

}
