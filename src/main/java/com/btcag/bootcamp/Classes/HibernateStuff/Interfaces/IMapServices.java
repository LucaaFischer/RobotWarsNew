package com.btcag.bootcamp.Classes.HibernateStuff.Interfaces;

import com.btcag.bootcamp.Classes.HibernateStuff.Enums.Maps;
import com.btcag.bootcamp.Classes.HibernateStuff.entities.MapEntity;
import com.btcag.bootcamp.Classes.Map.Model.Map;

public interface IMapServices {
    void setMap(Maps map);
    Maps getMap(int mapID);
}
