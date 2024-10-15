package org.example.day11.스태틱static;

public class 운동 {
    String doing;
    String with;
    int time;
    static int count;
    private static int sum;

    public 운동(String doing, String with, int time) {
        this.doing = doing;
        this.with = with;
        this.time = time;
        count++;
        sum += time;
    }

    public static int getTime(){
        return sum;
    }

    @Override
    public String toString() {
        return "운동{" +
                "doing='" + doing + '\'' +
                ", with='" + with + '\'' +
                ", time=" + time +
                '}';
    }
}