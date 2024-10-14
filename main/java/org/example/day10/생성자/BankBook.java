package org.example.day10.생성자;

public class BankBook {
    static int count;
    static int sum;
    String name;
    String ssn;
    int money;

    public BankBook(String name, String ssn, int money) {
        this.name = name;
        this.ssn = ssn;
        this.money = money;
        count++;
        sum += money;
    }

    public int getAvg() {
        return sum / count;
    }

    @Override
    public String toString() {
        return "BankBook{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", money=" + money +
                '}';
    }
}
