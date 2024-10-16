package org.example.day12.question;

public class Battery {
    protected int batteryCapacity; // 배터리 용량
    private String color; // 색상

    public Battery(int batteryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
