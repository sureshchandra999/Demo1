package com.Suresh4.SnakeAndLadderBySuresh.models;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int dimension;
    private int cellCount;
    private Map<Integer, BoardEntity> boardEntitiesMap; // this map will contain snakes and ladders

    // Constructor
    public Board(int dimension) {
        this.dimension = dimension;
        this.cellCount = dimension * dimension;

        // Initialize n snakes and n ladders
        boardEntitiesMap = new HashMap<>();
        //Add n snake   start index is > end index.




    }


    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Map<Integer, BoardEntity> getBoardEntitiesMap() {
        return boardEntitiesMap;
    }

    public void setBoardEntitiesMap(Map<Integer, BoardEntity> boardEntitiesMap) {
        this.boardEntitiesMap = boardEntitiesMap;
    }
}
/*
roll a dice
 min=1, max=6
 random number between 1 and 6

 (0,1) * (6 - 1 + 1) + 1 =>=> floor(x * 6 + 1) where x lies in (0,1)

 x=0.1, => 1.6 -> floor(1.6) => 1
x=0.7, => 5.2 -> floor(5.2) => 5
x=0.9, => 6.4 -> floor(6.4) => 6
x=0.6, => 4.6 -> floor(4.6) => 4




 */