package com.btcag.bootcamp.Classes;

public class Game {
    //---------------------------------------------------------------------------Startpositionen für die Roboter------------------------------------------------------------------
    public static int countTurns = 0;
    public static int tempRoboOneX = 1;
    public static int tempRoboOneY = 1;
    public static int tempRoboTwoX = 15;
    public static int tempRoboTwoY = 15;

    //----------------------------------------------------------------------------------Spielzüge--------------------------------------------------------------------------------------
    public static void turn(Robot robot1, Robot robot2, Player player1, Player player2) {
        Board board = new Board();


        if (countTurns % 2 == 0) {
            System.out.println(player1.playerName + " ist dran!");
            do {
                robot1.getMove();
            } while (!moveValid(robot1, robot2));

            player1.skillPoints++;
        } else {
            System.out.println(player2.playerName + " ist dran!");
            do {
                robot2.getMove();
            } while (!moveValid(robot1, robot2));

            player2.skillPoints++;
        }
        if (checkFight(robot1, robot2)) {
            fight(robot1, robot2, player1, player2);
        }

        board.drawBoard(robot1, robot2, player1, player2);

        if (countTurns % 2 != 0) {
            System.out.println("Ende der Runde. Nutzt eure Skillpoints!");
            SkillPoints.useSkillPoints(player1, player2, robot1, robot2);
        }
        tempRoboOneX = robot1.x;
        tempRoboOneY = robot1.y;
        tempRoboTwoX = robot2.x;
        tempRoboTwoY = robot2.y;
        countTurns++;
    }

    //----------------------------------------------------------------Überprüfung auf Möglichkeit des Zuges------------------------------------------------------------------------------
    public static boolean moveValid(Robot robot1, Robot robot2) {
        if (robot1.x > 15 || robot1.y > 15 || robot1.x < 1 || robot1.y < 1 || robot2.x > 15 || robot2.y > 15 || robot2.x < 1 || robot2.y < 1) {
            System.out.println("Zug außerhalb des Spielfelds! Mach nochmal.");
            return false;
        } else if (robot1.x > tempRoboOneX + robot1.movement || robot1.y > tempRoboOneY + robot1.movement || robot1.x < tempRoboOneX - robot1.movement || robot1.y < tempRoboOneY - robot1.movement
                || robot2.x > tempRoboTwoX + robot2.movement || robot2.y > tempRoboTwoY + robot2.movement || robot2.x < tempRoboTwoX - robot2.movement || robot2.y < tempRoboTwoY - robot2.movement) {
            System.out.println("Zug nicht möglich! Mach nochmal.");
            return false;
        } else {
            return true;
        }
    }

    //-----------------------------------------------------------------Prüfen ob es zum Kampf kommt----------------------------------------------------------------------------------
    public static boolean checkFight(Robot robot1, Robot robot2) {
        return (robot1.x == robot2.x && robot1.y == robot2.y);
    }

    //------------------------------------------------------------------------Kampfablauf--------------------------------------------------------------------------------------------
    public static void fight(Robot robot1, Robot robot2, Player player1, Player player2) {
        System.out.println("ES KOMMT ZU EINEM SPANNENDEN KAMPF DE LA ROBOTS");
        int tempRoboOneDmg = robot1.damage;
        int tempRoboTwoDmg = robot2.damage;

        tempRoboTwoDmg -= robot1.shield;
        tempRoboOneDmg -= robot2.shield;

        if (robot2.shield > robot1.damage) {
            robot2.shield -= robot1.damage;
        } else if (robot2.shield < robot1.damage) {
            robot2.shield = 0;
        }
        if (robot1.shield > robot2.damage) {
            robot1.shield -= robot2.damage;
        } else if (robot1.shield < robot2.damage) {
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

