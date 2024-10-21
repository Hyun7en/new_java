package org.example.day15.컬렉션;

import java.util.*;

public class 문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. 한번 갔던 여행지는 가지 않으려고 합니다. 가고 싶은 여행지 5곳을 컬렉션으로 만들어서
//        전체 프린트(set)
        Set place = new HashSet();

        System.out.println("가고 싶은 여행지 5곳을 쓰세요");
        for(int i  = 0; i < 5; i++){
            System.out.print("가고 싶은 " + (i + 1) +  "번째 여행지: ");
            place.add(sc.nextLine());
            System.out.println();
        }
        System.out.println(place);


//        2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고, 현관에는
//        신발의 정보를 컬렉션으로 만들어서 1)전체 프린트, 2)현관에는 무엇이 있나요?, 3)
//        거실에 책상으로 변경하여 전체 프린트(map)
        Map map = new HashMap();
        map.put("안방","TV");
        map.put("거실","쇼파");
        map.put("부엌","냉장고");
        map.put("현관","신발");

        //1
        System.out.println(map);
        //2
        System.out.println(map.get("현관"));
        //3
        System.out.println(map.put("거실","책상"));
        System.out.println(map);

//        3. 오늘 내가 할일 우선순위 5개 목록을 만들어서 1)전체 프린트, 2)첫번째 할 일과 마지막
//        할 일 프린트, 3) 2번째 할 일을 “청소”로 변경해서 전체 프린트(list)

        List<String> list = new ArrayList<>();

        System.out.println("오늘 내가 할일 우선순위 5개 목록:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 할 일: ");
            list.add(sc.nextLine());
            System.out.println();
        }

        // 1. 전체 프린트
        System.out.println("전체 목록: " + list);

        // 2. 첫번째 할 일과 마지막 할 일 프린트
        System.out.println("첫번째 할 일: " + list.get(0));
        System.out.println("마지막 할 일: " + list.get(list.size() - 1));

        // 3. 2번째 할 일을 “청소”로 변경해서 전체 프린트
        list.set(1, "청소");
        System.out.println("업데이트된 전체 목록: " + list);

        sc.close();

        //end
    }
}
