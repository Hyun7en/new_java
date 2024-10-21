package org.example.day05.array2;

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
        //1-2. 앞에서 부터 @앞까지 추출
        int index = s3.indexOf("@");
        System.out.println(index);
        System.out.println(s3.substring(0, index));
        System.out.println(s3.startsWith("alicia"));
        //s3에 들어있는 것을 대문자로
        System.out.println(s3.toUpperCase());
        //s3에 들어있는 것 중 com을 net을 변경
        System.out.println(s3.replace("com", "net"));
        //replace()는 램에 있는 데이터를 가져가자 cpu가 변경!
        s3 = s3.replace("com", "net");
        //ram은 변경되지 않았음.
        //==> 수동으로  ram에 넣어주어야 한다.

        //s3의 전체 글자수 프린트
        System.out.println(s3.length());
        //길이, 크기, 사이즈, 렝스, 개수
        String s4 = " root";
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";
        String s44 = s4.trim();
        System.out.println(s44.length());
        System.out.println(s44.equals("root"));
        System.out.println(s4.equals("root"));

        //String을 분리해서 배열에 넣어주기!
        String[] datas = s5.split(","); //{"감자","고구마","양파"}
        for (String data : datas) {
            System.out.println(data);
        }
        char[] datas2 = s6.toCharArray(); //{'a', 'b', 'c'}
        for (char data2 : datas2) {
            System.out.println(data2);
        }

    }
}
