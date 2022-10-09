package com.SnakesAndLadder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Håvard Svenkerud, Tord Grytting, Arne Giacomo Munthe-Kaas
 * @version 1.0
 */

public class SnakeAndLadder {

    public static Map<Integer, Integer> snake = new HashMap<>();
    public static Map<Integer, Integer> ladder = new HashMap<>();

    static {
        snake.put(98,79);
        snake.put(94,75);
        snake.put(93,73);
        snake.put(87,36);
        snake.put(62,19);
        snake.put(64,60);
        snake.put(54,34);
        snake.put(17,7);

        ladder.put(80,99);
        ladder.put(72,91);
        ladder.put(28,84);
        ladder.put(51,67);
        ladder.put(21,42);
        ladder.put(1,38);
        ladder.put(9,31);
        ladder.put(4,14);
    }
}
