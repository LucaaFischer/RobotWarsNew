package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Models.Robot;
import com.btcag.bootcamp.Classes.Views.UseSkillPointsView;
import com.btcag.bootcamp.Classes.Views.PrintStatsView;

public class UseSkillPointsController {
    public static void startSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        UseSkillPointsView.startSkillPointsMessage();
        useSkillPoints(player1, player2, robot1, robot2);

    }

    public static void endOfRoundSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        if (!CheckInRange.inRange(robot1, robot2)) {
            UseSkillPointsView.endSkillPointsMessage();
            useSkillPoints(player1, player2, robot1, robot2);
        }
    }

    public static void useSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        while (player1.skillPoints > 0) {
            UseSkillPointsView.skillPointsLeftMessage(player1);
            robot1.setStats();
            player1.skillPoints--;
        }

        while (player2.skillPoints > 0) {
            UseSkillPointsView.skillPointsLeftMessage(player2);
            robot2.setStats();
            player2.skillPoints--;
        }
        PrintStatsView.printStats(robot1, robot2, player1, player2);
    }
}
