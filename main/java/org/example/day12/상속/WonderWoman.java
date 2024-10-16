package org.example.day12.상속;

public class WonderWoman extends Woman {
    int high; //높이 점프

    public WonderWoman(String name, char gender, int walk, int high) {
        super(name, gender, walk);
        this.high = high;
    }

    @Override
    public String toString() {
        return "WonderWoman{" +
                "high=" + high +
                ", walk=" + walk +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
