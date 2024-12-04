package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Player;

public class UseSkillPointsView {
    public static void startSkillPointsMessage() {
        System.out.println("Game started! Use your start-skillpoints!\n");
    }

    public static void endSkillPointsMessage() {
        System.out.println("End of turn. Use your Skillpoints!");
    }

    public static void skillPointsLeftMessage(Player player) {
        System.out.println(STR."You have \{player.skillPoints} skillpoint(s) left, \{player.getName()}");
    }
}
