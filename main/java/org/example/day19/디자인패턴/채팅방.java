package org.example.day19.디자인패턴;

import java.util.ArrayList;
import java.util.List;

public class 채팅방 {
    List<User> users; //채팅창에 들어온 사람들 목록

    채팅방(){
        this.users = new ArrayList<>();
    }

    //사람들 추가하는 기능
    void addUser(User user){
        users.add(user);
    }

    //사람들 삭제하는 기능
    void removeUser(User user){
        users.remove(user);
    }

    //옵저버 패턴!(메시지를 입력하면 관찰하고 있다가 다른 객체로 알려줌.)
    void notifyUsers(String m){
        for (User user : users){
            user.update(m);
        }
    }
}