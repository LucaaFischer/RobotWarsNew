package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.*;

public class Board {
    public static void drawBoard(Robot robot1, Robot robot2, Player player1, Player player2) {
        Items item1 = ChooseRandItem.randomizer();
        Items item2 = ChooseRandItem.randomizer();
        Items item3 = ChooseRandItem.randomizer();
        Items item4 = ChooseRandItem.randomizer();

        int y = 1;
        System.out.print("      ");
        for (int i = 1; i <= 15; i++) {
            String xOut;
            xOut = String.valueOf(i);
            while (xOut.length() < 7) {
                xOut += " ";
            }
            System.out.print(xOut);
        }
        System.out.println();
        String yOut = "";
        while (y <= 15) {
            yOut = String.valueOf(y);
            while (yOut.length() < 3) {
                yOut += " ";
            }
            System.out.print(yOut);
            int x = 1;
            while (x <= 15) {
                if (x == robot1.getX() && y == robot1.getY()) {
                    System.out.print(STR." [ \{player1.getAvatar()} ] ");
                } else if (x == robot2.getX() && y == robot2.getY()) {
                    System.out.print(STR." [ \{player2.getAvatar()} ] ");
                } else if(x == item1.xCoordinate() && y == item1.yCoordinate()) {
                    System.out.print(STR." [ \{item1.iconOnMap} ] ");
                } else if(x == item2.xCoordinate() && y == item2.yCoordinate()) {
                    System.out.print(STR." [ \{item2.iconOnMap} ] ");
                } else if(x == item3.xCoordinate() && y == item3.yCoordinate()) {
                    System.out.print(STR." [ \{item3.iconOnMap} ] ");
                } else if(x == item4.xCoordinate() && y == item4.yCoordinate()) {
                    System.out.print(STR." [ \{item4.iconOnMap} ] ");
                } else {
                    System.out.print(" [   ] ");
                }
                x++;
            }
            System.out.println();
            System.out.println();
            y++;
        }
        System.out.println(STR."\{player2.getName()}'s Roboter (\{player2.getAvatar()}) befindet sich auf Feld x \{robot2.getX()} y \{robot2.getY()}.");
        System.out.println(STR."\{player1.getName()}'s Roboter (\{player1.getAvatar()}) befindet sich auf Feld x \{robot1.getX()} y \{robot1.getY()}.");
    }
}