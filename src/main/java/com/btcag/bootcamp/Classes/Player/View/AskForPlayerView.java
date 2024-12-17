package com.btcag.bootcamp.Classes.Player.View;

import java.util.Scanner;

public class AskForPlayerView {
    protected static Scanner input = new Scanner(System.in);

    public static String askForName() {
        String name = "";
        do {
            System.out.println("Please enter your name: ");
            name = input.nextLine();
        } while (name.length() < 3 || name.length() > 16);
        return name;
    }

    public static String askForAvatar() {
        Scanner input = new Scanner(System.in);
        String avatar = "";
        do {
            System.out.println(STR."Please choose an avatar");
            avatar = input.nextLine();
        } while (avatar.length() != 1);
        return avatar;
    }

    public static String askForPassword() {
        System.out.println("Please choose a password: ");
        String password = input.nextLine();
        return password;
    }
}
