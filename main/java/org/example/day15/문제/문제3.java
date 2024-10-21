package org.example.day15.문제;

import java.util.HashMap;
import java.util.Map;

public class 문제3 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(100,"김데이");
        map.put(200,"김사전");
        map.put(300,"김구조");
        map.put(400,"김자료");

        //200탈퇴
        map.remove(200);

        //300개명
        map.replace(300,"김충성");

        for(Object key : map.keySet()){
            System.out.println("고객 번호: " + key+", 이름: "+map.get(key));
        }

    }
}
