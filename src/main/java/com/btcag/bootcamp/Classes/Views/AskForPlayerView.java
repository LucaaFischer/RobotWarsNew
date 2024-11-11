package com.btcag.bootcamp.Classes.Views;

import java.util.Scanner;

public class AskForPlayerView {
    public static String askForNames() {
        Scanner input = new Scanner(System.in);
        String name = "";
        do {
            System.out.println(STR."Bitte gib deinen gewünschten Benutzernamen ein");
            name = input.nextLine();
        } while (name.length() < 3 || name.length() > 16);
        return name;
    }


    public static String askForAvatars() {
        Scanner input = new Scanner(System.in);
        String avatar = "";
        do {
            System.out.println(STR."Bitte wähle einen Avatar.");
            avatar = input.nextLine();
        } while (avatar.length() != 1);
        return avatar;
    }
}
