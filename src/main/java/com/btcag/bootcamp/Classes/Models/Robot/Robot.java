package com.btcag.bootcamp.Classes.Models.Robot;

import com.btcag.bootcamp.Classes.Controller.Move.MoveRobot;
import com.btcag.bootcamp.Classes.Enums.Directions;
import com.btcag.bootcamp.Classes.Models.Items.Items;
import com.btcag.bootcamp.Classes.Views.Move.AskForMove;
import com.btcag.bootcamp.Classes.Views.StatsAndItems.SkillStatMessages;


import java.util.ArrayList;

public class Robot {
    protected int x;
    protected int y;
    protected Directions facingDirection;
    protected int hp = 1;
    protected int damage = 1;
    protected int range = 1;
    protected int shield = 1;
    protected int movement = 3;
    protected boolean hasDMGItem;
    protected boolean hasRangeItem;
    protected boolean hasMovementItem;
    ArrayList<Items> itemsOnRobot = new ArrayList<>();

    public Robot(int x, int y, Directions facingDirection) {
        this.x = x;
        this.y = y;
        this.facingDirection = facingDirection;
    }

    public void setMove(Robot robotTurn, Robot robotNotTurn) {
        if(AskForMove.intendedAction().equals("move")) {
            MoveRobot.moveRobot(AskForMove.askForDirection(), robotTurn, robotNotTurn);

        } else {
            MoveRobot.alignRobot(AskForMove.askForDirection(), robotTurn);
        }
    }


    //-------------------------------------------------------------------Spieler die Stats für Robo festlegen lassen---------------------------------------------------------------
    public void setStats() {
        String skillStat = SkillStatMessages.askForStat();
        switch (skillStat) {
            case "hp":
                this.hp++;
                break;
            case "damage":
                this.damage++;
                break;
            case "range":
                this.range++;
                break;
            case "movement":
                this.movement++;
                break;
            default:
                SkillStatMessages.invalidStatMessage();
                setStats();
                break;
        }
    }

    public int getHp() {
        return hp;
    }

    public int getShield() {
        return shield;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getMovement() {
        return movement;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public Directions getFacingDirection() {
        return facingDirection;
    }

    public void setFacingDirection(Directions facingDirection) {
        this.facingDirection = facingDirection;
    }

    public boolean getHasDMGItem() {
        return hasDMGItem;
    }

    public void setHasDMGItem(boolean dmgItem) {
        hasDMGItem = dmgItem;
    }

    public ArrayList<Items> getItemsOnRobot() {
        return itemsOnRobot;
    }

    public boolean getHasRangeItem() {
        return hasRangeItem;
    }

    public void setHasRangeItem(boolean rangeItem) {
        hasRangeItem = rangeItem;
    }

    public boolean getHasMovementItem() {
        return hasMovementItem;
    }

    public void setHasMovementItem(boolean movementItem) {
        hasMovementItem = movementItem;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
