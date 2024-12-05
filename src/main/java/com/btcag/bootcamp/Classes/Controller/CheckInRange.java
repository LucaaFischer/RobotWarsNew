package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Robot;

public class CheckInRange {
    public static boolean inRange(Robot robotTurn, Robot robotNotTurn) {
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

    public static boolean attackable(Robot robot1, Robot robot2) {
        return ((robot1.getX() + robot1.getRange() >= robot2.getX() && robot2.getX() > robot1.getX() && robot1.getY() + robot1.getRange() >= robot2.getY() && robot2.getY() > robot1.getY()
                || robot1.getX() - robot1.getRange() <= robot2.getX() && robot2.getX() < robot1.getX() && robot1.getY() - robot1.getRange() <= robot2.getY() && robot2.getY() < robot1.getY()
                || robot1.getX() + robot1.getRange() >= robot2.getX() && robot2.getX() > robot1.getX() && robot1.getY() - robot1.getRange() <= robot2.getY() && robot2.getY() < robot1.getY()
                || robot1.getX() - robot1.getRange() <= robot2.getX() && robot2.getX() < robot1.getX() && robot1.getY() + robot1.getRange() >= robot2.getY() && robot2.getY() > robot1.getY())
        );
    }
}
