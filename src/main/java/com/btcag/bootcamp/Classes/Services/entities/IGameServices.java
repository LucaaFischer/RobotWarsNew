package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Game.RobotWars;
import com.btcag.bootcamp.Classes.Map.View.Board;

public interface IGameServices {
    public RobotWars game(int id);
    public Board board(int gameID);

}
