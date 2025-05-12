package com.Suresh4.SnakeAndLadderBySuresh.models;

public abstract class BoardEntity {
    private int start;
    private int end;
    private BoardEntityType boardEntityType;


    // Constructor
    public BoardEntity(int start, int end) {
        this.start = start;
        this.end = end;

    }

    public abstract void printBoardEntity();


    //getter and setter methods
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    public BoardEntityType getBoardEntityType() {
        return boardEntityType;
    }

    public void setBoardEntityType(BoardEntityType boardEntityType) {
        this.boardEntityType = boardEntityType;
    }
}
