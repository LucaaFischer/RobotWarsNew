package com.btcag.bootcamp.Classes.Enums;

public enum Directions {
    NORTH(0, -1, "W"),
    NORTH_EAST(1, -1, "E"),
    EAST(1, 0, "D"),
    SOUTH_EAST(1, 1,"X"),
    SOUTH(0, 1, "S"),
    SOUTH_WEST(-1, 1,"Y"),
    WEST(-1, 0, "A"),
    NORTH_WEST(-1, -1, "Q"),
    ;

    public final int x;
    public final int y;
    public final String key;

    Directions(int x, int y, String key) {
        this.x = x;
        this.y = y;
        this.key = key;
    }
}
