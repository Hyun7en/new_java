package org.example.mongo.naver;

public class NaverInsertMain {

    public static void main(String[] args) {
        MongoDBBlogInsert.insertBlogMember();
        MongoDBCafeInsert.insertCafeMember();
        MongoDBLineInsert.insertLineMember();
    }
}
