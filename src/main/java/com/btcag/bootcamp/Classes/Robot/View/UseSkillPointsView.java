package com.btcag.bootcamp.Classes.Robot.View;

import com.btcag.bootcamp.Classes.Player.Model.Player;

public class UseSkillPointsView {
    public static void startSkillPointsMessage() {
        System.out.println("GameEntity started! Use your start-skillpoints!\n");
    }

    public static void endSkillPointsMessage() {
        System.out.println("End of turn. Use your Skillpoints!");
    }

    public static void skillPointsLeftMessage(Player player) {
        System.out.println(STR."You have \{player.getSkillPoints()} skillpoint(s) left, \{player.getName()}");
    }
}
