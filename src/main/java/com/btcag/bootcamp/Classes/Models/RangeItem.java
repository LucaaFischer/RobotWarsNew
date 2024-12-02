package com.btcag.bootcamp.Classes.Models;

import com.btcag.bootcamp.Classes.Controller.ItemPositionValidator;
import com.btcag.bootcamp.Classes.Views.PickUpItemMessage;

import java.util.Random;

public class RangeItem extends Items {
    static Random rand = new Random();
    String itemName = "Range-Item";
    int duration = 2;
    int x;
    int y;

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void generatePosition(Items[] items) {
        int tempX;
        int tempY;

        do {
            tempX = rand.nextInt(5, 8);
            tempY = rand.nextInt(5, 8);
        } while (ItemPositionValidator.validator(items, tempX, tempY));

        this.x = tempX;
        this.y = tempY;
    }

    @Override
    public int getItemX() {
        return x;
    }

    @Override
    public int getItemY() {
        return y;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean wasPickedUp(Robot robot) {
        if (robot.getX() == getItemX() && robot.getY() == getItemY()) {
            robot.itemsOnRobot.add(new RangeItem());
            changeStat(robot);
            robot.setHasRangeItem(true);
            return true;
        }
        return false;
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
    public void changeStat(Robot robot) {
        robot.setRange(robot.getRange() + itemValue());
    }
}
