package com.btcag.bootcamp.Classes.Robot.Controller;

import com.btcag.bootcamp.Classes.Combat.Controller.CheckAttackPossible;
import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;
import com.btcag.bootcamp.Classes.Robot.View.UseSkillPointsView;
import com.btcag.bootcamp.Classes.Robot.View.PrintStatsView;

public class UseSkillPointsController {
    public static void startSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        UseSkillPointsView.startSkillPointsMessage();
        useSkillPoints(player1, player2, robot1, robot2);

    }

    public static void endOfRoundSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        if (!CheckAttackPossible.attackPossible(robot1, robot2)) {
            UseSkillPointsView.endSkillPointsMessage();
            useSkillPoints(player1, player2, robot1, robot2);
        }
    }

    public static void useSkillPoints(Player player1, Player player2, Robot robot1, Robot robot2) {
        while (player1.getSkillPoints() > 0) {
            UseSkillPointsView.skillPointsLeftMessage(player1);
            robot1.setStats();
            player1.setSkillPoints(player1.getSkillPoints() - 1);
        }

        while (player2.getSkillPoints() > 0) {
            UseSkillPointsView.skillPointsLeftMessage(player2);
            robot2.setStats();
            player2.setSkillPoints(player2.getSkillPoints() - 1);
        }
        PrintStatsView.printStats(robot1, robot2, player1, player2);
    }
}
