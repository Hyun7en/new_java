package org.example.mongo.naver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBSearchByJoinDate {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");
        // 라인 서비스에서 가입일이 특정 날짜 이후인 회원 정보 검색
        String joinDate = "2021-12-01";  // 특정 날짜 이후 가입한 회원
        Document query = new Document("service", "Line").append("joinDate", new Document("$gt", joinDate));
        for (Document member : collection.find(query)) {
            System.out.println("검색된 회원 정보: " + member.toJson());
        }
        mongoClient.close();
    }
}
