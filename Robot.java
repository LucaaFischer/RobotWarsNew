package com.btcag.bootcamp;

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
    protected int skillPoints = 2;
    protected String avatar;

    public Robot(int x, int y, String avatar) {
        this.x = x;
        this.y = y;
        this.avatar = avatar;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public int setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
        return skillPoints;
    }

    //------------------------------------------------------------------------Spieler den Roboter platzieren lassen-----------------------------------------------------------------
    public void getMove() {
        System.out.println("Wo möchtest du deinen Roboter platzieren? x-Koordinate:");
        this.x = input.nextInt();
        System.out.println("Und die Y-Koordinate?");
        this.y = input.nextInt();

        input.nextLine();
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
}

