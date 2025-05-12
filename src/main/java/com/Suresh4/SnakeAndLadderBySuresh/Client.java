package com.Suresh4.SnakeAndLadderBySuresh;

import com.Suresh4.SnakeAndLadderBySuresh.models.Game;
import com.Suresh4.SnakeAndLadderBySuresh.models.Player;

import java.util.LinkedList;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        int numberOfDice = 1;
        int dimension = 10;

        Player player1 = new Player("Suresh");
        Player player2 = new Player("Ravi");

        Queue<Player> players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        Game game = new Game(numberOfDice, dimension, players);

        //start playing the game
        game.start();

        //



    }
}
