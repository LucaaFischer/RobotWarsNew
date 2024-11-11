package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Player;

public class Intro {
    public static void intro(Player player1, Player player2) {
        System.out.println(".______        ______   .______     ______   .___________.   ____    __    ____  ___      .______          _______. \n");
        System.out.println("|   _  \\      /  __  \\  |   _  \\   /  __  \\  |           |   \\   \\  /  \\  /   / /   \\     |   _  \\        /       |\n");
        System.out.println("|  |_)  |    |  |  |  | |  |_)  | |  |  |  | `---|  |----`    \\   \\/    \\/   / /  ^  \\    |  |_)  |      |   (----`\n");
        System.out.println("|      /     |  |  |  | |   _  <  |  |  |  |     |  |          \\            / /  /_\\  \\   |      /        \\   \\    \n");
        System.out.println("|  |\\  \\----.|  `--'  | |  |_)  | |  `--'  |     |  |           \\    /\\    / /  _____  \\  |  |\\  \\----.----)   |   \n");
        System.out.println("| _| `._____| \\______/  |______/   \\______/      |__|            \\__/  \\__/ /__/     \\__\\ | _| `._____|_______/  \n");

        System.out.println(STR."WILLKOMMEN ZU ROBOT-WARS \{player1.playerName.toUpperCase()} UND \{player2.playerName.toUpperCase()} !!!\n");
        System.out.println(STR."Dein Avatar \{player1.playerName}: \{player1.playerAvatar}");
        System.out.println(STR."Dein Avatar \{player2.playerName}: \{player2.playerAvatar}\n");
    }
}
