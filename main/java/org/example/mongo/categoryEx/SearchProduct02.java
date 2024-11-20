package org.example.mongo.categoryEx;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

public class SearchProduct02 {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost", 27017);

        MongoDatabase db = client.getDatabase("Product");
        MongoCollection<Document> Electronics = db.getCollection("Electronics");
        System.out.println("컬렉션 연결");
        Bson filter = new Document("name", new Document("$regex", "Smart"));

        FindIterable<Document> result = Electronics.find(filter);
        System.out.println(result.first());
        client.close();

    }
}
