package org.example.day11.스태틱static;

public class WorkOut {
    static int count;
    private static int sum;
    private String sportsName;
    private String withWho;
    private int time;

    public WorkOut(String sportsName, String withWho, int time) {
        this.sportsName = sportsName;
        this.withWho = withWho;
        this.time = time;
        count++;
        sum += time;
    }

    public static int getTime(){

        return sum;
    }

    @Override
    public String toString() {
        return "WorkOut{" +
                "sportsName='" + sportsName + '\'' +
                ", withWho='" + withWho + '\'' +
                ", time=" + time +
                '}';
    }
}
