package com.github.siemen.command.device;

public class Stereo {

    private String name;
    public Stereo(String name) {
        this.name = name;
    }
    public void setCD() {
        System.out.println("stereo set cd in....");
    }

    public void setVolume(int vol) {
        System.out.println("stereo set volume to :" + vol);
    }

    public void on() {
        System.out.println("stereo was on......");
    }

    public void off() {
        System.out.println("stereo was off.....");
    }
}