package com.btcag.bootcamp.Classes.Views.Move;

import com.btcag.bootcamp.Classes.Controller.Game.GameController;
import com.btcag.bootcamp.Classes.Models.Player.Player;

public class GameView {
    public static void playerTurnMessage(Player player) {
        System.out.println(STR."\{player.getName()}'s turn!");
    }

    public static void movementLeftMessage(Player player) {
        System.out.println(STR."You have \{GameController.movementThisRound} moves left, \{player.getName()}!");
    }
}
