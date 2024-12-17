package com.btcag.bootcamp.Classes.Map.View;

import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Map.Model.Map;
import com.btcag.bootcamp.Classes.Move.Move;
import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

public class Board {
    public void drawBoard(Map map, Robot robot1, Robot robot2, Player player1, Player player2, Items[] items) {
        int count = 0;
        for(String field : map.getMap(items, robot1, robot2, player1, player2)) {
            System.out.print(field);
            count++;
            if (count % 15 == 0) { // Zeilenumbruch nach jeder 15. Spalte
                System.out.println();
            }
        }

        System.out.println(STR."\{player1.getName()}'s robot (\{player1.getAvatar()}) is on field x \{robot1.getX()} y \{robot1.getY()}.");
        System.out.println(STR."He is facing \{robot1.getFacingDirection()}");

        System.out.println(STR."\{player2.getName()}'s robot (\{player2.getAvatar()}) is on field x \{robot2.getX()} y \{robot2.getY()}.");
        System.out.println(STR."He is facing \{robot2.getFacingDirection()}");
    }
}
