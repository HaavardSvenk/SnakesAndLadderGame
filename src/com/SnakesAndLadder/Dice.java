package com.SnakesAndLadder;

import java.util.Random;

/**
 * @author Håvard Svenkerud, Tord Grytting, Arne Giacomo Munthe-Kaas
 * @version 1.0
 */

public class Dice {

    /**
     * @return void
     */
    // Generate a random number between 1 and 6
    public static int rollDice() {
        int n;
        Random r = new Random();
        n = r.nextInt(7); // Returns number between 0-6
        return (n==0?1:n);
        /*
        Question mark (?) - The value to use if the condition is true
        A colon (:) - The value to use if the condition is false
        Basic form: boolean statement ? true result : false result
         */
    }
}
