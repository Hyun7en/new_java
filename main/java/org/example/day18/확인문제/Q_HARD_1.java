package org.example.day18.확인문제;

public class Q_HARD_1 {
    public static void main(String[] args) {
        /*
        데이터베이스와의 연결을 관리하는 클래스를 만들 때, 연결 객체는 프로그램 전체에서 하나만 존재해야
        한다. 이를 통해 리소스를 효율적으로 사용하고 데이터베이스 연결 오버헤드를 줄일 수 있다. DB연결할 수
        있는 클래스를 정의하고 main메서드 안에서 싱글톤 객체 생성하시오. 동일한 객체의 주소를 2개 더 획득 후
        총 3개의 주소를 비교해보시오.
        ● 클래스명 : DatabaseConnection, Main
         */
        // DatabaseConnection 싱글톤 객체 생성
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection3 = DatabaseConnection.getInstance();

        // 객체의 주소 비교
        System.out.println("connection1 주소: " + connection1);
        System.out.println("connection2 주소: " + connection2);
        System.out.println("connection3 주소: " + connection3);

        // 동일한 객체인지 비교
        System.out.println("connection1 == connection2: " + (connection1 == connection2));
        System.out.println("connection2 == connection3: " + (connection2 == connection3));
        System.out.println("connection1 == connection3: " + (connection1 == connection3));
    }
}
