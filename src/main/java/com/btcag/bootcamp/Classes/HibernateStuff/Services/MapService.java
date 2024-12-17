package com.btcag.bootcamp.Classes.HibernateStuff.Services;

import com.btcag.bootcamp.Classes.HibernateStuff.Enums.Maps;
import com.btcag.bootcamp.Classes.HibernateStuff.Interfaces.IMapServices;

public class MapService implements IMapServices {
    Maps map;

    @Override
    public void setMap(Maps map) {
        this.map = map;
    }

    @Override
    public Maps getMap(int mapID) {
        return map;
    }
}
