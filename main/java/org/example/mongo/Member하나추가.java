package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Member하나추가 {
    public static void main(String[] args) {
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db 연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공!");

        //3. 전송할 js 생성
        //insert할 json(document)를 생성
        Document doc = new Document();
        doc.append("id", "apple"); //{id : "apple"}
        doc.append("pw", "1234"); //{ id : "apple", pw : "1234"}
        doc.append("name", "apple"); //{ id : "apple", pw : "1234", name : "apple"}
        doc.append("tel", "011"); //{ id : "apple", pw : "1234", name : "apple", tel : "011"}

        //4. 전송, 결과처리
        member.insertOne(doc);
        client.close();

    }
}
