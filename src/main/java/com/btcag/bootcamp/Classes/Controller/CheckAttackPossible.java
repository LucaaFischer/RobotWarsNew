package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Enums.Walls;
import com.btcag.bootcamp.Classes.Models.Robot;

public class CheckAttackPossible {
    public static boolean attackPossible(Robot robotTurn, Robot robotNotTurn) {
        int tempX = robotTurn.getX();
        int tempY = robotTurn.getY();

        for (int i = 1; i <= robotTurn.getRange(); i++) {
            tempX += robotTurn.getFacingDirection().x;
            tempY += robotTurn.getFacingDirection().y;
            if (tempX == robotNotTurn.getX() && tempY == robotNotTurn.getY()
                && !wallInWay(robotTurn)) {
                return true;
            }
        }
        return false;
    }

    public static boolean wallInWay(Robot robotTurn) {
        int tempX;
        int tempY;

        for(Walls wall : Walls.values()) {
            tempX = robotTurn.getX();
            tempY = robotTurn.getY();

            for (int i = 1; i <= robotTurn.getRange(); i++) {
                tempX += robotTurn.getFacingDirection().x;
                tempY += robotTurn.getFacingDirection().y;
                if (tempX == wall.x && tempY == wall.y) {
                    return true;
                }
            }
        }
        return false;
    }
}
