package com.btcag.bootcamp;

import java.util.Random;

public class Coordinates {
    static Random rand = new Random();
    public static int randX() {
        return rand.nextInt(0, 16);
    }

    public static int randY() {
        return rand.nextInt(0, 16);
    }
}
