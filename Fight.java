package com.btcag.bootcamp;

import java.util.ArrayList;

public class Fight {
    //-----------------------------------------------------------------Prüfen ob es zum Kampf kommt----------------------------------------------------------------------------------
    public static boolean inRange(Robot robotTurn, Robot[] otherRobots) {
        for (Robot otherRobot : otherRobots) {
            return ((robotTurn.x + robotTurn.range >= otherRobot.x && otherRobot.x > robotTurn.x && robotTurn.y + robotTurn.range >= otherRobot.y && otherRobot.y > robotTurn.y
                    || robotTurn.x - robotTurn.range <= otherRobot.x && otherRobot.x < robotTurn.x && robotTurn.y - robotTurn.range <= otherRobot.y && otherRobot.y < robotTurn.y
                    || robotTurn.x + robotTurn.range >= otherRobot.x && otherRobot.x > robotTurn.x && robotTurn.y - robotTurn.range <= otherRobot.y && otherRobot.y < robotTurn.y
                    || robotTurn.x - robotTurn.range <= otherRobot.x && otherRobot.x < robotTurn.x && robotTurn.y + robotTurn.range >= otherRobot.y && otherRobot.y > robotTurn.y)
                    && Game.moveValid(robotTurn, otherRobots));
        }
        return false;
    }

    //------------------------------------------------------------------------Kampfablauf--------------------------------------------------------------------------------------------
    public static void fight(Robot robotTurn, Robot[] otherRobots, ArrayList<String> players) {
        System.out.println("DU GREIFST DEINEN GEGNER AN!");

        for (Robot otherRobot : otherRobots) {
            int tempRoboDmg = robotTurn.damage;
            tempRoboDmg -= otherRobot.shield;

            if (otherRobot.shield > robotTurn.damage) {
                otherRobot.shield -= robotTurn.damage;
            } else {
                otherRobot.shield = 0;
            }

            if (tempRoboDmg > 0) {
                otherRobot.hp -= tempRoboDmg;
            }

            if (checkWin(otherRobots)) {
                checkWinner(otherRobots);
            } else {
                System.out.println("But no one won");
                SkillPoints.printStats(otherRobots, players);
            }
        }
    }

    //------------------------------------------------------------Überprüfen OB es einen Gewinner gibt--------------------------------------------------------------------
    public static boolean checkWin(Robot[] robots) {
        for (Robot robot : robots) {
            return robot.hp <= 0;
        }
        return false;
    }

    //----------------------------------------------------------------Prüfen WER gewonnen hat-------------------------------------------------------------------------------
    public static String checkWinner(Robot[] robots) {
        String winner = "";
        for (Robot robot : robots) {
            if (robot.hp <= 0) {
                winner = robot.avatar + "died.";
            } else {
                winner = robot.avatar + "won";
            }
        }
        return winner;
    }
}
