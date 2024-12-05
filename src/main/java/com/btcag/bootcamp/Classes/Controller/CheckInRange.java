package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Robot;

public class CheckInRange {
    public static boolean attackPossible(Robot robotTurn, Robot robotNotTurn) {
        int tempX = robotTurn.getX();
        int tempY = robotTurn.getY();

        for (int i = 1; i <= robotTurn.getRange(); i++) {
            tempX += robotTurn.getFacingDirection().x;
            tempY += robotTurn.getFacingDirection().y;
            if (tempX == robotNotTurn.getX() && tempY == robotNotTurn.getY()) {
                return true;
            }
        }
        return false;
    }
}
