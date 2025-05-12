package com.Suresh4.SnakeAndLadderBySuresh.models;

public class Player {
    private String name;
    private int currentPosition;

    //constructor
    public Player(String name) {
        this.name = name;
        this.currentPosition = 0; // Assuming starting position is 0
    }
    //getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentPosition() {
        return currentPosition;
    }
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
    // Method to move the player



}
