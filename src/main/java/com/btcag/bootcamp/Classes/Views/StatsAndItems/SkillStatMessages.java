package com.btcag.bootcamp.Classes.Views.StatsAndItems;

import java.util.Scanner;

public class SkillStatMessages {
    public static String askForStat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which stat do you want to skill?");
        return input.nextLine();
    }

    public static void invalidStatMessage() {
        System.out.println("Invalid Stat! You can only skill HP, Damage, Range, and Movement!");
    }
}
