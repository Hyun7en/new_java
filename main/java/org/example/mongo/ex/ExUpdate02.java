package org.example.mongo.ex;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

public class ExUpdate02 {
    public static void main(String[] args) {
        MongoClient client = new MongoClient("localhost", 27017);

        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공");

        Document filter = new Document();
        filter.append("id","hong");

        Bson pw = Updates.set("pw","7777");
        Bson name = Updates.set("name","winner");
        Bson all = Updates.combine(pw,name);

        member.updateOne(filter,all);
        System.out.println(" === mongoDB로 전송함 === ");
        client.close();
    }
}
