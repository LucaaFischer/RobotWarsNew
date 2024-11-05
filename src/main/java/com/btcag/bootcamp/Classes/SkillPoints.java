package com.btcag.bootcamp.Classes;

public class SkillPoints {
    //---------------------------------------------------------------------Skillpoints in Stats stecken----------------------------------------------------------------------------
    public static void useSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        if (!Fight.inRange(robot1, robot2)) {
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
            printStats(robot1, robot2, player1, player2);
        }
    }

    //--------------------------------------------------------Ausgabe der aktuellen Statverteilung-----------------------------------------------------------------------
    public static void printStats(Robot robot1, Robot robot2, Player player1, Player player2) {
        System.out.println("Eure Stats: ");
        System.out.println(STR."        \{player1.playerName} (\{player1.playerAvatar})               \{player2.playerName} (\{player2.playerAvatar})");

        System.out.println(STR."HP:        \{robot1.hp}                     \{robot2.hp}");
        System.out.println(STR."Energy:    \{robot1.energy}                     \{robot2.energy}");
        System.out.println(STR."DMG:       \{robot1.damage}                     \{robot2.damage}");
        System.out.println(STR."Shield:    \{robot1.shield}                     \{robot2.shield}");
        System.out.println(STR."Range:     \{robot1.range}                     \{robot2.range}");
        System.out.println(STR."AOE:       \{robot1.aoe}                     \{robot2.aoe}");
        System.out.println(STR."Accuracy:  \{robot1.accuracy}                     \{robot2.accuracy}");
        System.out.println(STR."Movement:  \{robot1.movement}                     \{robot2.movement}");
    }

}