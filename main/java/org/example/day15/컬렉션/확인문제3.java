package org.example.day15.컬렉션;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class 확인문제3 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("안방", "TV");
        map.put("부엌", "냉장고");
        map.put("현관", "신발");
        System.out.println(map.get("부엌"));
        System.out.println(map);
        Set keys = map.keySet();
        System.out.println(keys.contains("베란다"));
        Collection values = map.values();
        System.out.println(values.contains("스타일러"));
        System.out.println(values.contains("TV"));
        //map은 키목록을 Set으로 먼저 구해서 for-each로 값을 구해줌.
        for (Object x : keys) {
            System.out.println(x + ": " + map.get(x));
        }
    }
}