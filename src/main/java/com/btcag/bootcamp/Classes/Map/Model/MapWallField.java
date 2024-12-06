package com.btcag.bootcamp.Classes.Map.Model;

import com.btcag.bootcamp.Classes.Enums.Walls;

public class MapWallField {
    public static boolean wallField(int x, int y) {
        boolean wallFound = false;

        for (Walls wall : Walls.values()) {
            if(x == wall.x && y == wall.y) {
                wallFound = true;
            }
        }
        return wallFound;
    }
}
