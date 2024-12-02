package com.btcag.bootcamp.Classes.Models;

import com.btcag.bootcamp.Classes.Views.PickUpItemMessage;

import java.util.ArrayList;
import java.util.Scanner;

public class Robot {
    //---------------------------------------------------------------------Erstellen des Standard Roboters----------------------------------------------------------------------------
    Scanner input = new Scanner(System.in);
    protected int x;
    protected int y;
    protected int hp = 1;
    protected int damage = 1;
    protected int range = 1;
    protected int shield = 1;
    protected int movement = 3;
    protected boolean hasDMGItem;
    protected boolean hasRangeItem;
    protected boolean hasMovementItem;
    ArrayList<Items> itemsOnRobot = new ArrayList<>();

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //------------------------------------------------------------------------Spieler den Roboter platzieren lassen-----------------------------------------------------------------
    public void setMove() {
        System.out.println("Wo möchtest du deinen Roboter platzieren? Y-Koordinate:");
        this.x = input.nextInt();
        System.out.println("Und die X-Koordinate?");
        this.y = input.nextInt();

        input.nextLine(); // Scanner muss leer sein, damit beim ersten setStats() Durchlauf nicht direkt Default Wert ausgeführt wird lol
    }

    //-------------------------------------------------------------------Spieler die Stats für Robo festlegen lassen---------------------------------------------------------------
    public void setStats() {
        String skillStat = " ";
        System.out.println("Was möchtest du skillen?");
        skillStat = input.nextLine();
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
                System.out.println("Invalid Stat! Du kannst nur HP, AD, Movement und Range anpassen.");
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

    public int getY() {
        return y;
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

