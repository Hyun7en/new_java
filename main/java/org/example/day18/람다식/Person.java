package org.example.day18.람다식;

import org.example.day18.Speakable;
import org.example.day18.Workable;

public class Person {
    public void action1(Workable w){
        w.work("홍길동", "프로그래머");
    }

    public void action2(Speakable s){
        s.speak("안녕하세요.");
    }
}