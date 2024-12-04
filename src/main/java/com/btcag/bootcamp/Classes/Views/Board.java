package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.*;

public class Board {
    char itemIcon = 63;

    public void drawBoard(Robot robot1, Robot robot2, Player player1, Player player2, Items[] items) {
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

                } else if (!itemOnField(items, x, y, robot1, robot2)) {
                    System.out.print(" [   ] ");
                }

                x++;
            }
            System.out.println();
            System.out.println();
            y++;
        }

        System.out.println(STR."\{player2.getName()}'s robot (\{player2.getAvatar()}) is on field x \{robot2.getX()} y \{robot2.getY()}.");
        System.out.println(STR."\{player1.getName()}'s robot (\{player1.getAvatar()}) is on field x \{robot1.getX()} y \{robot1.getY()}.");
        for (Items item : items) {
            System.out.println(itemIcon);
        }
    }

    public boolean itemOnField(Items[] items, int x, int y, Robot robot1, Robot robot2) {
        boolean itemFound = false;

        for (Items item : items) {
            if (x == item.getItemX() && y == item.getItemY()) {
                System.out.print(STR." [ \{itemIcon} ] ");
                itemFound = true;
            }
        }
        return itemFound;
    }
}
