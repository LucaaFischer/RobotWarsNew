package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.Map.Model.Map;
import com.btcag.bootcamp.Classes.Map.View.Board;

public interface IMapServices {
    public Map getMap(int mapID);
}