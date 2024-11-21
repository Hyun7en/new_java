package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectTemplate {
    // MySQL JDBC URL
    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    // MongoDB Connection URI
    private static final String MONGO_URI = "mongodb://localhost:27017";

    private static MongoClient mongoClient;
    private static Connection mysqlConnection;

    // MongoDB 연결 메소드
    public static MongoCollection<Document> mongoDBConnect(String database, String collection) {
        if (mongoClient == null) {
            mongoClient = new MongoClient(new MongoClientURI(MONGO_URI));
            System.out.println("MongoDB 연결 성공");
        }
        MongoDatabase db = mongoClient.getDatabase(database);
        return db.getCollection(collection);
    }

    // MySQL 연결 메소드
    public static Connection mysqlConnect() throws ClassNotFoundException, SQLException {
        if (mysqlConnection == null || mysqlConnection.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            mysqlConnection = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("MySQL 연결 성공");
        }
        return mysqlConnection;
    }

    // MongoDB 연결 해제 메소드
    public static void closeMongoDB() {
        if (mongoClient != null) {
            System.out.println("MongoDB 연결 해제");
            mongoClient.close();
            mongoClient = null;
        }
    }

    // MySQL 연결 해제 메소드
    public static void closeMySQL() {
        if (mysqlConnection != null) {
            try {
                System.out.println("MySQL 연결 해제");
                mysqlConnection.close();
                mysqlConnection = null;
            } catch (SQLException e) {
                System.err.println("MySQL 연결 해제 중 오류 발생: " + e.getMessage());
            }
        }
    }
}