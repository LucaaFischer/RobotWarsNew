package com.btcag.bootcamp;

import java.util.ArrayList;

public class SkillPoints {


    //-------------------------------------------------------------Skillpoints in Stats stecken----------------------------------------------------------------------------
    public static void useSkillPoints(Robot[] robots, ArrayList<String> players) {
        for (int i = 0; i < robots.length; i++) {

            if (!Fight.inRange(robots[i], robots)) {
                while (robots[i].getSkillPoints() > 0) {
                    System.out.println("Du hast noch " + robots[i].skillPoints + " Skillpoint(s), " + players.get(i));
                    robots[i].setStats();
                    robots[i].setSkillPoints(robots[i].getSkillPoints() - 1);
                }
            }
        }
        printStats(robots, players);
    }

    //--------------------------------------------------------Ausgabe der aktuellen Statverteilung-----------------------------------------------------------------------
    public static void printStats(Robot[] robots, ArrayList<String> players) {
        System.out.println("Eure Stats: ");
        for (int i = 0; i < robots.length; i++) {
            String player = players.get(i);
            Robot robot = robots[i];

            System.out.println(player + ": ");
            System.out.println("HP: " + robot.hp);
            System.out.println("Shield: " + robot.shield);
            System.out.println("DMG: " + robot.damage);
            System.out.println("Range: " + robot.range);
            System.out.println("AOE: " + robot.aoe);
            System.out.println("Accuracy: " + robot.accuracy);
            System.out.println("Movement: " + robot.movement);
            System.out.println("Energy: " + robot.energy);
        }
    }
}
