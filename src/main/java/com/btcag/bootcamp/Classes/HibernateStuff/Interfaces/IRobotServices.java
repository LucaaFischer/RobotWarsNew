package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.Player.Model.Player;
import com.btcag.bootcamp.Classes.Robot.Model.Robot;

import java.util.ArrayList;

public interface IRobotServices {
    public ArrayList<Robot> getAllRobots(int gameID); // gibt alle robots des Games
    public Robot getRobot(int id); // gibt specific robot
    public Robot createRobot(Player player); // Lässt User Stats skillen
}
