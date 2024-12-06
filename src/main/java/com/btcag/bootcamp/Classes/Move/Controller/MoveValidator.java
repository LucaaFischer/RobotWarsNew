package com.btcag.bootcamp.Classes.Move.Controller;

import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Map.Model.MapWallField;

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
