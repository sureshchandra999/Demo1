package com.Suresh4.SnakeAndLadderBySuresh.models;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int dimension;
    private int cellCount;
    private Map<Integer, BoardEntity> boardEntityMap; // this map will contain snakes and ladders

    // Constructor
    public Board(int dimension) {
        this.dimension = dimension;
        this.cellCount = dimension * dimension;

        // Initialize n snakes and n ladders
        boardEntityMap = new HashMap<>();
        //Add n snake   ->start index is > end index.
        for (int i=0; i< dimension; i++) {
            int min= 2;
            int max= cellCount-1;

            int start = (int) Math.floor(Math.random() * (max - min +1) + min); //54
            max = start - 1; // end index can lie between 2 and 53.
            int end = (int) Math.floor(Math.random() * (max - min +1) + min); // 2
            //System.out.println("start: "+ start + " end: "+ end);
            //start > end
            if(!hasSnakeOrLadderPresent(start)) {
                boardEntityMap.put(start, new Snake(start, end));
            }




            //Add n ladder   ->start index is < end index.


        }






    }
    public boolean hasSnakeOrLadderPresent(int index) {
        return boardEntityMap.containsKey(index);
    }

    public void printBoard(){
        // print the board


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