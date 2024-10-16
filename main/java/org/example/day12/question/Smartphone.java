package org.example.day12.question;

public class Smartphone extends Battery {
    private int cameraResolution; // 카메라 해상도

    public Smartphone(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "cameraResolution=" + cameraResolution +
                ", batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}
