package org.example.분산환경;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.sql.*;
import java.util.ArrayList;

public class AwsLogs {

    private static final String MYSQL_URL = "jdbc:mysql://localhost:3306/aws";
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "1234";

    private static final String Mongo_URI = "mongodb://localhost:27017";

    public static void main(String[] args) {

        try {
            //1. mysql 연결
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            System.out.println("Connection Success");

            //2. 회원가입후 자동증가한 id 얻어옴
            String insertUserSQL = "insert into users (name,email,signup_date) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(insertUserSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,"hong");
            ps.setString(2,"hong@new.com");
            ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            ps.executeUpdate();
            System.out.println("User Insert Success");

            //3. 2번에서 얻은 id를 이용해서 몽고db에 정보를 넣자
            ResultSet rs = ps.getGeneratedKeys();
            int userID = 0;
            if(rs.next()){
                userID = rs.getInt(1);
            }
            System.out.println("자동 생성된 userId >> " + userID);
            //3-1. mongoDB에 연결
            MongoClient client = new MongoClient("localhost", 27017);
            MongoDatabase mongoDatabase = client.getDatabase("activity_logs");
            MongoCollection<Document> logCollection = mongoDatabase.getCollection("activity_logs");
            System.out.println("MongoDB Connection Success");
            System.out.println("3. mongoDB 연결");

            //3-2. document를 만들어서 전송
            Document activityLog = new Document();
            activityLog.append("userId", userID);
            activityLog.append("activity", "Login");
            activityLog.append("timestamp", "2024-11-10");

            Document activityLog2 = new Document();
            activityLog2.append("userId", userID);
            activityLog2.append("activity", "Order");
            activityLog2.append("timestamp", "2024-11-11");

            Document activityLog3 = new Document();
            activityLog3.append("userId", userID);
            activityLog3.append("activity", "Order");
            activityLog3.append("timestamp", "2024-11-21");

            logCollection.insertOne(activityLog);
            logCollection.insertOne(activityLog2);
            logCollection.insertOne(activityLog3);

            System.out.println("Inserted order for user ID: " + userID);
            System.out.println("4. mongoDB에 전송");

            //4. 회원정보는 mysql검색, 회원주문정보 보기는 mongoDB 검색하여 분산!
            //4-1 회원정보는 mysql 검색
            String selectUserSQL = "select * from users where id = ? ";
            PreparedStatement selectPstmt = con.prepareStatement(selectUserSQL);
            selectPstmt.setInt(1, userID);
            ResultSet userResult = selectPstmt.executeQuery();
            if (userResult.next()) {
                System.out.println("User Info: ");
                System.out.println("Name: " + userResult.getString("name"));
                System.out.println("Email: " + userResult.getString("email"));
            }

            //4-2 회원주문정보 보기는 mongoDB검색
            Document filter = new Document("userId", userID);
            ArrayList<Document> result = logCollection.find(filter).into(new ArrayList<Document>());
            System.out.println(result);

            con.close();
            client.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //end
    }

}
