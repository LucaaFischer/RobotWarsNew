package com.btcag.bootcamp.Classes.Models;

import java.util.Scanner;

public class Robot {
    //---------------------------------------------------------------------Erstellen des Standard Roboters----------------------------------------------------------------------------
    Scanner input = new Scanner(System.in);
    protected int x;
    protected int y;
    protected int hp = 1;
    protected int energy = 1;
    protected int damage = 1;
    protected int shield = 1;
    protected int range = 1;
    protected int aoe = 1;
    protected int accuracy = 1;
    protected int movement = 3;

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
            case "energy":
                this.energy++;
                break;
            case "damage":
                this.damage++;
                break;
            case "shield":
                this.shield++;
                break;
            case "range":
                this.range++;
                break;
            case "aoe":
                this.aoe++;
                break;
            case "accuracy":
                this.accuracy++;
                break;
            case "movement":
                this.movement++;
                break;
            default:
                System.out.println("Ungültiger Stat. Mach nochmal!");
                setStats();
                break;
        }

    }

    public int getHp() {
        return hp;
    }

    public int getEnergy() {
        return energy;
    }

    public int getDamage() {
        return damage;
    }

    public int getShield() {
        return shield;
    }

    public int getAoe() {
        return aoe;
    }

    public int getRange() {
        return range;
    }

    public int getAccuracy() {
        return accuracy;
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

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
}

