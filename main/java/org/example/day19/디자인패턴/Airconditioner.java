package org.example.day19.디자인패턴;

import java.util.Arrays;
import java.util.List;

public class Airconditioner implements 관찰자 {
    List<String> managers = Arrays.asList("alice", "hong", "park");

    void setTemp(int temp){
        for (String s: managers){
            System.out.print(s + "님 ");
            update(temp);
        }
    }
    @Override
    public void update(int temp) {
        System.out.print(temp + "도가 변경되었습니다.");
    }
}
