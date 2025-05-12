package com.Suresh4.SnakeAndLadderBySuresh.models;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Board board;
    private Queue<Player> players;
    private Queue<Player> winners;
    private int numberOfDies;
    private int dimension;

    // Constructor
    public Game(int numberOfDies, int dimension, Queue<Player> players) {
        this.numberOfDies = numberOfDies;
        this.dimension = dimension;
        this.players = players;
        this.winners = new LinkedList<>();
        this.board = new Board(dimension);
    }
    // Method to start the game
    public void start(){
        //print the board
        board.printBoard();
        //play the game
        while (players.size() > 1){
            Player currentPlayer = players.poll();

        }



    }

    public void makeMove(Player currentPlayer){
        int diceNumber= DiceUtility.roll(numberOfDices);

    }


}
