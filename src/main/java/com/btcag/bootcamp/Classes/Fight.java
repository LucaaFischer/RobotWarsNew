package com.btcag.bootcamp.Classes;

public class Fight {

    //------------------------------------------------------------------------Kampfablauf--------------------------------------------------------------------------------------------
    public static void fight(Robot robotTurn, Robot robotNotTurn, Player playerTurn, Player playerNotTurn) {
        System.out.println("DU GREIFST DEINEN GEGNER AN!");

        int tempRoboDmg = robotTurn.damage;
        tempRoboDmg -= robotNotTurn.shield;

        if (robotNotTurn.shield > robotTurn.damage) {
            robotNotTurn.shield -= robotTurn.damage;
        } else {
            robotNotTurn.shield = 0;
        }

        if (tempRoboDmg > 0) {
            robotNotTurn.hp -= tempRoboDmg;
        }

        if (checkWin(robotTurn, robotNotTurn)) {
            checkWinner(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        } else {
            System.out.println("But no one won");
            SkillPoints.printStats(robotTurn, robotNotTurn, playerTurn, playerNotTurn);
        }
    }

    //------------------------------------------------------------Überprüfen OB es einen Gewinner gibt--------------------------------------------------------------------
    public static boolean checkWin(Robot robot1, Robot robot2) {
        return robot1.hp <= 0 || robot2.hp <= 0;
    }

    //----------------------------------------------------------------Prüfen WER gewonnen hat-------------------------------------------------------------------------------
    public static String checkWinner(Robot robot1, Robot robot2, Player player1, Player player2) {
        String winner = "";
        if (robot1.hp <= 0 && robot2.hp <= 0) {
            winner = "U both died lmao";
        } else if (robot1.hp <= 0) {
            winner = player2.playerName;
        } else if (robot2.hp <= 0) {
            winner = player1.playerName;
        }
        return winner;
    }
}
