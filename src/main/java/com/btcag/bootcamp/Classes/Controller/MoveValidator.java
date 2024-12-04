package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Robot;
import com.btcag.bootcamp.Classes.Views.MapWallField;

public class MoveValidator {
    public static boolean moveValid(Robot robotTurn, Robot robotNotTurn) {
        if (robotTurn.getX() > 15 || robotTurn.getY() > 15 || robotTurn.getX() < 1 || robotTurn.getY() < 1) {
            System.out.println("Destination out of field, do again!");
            return false;

        } else if(MapWallField.wallField(robotTurn.getX(), robotTurn.getY())) {
            System.out.println("This field is blocked, do again!");
            return false;

        } else if (robotTurn.getX() > GameController.tempRobotTurnX + 1 || robotTurn.getY() > GameController.tempRobotTurnY + 1 || robotTurn.getX() < GameController.tempRobotTurnX - 1 || robotTurn.getY() < GameController.tempRobotTurnY - 1) {
            System.out.println("Invalid move, do again!");
            return false;

        } else if (robotTurn.getX() == robotNotTurn.getX() && robotTurn.getY() == robotNotTurn.getY()) {
            System.out.println("You can't stand on the same field as your enemy, do again!");
            return false;

        } else {
            return true;
        }
    }
}
