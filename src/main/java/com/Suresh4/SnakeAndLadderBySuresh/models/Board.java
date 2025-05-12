package com.Suresh4.SnakeAndLadderBySuresh.models;

import java.util.Map;

public class Board {
    private int dimension;
    private Map<Integer, BoardEntity> boardEntitiesMap;

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
