package com.btcag.bootcamp.Classes.Map.Model;

import com.btcag.bootcamp.Classes.Enums.Walls;
import com.btcag.bootcamp.Classes.Items.Model.Items;
import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

public class Map {
    private static final int SIZE = 15;
    private String[] map = new String[SIZE];

    private static final String EMPTYFIELD = "[   ]";
    private static final String WALLFIELD = Walls.WALL1.icon;
    private static final String ITEMFIELD = "?";

    public String[] getMap(Items[] items, Robot robot1, Robot robot2, Player player1, Player player2) {
        String[] map = new String[15 * 15];
        int index = 0;

        for (int y = 1; y <= 15; y++) {
            for (int x = 1; x <= 15; x++) {
                if (x == robot1.getX() && y== robot1.getY()) {
                    map[index] = STR."[ \{player1.getAvatar()} ]";

                } else if (x == robot2.getX() && y == robot2.getY()) {
                    map[index] = STR."[ \{player2.getAvatar()} ]";

                } else if (MapItemField.itemOnField(items, x, y)) {
                    map[index] = STR."[ \{ITEMFIELD} ]";

                } else if (MapWallField.wallField(x, y)) {
                    map[index] = STR."[\{WALLFIELD}]";

                } else {
                    map[index] = EMPTYFIELD;
                }
                index++;
            }
        }
        return map;
    }
}
