package com.btcag.bootcamp.Classes.Move;

import com.btcag.bootcamp.Classes.Enums.Directions;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

public class Move {
    protected static String moveType;
    protected static Directions direction;
    protected Robot robot;

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }
    public void setDirection(Directions direction) {
        this.direction = direction;
    }

    public static String getMoveType() {
        return moveType;
    }

    public static Directions getDirection() {
        return direction;
    }

}
