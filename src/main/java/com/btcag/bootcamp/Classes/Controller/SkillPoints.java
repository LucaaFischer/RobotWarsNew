package com.btcag.bootcamp.Classes.Controller;

import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Robot;
import com.btcag.bootcamp.Classes.UseSkillPoints;
import com.btcag.bootcamp.Classes.Validations;
import com.btcag.bootcamp.Classes.Views.PrintStatsView;

public class SkillPoints {
    //---------------------------------------------------------------------Skillpoints in Stats stecken----------------------------------------------------------------------------
    public static void skillPointController(Player player1, Player player2, Robot robot1, Robot robot2) {
        if (!Validations.inRange(robot1, robot2)) {
            UseSkillPoints.useEndOfRoundSkillPoints(player1, player2, robot1, robot2);
            PrintStatsView.printStats(robot1, robot2, player1, player2);
        }
    }
}