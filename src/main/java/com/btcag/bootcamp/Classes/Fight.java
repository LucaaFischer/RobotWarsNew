package com.btcag.bootcamp.Classes;

public class Fight {
    //-----------------------------------------------------------------Prüfen ob es zum Kampf kommt----------------------------------------------------------------------------------
    public static boolean inRange(Robot robot1, Robot robot2) {
        return (robot1.x + robot1.range >= robot2.x && robot2.x > robot1.x && robot1.y + robot1.range >= robot2.y && robot2.y > robot1.y
                || robot1.x - robot1.range <= robot2.x && robot2.x < robot1.x && robot1.y - robot1.range <= robot2.y && robot2.y < robot1.y
                || robot1.x + robot1.range >= robot2.x && robot2.x > robot1.x && robot1.y - robot1.range <= robot2.y && robot2.y < robot1.y
                || robot1.x - robot1.range <= robot2.x && robot2.x < robot1.x && robot1.y + robot1.range >= robot2.y && robot2.y > robot1.y);
    }

    //------------------------------------------------------------------------Kampfablauf--------------------------------------------------------------------------------------------
    public static void fight(Robot robot1, Robot robot2, Player player1, Player player2) {
        System.out.println("ES KOMMT ZU EINEM SPANNENDEN KAMPF DER ROBOTS");
        int tempRoboOneDmg = robot1.damage;
        int tempRoboTwoDmg = robot2.damage;

        tempRoboTwoDmg -= robot1.shield;
        tempRoboOneDmg -= robot2.shield;


        if (robot2.shield > robot1.damage) {
            robot2.shield -= robot1.damage;
        } else {
            robot2.shield = 0;
        }
        if (robot1.shield > robot2.damage) {
            robot1.shield -= robot2.damage;
        } else {
            robot1.shield = 0;
        }

        if (tempRoboOneDmg > 0) {
            robot2.hp -= tempRoboOneDmg;
        }
        if (tempRoboTwoDmg > 0) {
            robot1.hp -= tempRoboTwoDmg;
        }

        if (checkWin(robot1, robot2)) {
            checkWinner(robot1, robot2, player1, player2);
        } else {
            System.out.println("But no one won");
            SkillPoints.printStats(robot1, robot2, player1, player2);
            robot1.x = robot1.x - 1;
            robot1.y = robot1.y - 1;
            robot2.x = robot2.x + 1;
            robot2.y = robot2.y + 1;
        }
    }

    //-------------------------------------------------------------------Überprüfen OB es einen Gewinner gibt--------------------------------------------------------------------
    public static boolean checkWin(Robot robot1, Robot robot2) {
        return robot1.hp <= 0 || robot2.hp <= 0;
    }

    //----------------------------------------------------------------------Prüfen WER gewonnen hat-------------------------------------------------------------------------------
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
