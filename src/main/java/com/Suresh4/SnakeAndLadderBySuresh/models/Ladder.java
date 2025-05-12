package com.Suresh4.SnakeAndLadderBySuresh.models;

public class Ladder extends BoardEntity{
    // Constructor
    public Ladder(int start, int end) {
        super(start, end);
        this.setBoardEntityType(BoardEntityType.LADDER);

    }
    @Override
    public void printBoardEntity() {
        System.out.println("Yaaa you encountered Ladder..." );
        System.out.println("Ladder from " + getStart() + " to " + getEnd());


    }

    // Additional methods can be added here if needed


}
