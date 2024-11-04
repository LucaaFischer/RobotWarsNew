package com.btcag.bootcamp.Classes;

import java.util.Scanner;

public class Player {
    Scanner input = new Scanner(System.in);
    String playerName = "";
    String playerAvatar = "";
    int skillPoints = 2;

    // ---------------------------------------------------------------- ---------Namenseingabe------------------------------------------------------------------------------------------
    public void getName() {
        System.out.println("Bitte gib deinen gewünschten Benutzernamen ein");
        this.playerName = input.nextLine();

        while (playerName.length() < 3 || playerName.length() > 16) {
            System.out.println("Der eingegebene Name ist unzulässig.");
            getName();
        }
    }

    //----------------------------------------------------------------------------Avatarerstellung--------------------------------------------------------------------------------------
    public void getAvatar() {
        System.out.println("Wähle ein Zeichen als Avatar " + playerName);
        this.playerAvatar = input.nextLine();

        while (playerAvatar.length() != 1) {
            System.out.println("Dein Avatar muss ein Zeichen lang sein");
            System.out.println("Bitte gib erneut einen Avatar ein");
            getAvatar();
        }
    }
}
