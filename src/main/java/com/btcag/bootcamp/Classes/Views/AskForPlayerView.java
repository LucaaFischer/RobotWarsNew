package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.zDatabases.DBInserts;
import com.btcag.bootcamp.Classes.zDatabases.DBQueries;

import java.util.Scanner;

public class AskForPlayerView {
    public static String askForName() {
        String name = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Bitte gib deinen gewünschten Benutzernamen ein");
            name = input.nextLine();
        } while (name.length() < 3 || name.length() > 16);
        return name;
    }

    public static String askForAvatar() {
        Scanner input = new Scanner(System.in);
        String avatar = "";
        do {
            System.out.println(STR."Bitte wähle einen Avatar.");
            avatar = input.nextLine();
        } while (avatar.length() != 1);
        return avatar;
    }
}
