package com.btcag.bootcamp.Classes.Controller.Move;

import com.btcag.bootcamp.Classes.Models.Robot.Robot;
import com.btcag.bootcamp.Classes.Models.Map.MapWallField;

public class MoveValidator {
    public static boolean moveValid(int x, int y, Robot robotNotTurn) {
        if (x > 15 || y > 15 || x < 1 || y < 1) {
            System.out.println("Destination out of field, do again!");
            return false;

        } else if (MapWallField.wallField(x, y)) {
            System.out.println("This field is blocked, do again!");
            return false;

        } else if (x == robotNotTurn.getX() && y == robotNotTurn.getY()) {
            System.out.println("You can't stand on the same field as your enemy, do again!");
            return false;

        } else {
            return true;
        }
    }

}