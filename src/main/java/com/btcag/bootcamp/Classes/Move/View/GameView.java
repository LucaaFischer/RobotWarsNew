package com.btcag.bootcamp.Classes.Move.View;

import com.btcag.bootcamp.Classes.Game.GameController;
import com.btcag.bootcamp.Classes.Player.Model.Player;

public class GameView {
    public static void playerTurnMessage(Player player) {
        System.out.println(STR."\{player.getName()}'s turn!");
    }

    public static void movementLeftMessage(Player player) {
        System.out.println(STR."You have \{GameController.movementThisRound} moves left, \{player.getName()}!");
    }
}
