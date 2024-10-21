package org.example.day15.컬렉션;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class 맵해쉬 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("name", "홍길동");
        map.put("age", 100);
        map.put("w", 22.2);
        map.put("gender", 'm');
        System.out.println(map);
        System.out.println(map.get("age"));
        //이름꺼내서 성이 홍인지확인해보세요.!
        String name2 = (String)map.get("name");
        String s = name2.substring(0, 1);
        System.out.println(s);
        System.out.println(s.equals("홍"));

        map.put("age", 101);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.remove("gender");
        System.out.println(map);
        System.out.println(map.containsKey("w"));
        System.out.println(map.containsValue("홍길동"));
        Set keys = map.keySet();
        System.out.println(keys);
        Collection values = map.values();
        System.out.println(values);
        System.out.println(map.put("w", 'w'));
        System.out.println(map);
        System.out.println(map.replace("w", 33.3));
        System.out.println(map);
        for (Object key: keys){
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}