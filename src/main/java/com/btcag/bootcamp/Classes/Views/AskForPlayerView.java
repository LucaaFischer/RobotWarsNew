package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.zDatabases.DBInserts;
import com.btcag.bootcamp.Classes.zDatabases.DBQueries;

import java.util.Scanner;

public class AskForPlayerView {
    public static String askForName() {
        String name = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Are u new player or returning? 0 / 1");
        int alreadyExisting = input.nextInt();

        if (alreadyExisting == 0) {
            input.nextLine();

            do {
                System.out.println("Bitte gib deinen gewünschten Benutzernamen ein");
                name = input.nextLine();
            } while (name.length() < 3 || name.length() > 16);

            askForPassword();
            askForAvatar();

            DBInserts.insertUser(name, askForPassword(), askForAvatar());

        } else {
            input.nextLine();
            System.out.println("Gib deinen Benutzernamen ein");
            String userNameInput = input.nextLine();
            System.out.println("Gib dein Passwort ein");
            String passWordInput = input.nextLine();
            if(DBQueries.tryLoggingIn(userNameInput, passWordInput)) {
                name = userNameInput;
            }
        }
        return name;
    }

    private static String askForPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte wähle ein Passwort!");
        return input.nextLine();
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
