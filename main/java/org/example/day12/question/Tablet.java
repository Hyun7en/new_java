package org.example.day12.question;

public class Tablet extends Battery{
    private boolean isConnected; // 연결 상태

    public Tablet(int batteryCapacity, String color, boolean isConnected) {
        super(batteryCapacity, color);
        this.isConnected = isConnected;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "isConnected=" + isConnected +
                ", batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}
