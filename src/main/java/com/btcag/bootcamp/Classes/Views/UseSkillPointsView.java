package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Models.Player;

public class UseSkillPointsView {
    public static void startSkillPointsMessage() {
        System.out.println("Anfang der Runde. Verteilt eure Start-Skillpoints!\n");
    }

    public static void endSkillPointsMessage() {
        System.out.println("Ende der Runde. Nutzt eure Skillpoints!");
    }

    public static void skillPointsLeftMessage(Player player) {
        System.out.println(STR."Du hast noch \{player.skillPoints} Skillpoint(s), \{player.getName()}");
    }
}
