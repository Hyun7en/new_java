package org.example.mongo.crudTest;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Member여러개삭제 {
    public static void main(String[] args) {
        //1. MongoClient생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공~!");
        //3. 전송할 js생성
        //delete할 json(document) 조건(filter)을 생성
        Document filter = new Document();
        filter.append("pw", "1234");

        //4. 전송, 결과처리
        member.deleteMany(filter);
        //db.member.deleteOne({ pw : "1234 })
        System.out.println("몽고db에 전송함.");
        client.close();
    }
}