package org.example.mongo.crudTest;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Member하나삭제2 {
    public static void main(String[] args) {
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db 연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공!");

        //3. 전송할 js 생성
        //insert할 json(document)를 생성
        Document filter = new Document();
        filter.append("id","apple2");
        filter.append("pw","1234");

        //4. 전송, 결과처리
        member.deleteOne(filter);
        // db.member.deleteOne({ id : "apple2", pw : "1234"})
        System.out.println("==== 몽고DB로 전송함.");
        client.close();

    }
}
