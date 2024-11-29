package com.btcag.bootcamp.Classes.Models;

import java.util.Random;

public class RangeItem extends Items{
    static Random rand = new Random();
    int x = rand.nextInt(5, 8);
    int y = rand.nextInt(5, 8);

    @Override
    public int getItemX() {
        return x;
    }

    @Override
    public int getItemY() {
        return y;
    }

    @Override
    public int duration() {
        return super.duration();
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
    public void changeStat(Robot robot) {
        robot.setRange(robot.getRange() + itemValue());
    }
}
