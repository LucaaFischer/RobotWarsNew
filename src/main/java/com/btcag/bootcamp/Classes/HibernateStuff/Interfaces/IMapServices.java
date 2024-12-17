package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.HibernateStuff.Enums.Maps;

public interface IMapServices {
    void setMap(Maps map);
    Maps getMap(int mapID);
}
