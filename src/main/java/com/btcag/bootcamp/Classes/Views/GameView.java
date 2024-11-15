package com.btcag.bootcamp.Classes.Views;

import com.btcag.bootcamp.Classes.Controller.GameController;
import com.btcag.bootcamp.Classes.Models.Player;

public class GameView {
    public static void playerTurnMessage(Player player) {
        System.out.println(STR."\{player.getName()} ist dran!");
    }

    public static void movementLeftMessage(Player player) {
        System.out.println(STR."Du kannst dich noch \{GameController.movementThisRound} mal bewegen, \{player.getName()}!");
    }
}
