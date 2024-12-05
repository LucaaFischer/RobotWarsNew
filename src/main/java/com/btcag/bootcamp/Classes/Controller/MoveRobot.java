package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Enums.Directions;
import com.btcag.bootcamp.Classes.Models.Robot;

public class MoveRobot {
    public static void moveRobot(String userInput, Robot robotTurn, Robot robotNotTurn) {
        int tempX = robotTurn.getX();
        int tempY = robotTurn.getY();

        for (Directions direction : Directions.values()) {
            if (userInput.equals(direction.key)) {
                tempX += direction.x;
                tempY += direction.y;
            }
        }

        if (MoveValidator.moveValid(tempX, tempY, robotNotTurn)) {
            robotTurn.setX(tempX);
            robotTurn.setY(tempY);
        } else {
            robotTurn.setMove(robotTurn, robotNotTurn);
        }
    }

    public static void alignRobot(String userInput, Robot robotTurn) {
        for (Directions direction : Directions.values()) {
            if (userInput.equals(direction.key)) {
                robotTurn.setFacingDirectionX(robotTurn.getX() + direction.x);
                robotTurn.setFacingDirectionY(robotTurn.getY() + direction.y);
            }
        }


    }
}
