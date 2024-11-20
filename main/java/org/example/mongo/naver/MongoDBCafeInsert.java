package org.example.mongo.naver;

import com.mongodb.*;
import com.mongodb.client.*;
import org.bson.Document;
public class MongoDBCafeInsert {
    public static void insertCafeMember() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");
        // 네이버 카페 회원 정보 삽입 (카페에만 필요한 필드만 포함)
        Document cafeMember = new Document("service", "Cafe")
                .append("id", "cafeUser1")
                .append("name", "홍길동")
                .append("email", "cafeuser1@naver.com")
                .append("joinDate", "2023-01-01")
                .append("membershipLevel", "Gold");
        collection.insertOne(cafeMember);
        mongoClient.close();
        System.out.println("카페 회원 정보 삽입 완료.");
    }
}
