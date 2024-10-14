package org.example.day10.생성자;

public class TV {
    int channel;
    int volume;
    boolean isOn;

    public TV(int channel, int volume, boolean isOn) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "TV[" +
                "channel='" + channel + '\'' +
                ", volume=" + volume +
                ", isOn=" + isOn +
                ']';
    }
}
