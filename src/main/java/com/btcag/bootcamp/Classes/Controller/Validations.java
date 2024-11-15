package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Robot;

public class Validations {

    //----------------------------------------------------------------Überprüfung auf Möglichkeit des Zuges------------------------------------------------------------------------------
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

    //----------------------------------------------------------------Prüfen, ob Robot in Kampfreichweite ist---------------------------------------------------------------------
    public static boolean inRange(Robot robot1, Robot robot2) {
        return ((robot1.getX() + robot1.getRange() >= robot2.getX() && robot2.getX() > robot1.getX() && robot1.getY() + robot1.getRange() >= robot2.getY() && robot2.getY() > robot1.getY()
                || robot1.getX() - robot1.getRange() <= robot2.getX() && robot2.getX() < robot1.getX() && robot1.getY() - robot1.getRange() <= robot2.getY() && robot2.getY() < robot1.getY()
                || robot1.getX() + robot1.getRange() >= robot2.getX() && robot2.getX() > robot1.getX() && robot1.getY() - robot1.getRange() <= robot2.getY() && robot2.getY() < robot1.getY()
                || robot1.getX() - robot1.getRange() <= robot2.getX() && robot2.getX() < robot1.getX() && robot1.getY() + robot1.getRange() >= robot2.getY() && robot2.getY() > robot1.getY())
                && moveValid(robot1, robot2));
    }
}
