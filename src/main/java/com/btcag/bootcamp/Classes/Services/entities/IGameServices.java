package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Controller.Game.RobotWars;
import com.btcag.bootcamp.Classes.Views.BoardAndIntro.Board;

public interface IGameServices {
    public RobotWars game(int id);
    public Board board(int gameID);

}
