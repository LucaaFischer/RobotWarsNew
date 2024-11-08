package com.btcag.bootcamp.Classes;

public class Validations {

    //----------------------------------------------------------------Überprüfung auf Möglichkeit des Zuges------------------------------------------------------------------------------
    public static boolean moveValid(Robot robotTurn, Robot robotNotTurn) {
        if (robotTurn.x > 15 || robotTurn.y > 15 || robotTurn.x < 1 || robotTurn.y < 1) {
            System.out.println("Zug außerhalb des Spielfelds! Mach nochmal.");
            return false;
        } else if (robotTurn.x > Game.tempRobotTurnX + 1 || robotTurn.y > Game.tempRobotTurnY + 1 || robotTurn.x < Game.tempRobotTurnX - 1 || robotTurn.y < Game.tempRobotTurnY - 1) {
            System.out.println("Zug nicht möglich! Mach nochmal.");
            return false;
        } else if (robotTurn.x == robotNotTurn.x && robotTurn.y == robotNotTurn.y) {
            System.out.println("Du darfst nicht auf dem gleichen Feld wie dein Gegner stehen! Mach nochmal.");
            return false;
        } else {
            return true;
        }
    }

    //----------------------------------------------------------------Prüfen, ob Robot in Kampfreichweite ist---------------------------------------------------------------------
    public static boolean inRange(Robot robot1, Robot robot2) {
        return ((robot1.x + robot1.range >= robot2.x && robot2.x > robot1.x && robot1.y + robot1.range >= robot2.y && robot2.y > robot1.y
                || robot1.x - robot1.range <= robot2.x && robot2.x < robot1.x && robot1.y - robot1.range <= robot2.y && robot2.y < robot1.y
                || robot1.x + robot1.range >= robot2.x && robot2.x > robot1.x && robot1.y - robot1.range <= robot2.y && robot2.y < robot1.y
                || robot1.x - robot1.range <= robot2.x && robot2.x < robot1.x && robot1.y + robot1.range >= robot2.y && robot2.y > robot1.y)
                && moveValid(robot1, robot2));
    }
}
