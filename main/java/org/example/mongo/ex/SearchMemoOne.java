package org.example.mongo.ex;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class SearchMemoOne {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost",27017);

        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> memo = db.getCollection("memo");
        System.out.println("memo컬렉션까지 연결 성공!");

        Document filter = new Document();
        filter.append("age",3);

        FindIterable<Document> result = memo.find(filter);
        Document doc = result.first();
        System.out.println(doc.getString("name"));
        System.out.println(doc.getInteger("age"));
        System.out.println(doc.getString("office"));
        System.out.println(doc.getString("phone"));

        client.close();

    }
}
