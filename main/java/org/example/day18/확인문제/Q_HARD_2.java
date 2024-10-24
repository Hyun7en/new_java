package org.example.day18.확인문제;

public class Q_HARD_2 {
    public static void main(String[] args) {
        Girl girl = new Girl();

        // Dance를 구현한 람다 표현식 사용
        Play play = (name) -> {
            System.out.println(name + "할 때는 white 드레스를 입는다.");
        };

        // Drink를 구현한 람다 표현식 사용
        Play2 play2 = (name, price, count) -> {
            int total = price * count;
            System.out.println("나는 매일 " + name + " 후 " + price + "원짜리 음료 " + count + "개를 " + total + "원에 사먹는다.");
        };

        // action 호출
        girl.action(play);   // "발레할 때는 white 드레스를 입는다." 출력
        girl.action2(play2); // "나는 매일 발레 후 1000원짜리 음료 2개를 2000원에 사먹는다." 출력
    }
}
