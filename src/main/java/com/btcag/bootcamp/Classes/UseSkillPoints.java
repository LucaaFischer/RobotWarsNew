package com.btcag.bootcamp.Classes;

import com.btcag.bootcamp.Classes.Controller.SkillPoints;
import com.btcag.bootcamp.Classes.Models.Player;

public class UseSkillPoints {
    public static void useStartSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        System.out.println("Anfang der Runde. Verteilt eure Start-Skillpoints!\n");
        SkillPoints.skillPointController(player1, player2, robot1, robot2);
    }

    public static void useEndOfRoundSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        System.out.println("Ende der Runde. Nutzt eure Skillpoints!");
        while (player1.skillPoints > 0) {
            System.out.println(STR."Du hast noch \{player1.skillPoints} Skillpoint(s), \{player1.playerName}");
            robot1.setStats();
            player1.skillPoints--;
        }

        while (player2.skillPoints > 0) {
            System.out.println(STR."Du hast noch \{player2.skillPoints} Skillpoint(s), \{player2.playerName}");
            robot2.setStats();
            player2.skillPoints--;
        }
    }
}
