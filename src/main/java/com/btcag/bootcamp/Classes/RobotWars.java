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

        System.out.println("WILLKOMMEN ZU ROBOT-WARS " + player1.playerName.toUpperCase() + " UND " + player2.playerName.toUpperCase() + " !!!");
        System.out.println("Dein Avatar " + player1.playerName + ": " + player1.playerAvatar);
        System.out.println("Dein Avatar " + player2.playerName + ": " + player2.playerAvatar);

        //----------------------------------------------------------------Verteilung der Start-Stats---------------------------------------------------------------------------------------
        System.out.println("Anfang der Runde. Verteilt eure Start-Skillpoints!");
        Game.useSkillPoints(player1, player2, robot1, robot2);

        //---------------------------------------------------------------------Spielablauf----------------------------------------------------------------------------------------------
        while (!Game.checkWin(robot1, robot2)) {
            Game.turn(robot1, robot2, player1, player2);
        }

        //-----------------------------------------------------------------Ausgabe des Gewinners---------------------------------------------------------------------------------------
        System.out.println("The winner is " + Game.checkWinner(robot1, robot2, player1, player2));
    }
}


