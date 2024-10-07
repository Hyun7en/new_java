package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        //전체 프레임이 필요
        //new를 이용해서 부품을 만들어 램에 넣어둠.
        JFrame f = new JFrame();
        //1. new JFrame(): JFrame을 램에 넣어둔다.
        //2. f = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame f: f라는 변수에는 JFrame이 들어있는 주소를 넣어두었다를 표시
        //   --> 이렇게 쓰면 f에는 JFrame이 저장된 위치만 넣을 수 있고,
        //       다른 부품의 위치는 넣을 수 없음.
        f.setSize(500,500);
        String[] title = {"장소","누구와","언제"};
        String[][] contents = {
                {"부산","동생","오전출발"},
                {"대구","친구","오후출발"},
                {"광주","동료","저녁출발"}
        };

        //JTable table = new JTable(2차원 배열 데이터, 1차원 배열 항목명);
        JTable table = new JTable(contents,title);
        JScrollPane pane = new JScrollPane(table);
        f.add(pane);

        f.setVisible(true);
        //end!
    }
}
