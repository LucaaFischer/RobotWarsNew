package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.HibernateStuff.entities.PlayerEntity;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.RobotEntity;

import java.util.ArrayList;

public interface IRobotServices {
    ArrayList<RobotEntity> getAllRobots(int gameID); // gibt alle robots des Games
    RobotEntity getRobot(int id); // gibt specific robot
    void createRobot(int gameID, RobotEntity robot, PlayerEntity player, int hp, int dmg, int movement, int range); // Lässt User Stats skillen
}
