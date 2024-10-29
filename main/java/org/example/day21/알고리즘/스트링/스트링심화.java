package org.example.day21.알고리즘.스트링;

public class 스트링심화 {
    public static void main(String[] args) {
        String s = "퐁퐁"; //100
        String s2 = "퐁퐁"; //100
        System.out.println(s);
        System.out.println(s2);
        //참조형이 가르키고 있는 값을 비교
        System.out.println(s.equals(s2));
        //참조형 변수내에 들어있는 주소를 비교
        System.out.println(s == s2);
        s2 = "하하"; //200
        System.out.println(s == s2);
        s2 = "홍홍"; //300
        for (int i = 0; i < 100; i++) {
            s2 = i + "번";
        }
        //String은 값이 자꾸 변할 때 새로운 주소를 할당하기 때문에
        //사용하면 X
        //==> 스트링이 값이 자꾸 변할 때는 StringBuilder를 쓸 것.
        StringBuilder sb = new StringBuilder();
        sb.append("하하하하1");
        System.out.println(sb.hashCode());
        sb.append("하하하하2");
        System.out.println(sb.hashCode());
        sb.append("하하하하3");
        System.out.println(sb);
        sb.replace(0, 4, "호호호호");
        System.out.println(sb);
        sb.delete(0, 4);
        System.out.println(sb.hashCode());
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb.hashCode());
        System.out.println(sb);
        System.out.println(sb.indexOf("2"));
        sb.insert(1, "왕");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);

        String[] s3 = {"나는 ", "홍길동", "이다.",
                       "너는 ", "김길동", "이다."
        };
        //하나로 모아보세요.!
        // ==> StringBuilder에 모아서 String으로 옮기기!
        String s4 = "";
        StringBuilder sb2 = new StringBuilder();
        for (String one: s3){
            sb2.append(one);
            System.out.println(sb2.hashCode());
        }
        System.out.println(sb2);
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
    }
}
