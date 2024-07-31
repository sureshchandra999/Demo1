package com.suresh.suresh1.suresh2.suresh3.DesignPatterns.Structural_Design_Patterns.AdapterDesignPattern;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    /**
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name is:"+ fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid Media. "+ audioType + " format not supported");
        }

    }
}
