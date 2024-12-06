package com.btcag.bootcamp.Classes.Intro;

import com.btcag.bootcamp.Classes.Player.Model.Player;

public class Intro {
    public static void intro(Player player1, Player player2) {
        System.out.print(".______        ______   .______     ______   .___________.   ____    __    ____  ___      .______          _______. \n");
        System.out.print("|   _  \\      /  __  \\  |   _  \\   /  __  \\  |           |   \\   \\  /  \\  /   / /   \\     |   _  \\        /       |\n");
        System.out.print("|  |_)  |    |  |  |  | |  |_)  | |  |  |  | `---|  |----`    \\   \\/    \\/   / /  ^  \\    |  |_)  |      |   (----`\n");
        System.out.print("|      /     |  |  |  | |   _  <  |  |  |  |     |  |          \\            / /  /_\\  \\   |      /        \\   \\    \n");
        System.out.print("|  |\\  \\----.|  `--'  | |  |_)  | |  `--'  |     |  |           \\    /\\    / /  _____  \\  |  |\\  \\----.----)   |   \n");
        System.out.print("| _| `._____| \\______/  |______/   \\______/      |__|            \\__/  \\__/ /__/     \\__\\ | _| `._____|_______/  \n");

        System.out.println(STR."WELCOME TO ROBOT-WARS \{player1.getName().toUpperCase()} AND \{player2.getName().toUpperCase()} !!!\n");
        System.out.println(STR."Your avatar \{player1.getName()}: \{player1.getAvatar()}");
        System.out.println(STR."Your avatar \{player2.getName()}: \{player2.getAvatar()}\n");
    }
}
