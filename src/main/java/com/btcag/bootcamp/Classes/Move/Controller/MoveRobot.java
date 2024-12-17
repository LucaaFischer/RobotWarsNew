package com.btcag.bootcamp.Classes.Move.Controller;

import com.btcag.bootcamp.Classes.Enums.Directions;
import com.btcag.bootcamp.Classes.Move.Move;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

public class MoveRobot {
    public static void moveRobot(String userInput, Robot robotTurn, Robot robotNotTurn, Move move) {
        int tempX = robotTurn.getX();
        int tempY = robotTurn.getY();
        Directions tempFacingDirection = robotTurn.getFacingDirection();

        for (Directions direction : Directions.values()) {
            if (userInput.equals(direction.key)) {
                tempX += direction.x;
                tempY += direction.y;
                tempFacingDirection = direction;
            }

        }

        if (MoveValidator.moveValid(tempX, tempY, robotNotTurn)) {
            robotTurn.setX(tempX);
            robotTurn.setY(tempY);
            robotTurn.setFacingDirection(tempFacingDirection);
            move.setMoveType("move");
            move.setDirection(robotTurn.getFacingDirection());

        } else {
            robotTurn.setMove(robotTurn, robotNotTurn);
        }
    }

    public static void alignRobot(String userInput, Robot robotTurn, Move move) {
        for (Directions direction : Directions.values()) {
            if (userInput.equals(direction.key)) {
                robotTurn.setFacingDirection(direction);
                move.setMoveType("alignment");
                move.setDirection(robotTurn.getFacingDirection());
            }
        }


    }
}
