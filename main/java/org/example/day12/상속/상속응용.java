package org.example.day12.상속;

import java.util.ArrayList;
import java.util.Date;

public class 상속응용 {
    public static void main(String[] args) {
        //고정, 같은 타입, 많은 수 --> 배열
        //가변, 같은(다른)타입, 많은 수 --> ArrayList
        ArrayList list = new ArrayList();
        list.add(10000);
        list.add("볼펜");
        list.add(new Date());
        list.add(25.5);
        System.out.println(list);
        list.remove("볼펜");
        list.remove(0);
        System.out.println(list);
    }
}
