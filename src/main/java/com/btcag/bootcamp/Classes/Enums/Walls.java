package com.btcag.bootcamp.Classes.Enums;

public enum Walls {
    WALL1(3,4,"///"),
    WALL2(8, 9,"///"),
    WALL3(7, 5,"///"),
    WALL4(9,5,"///"),
    WALL5(3, 8,"///"),
    WALL6(4, 9,"///"),
    WALL7(2, 6,"///"),
    WALL8(8, 3,"///"),
    WALL9(5, 1,"///"),
    WALL10(12, 12,"///"),
    WALL11(14, 7,"///"),
    WALL12(15, 2,"///"),
    WALL13(6, 15,"///"),
    WALL14(4, 13,"///"),
    WALL15(11, 14,"///"),
    WALL16(1, 11,"///"),
    ;

    public final int x;
    public final int y;
    public final String icon;

    Walls(int x, int y, String icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }
}
