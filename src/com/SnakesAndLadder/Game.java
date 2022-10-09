package com.SnakesAndLadder;

import java.util.Scanner;

/**
 * @author Håvard Svenkerud, Tord Grytting, Arne Giacomo Munthe-Kaas
 * @version 1.0
 */

public class Game {

    final static int WIN = 100;

    /**
     * @param player
     * @param diceValue
     * @return
     */
    public int calculatePlayerValue(int player, int diceValue) {
        player = player + diceValue;

        if(player > WIN) {
            player = player - diceValue;
            return player;
        }
        if(SnakeAndLadder.snake.containsKey(player)) {
            System.out.println("Swallowed by snake");
            player = SnakeAndLadder.snake.get(player);
        }
        if(SnakeAndLadder.ladder.containsKey(player)) {
            System.out.println("Climb up the ladder");
            player = SnakeAndLadder.ladder.get(player);
        }
        return player;
    }

    /**
     * @param player
     * @return
     */
    public boolean isWin(int player) {
        return WIN == player;
    }

    /**
     * @return
     */
    public void startGame() {
        int player1 = 0;
        int player2 = 0;
        int currentPlayer = -1;

        Scanner scan = new Scanner(System.in);
        String str;
        int diceValue;

        do {
            System.out.println(currentPlayer==-1?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
            System.out.println("Press r to roll dice");
            str = scan.next();
            diceValue = Dice.rollDice();

            if(currentPlayer == -1) {
                player1 = calculatePlayerValue(player1, diceValue);
                System.out.println("First player :: " + player1);
                System.out.println("Second player :: " + player2);
                System.out.println("------------------");
                if(isWin(player1)) {
                    System.out.println("First player wins");
                    return;
                }
            } else {
                player2 = calculatePlayerValue(player2, diceValue);
                System.out.println("First Player :: " + player1);
                System.out.println("Second player :: " + player2);
                System.out.println("------------------");
                if(isWin(player2)) {
                    System.out.println("Second player wins");
                    return;
                }
            }

            currentPlayer = -currentPlayer;

        } while ("r".equals(str));
    }
}