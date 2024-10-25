package org.example.day19.디자인패턴;

public class 채팅방만들기 {
    public static void main(String[] args) {
        채팅방 room = new 채팅방();
        User user = new User("홍길동");
        room.addUser(user);
        room.addUser(new User("김길동"));
        room.addUser(new User("박길동"));

        room.notifyUsers("와! 오늘은 신나는 금요일!!!!");

        //채팅창에서 "홍길동" 삭제
        //내용을 보내보세요! --> 내일은 토요일!!
        room.removeUser(user);
        room.notifyUsers("내일은 토요일!!");
    }
}