package org.example.mongo.naver;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoDBMergeMembers {
    public static void mergeMembers() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection =
                database.getCollection("members");
        // 모든 회원 정보를 조회
        List<Document> allMembers = collection.find().into(new
                ArrayList<>());
        // 각 서비스의 회원 정보를 통합하여 출력
        for (Document doc : allMembers) {
            String service = doc.getString("service");
            String id = doc.getString("id");
            String name = doc.getString("name");
            String email = doc.getString("email");
            String phoneNumber = doc.getString("phoneNumber");
            String joinDate = doc.getString("joinDate");
            String membershipLevel = doc.getString("membershipLevel");
            Integer postCount = doc.getInteger("postCount");
            String status = doc.getString("status");
            // 서비스별 통합 출력
            System.out.println("서비스: " + service);
            System.out.println("ID: " + id);
            System.out.println("이름: " + name);
            if (email != null) System.out.println("이메일: " + email);
            if (phoneNumber != null) System.out.println("전화번호: " +
                    phoneNumber);
            if (membershipLevel != null) System.out.println("회원 등급: " +
                    membershipLevel);
            if (postCount != null) System.out.println("포스트 수: " +
                    postCount);
            if (status != null) System.out.println("상태: " + status);
            System.out.println("가입일: " + joinDate);
            System.out.println("-------------------------------");
        }
        mongoClient.close();
    }
}

