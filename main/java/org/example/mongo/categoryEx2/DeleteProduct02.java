package org.example.mongo.categoryEx2;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

public class DeleteProduct02 {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost", 27017);

        MongoDatabase db = client.getDatabase("Product");
        MongoCollection<Document> clothing = db.getCollection("Clothing");
        System.out.println("컬렉션 연결");
        Bson filter = new Document("price", new Document("$gte", 30000) );

        clothing.deleteOne(filter);
        System.out.println("MongoDB 전송");
        client.close();

    }
}