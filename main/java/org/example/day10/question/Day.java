package org.example.day10.question;

public class Day {
    String doing;
    String location;
    int time;
    static int count;
    static int totalHour;

    public Day(String doing, String location, int time) {
        this.doing = doing;
        this.location = location;
        this.time = time;
        count++;
        totalHour += time;
    }

    public static int getWorkAvg(){
        return  totalHour/count ;
    }

    @Override
    public String toString() {
        return "Day{" +
                "doing='" + doing + '\'' +
                ", location='" + location + '\'' +
                ", time=" + time +
                '}';
    }
}
