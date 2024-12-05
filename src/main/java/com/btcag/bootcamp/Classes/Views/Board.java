package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Enums.Walls;
import com.btcag.bootcamp.Classes.Models.*;

public class Board {
    public void drawBoard(Robot robot1, Robot robot2, Player player1, Player player2, Items[] items) {
        char itemIcon = 63;
        String wallIcon = Walls.WALL1.icon;

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

                } else if (MapItemField.itemOnField(items, x, y)) {
                    System.out.print(STR." [ \{itemIcon} ] ");

                } else if (MapWallField.wallField(x, y)) {
                    System.out.print(STR." [\{wallIcon}] ");

                } else {
                    System.out.print(" [   ] ");
                }
                x++;
            }
            System.out.println();
            y++;
        }

        System.out.println(STR."\{player1.getName()}'s robot (\{player1.getAvatar()}) is on field x \{robot1.getX()} y \{robot1.getY()}.");
        System.out.println(STR."He is facing \{robot1.getFacingDirection()}");

        System.out.println(STR."\{player2.getName()}'s robot (\{player2.getAvatar()}) is on field x \{robot2.getX()} y \{robot2.getY()}.");
        System.out.println(STR."He is facing \{robot2.getFacingDirection()}");
    }
}
