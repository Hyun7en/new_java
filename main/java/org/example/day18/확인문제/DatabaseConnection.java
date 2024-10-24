package org.example.day18.확인문제;

public class DatabaseConnection {
    // 1. DatabaseConnection 클래스의 유일한 인스턴스를 저장할 static 변수
    private static DatabaseConnection instance;

    // 2. private 생성자: 외부에서 인스턴스를 생성할 수 없도록 함
    private DatabaseConnection() {
        // 데이터베이스 연결 초기화 코드
        System.out.println("Database Connection Established.");
    }

    // 3. 인스턴스를 가져오는 static 메서드
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // 인스턴스가 없으면 생성
        }
        return instance; // 이미 존재하는 인스턴스 반환
    }
}
