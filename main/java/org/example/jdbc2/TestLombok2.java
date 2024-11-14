package org.example.jdbc2;

public class TestLombok2 {
    public static void main(String[] args) {
        //1. 가방을 만들자.
        BoardVO vo = new BoardVO();

        //2. 가방에 데이터를 넣는다.
        vo.setNo(1);
        vo.setTitle("안냥");
        vo.setContent("안녕하세요 잘부탁드려요!");
        vo.setWriter("고병현");

        //3. 가방을 전달하자.
        //4. 가방을 데이터화 하자.
        int no = vo.getNo();
        String title = vo.getTitle();
        String content = vo.getContent();
        String writer = vo.getWriter();

        System.out.println(vo);
    }
}
