package com.btcag.bootcamp.Classes.Models;

import java.util.Random;

public class RangeItem extends Items{
    static Random rand = new Random();

    @Override
    public int xCoordinate() {
        return rand.nextInt(6,8);
    }

    @Override
    public int yCoordinate() {
        return rand.nextInt(6,8);
    }

    @Override
    public int itemValue() {
        int chance = rand.nextInt(101);
        int value = 1;

        if (chance > 10) {
            return value;
        } else {
            return value * -1;
        }
    }

    @Override
    public void defineItem() {
        String itemName = "Range Item";
        char iconOnMap = super.iconOnMap;
    }

    @Override
    public boolean pickUpItem(Robot robot) {
        return (robot.getX() == xCoordinate() && robot.getY() == yCoordinate());
    }

    @Override
    void isActive(Robot robot) {
        if (pickUpItem(robot)) {
            robot.setHasRangeItem(true);
        }
    }

    @Override
    public void changeStat(Robot robot) {
        robot.setRange(robot.getRange() + itemValue());
    }
}
