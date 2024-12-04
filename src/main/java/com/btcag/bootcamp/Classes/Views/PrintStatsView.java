package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.*;

public class PrintStatsView {
    public static void printStats(Robot robot1, Robot robot2, Player player1, Player player2) {
        System.out.println("Your stats: ");
        System.out.println(STR."        \{player1.getName()} (\{player1.getAvatar()})               \{player2.getName()} (\{player2.getAvatar()})");

        System.out.println(STR."HP:        \{robot1.getHp()}                     \{robot2.getHp()}");
        System.out.println(STR."DMG:       \{robot1.getDamage()}                     \{robot2.getDamage()}");
        System.out.println(STR."Shield:    \{robot1.getShield()}                     \{robot2.getShield()}");
        System.out.println(STR."Range:     \{robot1.getRange()}                     \{robot2.getRange()}");
        System.out.println(STR."Movement:  \{robot1.getMovement()}                     \{robot2.getMovement()}");

    }
}
