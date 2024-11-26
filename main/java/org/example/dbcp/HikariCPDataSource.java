package org.example.dbcp;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class HikariCPDataSource {
    private static HikariCPDataSource instance; // 싱글톤 인스턴스
    private final HikariDataSource dataSource;

    private HikariCPDataSource() {
        // HikariConfig 설정
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/shop2"); // DB URL
        config.setUsername("root"); // DB 사용자 이름
        config.setPassword("1234"); // DB 비밀번호
        config.setDriverClassName("com.mysql.cj.jdbc.Driver"); // MySQL 드라이버
        config.setMaximumPoolSize(1000); // 최대 커넥션 풀 크기
        config.setMinimumIdle(2); // 최소 유휴 커넥션
        config.setIdleTimeout(30000); // 유휴 커넥션 유지 시간 (30초)
        config.setMaxLifetime(1800000); // 커넥션 최대 수명 (30분)
        config.setConnectionTimeout(30000); // 커넥션 획득 대기 시간 (30초)

        // HikariDataSource 생성
        this.dataSource = new HikariDataSource(config);
    }

    // 싱글톤 인스턴스 반환 메서드
    public static synchronized HikariCPDataSource getInstance() {
        if (instance == null) {
            instance = new HikariCPDataSource();
        }
        return instance;
    }

    // DataSource 반환 메서드
    public DataSource getDataSource() {
        return dataSource;
    }
}