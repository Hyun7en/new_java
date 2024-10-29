package org.example.day21.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문제풀이 {
    public static void main(String[] args) {

//        1. String s = "감,배,위"; 각 글자를 추출 후(split())
//        오름차순으로 정렬하여 String에 넣어 프린트
        String s = "감,배,위";
        List list = new ArrayList();
        for(String str : s.split(",")) {
            list.add(str);
        }
        Collections.sort(list);
        String s1 = list.toString();
        System.out.println(s1);
//        2. String[] s2 = {"제주도", "부산", "울릉도"};
//        다음과 같이 출력되도록 하나의 String으로 묶어서 프린트
//        나는 제주도 가고 싶다. 나는 부산 가고 싶다. 나는 울릉도 가고 싶다.
        String[] s2 = {"제주도", "부산", "울릉도"};
        StringBuilder sb = new StringBuilder();

        for(String str : s2) {
            sb.append("나는 ").append(str).append(" 가고 싶다.").append("\n");
        }

        System.out.println(sb.toString().trim());

//        3. String[] s3 = {"제주도", "부산", "울릉도"};
//        s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
//        부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
        String[] s3 = {"제주도", "부산", "울릉도"};
        List<String> list1 = new ArrayList<>(Arrays.asList(s3));
        list1.add("울산");
        list1.add("파주");
        list1.add("인천");
        list1.remove(0);
        int busan = list1.indexOf("부산");
        list1.set(busan,"마산");
        String ss3 = list1.toString();
        System.out.println(ss3);

//        4. String s4 = "마사아차가나"; 오름차순으로 정렬 후 프린트
        String s4 = "마사아차가나";
        List list2 = new ArrayList();
        for(char c : s4.toCharArray()) {
            list2.add(c);
        }
        Collections.sort(list2);
        System.out.println(list2.toString());

//        5. int[] s5 = {55, 100, 77, 88, 22}를 정렬 후 역순으로 int[] s6에 옮겨 프린트
        int[] s5 = {55, 100, 77, 88, 22};
        Arrays.sort(s5);
        int[] s6 = new int[s5.length];
        for(int i=0;i<s5.length;i++) {
            s6[i] = s5[s5.length-1-i];
        }
        System.out.println(Arrays.toString(s6));

    }
}
