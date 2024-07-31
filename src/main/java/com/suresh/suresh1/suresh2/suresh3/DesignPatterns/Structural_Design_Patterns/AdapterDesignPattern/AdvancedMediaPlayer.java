package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Structural_Design_Patterns.AdapterDesignPattern;

public class AdvancedMediaPlayer {

    void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}
