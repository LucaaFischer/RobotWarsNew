package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Robot;

public class MoveValidator {
    public static boolean moveValid(Robot robotTurn, Robot robotNotTurn) {
        if (robotTurn.getX() > 15 || robotTurn.getY() > 15 || robotTurn.getX() < 1 || robotTurn.getY() < 1) {
            System.out.println("Zug außerhalb des Spielfelds! Mach nochmal.");
            return false;

        } else if (robotTurn.getX() > GameController.tempRobotTurnX + 1 || robotTurn.getY() > GameController.tempRobotTurnY + 1 || robotTurn.getX() < GameController.tempRobotTurnX - 1 || robotTurn.getY() < GameController.tempRobotTurnY - 1) {
            System.out.println("Zug nicht möglich! Mach nochmal.");
            return false;

        } else if (robotTurn.getX() == robotNotTurn.getX() && robotTurn.getY() == robotNotTurn.getY()) {
            System.out.println("Du darfst nicht auf dem gleichen Feld wie dein Gegner stehen! Mach nochmal.");
            return false;

        } else {
            return true;
        }
    }
}
