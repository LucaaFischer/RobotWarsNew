package com.btcag.bootcamp.Classes;

import java.util.Scanner;

public class Robot {
    //---------------------------------------------------------------------Erstellen des Standard Roboters----------------------------------------------------------------------------
    Scanner input = new Scanner(System.in);
    int x;
    int y;
    int hp = 1;
    int energy = 1;
    int damage = 1;
    int shield = 1;
    int range = 1;
    int aoe = 1;
    int accuracy = 1;
    int movement = 3;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
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


