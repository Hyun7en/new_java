package org.example.mongo.naver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
public class MongoDBLineInsert {
    public static void insertLineMember() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");
        // 네이버 라인 회원 정보 삽입 (라인에만 필요한 필드만 포함)
        Document lineMember = new Document("service", "Line")
                .append("id", "lineUser3")
                .append("name", "김유신")
                .append("phoneNumber", "010-1234-5678")
                .append("joinDate", "2021-12-15")
                .append("status", "Active");
        collection.insertOne(lineMember);
        mongoClient.close();
        System.out.println("라인 회원 정보 삽입 완료.");
    }
}