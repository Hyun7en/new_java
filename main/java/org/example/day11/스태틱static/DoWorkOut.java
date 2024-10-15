package org.example.day11.스태틱static;

public class DoWorkOut {
    public static void main(String[] args) {
        WorkOut w1 = new WorkOut("테니스","친구",3);
        WorkOut w2 = new WorkOut("러닝","동네모임",2);
        //2-1) w1, w2의 구체적인 내용을 각각 프린트
        System.out.println(w1);
        System.out.println(w2);

        //2-2) 운동을 총 몇 번이나 했는지 프린트(static 변수 이용)
        System.out.println(WorkOut.count);

        //2-3) 운동을 총 몇 시간이나 했는지 프린트 (운동.getTime()이용)
        System.out.println(WorkOut.getTime());

    }
}
