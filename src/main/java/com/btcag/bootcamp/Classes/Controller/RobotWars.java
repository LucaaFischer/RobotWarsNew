package com.btcag.bootcamp.Classes.Controller;


import com.btcag.bootcamp.Classes.*;
import com.btcag.bootcamp.Classes.Models.Player;
import com.btcag.bootcamp.Classes.Views.Intro;
import com.btcag.bootcamp.Classes.Views.PrintOutWinnerView;

public class RobotWars {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Robot robot1 = new Robot(1, 1);
        Robot robot2 = new Robot(15, 15);

        player1.setName();
        player1.setAvatar();
        player2.setName();
        player2.setAvatar();

        Intro.intro(player1, player2);

        UseSkillPoints.useStartSkillPoints(player1, player2, robot1, robot2);

        while (!Fight.checkWin(robot1, robot2)) {
            if (Game.countTurns % 2 == 0) {
                Game.turn(robot1, robot2, player1, player2);

            } else {
                Game.turn(robot2, robot1, player2, player1);

                if (!Fight.checkWin(robot2, robot1)) {
                    SkillPoints.skillPointController(player1, player2, robot1, robot2);
                }
            }
            Game.countTurns++;
        }
        PrintOutWinnerView.printWinner(player1, player2, robot1, robot2);
    }
}

