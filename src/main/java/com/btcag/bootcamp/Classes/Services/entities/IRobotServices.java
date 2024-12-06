package com.btcag.bootcamp.Classes.Services.entities;

import com.btcag.bootcamp.Classes.Models.Robot.Robot;

import java.util.ArrayList;

public interface IRobotServices {
    public ArrayList<Robot> getAllRobots();
    public Robot getRobot(int id);
    public void createRobot();
}
