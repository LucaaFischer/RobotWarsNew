package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.*;

public class Board {
    public static void drawBoard(Robot robot1, Robot robot2, Player player1, Player player2, Items[] items) {
        char itemIcon = 63;
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

                } else if (itemOnField(items, x, y)) {
                    System.out.print(STR." [ \{itemIcon} ] ");

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
        for (
                Items item : items) {
            System.out.println(itemIcon);
        }
    }

    public static boolean itemOnField(Items[] items, int x, int y) {
        return (x == items[0].getItemX() && y == items[0].getItemY()
                || x == items[1].getItemX() && y == items[1].getItemY()
                || x == items[2].getItemX() && y == items[2].getItemY()
                || x == items[3].getItemX() && y == items[3].getItemY());
    }
}
