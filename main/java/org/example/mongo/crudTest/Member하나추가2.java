package org.example.mongo.crudTest;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Scanner;

public class Member하나추가2 {
    public static void main(String[] args) {
        //1. MongoClient 생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db 연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공!");
        Document doc = new Document();

        Scanner sc = new Scanner(System.in);
        System.out.println("id>> ");
        String id = sc.next();

        System.out.println("pw>> ");
        String pw = sc.next();

        System.out.println("name>> ");
        String name = sc.next();

        System.out.println("tel>> ");
        String tel = sc.next();
        sc.close();

        //3. 전송할 js 생성
        //insert할 json(document)를 생성
        doc.append("id", id); //{id : "apple"}
        doc.append("pw", pw); //{ id : "apple", pw : "1234"}
        doc.append("name", name); //{ id : "apple", pw : "1234", name : "apple"}
        doc.append("tel", tel); //{ id : "apple", pw : "1234", name : "apple", tel : "011"}

        //4. 전송, 결과처리
        member.insertOne(doc);
        client.close();

    }
}
