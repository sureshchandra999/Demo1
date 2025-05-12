package com.Suresh4.SnakeAndLadderBySuresh.models;

public class Snake extends BoardEntity{
    // Constructor
    public Snake(int start, int end) {
       super(start, end);
       this.setBoardEntityType(BoardEntityType.SNAKE);
    }

    @Override
    public void printBoardEntity() {
        System.out.println("Ohh you encountered Snake..." );
        System.out.println("Snake from " + getStart() + " to " + getEnd());


    }

    // Additional methods can be added here if needed

}
