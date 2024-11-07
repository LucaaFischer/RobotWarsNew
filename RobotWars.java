package com.btcag.bootcamp;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RobotWars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(Intro.intro());

        System.out.println("Wie viele Spieler seid ihr?");
        int playerCount = input.nextInt();
        input.nextLine(); // Muss Scanner leeren nach Int Eingabe, damit erster Schleifendurchlauf nicht übersprungen wird lmao

        ArrayList<String> playerList = new ArrayList<String>();

        Robot[] robots = new Robot[playerCount];

        for (int i = 1; i <= playerCount; i++) {
            System.out.println("Spieler " + i + ": Gib deinen Nutzernamen ein");
            String playerName = input.nextLine();
            Player players = () -> playerList.add(playerName);
            players.getPlayer();

            System.out.println("Wähle außerdem einen Avatar für deinen Roboter");
            String avatar = input.nextLine();
            robots[i - 1] = new Robot(Coordinates.randX(), Coordinates.randY(), avatar);
        }

        System.out.print("WILLKOMMEN ZU ROBOT WARS ");
        for (int i = 0; i < robots.length; i++) {
            String player = playerList.get(i);
            Robot robot = robots[i];

            System.out.print(player.toUpperCase() + "(" + robot.avatar + "), ");
        }


        System.out.println("!!!");


        System.out.println("Anfang der Runde. Verteilt eure Start-Skillpoints!\n");
        SkillPoints.useSkillPoints(robots, playerList);

        Board.drawBoard(robots);

        while (!Fight.checkWin(robots)) {
            for (int i = 0; i < robots.length ; i++) {
                String player = playerList.get(i);
                Robot robot = robots[i];

                Game.turn(robot, player, robots, playerList);

            }

            System.out.println("Ende der Runde. Nutzt eure Skillpoints!");
            SkillPoints.useSkillPoints(robots, playerList);
            Game.countTurns++;
        }

        //-----------------------------------------------------------------Ausgabe des Gewinners---------------------------------------------------------------------------------------
        System.out.println("The winner is " + Fight.checkWinner(robots));
    }
}