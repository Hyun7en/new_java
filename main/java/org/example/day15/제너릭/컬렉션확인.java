package org.example.day15.제너릭;

import java.util.ArrayList;
import java.util.HashMap;

public class 컬렉션확인 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동1");
        list.add("홍길동2");
        list.add("홍길동3");
        list.add("홍길동4");
        String name = list.get(0);//강제캐스팅 불필요!
        System.out.println(name);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "엄마");
        String value = map.get(1);
        System.out.println(value);
    }
}