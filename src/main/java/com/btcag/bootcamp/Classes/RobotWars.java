package com.btcag.bootcamp.Classes;

//---------------------------------------------------Deklaration von in unterschiedlichen Methoden gebrauchten Variablen---------------------------------------------------------------
public class RobotWars {
    //---------------------------------------------------------------------Benötigte Objekte-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Robot robot1 = new Robot(1, 1);
        Robot robot2 = new Robot(15, 15);

        //-----------------------------------------------------------------Namen & Avatar der Spieler-------------------------------------------------------------------------------------
        System.out.println("Spieler 1: ");
        player1.getName();
        player1.getAvatar();
        System.out.println();
        System.out.println("Spieler 2: ");
        player2.getName();
        player2.getAvatar();

        System.out.println(Intro.intro());
        System.out.println(STR."WILLKOMMEN ZU ROBOT-WARS \{player1.playerName.toUpperCase()} UND \{player2.playerName.toUpperCase()} !!!\n");
        System.out.println(STR."Dein Avatar \{player1.playerName}: \{player1.playerAvatar}");
        System.out.println(STR."Dein Avatar \{player2.playerName}: \{player2.playerAvatar}\n");

        //----------------------------------------------------------------Verteilung der Start-Stats---------------------------------------------------------------------------------------
        System.out.println("Anfang der Runde. Verteilt eure Start-Skillpoints!\n");
        SkillPoints.useSkillPoints(player1, player2, robot1, robot2);

        //---------------------------------------------------------------------Spielablauf----------------------------------------------------------------------------------------------
        while (!Fight.checkWin(robot1, robot2)) {
            if (Game.countTurns % 2 == 0) {
                Game.turn(robot1, robot2, player1, player2);

            } else {
                Game.turn(robot2, robot1, player2, player1);

                if (!Fight.checkWin(robot2, robot1)) {
                    System.out.println("Ende der Runde. Nutzt eure Skillpoints!");
                    SkillPoints.useSkillPoints(player1, player2, robot1, robot2);
                }
            }
            Game.countTurns++;
        }

        //-----------------------------------------------------------------Ausgabe des Gewinners---------------------------------------------------------------------------------------
        System.out.println(STR."The winner is \{Fight.checkWinner(robot1, robot2, player1, player2)}");
    }
}

