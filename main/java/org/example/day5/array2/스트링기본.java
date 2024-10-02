package org.example.day5.array2;

public class 스트링기본 {
    public static void main(String[] args) {
        String s = "나는! 프로그래머야"; //index를 가지고 있음. 나는 0번!
        String s2 = "진짜!!!";
        System.out.println(s + s2);
        String sum = s.concat(s2);
        System.out.println(sum);
        char c = s.charAt(0); //s스트링에 들어있는 것중 0번 index에 있는 char를 추출!
        System.out.println(c);
        char c2 = s2.charAt(2);
        System.out.println(c2);
        System.out.println(s.endsWith("!")); //true,false
        System.out.println(s2.endsWith("!"));
        System.out.println(s.contains("!"));
        System.out.println(s2.contains("!"));
        //aliciawill@kakao.com
        //--> aliciawill
        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 9));
        //index
        System.out.println(s2.indexOf("!"));//첫번째 위치!
        String s3 = "aliciawill@kakao.com";
        //aliciawill만 추출해주세요.!
        //1-1. @의 위치를 찾는다.
        int index = 0;
        index = s3.indexOf("@");
        System.out.println(index);
        //1-2. 앞에서 부터 @앞까지 추출
        System.out.println(s3.substring(0,index));
        System.out.println(s3.startsWith("aliciawill"));
        System.out.println(s3.toUpperCase());
        s3 = s3.replace("com","net");
        System.out.println(s3);
        System.out.println(s3.length());

        //길이, 크기, 사이즈, 렝스, 개수
        String s4 = " root";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";
        String s44 = s4.trim();
        System.out.println(s44.length());

        //String을 분리해서 배열에 넣어주기!
        
    }
}
